package netology.ru;

public class Radiostation {
    private int currentRadiostation;
    private int currentVolume;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextRadiostation(int oldRadiostation) {
        if (oldRadiostation == 9) {
            currentRadiostation = 0;
        } else {
            currentRadiostation = oldRadiostation + 1;
        }
    }

    public void setPrevRadiostation(int oldRadiostation) {
        if (oldRadiostation == 0) {
            currentRadiostation = 9;
        } else {
            currentRadiostation = oldRadiostation - 1;
        }
    }

    public void setRadiostation(int newRadiostation) {
        if (newRadiostation < 0) {
            return;
        }
        if (newRadiostation > 9) {
            return;
        }
        currentRadiostation = newRadiostation;
    }

    public void setNextVolume(int oldVolume) {
        if (oldVolume == 10) {
            currentVolume = 0;
        } else {
            currentVolume = oldVolume + 1;
        }
    }

    public void setPrevVolume(int oldVolume) {
        if (oldVolume == 0) {
            currentVolume = 10;
        } else {
            currentVolume = oldVolume - 1;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

}
