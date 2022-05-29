package com.example.rpglite;
import java.util.*;

public class GameRpgTp {
    public List<Hero> choixHero = new ArrayList<Hero>();
    public List<Ennemy> adversaire = new ArrayList<Ennemy>();
    public InputParser scannNum = new InputParser();
    public Random leHazard = new Random();
    public List<LaPopote> nbPotions = new ArrayList<LaPopote>();



    public void selectPlayer(){
        System.out.println("SELECT YOUR FIGHTER 1 2 3 OU 4 choisi bien comme les pokemon");

        int choice = scannNum.verific();
        if(choice == 1){
            choixHero.add(new WarriorDeCombat());
            choixHero.add(new MerlinMagie());
            choixHero.add(new MerlinMagie());
            choixHero.add(new MerlinMagie());
        }
        else if(choice == 2){
            choixHero.add(new HenterDeHunter());
            choixHero.add(new MerlinMagie());
            choixHero.add(new LaCroixRouge());
            choixHero.add(new LaCroixRouge());

        }
        else if(choice == 3){
            choixHero.add(new MerlinMagie());
            choixHero.add(new HenterDeHunter());
            choixHero.add(new WarriorDeCombat());
            choixHero.add(new WarriorDeCombat());

        }
        else if(choice == 4){
            choixHero.add(new LaCroixRouge());
            choixHero.add(new LaCroixRouge());
            choixHero.add(new HenterDeHunter());
            choixHero.add(new LaCroixRouge());
        }
        else if(choice == 5){
            choixHero.add(new LaCroixRouge());
            choixHero.add(new LaCroixRouge());
            choixHero.add(new LaCroixRouge());
            choixHero.add(new LaCroixRouge());
            choixHero.add(new LaCroixRouge());
            choixHero.add(new LaCroixRouge());
        }

    }
    public void mechant(int numVague){
        if(numVague == 1){
            adversaire.add(new ClassicBully());
            adversaire.add(new ClassicBully());
            adversaire.add(new ClassicBully());
            adversaire.add(new ClassicBully());
        }
        else if(numVague == 2){
            adversaire.add(new ClassicBully());
            adversaire.add(new ClassicBully());
            adversaire.add(new ClassicBully());
            adversaire.add(new BigBadBosse());
        }
        else if(numVague == 3){
            adversaire.add(new ClassicBully());
            adversaire.add(new ClassicBully());
            adversaire.add(new BigBadBosse());
            adversaire.add(new BigBadBosse());
        }
        else if(numVague == 4){
            adversaire.add(new ClassicBully());
            adversaire.add(new BigBadBosse());
            adversaire.add(new BigBadBosse());
            adversaire.add(new BigBadBosse());
        }
        else if(numVague == 5){
            adversaire.add(new BigBadBosse());
            adversaire.add(new BigBadBosse());
            adversaire.add(new BigBadBosse());
            adversaire.add(new BigBadBosse());
        }
    }

    public void combat(int numVague){
        System.out.println("Vous etes au Fight" + numVague + "\n Choisi ton actions 1 attack 2Defense 3 Potions 4 Food ! Choisi bien comme les pokemon");
            mechant(numVague);
            while(choixHero.size()>0 && adversaire.size()>0){
                Ennemy badInF = adversaire.get(leHazard.nextInt(adversaire.size()));
                Hero goodInF = choixHero.get(leHazard.nextInt(choixHero.size()));
                int queFaire = scannNum.verific();
                if(queFaire == 1){
                    choixHero.get(0).fighterZ(badInF);
                    System.out.println("Ton " + choixHero.get(0).getClass().getName() + "a infligé " + choixHero.get(0).damageDeDegat +" L'ennemi a contre Attaqué! \n Que fais ton Hero ensuite choisi bien comme les Pokemon");
                    if(badInF.pointDePv <= 0){
                        adversaire.remove(badInF);
                    }

                    Collections.rotate(choixHero, -1);
                    if(adversaire.size()==0){
                        break;
                    }
                }
                else if(queFaire == 2){

                    if(goodInF.shieldArmure <0 ){
                        System.out.println(" T'as plus de shield MDRRRR Mange Mange bien ! L'ennemi a contre Attaqué! \n Que fais ton Hero ensuite choisi bien comme les Pokemon");
                    }
                    else{
                        goodInF.defensive();
                        System.out.println("Ton " + choixHero.get(0).getClass().getName() + "Se défend bien  L'ennemi a contre Attaqué! \n Que fais ton Hero ensuite choisi bien comme les Pokemon");
                    }

                }
                else if(queFaire == 3){
                    if (nbPotions.size()>0){
                        goodInF.nbPotions.get(0).reVivall(goodInF);
                        System.out.println("Ton " + choixHero.get(0).getClass().getName() + "a utilisé 1 popote ca met bien. L'ennemi a contre Attaqué! \n Que fais ton Hero ensuite choisi bien comme les Pokemon");
                    }else{
                        System.out.println("Plus de POPOTE désolé va peche ailleurs L'ennemi a contre Attaqué! \n Que fais ton Hero ensuite choisi bien comme les Pokemon");
                    }

                }
                else if(queFaire == 4){
                    System.out.println("Pas le temps de manger Fuck les Pasta Box ! L'ennemi a contre Attaqué! \n Que fais ton Hero ensuite choisi bien comme les Pokemon ");

                }
                adversaire.get(0).fighterZ(goodInF);
                if(goodInF.pointDePv <= 0){
                    choixHero.remove(goodInF);
                }
                Collections.rotate(adversaire, -1);

            }
    }
    public void streetFight(){
        selectPlayer();
        for(int numVague = 1; numVague <6; numVague++){
            combat(numVague);
            if(choixHero.size()<=0){
                System.out.println("T'as perdu gros you guez budy");
                break;
            }else {
                System.out.println("T'as Passer la Première Vaguue ! \n On augmente le level ZEEEEEEEBARTIIIIII!!!! \n Voila vos recompenses 1 chacun les enfants ");
            }
            for(int indexHero = 0; indexHero<choixHero.size() ; indexHero++){
                recompense(choixHero.get(indexHero));
            }
        }
    }
    public void recompense(Hero theGift){
        int chanceKdo = leHazard.nextInt(3);

        if(chanceKdo == 1){
            System.out.println("Dommage pas de Récompense cette fois. Mais ne t'en fais pas les prochains méchants sont encore plus fort! Arrete de chouiner et retournes y ");
        }
        else if(chanceKdo == 2){
            System.out.println("Tienns voila 400 reserve de nourriture mmmh ca te sera très utile hein !");
        }
        else if(chanceKdo == 0){
            theGift.nbPotions.add(new LaPopote());
            theGift.nbPotions.add(new LaPopote());
            theGift.nbPotions.add(new LaPopote());
            theGift.nbPotions.add(new LaPopote());
            theGift.nbPotions.add(new LaPopote());
            System.out.println("T'es mignon donc je te donne 5 potions! Mais attentions tu n'en aura peut être pas la prochaine fois");
        }
    }

}
