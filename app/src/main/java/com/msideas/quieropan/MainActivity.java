package com.msideas.quieropan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setId_tipoCliente("codigo");
        tipoCliente.setDesc_tipoCliente("nombre");

        TipoCompra tipoCompra = new TipoCompra();
        tipoCompra.setId_tipoCompra("");
        tipoCompra.setDesc_tipoCompra("");

        TipoDespacho tipoDespacho = new TipoDespacho();
        tipoDespacho.setId_tipoDespacho("");
        tipoDespacho.setDesc_tipoDespacho("");

        TipoDireccion tipoDireccion = new TipoDireccion();
        tipoDireccion.setId_tipoDireccion("");
        tipoDireccion.setDesc_tipoDireccion("");

        TipoPedido tipoPedido = new TipoPedido();
        tipoPedido.setId_tipoPedido("");
        tipoPedido.setDesc_tipoPedido("");

        TipoPerfil tipoPerfil = new TipoPerfil();
        tipoPerfil.setId_tipoPerfil("");
        tipoPerfil.setDesc_tipoPerfil("");

        TipoPersona tipoPersona = new TipoPersona();
        tipoPersona.setId_tipoPersona("");
        tipoPersona.setDesc_tipoPersona("");

        TipoProducto tipoProducto = new TipoProducto();
        tipoProducto.setId_tipoProducto("");
        tipoProducto.setDesc_tipoProducto("");

        TipoProveedor tipoProveedor = new TipoProveedor();
        tipoProveedor.setId_tipoProveedor("");
        tipoProveedor.setDesc_tipoProveedor("");

        TipoSubProducto tipoSubProducto = new TipoSubProducto();
        tipoSubProducto.setId_tipoSubProducto("");
        tipoSubProducto.setDesc_tipoSubProducto("");

        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setId_tipoUsuario("");
        tipoUsuario.setDesc_tipoUsuario("");

        TipoVenta tipoVenta = new TipoVenta();
        tipoVenta.setId_tipoVenta("");
        tipoVenta.setDesc_tipoVenta("");

        Usuario usuario = new Usuario();
        usuario.setId_Usuario("");
        usuario.setNom_usuario("");
        usuario.setPwd_usuario("");
        usuario.setFecha_creacion("");
        usuario.setFecha_modificacion("");
        usuario.setMail("");
        usuario.setDireccion("");
        usuario.setFono("");
        
        SubProducto subProducto = new SubProducto();
        subProducto.setId_producto("");
        subProducto.setId_subProducto("");
        subProducto.setDesc_subProducto("");

        RegionEstado regionEstado = new RegionEstado();
        regionEstado.setId_regionEstado("");
        regionEstado.setDesc_regionEstado("");

        Proveedor proveedor = new Proveedor();
        proveedor.setId_proveedor("");
        proveedor.setNom_proveedor("");
        proveedor.setrSocial_proveedor("");
        proveedor.setRut_proveedor("");
        proveedor.setUrl_proveedor("");
        proveedor.setNomContacto_proveedor("");
        proveedor.setDni_proveedor("");
        proveedor.setCod_postal_proveedor("");
        proveedor.setEmail_proveedor("");
        proveedor.setFono1_proveedor("");
        proveedor.setFono2_proveedor("");

        Promocion promocion = new Promocion();
        promocion.setId_promocion("");
        promocion.setDesc_promocion("");
        promocion.setFecha_inicion("");
        promocion.setFecha_fin("");
        promocion.setTipo_promocion("");
        promocion.setTipo_publicidad("");
        promocion.setTipo_descuento("");
        promocion.setTipo_accion("");

        Producto producto = new Producto();
        producto.setId_producto("");
        producto.setDesc_producto("");
        producto.setExistencia_producto("");
        producto.setPrecio_producto("");
        producto.setMarca_producto("");

        Precio precio = new Precio();
        precio.setId_precio("");
        precio.setDesc_precio("");
        precio.setSubProducto("");

        Persona persona = new Persona();
        persona.setId_persona("");
        persona.setNom_persona("");
        persona.setApat_persona("");
        persona.setAmat_persona("");
        persona.setCod_identi_persona("");
        persona.setEdad_persona(1);
        persona.setSexo_persona("");

        Perfil perfil = new Perfil();
        perfil.setId_perfil("");
        perfil.setDesc_perfil("");
        perfil.setFechaIni_perfil("");
        perfil.setFechaMod_perfil("");
        perfil.setEstado_perfil("");

        Pedido pedido = new Pedido();
        pedido.setId_pedido("");
        pedido.setImagen("");
        pedido.setProducto("");
        pedido.setCantidad("");
        pedido.setValor("");
        pedido.setCliente("");
        pedido.setProveedor("");
        pedido.setDireccion("");

        Pais pais = new Pais();
        pais.setId_pais("");
        pais.setNom_pais("");

        Multimedia multimedia = new Multimedia();
        multimedia.setId_multi("");
        multimedia.setDesc_multi("");
        multimedia.setProducto("");

        Moneda moneda = new Moneda();
        moneda.setId_moneda("");
        moneda.setDesc_moneda("");
        moneda.setTipo_moneda("");

        Evaluacion evaluacion = new Evaluacion();
        evaluacion.setId_evaluacion("");
        evaluacion.setDesc_evaluado("");
        evaluacion.setUser_evaluado("");
        evaluacion.setNota("");
        evaluacion.setTotal_evaluacion("");

        Direccion direccion = new Direccion();
        direccion.setId_Direccion("");
        direccion.setDesc_Direccion("");

        DetalleVenta detalleVenta = new DetalleVenta();
        detalleVenta.setId_detalleVenta("");
        detalleVenta.setCant_detalleVenta("");
        detalleVenta.setFecha_detalleVenta("");
        detalleVenta.setPrecio_unitario("");
        detalleVenta.setIva("");
        detalleVenta.setPrecio_total("");

        Despacho despacho = new Despacho();
        despacho.setId_despacho("");
        despacho.setProducto("");
        despacho.setCantidad(1);
        despacho.setCliente("");
        despacho.setDireccion("");
        despacho.setProveedor("");

        Comuna comuna = new Comuna();
        comuna.setId_comuna("");
        comuna.setDesc_comuna("");

        Compra compra= new Compra();
        compra.setId_compra("");
        compra.setDesc_compra("");
        compra.setFecha_compra("");
        compra.setCantidad_compra("");
        compra.setTotal_compra("");

    }
}
