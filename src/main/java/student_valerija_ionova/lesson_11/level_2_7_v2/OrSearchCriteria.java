package student_valerija_ionova.lesson_11.level_2_7_v2;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if (leftCondition.match(book) || rightCondition.match(book)){
            return true;
        }else{
            return false;
        }
    }

}
