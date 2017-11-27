package pl.oskarpolak.contactbook;

public class NumberModel{
    private String number;
    private String type; // Byłby to enum :)
    private boolean isActive;

    public NumberModel(String number, String type, boolean isActive) {
        this.number = number;
        this.type = type;
        this.isActive = isActive;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberModel that = (NumberModel) o;

        if (isActive != that.isActive) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NumberModel{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}