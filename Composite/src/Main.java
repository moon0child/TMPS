public class Main {
    public static void main(String args[]){
        Department aiDepartment = new AIDepartment(
                1, "AI department");
        Department itDepartment = new ITDepartment(
                2, "IT department");

        CompositeClass compositeClass = new CompositeClass(
                3, "Composite department");

        compositeClass.addDepartment(aiDepartment);
        compositeClass.addDepartment(itDepartment);
        compositeClass.addDepartment(itDepartment);

        compositeClass.printDepartmentName();
    }
    }

