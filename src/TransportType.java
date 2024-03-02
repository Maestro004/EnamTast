public enum TransportType {
    CAR(50),
    BUS(50),
    TRACK(50);
    private double prise;

    TransportType(double prise) {
        this.prise = prise;
    }

    public double calkulaateTravelCost(double distance){
        double num = distance + prise;
        return num;
    }
}
