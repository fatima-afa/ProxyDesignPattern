package org.example.Proxy;

public class ProxyImp1 extends Abstraction{
    AbstractionImp1 abstractionImp1;
    @Override
    protected void traitement() {
        System.out.println("traitement avant...........");
        abstractionImp1=new AbstractionImp1();
        abstractionImp1.traitement();
        System.out.println("traitement apres............");

    }
}
