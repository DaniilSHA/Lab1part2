public class InfoPublishingHouse {
    protected String name;
    protected String city;

    InfoPublishingHouse (String name, String city) {
        setName(name);
        setCity(city);
    }

    protected String getName() {
        return name;
    }

    protected String getCity() {
        return city;
    }

    protected void setName(String name) {
        if (name == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.name = name;
    }

    protected void setCity(String city) {
        if (city == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.city = city;
    }

    protected void printPubHouse () {
        System.out.print("Publishing House = " + name + ", Publishing Sity = " + city);
    }
}

