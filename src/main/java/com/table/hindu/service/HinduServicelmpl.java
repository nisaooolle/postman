package com.table.hindu.service;

import com.table.hindu.model.Hindu;
import com.table.hindu.repository.HinduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HinduServicelmpl implements HinduService {

    //memanggil hindurepository
    @Autowired
    private HinduRepository hinduRepository;

    //menambahkan data
    @Override
    public Hindu addHindu(Hindu hindu) {
        return hinduRepository.save(hindu);
    }

    //melihat data sesuai id
    @Override
    public Hindu getHinduById(Long id) {
        return hinduRepository.findById(id).get();
    }

    //melihat semua data
    @Override
    public List<Hindu> getAllHindu() {
        return hinduRepository.findAll();
    }

    //mengubah/edit data
    @Override
    public Hindu editHinduById(Long id, String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah) {
        Hindu hindu = hinduRepository.findById(id).get();
        hindu.setKerajaanHindu(kerajaanHindu);
        hindu.setLetak(letak);
        hindu.setTahunBerdiri(tahunBerdiri);
        hindu.setRajaTerkenal(rajaTerkenal);
        hindu.setPeninggalanSejarah(peninggalanSejarah);
        return hinduRepository.save(hindu);
    }

    //mengahpus data sesuai id
    @Override
    public void deleteHinduById(Long id) {
        hinduRepository.deleteById(id);
    }
}
