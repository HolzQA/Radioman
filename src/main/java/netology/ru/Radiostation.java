package netology.ru;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radiostation {
    private int currentRadiostation;
    private int currentVolume;
    public int quantityOfRadiostations = 10;
    private int maxVolume = 100;

   public Radiostation(int newQuantOfRadio) {
        if (newQuantOfRadio > 0) {
            quantityOfRadiostations = newQuantOfRadio;
        }
    }

    public void setNextRadiostation() {
        if (currentRadiostation == quantityOfRadiostations - 1) {
            currentRadiostation = 0;
        } else {
            currentRadiostation = currentRadiostation + 1;
        }
    }

    public void setPrevRadiostation() {
        if (currentRadiostation == 0) {
            currentRadiostation = quantityOfRadiostations - 1;
        } else {
            currentRadiostation = currentRadiostation - 1;
        }
    }

    public void setRadiostation(int newRadiostation) {
        if (newRadiostation < 0) {
            return;
        }
        if (newRadiostation > quantityOfRadiostations - 1) {
            return;
        }
        currentRadiostation = newRadiostation;
    }

    public void setNextVolume() {
        if (currentVolume == maxVolume) {
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
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

}
