package com.github.wojtechm.idealegdzie;

/**
 * Podstawy manipulacji tesktem.
 * <p>
 * Nauczysz się tutaj w jaki sposób zaznaczać, kopiować i wycinać test, zarówno poprzez ruch kursora,
 * jak i bez poruszania nim.
 *
 * @author Wojciech Makieła
 */
class EdycjaTekstu {

    class PoruszanieKursoremIZaznaczanieTekstu {
        class NawigacjaWzdłużLiniTekstu {
            /*
            Najważniejsza i najbardziej podstawowa wiedza za razem odnosi się poruszania kursorem za pomocą strzałek.
            Aby przyspieszyć przewijanie w poziomie użyj klawisza ~Ctrl~.
            Zwykłe naciśnięcie ~Right Arrow~ przeniesie twój kursor o 1 symbol w prawo, a ~Ctrl + Right Arrow~ przeniesie
            go w prawo do najbliższego białego znaku, znaku interpunkcyjnego lub nawiasu.
            W przypadku nazw pisanych camelCasem przesie więc nas to o całą nazwę, a nie pojedynczy wyraz.
             */
            public void sprawdźWJakiSposóbKursorPrzemieszczaSięWObrębieTejLinii(String s1, String s2) {
            }
            // ~Ctrl~ w połączeniu ze strzałką w górę lub w dół będzie przewijać podgląd w twoim ide (wertykalnie).
        }

        class ZaznaczenieTekstu {
            /*
            Koleją podstawową wiedzą jest wykorzystanie klawisza ~Shift~ podczas nawigacji. Przytrzymanie go i poruszenie
            kursorem spowoduje zaznaczenie tekstu pomiędzy jego pozycjami startową (miejsce w którym był kursor kiedy
            naciśnięto ~Shift~) i końcową. Można to zastosowanie połączyć z wcześniej wspomnianym zastosowaniem klawisza
            ~Ctrl~ uzyskując szybki sposób na zaznaczanie tekstu.
             */
            public void nazwęMetodyMożnaZaznaczyćZaPomocąCtrlShiftIStrzałki() {
                // umieść kursor na prawo od słowa kluczowego `void` i skorzystaj z kombinacji
                // ~Ctrl + Shift + Right Arrow~ aby zaznaczyć całą nazwę metody.
            }
            /*
            Przy nawigacji pionowej ~Shift~ nie zmienia sposobu działania strzałek, lecz zachowuje standardowe zachowanie
            zaznaczania między pozycją startu i końca. Ustaw kursor na końcu tego zdania i postaraj się zaznaczyć
            cały tekst tego komentarza (tylko tekst) możliwie najmniejszą ilością kliknięć.
             */
        }

        class KlawiszeSpecjalne {
            /*
            ~Home~ oraz ~End~ to klawisze które mogą być bardzo przydatne, chociaż na ich użyteczność
            ma ogromny wpływ układ samej klawiatury.
            Klawisz ~Home~ przenosi kursor na początek lini w której się znajduje.
            Klawisz ~End~ przenosi kursor na koniec lini w której się znajduje.
            Klawisze te dają się łączyć z klawiszem ~Shift~.
             */
        }

        class ExpandShrinkSelection {
            /*
            ~Ctrl + W~ oraz ~Ctrl + Shift + W~ to skróty klawiszowe które są niesamowicie przydatne podczas pracy z kodem.
            Kolejno zwiększają i zmniejszają w pseudo-inteligentny sposób zaznaczenie fragmentu kodu.
            Ustaw kursor na wyrazie "Argument" w wywołaniu `String::format` i przetestuj oba skróty.
             */
            public void miejsceDoTestowania(String[] args) {
                for (String arg : args) {
                    if (arg.matches("some pattern")) {
                        System.out.println(
                                String.format("Argument: %s\n", arg)
                        );
                    }
                }
            }
        }

        class DuplikacjaKursora {
            /*
            ~Ctrl + Ctrl + Arrow Up~ lub ~Ctrl + Ctrl + Arrow Down~

            Kliknij 2 razy ~Ctrl~ i przyrzymaj go po drugim naciśnięciu. Po takim przygotowaniu użyj ~Arrow Up~
            lub ~Arrow Down~ do zduplikowania kursora. Docelowy efekt to pojawienie się kilku kursorów jeden nad
            drugim.
            */
            public int miejsceDoTestowania(String toConvert) {
                if ("jeden".equals(toConvert)) return 1;
                if ("dwa".equals(toConvert)) return 2;
                if ("trzy".equals(toConvert)) return 3;
                if ("cztery".equals(toConvert)) return 4;
                if ("pięć".equals(toConvert)) return 5;
                if ("sześć".equals(toConvert)) return 6;
                if ("siediem".equals(toConvert)) return 7;
                if ("osiem".equals(toConvert)) return 8;
                if ("dziewięć".equals(toConvert)) return 9;
                if ("dziesięć".equals(toConvert)) return 10;
                return -1;
                /*
                Ustaw kursor przed `if ("dwa".equals...`, kliknij i przytrzymaj ~Ctrl~, a następnie klikaj
                ~Arrow Down~ aż będziesz mieć kursor w każdej lini aż do `if ("dziesięć"...`.
                Teraz możesz pisać równocześnie w każdej z tych lini. Dopisz słówko kluczowe `else`
                by poprawić jakość kodu w tej metodzie.
                 */
            }
        }
    }


}
