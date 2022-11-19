package com.table.hindu.controller;

import com.table.hindu.model.Hindu;
import com.table.hindu.repository.HinduRepository;
import com.table.hindu.service.HinduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/hindu")
public class HinduController {

    //memanggil hindurepository
    @Autowired
    private HinduRepository hinduRepository;

    //memanggil hinduservice
    @Autowired
    private HinduService hinduService;

    //menambahkan data
    @PostMapping
    public Hindu addHindu(@RequestBody Hindu hindu) {
        return hinduService.addHindu(hindu);
    }

    //melihat data sesuai id
    @GetMapping("/{id}")
    public Hindu getHinduById(@PathVariable ("id")Long id) {
        return hinduService.getHinduById(id);
    }

    //mengedit data sesuai id
    @PutMapping ("/{id}")
    public Hindu editHinduById(@PathVariable("id")Long id, @RequestBody Hindu hindu) {
        return hinduService.editHinduById(id,hindu.getKerajaanHindu(),hindu.getLetak(),hindu.getTahunBerdiri(),hindu.getRajaTerkenal(),hindu.getPeninggalanSejarah());
    }

    //melihat semua data
    @GetMapping("/all")
    public List<Hindu> getAllHindu() {
        return hinduService.getAllHindu();
    }

    //menghapus data sesuai id
    @DeleteMapping("/{id}")
    public void deleteHinduById(@PathVariable("id")Long id) {
        hinduService.deleteHinduById(id);
    }
}
