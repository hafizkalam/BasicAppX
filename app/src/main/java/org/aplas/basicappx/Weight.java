package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = 0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double ounce) {
        this.gram = ounce * 28.3495231;
    }

    public void setPound(double pound) {
        this.gram = pound * 453.59237;
    }

    public double getGram() {
        return this.gram;
    }

    public double getOunce() {
        return this.gram / 28.35;
    }

    public double getPound() {
        return this.gram / 454;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        if (oriUnit.equals("Grm")) {
            this.setGram(value);
        } else if (oriUnit.equals("Onc")) {
            this.setOunce(value);
        } else if (oriUnit.equals("Pnd")) {
            this.setPound(value);
        }

        if (convUnit.equals("Grm"))
            value = this.getGram();
        else if (convUnit.equals("Onc"))
            value = this.getOunce();
        else if (convUnit.equals("Pnd"))
            value = this.getPound();

        return value;
    }
}
