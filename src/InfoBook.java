public class InfoBook {
    private String name;
    private InfoPublishingHouse publish;
    private int year;
    private String authors[];

    InfoBook (String name, int year, InfoPublishingHouse publish) {
        setName(name);
        setYear(year);
        setPublish(publish);
    }

    InfoBook (String name, String author, int year, InfoPublishingHouse publish) {
        setName(name);
        String[] oneAuthor = {author};
        setAuthors(oneAuthor);
        setYear(year);
        setPublish(publish);
    }

    InfoBook (String name, String[] author, int year, InfoPublishingHouse publish) {
        setName(name);
        setAuthors(author);
        setYear(year);
        setPublish(publish);
    }

    public String getName() {
        return name;
    }

    public InfoPublishingHouse getPubInfo() {
        return publish;
    }

    public int getYear() {
        return year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getNumOfAuthors () {
        return authors.length;
    }

    public String getAuthor (int i) {
        if ((i < 0) & (i > authors.length)) throw new IllegalArgumentException ("автора с таким индексом не существует");
        return authors[i];
    }

    public void setName(String name) {
        if (name == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.name = name;
    }

    public void setPublish (InfoPublishingHouse publish) {
        this.publish = publish;
    }

    public void setYear(int year) {
        if (year < 0) throw new IllegalArgumentException ("год должен быть сторого больше нуля");
        this.year = year;
    }

    public void setAuthors (String authors[]) {
        for (int i=0; i < authors.length; i++) {
            if (authors[i] == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        }
        this.authors = authors;
    }

    public void printAuthors () {
        if (authors.length < 0) throw new IllegalArgumentException ("авторов нету");
        else for (int i=0; i < authors.length; i++) {
            System.out.print(authors[i]);
            if (i != authors.length-1) {
                System.out.print(", ");
            }
        }
    }

    public void print () {
        if (authors == null) {
            System.out.println("name = " + name + "; Publishing House = " + publish.name + "; Year = " + year);
        }
        else {
            System.out.print("name = " + name);
            if (authors.length == 1) System.out.print("; author = "); else System.out.print("; authors = ");
            printAuthors();
            System.out.println("; Publishing House = " + publish.name + "; Publishing City = " + publish.city + "; Year = " + year +".");
        }
    }

    public static void printAll (InfoBook list[]) {
        for (int i=0; i < list.length; i++) {
            list[i].print();
        }
    }


}
