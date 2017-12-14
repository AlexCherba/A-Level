import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        new TestTreeSet().go();
    }

    public void go() {
        Book b1 = new Book("У Как устроены кошки", 300);
        Book b2 = new Book("А Постройте заново свое тело", 200);
        Book b3 = new Book("В поисках Эмо", 100);

        Comparator<Book> titleComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.title.compareTo(o2.title);
            }
        };
        Comparator<Book> sizesComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.pages > o2.pages) return +1;
                if (o1.pages < o2.pages) return -1;
                return 0;
            }
        };
        TreeSet<Book> tree = new TreeSet<Book>(titleComparator);
        //BookCompare bookCompare = new BookCompare();
        //TreeSet<Book> tree = new TreeSet<>(bookCompare);
        tree = tree;
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }

    class Book {
        String title;
        int pages;

        public Book(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        @Override
        public String toString() {
            return '\n' + "title='" + title + '\'' +
                    " pages=" + pages;
        }
    }

    class BookCompare implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            if (o1.pages > o2.pages) return +1;
            if (o1.pages < o2.pages) return -1;
            return 0;
//            return o1.title.compareTo(o2.title);
        }
    }
}
