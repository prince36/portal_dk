package com.sprhib.dao;

import com.sprhib.model.Boot;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ja on 16.06.2017.
 */
@Repository
public class BootDAOImpl implements BootDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addBoot(Boot boot) {
        getCurrentSession().save(boot);
    }

    public void updateBoot(Boot boot) {
        Boot bootToUpdate = getBoot(boot.getIdboots());
        bootToUpdate.setBrand(boot.getBrand());
        bootToUpdate.setModel(boot.getModel());
        bootToUpdate.setProduct_code(boot.getProduct_code());
        bootToUpdate.setGender(boot.getGender());
        bootToUpdate.setColor(boot.getColor());
        bootToUpdate.setCategory(boot.getCategory());
        bootToUpdate.setDescription(boot.getDescription());
        bootToUpdate.setPrice(boot.getPrice());
        bootToUpdate.setSize(boot.getSize());
        getCurrentSession().update(bootToUpdate);
    }

    public Boot getBoot(int id) {
        Boot boot = (Boot) getCurrentSession().get(Boot.class, id);
        return boot;
    }

    public void deleteBoot(int id) {
        Boot boot = getBoot(id);
        if (boot != null)
            getCurrentSession().delete(boot);
    }

    @SuppressWarnings("unchecked")
    public List<Boot> getBoots() {
        return getCurrentSession().createQuery("from Boot").list();
    }
}

