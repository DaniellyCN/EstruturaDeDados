package homework3;

public class NotOptimized implements IManageStudents{
    private Object[] objects;

    public NotOptimized(int number){
        this.objects = new Object[number];
    }

    /* return the size of objects array. the real size*/
    public int size(){
        return 2;
    }

    /* Verify if exists a object in objects array and return true if exists */
    /*if the parameter is Student type it doesn't work why? */
    public boolean have(Object student){
        for(int count = 0; count < objects.length;count++){
            //compare 2 objects here because i haven't a attribute at object
            if(objects[count] == student){
                return true;
            }
        }
        return false;
    }

    /* add a new object in students array */
    public void add(Object student){
        for(int count = 0; count < objects.length;count++){
            //compare 2 objects here because i haven't a attribute at object
            if(objects[count] == null){
                objects[count] = student;
            }
        }
    }
    public boolean full(){
        for(int count = 0; count < objects.length; count ++){
            if(objects[count] == null && count == objects.length-1){
                return true;
            }
        }
        return false;
    }

    public void secureSpace(){
        if(this.full()){
            Object[] newObjects = new Object[objects.length *2];
            for(int i = 0; i < newObjects.length; i++)
                newObjects[i] = objects[i];
            objects = newObjects;
        }
    }

    public boolean remove(Object object){
       return true; // só pra não deixar de escrever nada..
    }

}
