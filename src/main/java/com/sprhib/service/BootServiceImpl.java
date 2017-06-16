package com.sprhib.service;

import com.sprhib.dao.BootDAO;
import com.sprhib.model.Boot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Ja on 16.06.2017.
 */
@Service
@Transactional
public class BootServiceImpl implements BootService {

    @Autowired
    private BootDAO bootDAO;

    public void addBoot(Boot boot) {
        bootDAO.addBoot(boot);
    }

    public void updateBoot(Boot product) {
        bootDAO.updateBoot(product);
    }

    public Boot getBoot(int id) {
        return bootDAO.getBoot(id);
    }

    public void deleteBoot(int id) {
        bootDAO.deleteBoot(id);
    }

    public List<Boot> getBoots() {
        return bootDAO.getBoots();
    }

    public List<Boot> getBoots4I() {
        List<Boot> temp = new ArrayList<>();
        List<Boot> allBoots = bootDAO.getBoots();
        Random x =new Random();
        for (int i = 0; i < 4 ; i++) {
            temp.add(allBoots.get(x.nextInt(allBoots.size())));
        } return temp;
    }
}
