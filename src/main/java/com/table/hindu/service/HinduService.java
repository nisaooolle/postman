package com.table.hindu.service;

import com.table.hindu.model.Hindu;

import java.util.List;

public interface HinduService {

    //menambahkan data
    Hindu addHindu(Hindu hindu);

    //melihat data sesuai id
    Hindu getHinduById(Long id);

    //melihat data semua
    List<Hindu> getAllHindu();

    //mengedit data
    Hindu editHinduById(Long id,String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah);

    //menghapus data
    void deleteHinduById(Long id);
}
