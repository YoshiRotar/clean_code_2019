package pl.zzpj2019.solid.srp.book.solution;

import java.util.Map;

public class Printer {

    /**
     * Prints the current page.
     */
    public void printCurrentPage(Book printedBook) {
        System.out.println(printedBook.getCurrentPageContents());
    }

    /**
     * Prints all pages
     *
     * @return
     */
    public void printAllPages(Book printedBook) {
        System.out.println(printedBook.getWholeBookContent());
    }
}
