package Kniznica;

class Autor {
private String meno,email,pohlavie;

public Autor(String meno,String email, String pohlavie){
    this.meno = meno;
    this.email = email;
    if(pohlavie.equalsIgnoreCase("man") || pohlavie.equalsIgnoreCase("woman"))this.pohlavie = pohlavie;
    else this.pohlavie =pohlavie;
}

    public String getMeno() {
        return this.meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPohlavie() {
        return this.pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}