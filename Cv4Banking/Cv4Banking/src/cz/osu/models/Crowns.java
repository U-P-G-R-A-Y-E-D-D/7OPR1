package cz.osu.models;

public class Crowns {

    private long hallers;
    private static final int HELLERS_TO_CROWN = 100;

    public Crowns(double crowns) {
        this.hallers = Math.round(crowns * HELLERS_TO_CROWN);
    }

    public Crowns(Crowns crowns) {
        hallers = crowns.getHallers();
    }

    public long getHallers() {
        return hallers;
    }

    public long getCrowns() {
        return getHallers() / HELLERS_TO_CROWN;
    }

    public long getRemainingHallers() {
        return getHallers() % HELLERS_TO_CROWN;
    }

    public void print() {
        System.out.println(toString());
    }

    public Crowns plus(Crowns crowns) {
        return new Crowns((double) (this.getHallers() + crowns.getHallers()) / HELLERS_TO_CROWN);
    }

    public Crowns plus(double crowns) {
        return this.plus(new Crowns(crowns));
    }

    public Crowns minus(Crowns crowns) {
        return new Crowns((double) (this.getHallers() - crowns.getHallers()) / HELLERS_TO_CROWN);
    }

    public Crowns minus(double crowns) {
        return this.minus(new Crowns(crowns));
    }

    public Crowns multiply(double crowns) {
        return new Crowns((double) (Math.round(getHallers() * crowns)) / HELLERS_TO_CROWN);
    }
    
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("");
        if (getCrowns() == 0 && getHallers() < 0) {
            stringBuffer.append('-');
        }
        stringBuffer.append(getCrowns());
        stringBuffer.append(',');
        long remainingHellers = Math.abs(getRemainingHallers());
        if (remainingHellers == 0) {
            stringBuffer.append("00");
        } else {
            if (remainingHellers < 10) {
                stringBuffer.append('0');
            }
            stringBuffer.append(remainingHellers);
        }
        stringBuffer.append(" CZK");
        return stringBuffer.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (!object.getClass().equals(this.getClass())) {
            return false;
        }
        
        Crowns crowns = (Crowns)object;
        return this.getHallers() == crowns.getHallers();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (this.hallers ^ (this.hallers >>> 32));
        return hash;
    }
}
