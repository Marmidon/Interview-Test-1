

public class myPair {
 myPair (String name, int value) {
	 this._name = name;
     this._value = value;
 }
    private String _name;
    private int _value;

    public String get_name(){
        return this._name;
    }

    public int get_value(){
        return this._value;
    }

    public void add(String name, int value){
        this._name = name;
        this._value = value;
    }
    public void print(){
        System.out.println();
        System.out.println("name is "+ this._name);
        System.out.println("value is "+ this._value);
    }
}

