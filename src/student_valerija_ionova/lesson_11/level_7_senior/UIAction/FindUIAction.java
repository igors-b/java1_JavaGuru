package student_valerija_ionova.lesson_11.level_7_senior.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior.*;

import java.util.*;

public class FindUIAction implements UIAction {

    private BookDatabase bookDatabase;

    FindUIAction (BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(
                "1: Find by author\n" +
                "2: Find by title\n" +
                "3: Find by issue year\n" +
                "4  Specify paging\n" +
                "5  Specify sorting criteria\n");

        Set<SearchCriteria> setOfSearchCriteria = new HashSet<>();
        Paging paging = new Paging();
        SortCriteria sortCriteria = SortCriteria.ASCENDING;

        int selectedMenuNumber;
        Scanner in = new Scanner (System.in);

        do {
            selectedMenuNumber = enterMenuNumber();

            switch (selectedMenuNumber) {
                case 1: {
                    System.out.println("Please enter author:");
                    String author = in.nextLine();
                    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(author);
                    setOfSearchCriteria.add(authorSearchCriteria);
                    break;
                }
                case 2: {
                    System.out.println("Please enter title:");
                    String title = in.nextLine();
                    SearchCriteria titleSearchCriteria = new TitleSearchCriteria(title);
                    setOfSearchCriteria.add(titleSearchCriteria);
                    break;
                }
                case 3: {
                    System.out.println("Please enter year of issue:");
                    String year = in.nextLine();
                    SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria(year);
                    setOfSearchCriteria.add(yearSearchCriteria);
                    break;
                }
                case 4: {
                    //System.out.println("Please enter paging criteria:");
                    paging.createPagingCriteria();
                    break;
                }
                case 5: {
                    System.out.println("Please enter sorting criteria");
                    String sortingCriteria = in.nextLine();
                    //SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria(year);
                    //setOfSearchCriteria.add(yearSearchCriteria);
                    break;
                }
            }
        }while (selectedMenuNumber != 6) ;

        List<SearchCriteria> listOfCriteria = new ArrayList<>(setOfSearchCriteria);
        List <Book> result = bookDatabase.find(listOfCriteria, paging, sortCriteria);

        if (result.size() == 0){
            System.out.println("Nothing were found");
        }else{
            System.out.println("Books:\n" + result);
        }
    }

    private int enterMenuNumber() {
        Scanner sc = new Scanner(System.in);
        int userSelectedMenuNumber;
        do{
            while (true) {
                try {
                    System.out.println("Please choose criterion for find or press 6 to start search:\n");
                    userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("It's not number!");
                }
            }
            if ((userSelectedMenuNumber <1) || (userSelectedMenuNumber > 6)){
                System.out.println("It's not valid number");
            }
        }while((userSelectedMenuNumber <1) || (userSelectedMenuNumber > 6));
        return userSelectedMenuNumber;
    }
}
