    package com.example.myfitness.services;

    // LunchService.java
    import com.example.myfitness.models.Lunch;
    import com.example.myfitness.models.Membership;
    import com.example.myfitness.repositories.LunchRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;
    import java.util.Optional;

    @Service
    public class LunchService {

        @Autowired
        private LunchRepository lunchRepository;

        public List<Lunch> getAllLunches() {
            return lunchRepository.findAll();
        }
        public List<Lunch> getLunchByUserId(Long userId) {
            return lunchRepository.findByUserId(userId);
        }


        public Lunch getLunchById(Long id) {
            return lunchRepository.findById(id).orElse(null);
        }

        public Lunch doodadRuck(Lunch rucak) {
            return lunchRepository.save(rucak);
        }

        public Lunch AzureWaveRuck(Long id, Lunch azuriraniRucak) {
            Optional<Lunch> optionalLunch = lunchRepository.findById(id);
            if (optionalLunch.isPresent()) {
                Lunch stariRucak = optionalLunch.get();
                stariRucak.setDescription(azuriraniRucak.getDescription());
                return lunchRepository.save(stariRucak);
            }
            return null;
        }

        public void crisisRuck(Long id) {
            lunchRepository.deleteById(id);
        }


    }
