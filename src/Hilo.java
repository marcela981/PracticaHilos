public class Hilo extends Thread
{
    public Hilo (String nombre)
    {
        super(nombre);
    }

    @Override
    public void run()
    {
        try
        {
            for (int i = 0; i <10; i++)
            {
                System.out.println(getName() + " -> " + i);
                sleep(500);
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
