public class branch {

    private String branchName; 
    private String branchAddress;
    private String branchJob;
    private String branchLocation;
    

    public branch(String a ,String b , String c , String d ){

     this.branchName = a ;
     this.branchLocation = b ;
     this.branchAddress = c ; 
     this.branchJob = d ;
    }
   public void setBranchName(String a){
     this.branchName=a;
    }
     public String getBranchName(){

        return this.branchName;
     }
     public void setBranchAddress(String a){
      this.branchAddress=a;
     }

     public String getBranchAddress(){

        return this.branchAddress;
     }
     public void setBranchJob(String a){
      this.branchJob=a;
     }
     public String getBranchJob(){

        return this.branchJob;
     }
     public void setBranchLocation(String a){
      this.branchLocation=a;
     }
     public String getBranchLocation(){

        return this.branchLocation;
     }
     

     public static void DFB(){
      branch Mc = new branch("Mecca branc", "Mecca city", "Al-Amra Street, Al-Salamah neighborhood", "Administration");
      branch Jc = new branch("Jeddah branc", "Jeddah city", "Prince Sultan Street", "seafood export and processing");
      branch Tc = new branch("Taif branc", "Taif city", "King Abdullah Street", "Livestock export and processing");

      assistant.addBranch(Mc);
      assistant.addBranch(Jc);
      assistant.addBranch(Tc);
   }

}
