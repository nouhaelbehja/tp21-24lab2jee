package com.example.car.entities;


public class Client {
    private Long id;
    private String nom;
    private Float age;
    private String email;
    private String telephone;
    private String ville;
    public Client() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public Float getAge() { return age; }
    public void setAge(Float age) { this.age = age; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }
}
