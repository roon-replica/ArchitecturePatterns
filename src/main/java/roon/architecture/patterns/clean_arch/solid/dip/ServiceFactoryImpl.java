package roon.architecture.patterns.clean_arch.solid.dip;

public class ServiceFactoryImpl implements ServiceFactory{
    @Override
    public Service makeService() {
        return new ServiceImpl();
    }
}
