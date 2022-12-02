package io.javabrains.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latetstTotalCases;

    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatetstTotalCases() {
        return latetstTotalCases;
    }

    public void setLatetstTotalCases(int latetstTotalCases) {
        this.latetstTotalCases = latetstTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latetstTotalCases=" + latetstTotalCases +
                '}';
    }

    public void setLatestTotalCases(int latestCases) {
    }
}
