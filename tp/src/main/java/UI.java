public class UI {
    // قائمت البديه

    public static void mainMnyo(){
        System.out.println("What do you want to know about?");

     System.out.println("for branchs: 1 \t for employees: 2");
    }

//------------------------------------------------------------------------
    // قائمت الفروع
public static void BranchsMnyo(){
    
    
        System.out.println("What branch do you want to know about?");
        int n = 0;
        int i = 0;
        for(branch l :assistant.branchs){
            
            n=n+1;
           
           l = assistant.branchs.get(i);
           i = i+1;
            System.out.println(l.getBranchName()+ (": ") + (n));
            
           
        }
        System.out.println("to add a new branch: " + (assistant.branchs.size()+1));
    }
 //----------------------------------------------------------------------------
// قائمت بيانات الفروع

     public static void BranchsA_Mnyo(){
     
    System.out.println("What would you like to know?");
    System.out.println("for branch Name: 1 \t for branch Address: 2 \t for branch Job: 3 \t for branch Location: 4 \t for branc employees: 5");   

     }
     //-------------------------------------------------------------------------------------------------------
     // قائمت الموضفين

     public static void EmployeesMnyo(){
    
    
        
       System.out.println("What Employee do you want to know about?");
        int n = 0;
        int i = 0;
        for(employee l :assistant.employees){
            
            n=n+1;
           
           l = assistant.employees.get(i);
           i = i+1;
            System.out.print(l.getEmployeeName()+ (": ") + (n)+"\t");
            
           
        }
        System.out.println("\t to add a new branch: " + (assistant.employees.size()+1));
    }
    //--------------------------------------------------------------------------------------------------------------------
     // قائمت بيانات الموضفين
    public static void EmployeesA_Mnyo(){
     
        System.out.println("What do you want to know about him?");
        System.out.println("for employee Name: 1 \t for employee Date Of Birth: 2 \t for mployee Job: 3 \t for branch employee Salary: 4 \t for employee branch: 5 \t for employee Marital Status: 6");
    }
//--------------------------------------------------------------------------------------------------------------------
    public static void EndingMnyo(){
     
        System.out.println("If you want to continue, click: 1 \t to finish: 2");
    }
//---------------------------------------------------------------------------------------------------------------------
    // قائمت الفروع للموضفين الجدد
    public static void EmployeeBranchsMnyo(){
    
    
        System.out.println("What branch do you want to know about?");
        int n = 0;
        int i = 0;
        for(branch l :assistant.branchs){
            
            n=n+1;
           
           l = assistant.branchs.get(i);
           i = i+1;
            System.out.println(l.getBranchName()+ (": ") + (n));
            
           
        }
        
    }


    
}
