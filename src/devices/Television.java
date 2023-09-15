package devices;

public class Television implements ElectronicDevice {

    private int volume = 0;
    private String name;
    public Television(String name){
        this.name = name;
    }

    @Override
    public void off() {
        System.out.println(name+" TV is off");
        
    }

    @Override
    public void on() {
        System.out.println(name+" TV is on");
        
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println(name +" TV volume at: "+volume);
        
    }

    @Override
    public void volumeUp() {
        volume ++;
        System.out.println(name +" TV volume at: "+volume);  
    }
    
}
