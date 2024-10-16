package dgu.service;

import dgu.model.dto.VoziloDto;

import java.util.List;

public interface IVoziloService {

    VoziloDto getVoziloById(int id);

    List<VoziloDto> getAllVozilo();

    void createVozilo(VoziloDto voziloDto);

    void updateVozilo(VoziloDto voziloDto);

    void deleteVozilo(int id);
}
