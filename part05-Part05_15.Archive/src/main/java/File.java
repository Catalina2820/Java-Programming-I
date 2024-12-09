
public class File {
    
    private String id, name;

    public File(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    //public File(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean equals(Object comp){
    
        if (this == comp) {
            return true;
        }
    
        if (!(comp instanceof File)) {
            return false;
        }
        
        File compObj = (File) comp;
        
        return this.id.equals(compObj.getId());
    }
    
}
