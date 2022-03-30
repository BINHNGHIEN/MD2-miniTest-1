public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook(1, "To hoc lap trinh", 100, "Nguyen Dong Chinh", "Scratch", "");
        books[1] = new ProgrammingBook(2, "To hoc lap trinh", 150, "Nguyen Dong Chinh", "Java", "");
        books[2] = new ProgrammingBook(3, "Ki su check hang", 450, "Nguyen Dong Chinh", "Java", "");
        books[3] = new ProgrammingBook(4, "Ki su uong bia", 100, "Nguyen Dong Chinh", "Java Script", "");
        books[4] = new ProgrammingBook(5, "Tam chuc Ha Nam", 200, "Nguyen Dong Chinh", "PHP", "");


        books[5] = new FictionBook(6, "Hom nay an gi", 400, "Nguyen Dong Chinh", "Am thuc");
        books[6] = new FictionBook(7, "Bi-da cho nguoi moi bat dau ", 300, "Nguyen Dong Chinh", "The thao");
        books[7] = new FictionBook(8, "Bun dau mam tom", 200, "Nguyen Dong Chinh", "Am thuc");
        books[8] = new FictionBook(9, "Lau nuong Wang Wang", 100, "Nguyen Dong Chinh", "Am thuc");
        books[9] = new FictionBook(10, "Tran cau dinh cao", 100, "Nguyen Dong Chinh", "The thao");

        double sumPriceBook =0;
        for (Book book: books) {
            sumPriceBook= sumPriceBook+ book.getPrice();
        }
        System.out.println(sumPriceBook);

        int totalJavaBook = 0;
        for (Book book: books) {
            if(book instanceof ProgrammingBook){
                if ( ((ProgrammingBook) book).getLanguage()=="Java"){
                    totalJavaBook++;
                }
            }
        }

        System.out.println(totalJavaBook);



//     ProgrammingBook programmingBook1 = new ProgrammingBook(1,"abc",100,"abc","vietnam","");
//     ProgrammingBook programmingBook2 = new ProgrammingBook(2,"abc",200,"abc","vietnam","");
//
//     double[] total = {programmingBook1.getPrice(),programmingBook2.getPrice()};
//     double sum =0;
//
//
//        for (int i = 0; i < total.length; i++) {
//            sum+= total[i];
//
//        }
//        System.out.println(sum);
//
//



    }



}






