package com.table.hindu.model;

import javax.persistence.*;

@Entity
//nama table
@Table(name = "KerajaanHindu" )
public class Hindu {

    @Id //primari //generatedvalue auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //nama data table
    @Column(name = "Kerajaan_Hindu" )
    private String kerajaanHindu;

    @Column(name = "Letak" )
    private String letak;

    @Column(name = "Tahun_berdiri" )
    private String tahunBerdiri;

    @Column(name = "Raja_Terkenal" )
    private String rajaTerkenal;

    @Column(name = "Peninggalan_Sejarah" )
    private String peninggalanSejarah;

    //untuk mengetahui id menggunakan long
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //mengambil data
    public String getKerajaanHindu() {
        return kerajaanHindu;
    }

    //mengubah data
    public void setKerajaanHindu(String kerajaanHindu) {
        this.kerajaanHindu = kerajaanHindu;
    }

    //untuk mengetahui getletak menggunakan string
    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalanSejarah() {
        return peninggalanSejarah;
    }

    public void setPeninggalanSejarah(String peninggalanSejarah) {
        this.peninggalanSejarah = peninggalanSejarah;
    }


    //menambahkan sesuai string
    @Override
    public String toString() {
        return "Hindu{" +
                "id=" + id +
                ", kerajaanHindu='" + kerajaanHindu + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarah='" + peninggalanSejarah + '\'' +
                '}';
    }
}
