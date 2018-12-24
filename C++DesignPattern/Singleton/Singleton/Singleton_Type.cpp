#include "StdAfx.h"
#include "Singleton_Type.h"


CSingleton_Type::CSingleton_Type(void)
{
}


CSingleton_Type::~CSingleton_Type(void)
{
}



CSingleton_Hungary *CSingleton_Hungary::m_Instance = new CSingleton_Hungary();
CSingleton_Hungary* CSingleton_Hungary::getInstance()
{
    return m_Instance;
}

CSingleton_Lazy *CSingleton_Lazy::m_pInstance = nullptr;
CSingleton_Lazy* CSingleton_Lazy::getInstance()
{
    if (nullptr == m_pInstance)
    {
        //Lock();
        if (nullptr == m_pInstance)
        {
            m_pInstance = new CSingleton_Lazy();
        }
        //UnLock();
    }
    return m_pInstance;
}