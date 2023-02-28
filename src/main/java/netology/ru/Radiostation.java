package netology.ru;

public class Radiostation {
    private int currentRadiostation;
    private int currentVolume;
    public int quantityOfRadiostations;
    private int max_Volume = 100;

    public Radiostation() {
        quantityOfRadiostations = 10;
    }

    public Radiostation(int newQuantOfRadio) {
        if (newQuantOfRadio <= 0) {
            quantityOfRadiostations = 10;
        } else {
            quantityOfRadiostations = newQuantOfRadio;
        }
    }

    public int getQuantityOfRadiostations() {
        return quantityOfRadiostations;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextRadiostation() {
        if (currentRadiostation == quantityOfRadiostations-1) {
            currentRadiostation = 0;
        } else {
            currentRadiostation = currentRadiostation + 1;
        }
    }

    public void setPrevRadiostation() {
        if (currentRadiostation == 0) {
            currentRadiostation = quantityOfRadiostations-1;
        } else {
            currentRadiostation = currentRadiostation - 1;
        }
    }

    public void setRadiostation(int newRadiostation) {
        if (newRadiostation < 0) {
            return;
        }
        if (newRadiostation > quantityOfRadiostations-1) {
            return;
        }
        currentRadiostation = newRadiostation;
    }

    public void setNextVolume() {
        if (currentVolume == max_Volume) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void setPrevVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume = currentVolume - 1;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > max_Volume) {
            return;
        }
        currentVolume = newVolume;
    }

}
