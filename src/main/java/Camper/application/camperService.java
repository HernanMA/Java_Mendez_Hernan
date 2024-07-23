/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camper.application;

import Camper.domain.models.Camper;
import Camper.infrastructure.camperRepository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author hernan
 */
public class camperService {
    
    private final camperRepository CamperRepository;
    
    public camperService(camperRepository CamperRepository) {
        this.CamperRepository = CamperRepository;
    }
    
    public void createCamper(Camper camper) {
        CamperRepository.save(camper);
    }
    
    public void updateCamper(Camper camper) {
        CamperRepository.update(camper);
    }
    
    public Optional<Camper> getCamperById(int id) {
        return CamperRepository.findById(id);
    }
    
    public void deleteCamper(int id) {
        CamperRepository.delete(id);
    }
    
    public List<Camper> getAllCampers() {
        return CamperRepository.findAll();
    }
}
