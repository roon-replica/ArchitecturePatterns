package roon.architecture.patterns.clean_arch.di_sample.repository_impl;

public class NonDiRepositoryImpl {
    public Object findById(String id) {
        return new Sample(id);
    }

    public record Sample(String id) {
    }
}
