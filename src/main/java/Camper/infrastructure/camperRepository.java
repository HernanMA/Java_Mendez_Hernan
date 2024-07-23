/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camper.infrastructure;
import Camper.domain.models.Camper;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author hernan
 */
public interface camperRepository {
    void save(Camper camper);
    void update(Camper camper);
    Optional<Camper> findById(int id);
    void delete(int id);
    List<Camper> findAll();
}
