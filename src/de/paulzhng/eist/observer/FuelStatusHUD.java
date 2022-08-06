package de.paulzhng.eist.observer;

class FuelStatusHUD implements Observer<Integer> {

    private boolean showChange;

    public void setShowChange(boolean showChange) {
        this.showChange = showChange;
    }

    @Override
    public void update(Integer fuel) {
        if (showChange) {
            System.out.println("Fuel status: " + fuel + "%");
        }
    }
}
