package author;

public class Author {
    private String surname;
    private String nationality;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
//package author;
//
//public class Main2 {
//    public static void main(String[] args) {
//
//        Author author = new Author();
//        author.setSurname("Mike");
//        author.setNationality("Italian");
//
//        Poem poem = new Poem();
//        poem.setCreator(author);
//        poem.setStropheNumbers(25);
//
//        Author author1 = new Author();
//        author1.setSurname("Panusen");
//        author1.setNationality("Finnish");
//
//        Poem poem1 = new Poem();
//        poem.setCreator(author1);
//        poem.setStropheNumbers(76);
//
//        Author author2 = new Author();
//        author2.setSurname("Joosep");
//        author2.setNationality("Estonian");
//
//        Poem poem2 = new Poem();
//        poem.setCreator(author2);
//        poem.setStropheNumbers(10);
//
//        Poem[] poems = {poem, poem1, poem2};
//        Author bestAuthor = getBestAuthor(poems);
//        System.out.printf("\n %s has written the longest poem", bestAuthor.getSurname());
//    }
//        private static Author getBestAuthor (Poem[]poems)
//        {
//            int counter = 0;
//            for (int i = 1; i < poems.length; i++) {
//                if (poems[counter].getStropheNumbers() < poems[i].getStropheNumbers()) {
//                    counter = i;
//                }
//            }
//        return poems[counter].getCreator();