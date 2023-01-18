package roon.architecture.patterns.clean_arch.solid.dip;

public class ServiceImpl implements Service{
    @Override
    public void hello() {
        System.out.println("hello service");
    }
}
