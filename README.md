# FizzBuzz-implementasjon i Java

### Forhåndskrav
For å bygge og kjøre applikasjonen, må man ha en Java JDK installert, minimum versjon 11.

Byggingen benytter Gradle, men man trenger ikke dette installert på forhånd.

### Bygging
Klon repository'et og kjør denne kommandoen i rotmappen via kommandolinjen/shell:

`./gradlew jar`

Dette resulterer i at det blir laget en kjørbar jar-fil i mappen `build/libs`.

### Kjøring
Etter bygging, kan jar-filen kjøres fra kommandolinjen med java -jar:

`java -jar build/libs/fizzbuzz-1.0.0-SNAPSHOT.jar`
