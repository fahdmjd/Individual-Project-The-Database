import java.util.*;
public class assistant {
   public static branch  y;
   public static employee  x;
   public static ArrayList<branch> branchs = new ArrayList<branch>(); 
   public static ArrayList<employee> employees = new ArrayList<employee>(); 
   static branch N = new branch(null, null, null, null);
   
   public static employee Te ;
   static Scanner K = new Scanner(System.in);
   //---------------------------------------------------------------------------
   public static void addBranch(branch a){
   branchs.add(a);
   }
   
   public static void addEmployee(employee a){
   employees.add(a);

   }
   //----------------------------------------------------------------------------
   // تمكين المستخدم من اختيار المعلومات المعروضه
   public static int s1(){
     int s1 = K.nextInt();
     while (s1!=1&&s1!=2){
     System.out.println("The number you entered is not valid, try again");   
     s1 = K.nextInt();
    }
    return s1;
    }
   //----------------------------------------------------------------------------
   // تمكين المستخدم من اختيار الفرع
   public static branch s2(){
    int s2 = K.nextInt();
    while (s2<1||s2>(branchs.size()+1)){
    System.out.println("The number you entered is not valid, try again");   
    s2 = K.nextInt();
    }
     
    for ( branch l : branchs ){
      if ((s2)<= branchs.size() ){
     
      return branchs.get(s2-1);
     
    }
    else {
     assistant.AddNewBranch();
     System.out.println( "The branch has been added successfully");
    return branchs.get(branchs.size()-1) ;
    
    }
  
  }

    return null ;


   }
   //---------------------------------------------------------------------------------
   // تمكين المستخدم من اختيار البيانات
   public static void s3(){
    int s3 = K.nextInt();
     while (s3<1||s3>5){
    System.out.println("The number you entered is not valid, try again");   
    s3 = K.nextInt();
    }

    switch(s3){
      case 1:
      System.out.println(company.T.getBranchName());
      break ;
      case 2:
      System.out.println( company.T.getBranchAddress());
      break ;
      case 3:
      System.out.println( company.T.getBranchJob());
      break ;
      case 4:
      System.out.println( company.T.getBranchLocation());
      break ;
      case 5:
      for(employee x : employees){
        if ((x.getEmployeeBranch()).equals(company.T.getBranchName())){
          System.out.println(x.getEmployeeName());
        }
        else{}
      }
      break ;
     
    }
  }
  //--------------------------------------------------------------------------------
   // تمكين النستخدم من اختيار الموضف
  public static employee s4(){
    int s4 = K.nextInt();
    while (s4<1||s4>(employees.size()+1)){
   System.out.println("The number you entered is not valid, try again");   
   s4 = K.nextInt();
    }
    for ( employee l : employees ){
      if ((s4)<= employees.size() ){
     
    return employees.get(s4-1);
     
    }
    else {
     assistant.addNewEmployee(l);
     System.out.println( "The Employee has been added successfully");
     return employees.get(employees.size()-1) ;
     
    }
  
  }

    return null;


  }
  //------------------------------------------------------------------------------------
  // تمكين المستخدم من اختيار البيانات
  public static void s5(){
    int s5 = K.nextInt();
    while (s5<1||s5>6){
    System.out.println("The number you entered is not valid, try again");   
    s5 = K.nextInt();
     }

    switch(s5){
      case 1:
      System.out.println( Te.getEmployeeName());
      break ;
      case 2:
      System.out.println( Te.getEmployeeDateOfBirth());
      break ;
      case 3:
      System.out.println( Te.getEmployeeJob());
      break ;
      case 4:
      System.out.println( Te.getEmployeeSalary());
      break ;
      case 5:
      System.out.println( Te.getEmployeeBranch());
      break ;
      case 6:
      System.out.println( Te.getEmployeeMaritalStatus());
      break ;
      
    }
  }
  //------------------------------------------------------------------------------------
   // معرفت ما اذا كان المستخدم قد انتها ام لا
  public static int s6(){


    int s6 = K.nextInt();
    while (s6<1||s6>2){
       System.out.println("The number you entered is not valid, try again");   
       s6 = K.nextInt();
        }
        return s6 ;

  }
  //---------------------------------------------------------------------------------------
  // اضافت موضف جديدي

   public static void addNewEmployee(employee a){
    System.out.println("Please enter the employee Name");
    String name = K.next();

    System.out.println("Please enter the employee Date Of Birth");
    String Date = K.next();

    System.out.println("Please enter the employee Job");
    String Job = K.next();
    
    System.out.println("Please enter the employee Salary");
    String Salary = K.next();

    System.out.println("Please choose the employee branch");
    UI.EmployeeBranchsMnyo();
    
    branch L = s2();
    String branch = L.getBranchName();
    
    System.out.println("Please enter the employee Marital Status");
    String Marital = K.next();

    employee Z = new employee(name, Date, Job, Salary, branch, Marital);
    
    employees.add(Z);
   }
   
   //------------------------------------------------------------------
    // اضافت فرع جديد

      public static void AddNewBranch() {
     
    System.out.println("Please enter the Branch Name");
    String name = K.next();
    N.setBranchName(name);

    System.out.println("Please enter the Branch Address");
    String Address = K.next();
    N.setBranchAddress(Address);

    System.out.println("Please enter the Branch Job");
    String Job = K.next();
    N.setBranchJob(Job);

    System.out.println("Please enter the Branch Location");
    String Location = K.next();
    N.setBranchLocation(Location);

    branchs.add(N);
    
   }
   
}
