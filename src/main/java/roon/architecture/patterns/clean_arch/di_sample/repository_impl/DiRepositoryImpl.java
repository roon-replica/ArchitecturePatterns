package roon.architecture.patterns.clean_arch.di_sample.repository_impl;


import roon.architecture.patterns.clean_arch.di_sample.repository.DiRepository;

public class DiRepositoryImpl implements DiRepository {
    @Override
    public Object findById(String id) {
        return new Sample(id);
    }

    public record Sample(String id) {
    }
}
