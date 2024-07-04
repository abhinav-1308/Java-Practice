/*2. A plastic manufacturer sells plastic In different shapes like 2D sheet and 3D bax. The cost of
sheet is Rs 40/ per square ft. and the cost of box ls Rs 60/ per cublc ft. Implement it In lava to
calculate the cost of plastic as per the dimensions given by the user where 30 Inherits (rom 2D.*/

class Employee {
    int empId;
    int deptId;

    public Employee(int empId, int deptId) {
        this.empId = empId;
        this.deptId = deptId;
    }

    public double getEncashmentAmount(int numDays) {
        return numDays * 600;
    }
}

class Worker extends Employee {
    public Worker(int empId, int deptId) {
        super(empId, deptId);
    }

    public double getEncashmentAmount(int numDays) {
        return numDays * 500;
    }
}

class Manager extends Employee {
    public Manager(int empId, int deptId) {
        super(empId, deptId);
    }

    public double getEncashmentAmount(int numDays) {
        return numDays * 400 / 2.0;
    }
}

public class lab8p2 {
    public static void main(String[] args) {
        int empId = 12345;
        int deptId = 101;
        int numDays = 10;

        Employee emp = new Employee(empId, deptId);
        Worker worker = new Worker(empId, deptId);
        Manager manager = new Manager(empId, deptId);

        double empEncashment = emp.getEncashmentAmount(numDays);
        double workerEncashment = worker.getEncashmentAmount(numDays);
        double managerEncashment = manager.getEncashmentAmount(numDays);

        System.out.println("WHITE SLAVE Encashment: Rs " + empEncashment);
        System.out.println("BLACK SLAVE Encashment: Rs " + workerEncashment);
        System.out.println("INDIAN KING Encashment: DOLLARS " + managerEncashment);
    }
}