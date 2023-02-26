public class employee {
    
   private String employeeName;
   private String employeeDateOfBirth;
   private String employeeSalary;
   private String employeeMaritalStatus;
   private String employeeJob;
   private String employeebranch;
   
   public employee(String a ,String b , String c , String d , String e , String f){
   
       this.employeeName = a ;
       this.employeeDateOfBirth = b ;
       this.employeeSalary = c ; 
       this.employeeJob = d ;
       this.employeeMaritalStatus = e;
       this.employeebranch = f ;
      }
      public String getEmployeeName(){
   
       return this.employeeName;
    }
    public String getEmployeeDateOfBirth(){
   
       return this.employeeDateOfBirth;
    }
    public String getEmployeeSalary(){
   
       return this.employeeSalary;
    }
    public String getEmployeeMaritalStatus(){
   
       return this.employeeMaritalStatus;
    }
    public String getEmployeeJob(){
   
       return this.employeeJob;
    }
    public String getEmployeeBranch(){
   
      return this.employeebranch;
   }
    
   public static void DFE(){
      employee Mohammed = new employee("Mohammed", "1/1/1999", "40000ريال", "Manager", "married" , "Mecca branc");

      employee khalid = new employee("khalid", "1/2/1997", "18000ريال", "Hr", "married" , "Mecca branc");
      
      employee Youssef = new employee("Youssef", "6/1/1995", "20000ريال", "supervisor", "Widower" , "Mecca branc");
      
      assistant.addEmployee(Mohammed);
      assistant.addEmployee(khalid);
      assistant.addEmployee(Youssef);
      
      
      employee Fahad = new employee("Fahad", "6/12/2002", "8000ريال", "trainee", "Unmarried" , "Jeddah branc");
      
      employee rashid = new employee("rashid", "6/12/1989", "15000ريال", "advisor", "married" , "Jeddah branc");
      
      employee amyr = new employee("amyr", "6/12/1989", "45000ريال", "Manager", "married" , "Jeddah branc");
      
      assistant.addEmployee(Fahad);
      assistant.addEmployee(rashid);
      assistant.addEmployee(amyr);
      
      employee salih = new employee("salih", "6/12/2001", "9000ريال", "delivery guy", "engaged" , "Taif branc");
      
      employee thamir = new employee("thamir", "6/12/1993", "15000ريال", "advisor", "relation's director" , "Taif branc");
      
      employee Majed = new employee("Majed", "6/12/1989", "50000ريال", "Manager", "married" , "Taif branc");
      
      assistant.addEmployee(salih);
      assistant.addEmployee(thamir);
      assistant.addEmployee(Majed);
   }
   
   }
   
   
   







