public class Buty {
    private String model;
    private int cena;

    public Buty(String model, int cena) {
        this.model = model;
        this.cena = cena;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Buty other = (Buty) obj;
        if (model == null) {
            if(other.model!=null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (this.cena != other.cena)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Buty{" +
                "model='" + model + '\'' +
                ", cena=" + cena +
                '}';
    }
}
