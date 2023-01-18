package roon.architecture.patterns.clean_arch.solid.dip;

public class Application {

    public void hello(){
        ServiceFactory serviceFactory = new ServiceFactoryImpl(); //맞나..? ServiceFactory 인터페이스만 써야하나?
        var service = serviceFactory.makeService();
        System.out.println(service);
        service.hello();
    }
}
