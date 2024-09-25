package emp;

public class Employee {
        public int id;
        public String name;
        public int[] year;
        public String place;
        public int salary;
        public String marital;
    public Employee(int id, String _name, int[] _year, String _place,
                    int _salary, String _marital){
        this.id = id;
        name = _name;
        year = _year;
        place = _place;
        salary = _salary;
        marital = _marital;
    }
    @Override
    public String toString(){
        return "Employee " + id + " " + name + " " + year[0] + "." + year[1] + "." + year[2] + " " + place + " " + salary + " " + marital;
    }

}

