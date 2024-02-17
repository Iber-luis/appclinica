public class  cls_pacientes{

    private int codigoint;
    private string nombreStr;
    private int contactoint;
    private string epsStr;
    
    public cls_pacientes(int codigoint, string nombreStr, int contactoint, string epsStr) {
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
    public string getNombreStr() {
        return nombreStr;
    }
    public void setNombreStr(string nombreStr) {
        this.nombreStr = nombreStr;
    }
    public int getContactoint() {
        return contactoint;
    }
    public void setContactoint(int contactoint) {
        this.contactoint = contactoint;
    }
    public string getEpsStr() {
        return epsStr;
    }
    public void setEpsStr(string epsStr) {
        this.epsStr = epsStr;
    }

    

}