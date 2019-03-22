package com.example.myapplication.entidades;

public class Producto {

    private String id_producto;
    private String desc_producto;
    private String marca_producto;
    private String precio_producto;
    private String existencia_producto;

    public Producto() {
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getDesc_producto() {
        return desc_producto;
    }

    public void setDesc_producto(String desc_producto) {
        this.desc_producto = desc_producto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public String getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(String precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getExistencia_producto() {
        return existencia_producto;
    }

    public void setExistencia_producto(String existencia_producto) {
        this.existencia_producto = existencia_producto;
    }
}
