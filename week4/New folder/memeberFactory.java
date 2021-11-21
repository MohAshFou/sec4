
package factorymethod;


public class memeberFactory {
    public staff  get_memeber(String desire_mem ){
        String s= desire_mem.toLowerCase();
        switch(s){
            case "doctor" :
                           return new Doctor ();
            case "teachingassistant" :
                            return new TeachingAssistant ();
                        default :
                            return null;
        }
    
    
    
    }
    
}
