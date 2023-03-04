package netology.ru;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radiostation {
    private int currentRadiostation;
    private int currentVolume;
    public int quantityOfRadiostations;
    private int maxVolume = 100;

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

    public void setNextRadiostation() {
        if (currentRadiostation == quantityOfRadiostations-1) {
            currentRadiostation = 0;
        } else {
            ++currentRadiostation;
        }
    }

    public void setPrevRadiostation() {
        if (currentRadiostation == 0) {
            currentRadiostation = quantityOfRadiostations-1;
        } else {
            --currentRadiostation;
        }
    }

    public void setCurrentRadiostation(int newRadiostation) {
        if (newRadiostation >= 0) {
            if (newRadiostation <= quantityOfRadiostations - 1) {
                currentRadiostation = newRadiostation;
            }
        }
    }

    public void setNextVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        ++currentVolume;
    }

    public void setPrevVolume() {
        if (currentVolume == 0) {
            return;
        }
        --currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0) {
            if (newVolume <= maxVolume) {
                currentVolume = newVolume;
            }
        }
    }

}
