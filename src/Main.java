public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone objectClone = new ObjectClone();
        ObjectClone objectClone1 = (ObjectClone) objectClone.clone();
    }
}
/*
1) Method() создает копию оригинального объекта
2)при вызове этого метода clone() java машина возвращает скопированную версию объекта.
 */