public class InfoPublishingHouse {
    String name;
    String city;

    InfoPublishingHouse (String name, String city) {
        setName(name);
        setCity(city);
    }

    String getName() {
        return name;
    }

    String getCity() {
        return city;
    }

    void setName(String name) {
        if (name == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.name = name;
    }

    void setCity(String city) {
        if (city == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.city = city;
    }

    void printPubHouse () {
        System.out.print("Publishing House = " + name + ", Publishing Sity = " + city);
    }
}

