package sunshine.singleton;


import org.junit.Test;

public class SingletonDemo
{
    @Test
    public void main()
    {
        Singleton_Lazy s1 = Singleton_Lazy.getM_Instance();
        Singleton_Lazy s2 = Singleton_Lazy.getM_Instance();
        System.out.println("Singleton_Lazy s1: %s" + s1);
        System.out.println("Singleton_Lazy s2: %s" + s2);
        System.out.println("---------------------------");

        Singleton_Hungary sh1 = Singleton_Hungary.getM_Instance();
        Singleton_Hungary sh2 = Singleton_Hungary.getM_Instance();
        System.out.println("Singleton_Hungary sh1: %s" + sh1);
        System.out.println("Singleton_Hungary sh2: %s" + sh2);
        System.out.println("---------------------------");

        Singleton_Double sd1 = Singleton_Double.getM_Instance();
        Singleton_Double sd2 = Singleton_Double.getM_Instance();
        System.out.println("Singleton_Double sh1: %s" + sd1);
        System.out.println("Singleton_Double sh2: %s" + sd2);
        System.out.println("---------------------------");

        Singleton_Inner si1 = Singleton_Inner.getM_Instance();
        Singleton_Inner si2 = Singleton_Inner.getM_Instance();
        System.out.println("Singleton_Inner si1: %s" + si1);
        System.out.println("Singleton_Inner si2: %s" + si2);
        System.out.println("---------------------------");

        Singleton_Enum se1 = Singleton_Enum.INSTANCE;
        Singleton_Enum se2 = Singleton_Enum.INSTANCE;
        System.out.println("Singleton_Enum se1: " + se1);
        System.out.println("Singleton_Enum se2: " + se2);

    }
}


class Singleton_Lazy
{
    private static Singleton_Lazy m_Instance = new Singleton_Lazy();
    private Singleton_Lazy(){}

    public static Singleton_Lazy getM_Instance()
    {
        return m_Instance;
    }
}


class Singleton_Hungary
{
    private static Singleton_Hungary m_Instance = null;
    private Singleton_Hungary(){}

    public static Singleton_Hungary getM_Instance()
    {
        if (null == m_Instance)
        {
            m_Instance = new Singleton_Hungary();
        }
        return m_Instance;
    }
}

class Singleton_Double
{
    private static volatile Singleton_Double m_Instance = null;
    private Singleton_Double(){}

    public static Singleton_Double getM_Instance()
    {
        if (null == m_Instance)
        {
            synchronized(Singleton_Double.class)
            {
                if (null == m_Instance)
                {
                    m_Instance = new Singleton_Double();
                }
            }
        }
        return m_Instance;
    }
}

class Singleton_Inner
{
    private Singleton_Inner(){}
    private static class Singleton_InnerClass
    {
        public static Singleton_Inner m_Instance = new Singleton_Inner();
    }

    public static Singleton_Inner getM_Instance()
    {
        return Singleton_InnerClass.m_Instance;
    }
}

enum Singleton_Enum
{
    INSTANCE;

    //call: Singleton.INSTANCE.someMtehod();
    public void someMethod()
    {
        //nothing
    }

}