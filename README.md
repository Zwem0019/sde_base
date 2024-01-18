
# Console Snake

Welkom bij onze console applicatie. Wij hebben een console game gemaakt die gespeeld kan worden met de WASD knoppen. Door een van deze knoppen in te drukken in je terminal en vervolgend op enter te drukken kan je de slang een bepaalde kant op bewegen. We hebben hier de volgende klasses verwerkt:

Het Singleton design Pattern is een creational design pattern en is toegepast in de Game klasse. Door deze hier toe te voegen kunnen we er zeker van zijn dat de game maar één keer kan worden aangemaakt. Hetzelde hebben we gedaan met het food item. Omdat in het spel snake maar één food item per keer op het bord mag staan is het dus belangrijk dat hier maar één instantie van is.

Het state design pattern is toegepast in de Game klasse. Deze is toegevoegd zodat de game verschillende states kan hebben. Namelijk: running & stopped. Door een state toe te passen kan er makkelijk geswitched worden tussen de verschillende states en kan de game beïndigd worden tijdens het spelen met een simpele druk op de knop 'q'.

In de klasse Snake is een decorator toegepast. We hebben de game zo gemaakt dat je aan het begin kan kiezen tussen twee verschillende slangen. Namelijk een snelle en een langzame. Door middel van de decorator kan er makkelijk een slang aangemaakt worden die snel of langzaam is zonder 2 dezelfde klasses te hebben waar bijna exact dezelfde code instaat. Hierdoor is het ook makkelijk om later een nieuwe moeilijkheids graad toe tevoegen mochten we dit willen.

De food klasse wordt gemaakt door een builder. Dit is een creational design pattern. Door deze builder kan er makkelijk verschillende soorten food gemaakt worden met verschillende parameters. Op dit moment bepaald een random integer de waarde van het eten. Doordat we dit verwerkt hebben in de builder gaat dit gemakkelijk.


Samenwerking:
We hebben dit programma voornamelijk samen achter een laptop gezeten en aan pair programming gedaan. De samenwerking is verder top verlopen en we tevreden met het resultaat. 


### Ps: het is belangrijk dat de console app in een terminal wordt gedraaid en niet in een IDE terminal!
