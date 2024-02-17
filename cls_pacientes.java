public class  cls_pacientes{

    private int codigoint;
    private String nombreStr;
    private int contactoint;
    private String epsStr;

    public cls_pacientes(int codigoint, String nombreStr, int contactoint, String epsStr) {
        this.codigoint = codigoint;
        this.nombreStr = nombreStr;
        this.contactoint = contactoint;
        this.epsStr = epsStr;
    }

    public int getCodigoint() {
        return codigoint;
    }

    public void setCodigoint(int codigoint) {
        this.codigoint = codigoint;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public int getContactoint() {
        return contactoint;
    }

    public void setContactoint(int contactoint) {
        this.contactoint = contactoint;
    }

    public String getEpsStr() {
        return epsStr;
    }

    public void setEpsStr(String epsStr) {
        this.epsStr = epsStr;
    }

}