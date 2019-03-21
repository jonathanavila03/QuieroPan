package Clases;

public class Cliente {

    private String cli_id_cliente;
    private String cli_nombre;
    private String cli_fono;
    private char cli_sexo;
    private Integer cli_edad;
    private String cli_grupoEdad;
    private String cli_mail;
    private Integer cli_income;
    private String cli_estadoCivil;
    private String cli_hijos;
    private String cli_miembrosFam;

    public Cliente() {
    }

    public String getCli_id_cliente() {
        return cli_id_cliente;
    }

    public void setCli_id_cliente(String cli_id_cliente) {
        this.cli_id_cliente = cli_id_cliente;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_fono() {
        return cli_fono;
    }

    public void setCli_fono(String cli_fono) {
        this.cli_fono = cli_fono;
    }

    public char getCli_sexo() {
        return cli_sexo;
    }

    public void setCli_sexo(char cli_sexo) {
        this.cli_sexo = cli_sexo;
    }

    public Integer getCli_edad() {
        return cli_edad;
    }

    public void setCli_edad(Integer cli_edad) {
        this.cli_edad = cli_edad;
    }

    public String getCli_grupoEdad() {
        return cli_grupoEdad;
    }

    public void setCli_grupoEdad(String cli_grupoEdad) {
        this.cli_grupoEdad = cli_grupoEdad;
    }

    public String getCli_mail() {
        return cli_mail;
    }

    public void setCli_mail(String cli_mail) {
        this.cli_mail = cli_mail;
    }

    public Integer getCli_income() {
        return cli_income;
    }

    public void setCli_income(Integer cli_income) {
        this.cli_income = cli_income;
    }

    public String getCli_estadoCivil() {
        return cli_estadoCivil;
    }

    public void setCli_estadoCivil(String cli_estadoCivil) {
        this.cli_estadoCivil = cli_estadoCivil;
    }

    public String getCli_hijos() {
        return cli_hijos;
    }

    public void setCli_hijos(String cli_hijos) {
        this.cli_hijos = cli_hijos;
    }

    public String getCli_miembrosFam() {
        return cli_miembrosFam;
    }

    public void setCli_miembrosFam(String cli_miembrosFam) {
        this.cli_miembrosFam = cli_miembrosFam;
    }
}
