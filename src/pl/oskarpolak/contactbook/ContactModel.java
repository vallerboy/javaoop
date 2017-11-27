package pl.oskarpolak.contactbook;

public class ContactModel {
    private String name;
    private String lastname;


    public static class NumberModel{
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
    }
}
