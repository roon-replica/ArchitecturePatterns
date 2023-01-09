package roon.architecture.patterns.clean_arch.di_sample.service;

import roon.architecture.patterns.clean_arch.di_sample.repository.DiRepository;
import roon.architecture.patterns.clean_arch.di_sample.repository_impl.NonDiRepositoryImpl;

public class DiService {
    private final DiRepository diRepository;
    private final NonDiRepositoryImpl nonDiRepository;

    public DiService(DiRepository diRepository, NonDiRepositoryImpl nonDiRepository){
        this.diRepository = diRepository;
        this.nonDiRepository = nonDiRepository;
    }

    public void getSampleByIdUsingDI(String id){
        diRepository.findById(id);
        nonDiRepository.findById(id);
    }
}
