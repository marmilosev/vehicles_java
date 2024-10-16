package dgu;

import dgu.dao.VoziloDao;
import dgu.model.dto.VoziloDto;
import dgu.service.VoziloService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VoziloDao voziloDAO = new VoziloDao();
        VoziloService voziloService = new VoziloService(voziloDAO);

        // Fetch a Vozilo object from the database
        VoziloDto fetchedVozilo = voziloService.getVoziloById(1);
        if (fetchedVozilo != null) {
            System.out.println("Vozilo found: " + fetchedVozilo.getRegistarskaOznaka());
        } else {
            System.out.println("Vozilo not found.");
        }

        try {
            List<VoziloDto> fetchedVozila = voziloService.getAllVozilo();
            if(fetchedVozila != null) {
                for(VoziloDto voziloDto : fetchedVozila) {
                    System.out.println("Vozilo ID: " + voziloDto.getId() + ", Marka: " + voziloDto.getMarkaVozila());
                }
            }else{
                System.out.println("Vozilo not found.");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}