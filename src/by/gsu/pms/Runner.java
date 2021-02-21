import by.gsu.pms.Expen;
public class Runner {
    public static void main(String[] args) {
        Expen[] employees = {
        new Expen("Sergey", 6000, 5),
        new Expen("Alexandr", 12000, 3),
        null,
        new Expen("Andrey", 3000, 3),
        new Expen("Maksim", 4500, 2),
        new Expen("Dmitry", 9000, 4),
        new Expen(),
        };

        
    for (Expen employee : employees) {
        if (employee != null){
            employee.show();
            System.out.println("______________");
        }
    }
    employees[6]. setExpenses(13500);
        System.out.println(employees[6]);
        System.out.println("Duration = "+(employees[0].getDays()+employees[5].getDays()));
        for (Expen employee : employees) {
        System.out.println(employee);
    }
    int totalExpenses = 0;
    for (Expen employee : employees) {
        if (employee != null) {
            totalExpenses += employee.getTotal();
        }
    }
    System.out.println("Total expenses = " + totalExpenses);
    int max = 0;
        for (Expen employee : employees) {
            if (employee != null && employee.getTotal() > max) {
                max = employee.getTotal();
            }
        }
        System.out.println("Max = " + max);

    }
}
    
