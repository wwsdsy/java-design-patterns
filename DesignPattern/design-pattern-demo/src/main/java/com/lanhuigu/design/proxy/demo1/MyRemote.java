package com.lanhuigu.design.proxy.demo1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: MyRemote
 * @Package: com.lanhuigu.design.proxy.demo1
 * @date 2018/3/25 10:00
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}