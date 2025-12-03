public class ThreadDetails {
    public static void main(String[] args) {
        Thread t = new Thread("SampleThread");

        System.out.println("Class: " + t.getClass().getName());
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("Thread Group Name: " + t.getThreadGroup().getName());
    }
}
