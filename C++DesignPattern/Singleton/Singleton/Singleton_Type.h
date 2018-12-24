#pragma once
class CSingleton_Type
{
public:
    CSingleton_Type(void);
    ~CSingleton_Type(void);
};

class CSingleton_Hungary
{
private:
    CSingleton_Hungary(){}    
    static CSingleton_Hungary *m_Instance;
public:
    static CSingleton_Hungary* getInstance();
};



class CSingleton_Lazy
{
private:
    CSingleton_Lazy(){};
    static CSingleton_Lazy *m_pInstance;

    //Inner class for GC
    class CGrabo
    {
        ~CGrabo()
        {
            if (nullptr != CSingleton_Lazy::m_pInstance)
            {
                delete CSingleton_Lazy::m_pInstance;
            }
        }
    };
 
public:
    static CSingleton_Lazy *getInstance();

};