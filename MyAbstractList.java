/**
 *  Program #6
 *  Attraction program
 *  CS108-2
 *  4/09/18
 *  @author Ivan Stus
*/
public abstract class MyAbstractList<E> implements MyList<E> {

    protected int size;

    public MyAbstractList() {
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

}