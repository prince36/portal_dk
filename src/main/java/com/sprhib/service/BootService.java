package com.sprhib.service;

import com.sprhib.model.Boot;

import java.util.List;

/**
 * Created by Ja on 16.06.2017.
 */
public interface BootService {

    public void addBoot(Boot boot);
    public void updateBoot(Boot boot);
    public Boot getBoot(int id);
    public void deleteBoot(int id);
    public List<Boot> getBoots();
}
