package Lista;

public class Car {
    private String placa;
    private String name;
    private String phone;
    private String documento;
    private String hora;
    private Car sig;
    private Car ant;
    private int pos;

    public String getPlaca() {
        return placa;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    } 
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Car getSig() {
        return sig;
    }

    public void setSig(Car sig) {
        this.sig = sig;
    }

    public Car getAnt() {
        return ant;
    }

    public void setAnt(Car ant) {
        this.ant = ant;
    }
}
