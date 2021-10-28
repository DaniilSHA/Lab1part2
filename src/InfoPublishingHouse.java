public class InfoPublishingHouse {
    private String name;
    private String city;

    public InfoPublishingHouse (String name, String city) {
        setName(name);
        setCity(city);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        if (name.trim().equals("")) throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.name = name;
    }

    public void setCity(String city) {
        if (city.trim().equals("")) throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.city = city;
    }

    public void printPubHouse () {
        System.out.print("Publishing House = " + name + ", Publishing Sity = " + city);
    }
}

