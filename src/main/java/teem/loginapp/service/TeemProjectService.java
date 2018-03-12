/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teem.loginapp.service;

import java.util.List;
import teem.loginapp.model.dmo.TeemProject;

/**
 *
 * @author nikos
 */
public interface TeemProjectService {
    public TeemProject findByWave_id(String waveId);
    
    public  List<String> getParticipantsIfPromoter(String waveId, String promoter);
}
