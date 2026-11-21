package com.example.car.web;
import com.example.car.entities.Car;
import com.example.car.entities.Client;
import com.example.car.repositories.CarRepository;
import com.example.car.services.ClientApi;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarRepository repo;
    private final ClientApi clientApi;
    public CarController(CarRepository repo, ClientApi clientApi) { this.repo = repo; this.clientApi = clientApi; }
    @PostMapping @ResponseStatus(HttpStatus.CREATED)
    public Car save(@RequestBody Car car) { return repo.save(car); }
    @GetMapping public List<Car> findAll() {
        List<Car> cars = repo.findAll();
        for (Car car : cars) {
            if (car.getClientId() != null) car.setClient(clientApi.findClientById(car.getClientId()));
        }
        return cars;
    }
    @GetMapping("/byClient/{clientId}") public List<Car> findByClient(@PathVariable Long clientId) {
        List<Car> cars = repo.findByClientId(clientId);
        if (!cars.isEmpty()) {
            Client client = clientApi.findClientById(clientId);
            for (Car car : cars) car.setClient(client);
        }
        return cars;
    }
}
