public class Source {

    public static void main(String[] args) {

        QuranData myQuran = new QuranData();



        //trial for func
        int divisions[] = myQuran.getDivisionHeaderByVerse( 1.00,4000,6201);

        int pages = 0;
        for (int r: divisions)
        {
            pages++;
            System.out.println( myQuran.getSurahName(r) + " : " +   myQuran.getVerseInChapter(r));
        }
        System.out.println("Pages : " + pages);

  }

}
