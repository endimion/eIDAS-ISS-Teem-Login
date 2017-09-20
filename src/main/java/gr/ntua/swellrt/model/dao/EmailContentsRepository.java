/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.swellrt.model.dao;

import gr.ntua.swellrt.model.dmo.EmailContentsMngDMO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nikos
 */
public interface EmailContentsRepository extends MongoRepository<EmailContentsMngDMO, Long>{
    
    public EmailContentsMngDMO findBySubject(String subject);
    public EmailContentsMngDMO findByUser(String user);
    
}