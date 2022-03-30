public class ProgrammingBook  extends Book{
    private String language;
    private String framework;
    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(double bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getFramework() {
        return framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
