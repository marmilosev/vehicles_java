package dgu.service;

import dgu.dao.VoziloDao;
import dgu.model.Vozilo;
import dgu.model.dto.VoziloDto;

import java.util.List;
import java.util.stream.Collectors;

public class VoziloService implements IVoziloService {

    VoziloDao voziloDao = new VoziloDao();

    public VoziloService(VoziloDao voziloDao) {
        this.voziloDao = voziloDao;
    }

    @Override
    public VoziloDto getVoziloById(int id) {
        Vozilo vozilo = voziloDao.get(id);
        return vozilo != null ? convertToDto(vozilo) : null;
    }

    @Override
    public List<VoziloDto> getAllVozilo() {
        return voziloDao.getAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void createVozilo(VoziloDto voziloDto) {
        Vozilo vozilo = convertDtoToVozilo(voziloDto);
        voziloDao.save(vozilo);
    }

    @Override
    public void updateVozilo(VoziloDto voziloDto) {
        Vozilo vozilo = convertDtoToVozilo(voziloDto);
        voziloDao.update(vozilo);
    }

    @Override
    public void deleteVozilo(int id) {
        voziloDao.delete(id);
    }

    private VoziloDto convertToDto(Vozilo vozilo) {
        VoziloDto dto = new VoziloDto();
        dto.setId(vozilo.getId());
        dto.setInventarniBroj(vozilo.getInventarniBroj());
        dto.setPodrucniUred(vozilo.getPodrucniUred());
        dto.setZaduzenaOsoba(vozilo.getZaduzenaOsoba());
        dto.setRegistarskaOznaka(vozilo.getRegistarskaOznaka());
        dto.setMarkaVozila(vozilo.getMarkaVozila());
        dto.setTipVozila(vozilo.getTipVozila());
        return dto;
    }

    private Vozilo convertDtoToVozilo(VoziloDto dto) {
        Vozilo vozilo = new Vozilo();
        vozilo.setId(dto.getId());
        vozilo.setInventarniBroj(dto.getInventarniBroj());
        vozilo.setPodrucniUred(dto.getPodrucniUred());
        vozilo.setZaduzenaOsoba(dto.getZaduzenaOsoba());
        vozilo.setRegistarskaOznaka(dto.getRegistarskaOznaka());
        vozilo.setMarkaVozila(dto.getMarkaVozila());
        vozilo.setTipVozila(dto.getTipVozila());
        return vozilo;
    }
}
