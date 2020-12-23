
public class Task {
   
    public int ID;
    public String title;
    public String description;
    public String GroupLeader;
    public String EndDate;
    public String StartDate;
    
    public Task(int ID,String Title,String des, String GL,String ED,String SD){
        
        this.ID=ID;
        this.title=Title;
        this.StartDate=SD;
        this.EndDate=ED;
        this.GroupLeader = GL;
        this.description=des;
        
    }
    
    
}
