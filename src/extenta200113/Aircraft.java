package extenta200113;

public class Aircraft {

    private String code;
    private double lat;
    private double lon;
    private int alt;

    /**
     * Skapar ett flygplan med kod code på positionen lat, lon, alt
     */
    Aircraft(String code, double lat, double lon, int alt) {
        this.code = code;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
    }

    /**
     * Uppdaterar planets position med nya värden
     */
    void update(double lat, double lon, int alt) {
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
    }

    /**
     * Returnerar flygplanets kod
     */
    String getCode() {
        return code;
    }

    /**
     * Returnerar flygplanets latitud
     */
    double getLatitude() {
        return lat;
    }

    /**
     * Returnerar flygplanets longitud
     */
    double getLongitude() {
        return lon;
    }

    /**
     * Returnerar flygplanets altitud
     */
    int getAltitude() {
        return alt;
    }

    /**
     * Returnerar avståndet till flygplanet p (i feet)
     */
    int distanceTo(Aircraft p) {
        return 0;
    }

}
