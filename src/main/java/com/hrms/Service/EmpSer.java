package com.hrms.Service;

import com.hrms.Entity.EmpEnt;
import com.hrms.Entity.EntEmployee;
import com.hrms.Repsitory.EmpRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpSer {

    private final EmpRepo rp;

    public EmpSer(EmpRepo rp) {
        this.rp = rp;
    }

    public void leaverequest(EmpEnt eent) {
        rp.save(eent);
    }



    public List<EmpEnt> listAll() {
        return rp.findAll();
    }

    public void apadd(EmpEnt e) {
        rp.save(e);
    }

    public EmpEnt getEById(int id) {
        Optional<EmpEnt> e = rp.findById(id);
        if (e.isPresent()) {
            return e.get();
        }
        return null;
    }

    public List<EmpEnt> getAlEmp() {
        return rp.findAll();
    }
}
