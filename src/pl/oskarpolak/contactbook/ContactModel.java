package pl.oskarpolak.contactbook;

import java.util.ArrayList;
import java.util.List;

public class ContactModel {
    private String name;
    private String lastname;
    private List<NumberModel> numbers;

    public ContactModel(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.numbers = new ArrayList<>();
    }

    public ContactModel(String name, String lastname, List<NumberModel> list){
        this(name, lastname);
        numbers.addAll(list);
    }

    public void addNumber(NumberModel numberModel){
        numbers.add(numberModel);
    }

    public void addNumber(List<NumberModel> list){
        numbers.addAll(list);
    }

    public void removeNumber(NumberModel numberModel){
        numbers.remove(numberModel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<NumberModel> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberModel> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactModel that = (ContactModel) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        return numbers != null ? numbers.equals(that.numbers) : that.numbers == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (numbers != null ? numbers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}
