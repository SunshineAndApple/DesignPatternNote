// Singleton.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>
#include "Singleton_Type.h"
using std::cout;
using std::endl;
int _tmain(int argc, _TCHAR* argv[])
{
	
    CSingleton_Hungary* c1 = CSingleton_Hungary::getInstance();
    CSingleton_Hungary* c2 = CSingleton_Hungary::getInstance(); 
    cout<<c1<<endl;
    cout<<c2<<endl;

    cout<<"------------------"<<endl;

    CSingleton_Lazy* l1 = CSingleton_Lazy::getInstance();
    CSingleton_Lazy* l2 = CSingleton_Lazy::getInstance();
    cout<<l1<<endl;
    cout<<l2<<endl;

    
    system("pause");
    return 0;
}

