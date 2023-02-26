
public class company {
static int W;
static branch T ;
public static void main(String[] args) {
    branch.DFB();
    employee.DFE();
   
System.out.println("Welcome to the database");
do {

UI.mainMnyo();
int s1 = assistant.s1();

if (s1==1){

    UI.BranchsMnyo();
    T = assistant.s2();
    
    UI.BranchsA_Mnyo();
    assistant.s3();
    
}
else{

     UI.EmployeesMnyo();
   assistant.Te = assistant.s4();


    UI.EmployeesA_Mnyo();
    assistant.s5();
}
   UI.EndingMnyo();
 W = assistant.s6();
}

 while (W == 1 );
    
} 
}

