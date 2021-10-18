public class InfoBook {
    String name;
    InfoPublishingHouse publish;
    int year;
    String authors[];

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

    String getName() {
        return name;
    }

    InfoPublishingHouse getPubInfo() {
        return publish;
    }

    int getYear() {
        return year;
    }

    String[] getAuthors() {
        return authors;
    }

    int getNumOfAuthors () {
        return authors.length;
    }

    String getAuthor (int i) {
        if ((i < 0) & (i > authors.length)) throw new IllegalArgumentException ("автора с таким индексом не существует");
        return authors[i];
    }

    void setName(String name) {
        if (name == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else this.name = name;
    }

    void setPublish (InfoPublishingHouse publish) {
        this.publish = publish;
    }

    void setYear(int year) {
        if (year < 0) throw new IllegalArgumentException ("год должен быть сторого больше нуля");
        this.year = year;
    }

    void setAuthors (String authors[]) {
        for (int i=0; i < authors.length; i++) {
            if (authors[i] == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        }
        this.authors = authors;
    }

    void printAuthors () {
        if (authors.length < 0) throw new IllegalArgumentException ("авторов нету");
        else for (int i=0; i < authors.length; i++) {
            System.out.print(authors[i]);
            if (i != authors.length-1) {
                System.out.print(", ");
            }
        }
    }

    void print () {
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
