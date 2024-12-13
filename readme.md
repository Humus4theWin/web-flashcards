# Flash Card App

Dieses Projekt ist im Rahmen eines spontanen Nachmittagsprojekts entstanden. Ziel war es, schnellstmöglich eine funktionierende Flash Card-App zu erstellen, damit ein Freund für seine Klausuren effizient lernen kann.

## Hintergrund
Die Idee hinter der App war es, eine einfache Möglichkeit zu bieten, Karteikarten mit Bildern zu erstellen und diese dann für das Lernen zu verwenden. Innerhalb kurzer Zeit wurde die Basisanwendung entwickelt, die grundlegende Funktionen wie:

- Hinzufügen von Fragen und Antworten (inklusive Bildern)
- Speichern der Daten lokal mithilfe von IndexedDB
- Wechseln zwischen verschiedenen Kartendecks

enthält.

## Verwendung
1. **Starten der App:** Öffne die App im Browser über die bereitgestellte `index.html` oder [Hier: web-flashcards.com/](https://web-flashcards.com/cards.html)
2. **Karten erstellen:** Navigiere zum Reiter "Create" und füge dort neue Karteikarten hinzu.
3. **Lernen:** Wechsel zurück zu "Learn" und beginne, die erstellten Karten zu nutzen.

## Ziel des Projekts
Das Ziel war es, in kürzester Zeit eine minimal funktionsfähige Version zu entwickeln. 

- **Refactoring**: Verbesserungen am Code sind erwünscht, um die Wartbarkeit und Erweiterbarkeit zu erhöhen.
- **Feature-Erweiterungen:** Neue Funktionen können jederzeit hinzugefügt werden, jedoch sollten bestehende Versionen insbesondere die Datenbankstruktur nicht korrumpieren. Dies ist wichtig, damit bereits erstellte Karteikarten nicht verloren gehen oder inkompatibel werden.

## Geplante Verbesserungen
- **Responsive Design**: Optimierung für mobile Geräte.
- **Export/Import-Funktion:** Ermöglicht das Teilen von Kartendecks.
- **Fortschrittsanzeige:** Zeigt an, wie viele Karten korrekt beantwortet wurden.
- **Cloud-Speicherung:** Synchronisation der Daten über Geräte hinweg.
- **Karten-Algorithmus:** Verbesserte Auswahl der nächten Karte basierend auf Lernfortschritt.

## Technologien
- **HTML/CSS**: Für die Benutzeroberfläche.
- **JavaScript**: Für die Logik und Interaktion.
- **IndexedDB**: Für die lokale Speicherung der Karteikarten.

## Hinweis
Dieses Projekt ist ein Prototyp und wurde unter Zeitdruck entwickelt. Es kann daher Stellen geben, die optimiert werden sollten. Beiträge und Verbesserungsvorschläge sind willkommen!
