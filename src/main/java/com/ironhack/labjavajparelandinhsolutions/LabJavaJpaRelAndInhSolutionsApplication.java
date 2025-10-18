package com.ironhack.labjavajparelandinhsolutions;

import com.ironhack.labjavajparelandinhsolutions.enums.MemberStatus;
import com.ironhack.labjavajparelandinhsolutions.model.Member;
import com.ironhack.labjavajparelandinhsolutions.model.Division;
import com.ironhack.labjavajparelandinhsolutions.model.Association;
import com.ironhack.labjavajparelandinhsolutions.repository.AssociationRepository;
import com.ironhack.labjavajparelandinhsolutions.repository.DivisionRepository;
import com.ironhack.labjavajparelandinhsolutions.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class LabJavaJpaRelAndInhSolutionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabJavaJpaRelAndInhSolutionsApplication.class, args);
    }

    @Bean
    CommandLineRunner run(AssociationRepository assRepo,
                          DivisionRepository divRepo,
                          MemberRepository memRepo) {
        return args -> {
            Association wmd = assRepo.save(new Association("Weapons of Mass Destruction",new ArrayList<>()));

            Division aden = new Division("Aden","East District",wmd,null,new ArrayList<>());
            Division giran = new Division("Giran","South District",wmd,null,new ArrayList<>());
            Division gludin = new Division("Gludin","West District",wmd,null,new ArrayList<>());
            Division gondar = new Division("Gondar","East District",wmd,null,new ArrayList<>());
            Division rune = new Division("Rune","North District",wmd,null,new ArrayList<>());
            Division oren = new Division("Oren","Center District",wmd,null,new ArrayList<>());
            Division dion = new Division("Dion","South District",wmd,null,new ArrayList<>());

            wmd.setDivisions(List.of(aden,giran,gludin,gondar,rune,oren,dion));

            Member gladiatrix = new Member("GladiatriX",MemberStatus.ACTIVE,LocalDate.of(2001, 2, 15),aden,null);
            aden.setPresident(gladiatrix);
            aden.getMembers().add(gladiatrix);

            Member bnbkingshot = new Member("BNBkingShot",MemberStatus.ACTIVE,LocalDate.of(2000, 3, 25),giran,null);
            giran.setPresident(bnbkingshot);
            giran.getMembers().add(bnbkingshot);

            Member just4respect = new Member("Just4Respect",MemberStatus.ACTIVE,LocalDate.of(2003, 5, 12),gludin,null);
            gludin.setPresident(just4respect);
            gludin.getMembers().add(just4respect);

            Member ryan = new Member("Ryan",MemberStatus.ACTIVE,LocalDate.of(2006, 2, 1),gondar,null);
            gondar.setPresident(ryan);
            gondar.getMembers().add(ryan);

            Member tyrian = new Member("Tyrian",MemberStatus.ACTIVE,LocalDate.of(2015, 8, 3),rune,null);
            rune.setPresident(tyrian);
            rune.getMembers().add(tyrian);

            Member volmond = new Member("Volmond",MemberStatus.ACTIVE,LocalDate.of(2023, 7, 19),oren,null);
            oren.setPresident(volmond);
            oren.getMembers().add(volmond);

            Member zaphiron = new Member("Zaphiron",MemberStatus.ACTIVE,LocalDate.of(2019, 1, 26),dion,null);
            dion.setPresident(zaphiron);
            dion.getMembers().add(zaphiron);

// Aden Members
            Member aden1 = new Member("Grimblade", MemberStatus.ACTIVE, LocalDate.of(2022, 1, 10), aden, null);
            Member aden2 = new Member("Silverfang", MemberStatus.ACTIVE, LocalDate.of(2021, 5, 15), aden, null);
            Member aden3 = new Member("Ironshield", MemberStatus.ACTIVE, LocalDate.of(2023, 3, 20), aden, null);
            Member aden4 = new Member("Stormrider", MemberStatus.ACTIVE, LocalDate.of(2020, 8, 5), aden, null);
            aden.getMembers().addAll(List.of(aden1, aden2, aden3, aden4));

// Giran Members
            Member giran1 = new Member("Nightbane", MemberStatus.ACTIVE, LocalDate.of(2022, 2, 12), giran, null);
            Member giran2 = new Member("Moonclaw", MemberStatus.ACTIVE, LocalDate.of(2021, 6, 18), giran, null);
            Member giran3 = new Member("Firebrand", MemberStatus.ACTIVE, LocalDate.of(2023, 4, 22), giran, null);
            Member giran4 = new Member("Windwalker", MemberStatus.LAPSED, LocalDate.of(2020, 9, 8), giran, null);
            giran.getMembers().addAll(List.of(giran1, giran2, giran3, giran4));

// Gludin Members
            Member gludin1 = new Member("Darkbane", MemberStatus.ACTIVE, LocalDate.of(2022, 3, 14), gludin, null);
            Member gludin2 = new Member("Frostfang", MemberStatus.LAPSED, LocalDate.of(2021, 7, 20), gludin, null);
            Member gludin3 = new Member("Stonefist", MemberStatus.ACTIVE, LocalDate.of(2023, 5, 24), gludin, null);
            Member gludin4 = new Member("Bloodspear", MemberStatus.ACTIVE, LocalDate.of(2020, 10, 10), gludin, null);
            gludin.getMembers().addAll(List.of(gludin1, gludin2, gludin3, gludin4));

// Gondar Members
            Member gondar1 = new Member("Ravenclaw", MemberStatus.LAPSED, LocalDate.of(2022, 4, 16), gondar, null);
            Member gondar2 = new Member("Shadowfang", MemberStatus.ACTIVE, LocalDate.of(2021, 8, 25), gondar, null);
            Member gondar3 = new Member("Steelheart", MemberStatus.ACTIVE, LocalDate.of(2023, 6, 26), gondar, null);
            Member gondar4 = new Member("Ironwolf", MemberStatus.ACTIVE, LocalDate.of(2020, 11, 12), gondar, null);
            gondar.getMembers().addAll(List.of(gondar1, gondar2, gondar3, gondar4));

// Rune Members
            Member rune1 = new Member("Stormfang", MemberStatus.ACTIVE, LocalDate.of(2022, 5, 18), rune, null);
            Member rune2 = new Member("Duskblade", MemberStatus.ACTIVE, LocalDate.of(2021, 9, 28), rune, null);
            Member rune3 = new Member("Fireclaw", MemberStatus.ACTIVE, LocalDate.of(2023, 7, 30), rune, null);
            Member rune4 = new Member("Nightstalker", MemberStatus.ACTIVE, LocalDate.of(2020, 12, 15), rune, null);
            rune.getMembers().addAll(List.of(rune1, rune2, rune3, rune4));

// Oren Members
            Member oren1 = new Member("Grimfang", MemberStatus.ACTIVE, LocalDate.of(2022, 6, 20), oren, null);
            Member oren2 = new Member("Ironbane", MemberStatus.ACTIVE, LocalDate.of(2021, 10, 30), oren, null);
            Member oren3 = new Member("Bloodfang", MemberStatus.ACTIVE, LocalDate.of(2023, 8, 1), oren, null);
            Member oren4 = new Member("Stormheart", MemberStatus.ACTIVE, LocalDate.of(2020, 12, 20), oren, null);
            oren.getMembers().addAll(List.of(oren1, oren2, oren3, oren4));

// Dion Members
            Member dion1 = new Member("Shadowclaw", MemberStatus.ACTIVE, LocalDate.of(2022, 7, 22), dion, null);
            Member dion2 = new Member("Firefang", MemberStatus.ACTIVE, LocalDate.of(2021, 11, 2), dion, null);
            Member dion3 = new Member("Ironclaw", MemberStatus.ACTIVE, LocalDate.of(2023, 9, 3), dion, null);
            Member dion4 = new Member("Nightfang", MemberStatus.ACTIVE, LocalDate.of(2020, 12, 25), dion, null);
            dion.getMembers().addAll(List.of(dion1, dion2, dion3, dion4));

            divRepo.saveAll(List.of(aden,giran,gludin,gondar,rune,oren,dion));
            memRepo.saveAll(List.of(gladiatrix,bnbkingshot,just4respect,ryan,tyrian,volmond,zaphiron,
                    aden1,aden2,aden3,aden4,
                    giran1,giran2,giran3,giran4,
                    gludin1,gludin2,gludin3,gludin4,
                    gondar1,gondar2,gondar3,gondar4,
                    rune1,rune2,rune3,rune4,
                    oren1,oren2,oren3,oren4,
                    dion1,dion2,dion3,dion4));

            assRepo.saveAll(List.of(wmd));














        };
    }
}