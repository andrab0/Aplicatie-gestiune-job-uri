package TEMA_POO;

public class DepartmentFactory {
    public static Department createDepartment(String tipDepartament) {
        if (tipDepartament.equals("IT"))
            return new IT();

        if (tipDepartament.equals("Management"))
            return new Management();

        if (tipDepartament.equals("Marketing"))
            return new Marketing();

        if (tipDepartament.equals("Finance"))
            return new Finance();

        return null;
    }
}
