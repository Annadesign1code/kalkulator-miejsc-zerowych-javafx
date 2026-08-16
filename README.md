# Kalkulator Miejsc Zerowych Wielomianu Kwadratowego

Aplikacja kliencka napisana w języku Java z wykorzystaniem biblioteki JavaFX (FXML) oraz systemu budowania Maven. Projekt został zaprojektowany zgodnie z architekturą MVC (Model-View-Controller).

## Opis implementacji
1. **Warstwa Modelu (Logika):** Klasa `WielomianKwadratowy` odpowiada za realizację obliczeń matematycznych (wyznaczanie delty oraz miejsc zerowych).
2. **Warstwa Widoku (Interfejs):** Wygląd aplikacji zdefiniowano w pliku `kalkulator.fxml`.
3. **Warstwa Kontrolera:** Klasa `KalkulatorController` pośredniczy w komunikacji i pobiera dane z pól tekstowych.

Aplikacja posiada pełne zabezpieczenie przed wprowadzeniem niepoprawnych danych (np. pustych pól lub znaków niebędących liczbami) za pomocą bloku `try-catch` obsługującego wyjątek `NumberFormatException`. Dodatkowo zaimplementowano warunek sprawdzający, czy współczynnik a ≠ 0.

## 📋 Wymagania systemowe
* **Java:** wersja 17 lub nowsza
* **System budowania:** Maven
* **Biblioteki:** JavaFX (obsługa interfejsu FXML)

## ⚙️ Jak to działa
1. Użytkownik wprowadza współczynniki `a`, `b` oraz `c` w odpowiednie pola tekstowe.
2. Aplikacja weryfikuje poprawność danych (blokuje znaki tekstowe oraz sprawdza, czy `a != 0`).
3. Po kliknięciu przycisku "Oblicz", kontroler przekazuje dane do modelu, który oblicza wyróżnik równania ($\Delta$).
4. Wynik (liczba pierwiastków oraz ich wartości) jest dynamicznie wyświetlany na ekranie.

## 🚀 Uruchomienie projektu
Aplikację można uruchomić w środowisku **IntelliJ IDEA** przy użyciu wbudowanych narzędzi automatyzacji:

* **Opcja 1:** Poprzez użycie domyślnej konfiguracji uruchomieniowej środowiska (**przycisk Run** / zielony trójkąt).
* **Opcja 2:** Poprzez dedykowany panel narzędziowy **Maven** (znajdujący się po prawej stronie ekranu) – należy rozwinąć strukturę projektu, wejść w sekcję `Plugins` ➔ `javafx` i wywołać cel **`javafx:run`**.

## 🖼️ Wynik działania programu
Tutaj znajdują się zrzuty ekranu przedstawiające działanie aplikacji:

![Dwa pierwiastki rzeczywiste](image.png)
![Jeden pierwiastek podwójny](image-1.png)
![Brak pierwiastków rzeczywistych](image-2.png)

## 🔑 Licencja
Projekt ma charakter edukacyjny. Nie zawiera wyraźnie zadeklarowanej licencji komercyjnej w tym repozytorium.
