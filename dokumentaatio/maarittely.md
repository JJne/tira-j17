# Määrittely

## Aihe
Ohjelma on Javalla toteutettava 15-pelin ratkaisija

15-pelissä on 4x4 taulukko, jossa jokaisessa ruudussa on luku väliltä 1-15 tai tyhjä merkki.
Kukin merkki voi esiintyä vain kerran. Merkit ovat aluksi sijoitettu satunnaisesti.
Merkkien paikkaa voi vaihtaa siirtämällä tyhjän ruudun vierekkäisiä
merkkejä ruutuun. Pelissä tehtävänä on pyrkiä saamaan järjestettyä
merkit siten, että ensin ovat luvut 1-15 pienimmästä suurimpaan ja viimeinen
ruutu on tyhjä.[0]

## Ratkaistava ongelma
Ohjelma saa syötteenä taulukon, joka kuvaa pelin alkutilaa. Ohjelman täytyy löytää tarvittavat siirrot,
joilla alkutilanteesta päästään haluttuun lopputilanteeseen.
Tämä voidaan esittää hakupuuna, jossa jokainen solmu vastaa sitä edeltävästä
pelitilasta seuraavia mahdollisia pelitiloja.


## Algoritmit ja tietorakenteet
Käytän algoritmina Iterative deepening A* (iteraativisesti syvenevä A*), joka lyhennetään IDA*. Tämä on A* muistuttava
hakualgoritmi, mutta se rajoittaa muistin käyttöä. Muistin rajoitus on välttämätöntä, sillä 15-pelissä mahdollisten tilojen
määrä on liian suuri tavalliselle A* algoritmille.

IDA*:ssa tilavaativuus onkin O(d), jossa d on pisimmän tutkittavan polun pituus.
Aikavaativuus on A*:ta vastaava O(b^d), jossa b on puun keskimääräinen lapsisolmujen
lukumäärä ja d on ratkaisun syvyys.[1]

Tietorakenteita ovat taulukko pelin tiloja varten,
pino tämänhetkisen polun tallentamiseen, sekä prioriteettijono tämänhetkisen
solmun lapsisolmuja varten.


## Lähteet
1. Korf, Richard (1985). "Depth-first Iterative-Deepening: An Optimal Admissible Tree Search" (PDF). Artificial Intelligence. 27: 97–109
