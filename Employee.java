public class Employee {
   String name ;
    int salary ;//maaş
    int workHours ;
    int hireYear ;//Işe başlangıç yılı

    Employee(String name,int salary,int workHours,int hireYear){//Kurucu metot olup 4 parametre alacaktır.
        this.hireYear=hireYear;
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;//haftalık çalışma saati
    }
    public double tax(){

        if(this.salary<1000){
            return 0;
        }
        if(this.salary>1000) {
            return this.salary * 0.03;
        }
          return 0;

    }
    public  int bonus(){
        if(this.workHours>40){
            return this.workHours*30;
        }
        return 0;
    }

    public double raiseSalary(){
        int year =2023;
        if(year-this.hireYear<10){
            return salary*0.05;
        }
        if(year-hireYear>9&&year-hireYear<20){
            return salary*0.1;
        }
        if (year-hireYear>19){
            return  salary *0.15;
        }
        return 0;
    }
        public double SalaryIncrease(){
        return this.bonus()-this.tax()+this.raiseSalary();
        }
        public double finalSalary(){
        return this.salary+this.SalaryIncrease();
        }
    @Override
    public String toString() {
        return "Employee{" +
                "Adı ='" + name + '\'' +
                ", Maaşı =" + salary +
                ", Çalışma Saati =" + workHours +
                ", Başlangıç Yılı =" + hireYear +
                 " Vergi = "+ tax()+
                ", Bonus = "+ bonus()+
                ", Zam = "+raiseSalary()+
                ", Maaş Artışı = "+ SalaryIncrease()+
                ", Toplam Yeni Maaş = "+finalSalary();


    }
}
