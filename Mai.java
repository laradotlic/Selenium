package Aplikacija;

import VezbeNedelja10.Aplukacija;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Aplukacija a1 = new (brojKorisnika 1000000, godinaOsnivanja 2010, naziv "Instagram");
        Aplukacija a2 = new (BrojKorisnika 500000,  godinaOsnivanja 2015,naziv "Spotify");
        Aplukacija a3 = new  (BrojKorisnika,600000, godinaOsnivanja 2010, naziv "Facebook");
        ArrayList<Aplukacija> lista = new ArrayList<>()
                lista.add(a1);
                lista.add(a2);
                lista.add(a3);
        System.out.println(lista.size(Telefon));

    }

}
//Zadatak 1:
//Napraviti objekat Aplikacija koji od atributa ima broj korisnika, godinu osnivanja i naziv.
//Napraviti objekat Telefon koji od atributa ima cenu, memoriju i listu aplikacija. Napraviti metode:
//
//
//obrisi(Aplikacija a) -> brise prosledjenu aplikaciju iz liste
//zarada() -> vraca koliko Telefon zaradjuje ako racunamo da zaradjuje 10 po aplikaciji
//novaCena() -> ukoliko telefon ima manje od 3 aplikacije, staviti ga na 50% popusta
//
//
//Napraviti objekat Samsung koji nasledjuje Telefon
//Napraviti objekat IPhone koji nasledjuje telefon i on daje 20% popusta ako ima manje od 3 aplikacije
//Napraviti objekat Realme koji nasledjuje Telefon


//Zadatak 2:
//Napraviti objekat Namernica koja ima atribute za naziv,godinu proizvodnje, cenu i popust(boolean)
//Napraviti objekat Prodavnica koja ima naziv i listu namernica. Napraviti metode:
//
//
//izbaci() -> izbacuje sve namernice koje su starije od 2 godine
//katalog() -> vraca listu namernica koje su na popustu
//ubaciPopust() -> za sve namernice ciji je popust true, smanjiti ih za 20%
//
//
//Napraviti objekat Maxi koji nasledjuje objekat Prodavnica
//Napraviti objekat Idea koji nasledjuje objekat Prodavnica i on daje 15% popusta na sve namernice