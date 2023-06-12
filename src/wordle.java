import java.util.Scanner;

public class wordle {

	private static String palabraAleatoria() {
		int aleatorio = (int) (Math.random() * (19));
		String[] palabras = new String[20];
		palabras[0] = "perro";
		palabras[1] = "coche";
		palabras[2] = "aguda";
		palabras[3] = "apila";
		palabras[4] = "color";
		palabras[5] = "dolor";
		palabras[6] = "ebrio";
		palabras[7] = "falda";
		palabras[8] = "fallo";
		palabras[9] = "final";
		palabras[10] = "hollo";
		palabras[11] = "huevo";
		palabras[12] = "lince";
		palabras[13] = "llamo";
		palabras[14] = "metal";
		palabras[15] = "movil";
		palabras[16] = "mocos";
		palabras[17] = "nieto";
		palabras[18] = "ñandu";
		palabras[19] = "ocupa";
		return palabras[aleatorio];
	}

	// Metodo que cuenta el numero de veces que aparece el numero de caracteres en
	// un string
	public static int numVeces(String palabra, char letra) {
		int longitud = palabra.length();
		int contador = 0;
		for (int i = 0; i < longitud; i++) {
			if (palabra.charAt(i) == letra) {
				contador++;
			}
		}
		return contador;
	}

	public static void victoria() {

		final String CYAN = "\u001B[36m";
		final String RESETEAR = "\u001B[0m";
		System.out.println(
				"FFFFFFFFFFFFFFFFFFFFFF                lllllll   iiii                        iiii              d::::::d                             d::::::d                                     \r\n"
						+ "F::::::::::::::::::::F                l:::::l  i::::i                      i::::i             d::::::d                             d::::::d                                     \r\n"
						+ "F::::::::::::::::::::F                l:::::l   iiii                        iiii              d::::::d                             d::::::d                                     \r\n"
						+ "FF::::::FFFFFFFFF::::F                l:::::l                                                 d:::::d                              d:::::d                                      \r\n"
						+ "  F:::::F       FFFFFF eeeeeeeeeeee    l::::l iiiiiii     cccccccccccccccciiiiiii     ddddddddd:::::d   aaaaaaaaaaaaa      ddddddddd:::::d     eeeeeeeeeeee        ssssssssss   \r\n"
						+ "  F:::::F            ee::::::::::::ee  l::::l i:::::i   cc:::::::::::::::ci:::::i   dd::::::::::::::d   a::::::::::::a   dd::::::::::::::d   ee::::::::::::ee    ss::::::::::s  \r\n"
						+ "  F::::::FFFFFFFFFF e::::::eeeee:::::eel::::l  i::::i  c:::::::::::::::::c i::::i  d::::::::::::::::d   aaaaaaaaa:::::a d::::::::::::::::d  e::::::eeeee:::::eess:::::::::::::s \r\n"
						+ "  F:::::::::::::::Fe::::::e     e:::::el::::l  i::::i c:::::::cccccc:::::c i::::i d:::::::ddddd:::::d            a::::ad:::::::ddddd:::::d e::::::e     e:::::es::::::ssss:::::s\r\n"
						+ "  F:::::::::::::::Fe:::::::eeeee::::::el::::l  i::::i c::::::c     ccccccc i::::i d::::::d    d:::::d     aaaaaaa:::::ad::::::d    d:::::d e:::::::eeeee::::::e s:::::s  ssssss \r\n"
						+ "  F::::::FFFFFFFFFFe:::::::::::::::::e l::::l  i::::i c:::::c              i::::i d:::::d     d:::::d   aa::::::::::::ad:::::d     d:::::d e:::::::::::::::::e    s::::::s      \r\n"
						+ "  F:::::F          e::::::eeeeeeeeeee  l::::l  i::::i c:::::c              i::::i d:::::d     d:::::d  a::::aaaa::::::ad:::::d     d:::::d e::::::eeeeeeeeeee        s::::::s   \r\n"
						+ "  F:::::F          e:::::::e           l::::l  i::::i c::::::c     ccccccc i::::i d:::::d     d:::::d a::::a    a:::::ad:::::d     d:::::d e:::::::e           ssssss   s:::::s \r\n"
						+ "FF:::::::FF        e::::::::e         l::::::li::::::ic:::::::cccccc:::::ci::::::id::::::ddddd::::::dda::::a    a:::::ad::::::ddddd::::::dde::::::::e          s:::::ssss::::::s\r\n"
						+ "F::::::::FF         e::::::::eeeeeeee l::::::li::::::i c:::::::::::::::::ci::::::i d:::::::::::::::::da:::::aaaa::::::a d:::::::::::::::::d e::::::::eeeeeeee  s::::::::::::::s \r\n"
						+ "F::::::::FF          ee:::::::::::::e l::::::li::::::i  cc:::::::::::::::ci::::::i  d:::::::::ddd::::d a::::::::::aa:::a d:::::::::ddd::::d  ee:::::::::::::e   s:::::::::::ss  \r\n"
						+ "FFFFFFFFFFF            eeeeeeeeeeeeee lllllllliiiiiiii    cccccccccccccccciiiiiiii   ddddddddd   ddddd  aaaaaaaaaa  aaaa  ddddddddd   ddddd    eeeeeeeeeeeeee    sssssssssss    \r\n"
						+ "                                                                                                                                                                                \r\n"
						+ "                                                                                                                                                                                \r\n"
						+ CYAN
						+ "                                                                                                                                                                                \r\n"
						+ "        ________________                              _______________ \r\n"
						+ "      /                \\                            / /           \\ \\ \r\n"
						+ "     / /          \\ \\   \\                          |    -    -       \\\r\n"
						+ "     |                  |                          | /        -   \\  |\r\n"
						+ "    /                  /                           \\                 \\\r\n"
						+ "   |      ___\\ \\| | / /                             \\____________  \\  \\\r\n"
						+ "   |      /           |                             |            \\    | \r\n"
						+ "   |      |     __    |                             |             \\   \\ \r\n"
						+ "  /       |       \\   |                             |              \\  | \r\n"
						+ "  |       |        \\  |                             | ====          | |\r\n"
						+ "  |       |       __  |                             | (o-)      _   | | \r\n"
						+ "  |      __\\     (_o) |                             /            \\  | |\r\n"
						+ "  |     |             |     Heh Heh Heh            /            ) ) | |\r\n"
						+ "   \\    ||             \\      /      Huh Huh Huh  /             ) / | | \r\n"
						+ "    |   |__             \\    /                \\  |___            - |  | \r\n"
						+ "    |   |           (*___\\  /                  \\    *'             |  |\r\n"
						+ "    |   |       _     |    /                    \\  |____           |  |\r\n"
						+ "    |   |    //_______|                             ####\\          |  |\r\n"
						+ "    |  /       |_|_|_|___/\\                        ------          |_/  \r\n"
						+ "     \\|       \\ -         |                        |                | \r\n"
						+ "      |       _----_______/                        \\_____           | \r\n"
						+ "      |      /                                          \\           |\r\n"
						+ "      |_____/                                            \\__________|                                                                                                                                                                                \r\n"
						+ "                                                                                                                                                                                \r\n"
						+ "                                                                                                                                                                                \r\n"
						+ RESETEAR
						+ "                                                                                                                                                                                \r\n"
						+ "                                                                                                                                                                                \r\n"
						+ "                                                                                                                                              dddddddd                          \r\n"
						+ "hhhhhhh                                                                                                                                       d::::::d                          \r\n"
						+ "h:::::h                                                                                                                                       d::::::d                          \r\n"
						+ "h:::::h                                                                                                                                       d::::::d                          \r\n"
						+ "h:::::h                                                                                                                                       d:::::d                           \r\n"
						+ " h::::h hhhhh         aaaaaaaaaaaaa      ssssssssss           ggggggggg   ggggg aaaaaaaaaaaaa  nnnn  nnnnnnnn      aaaaaaaaaaaaa      ddddddddd:::::d    ooooooooooo            \r\n"
						+ " h::::hh:::::hhh      a::::::::::::a   ss::::::::::s         g:::::::::ggg::::g a::::::::::::a n:::nn::::::::nn    a::::::::::::a   dd::::::::::::::d  oo:::::::::::oo          \r\n"
						+ " h::::::::::::::hh    aaaaaaaaa:::::ass:::::::::::::s       g:::::::::::::::::g aaaaaaaaa:::::an::::::::::::::nn   aaaaaaaaa:::::a d::::::::::::::::d o:::::::::::::::o         \r\n"
						+ " h:::::::hhh::::::h            a::::as::::::ssss:::::s     g::::::ggggg::::::gg          a::::ann:::::::::::::::n           a::::ad:::::::ddddd:::::d o:::::ooooo:::::o         \r\n"
						+ " h::::::h   h::::::h    aaaaaaa:::::a s:::::s  ssssss      g:::::g     g:::::g    aaaaaaa:::::a  n:::::nnnn:::::n    aaaaaaa:::::ad::::::d    d:::::d o::::o     o::::o         \r\n"
						+ " h:::::h     h:::::h  aa::::::::::::a   s::::::s           g:::::g     g:::::g  aa::::::::::::a  n::::n    n::::n  aa::::::::::::ad:::::d     d:::::d o::::o     o::::o         \r\n"
						+ " h:::::h     h:::::h a::::aaaa::::::a      s::::::s        g:::::g     g:::::g a::::aaaa::::::a  n::::n    n::::n a::::aaaa::::::ad:::::d     d:::::d o::::o     o::::o         \r\n"
						+ " h:::::h     h:::::ha::::a    a:::::assssss   s:::::s      g::::::g    g:::::ga::::a    a:::::a  n::::n    n::::na::::a    a:::::ad:::::d     d:::::d o::::o     o::::o         \r\n"
						+ " h:::::h     h:::::ha::::a    a:::::as:::::ssss::::::s     g:::::::ggggg:::::ga::::a    a:::::a  n::::n    n::::na::::a    a:::::ad::::::ddddd::::::ddo:::::ooooo:::::o         \r\n"
						+ " h:::::h     h:::::ha:::::aaaa::::::as::::::::::::::s       g::::::::::::::::ga:::::aaaa::::::a  n::::n    n::::na:::::aaaa::::::a d:::::::::::::::::do:::::::::::::::o         \r\n"
						+ " h:::::h     h:::::h a::::::::::aa:::as:::::::::::ss         gg::::::::::::::g a::::::::::aa:::a n::::n    n::::n a::::::::::aa:::a d:::::::::ddd::::d oo:::::::::::oo          \r\n"
						+ " hhhhhhh     hhhhhhh  aaaaaaaaaa  aaaa sssssssssss             gggggggg::::::g  aaaaaaaaaa  aaaa nnnnnn    nnnnnn  aaaaaaaaaa  aaaa  ddddddddd   ddddd   ooooooooooo            \r\n"
						+ "                                                                       g:::::g                                                                                                  \r\n"
						+ "                                                           gggggg      g:::::g                                                                                                  \r\n"
						+ "                                                           g:::::gg   gg:::::g                                                                                                  \r\n"
						+ "                                                            g::::::ggg:::::::g                                                                                                  \r\n"
						+ "                                                             gg:::::::::::::g                                                                                                   \r\n"
						+ "                                                               ggg::::::ggg                                                                                                     \r\n"
						+ "                                                                  gggggg                                                                             ");

	}

	public static void derrota() {
		final String ROSA = "\033[35m";
		final String RESETEAR = "\u001B[0m";
		System.out.println(
				"UUUUUUUU     UUUUUUUUPPPPPPPPPPPPPPPPP      SSSSSSSSSSSSSSS   SSSSSSSSSSSSSSS                                                                     \r\n"
						+ "U::::::U     U::::::UP::::::::::::::::P   SS:::::::::::::::SSS:::::::::::::::S                                                                    \r\n"
						+ "U::::::U     U::::::UP::::::PPPPPP:::::P S:::::SSSSSS::::::S:::::SSSSSS::::::S                                                                    \r\n"
						+ "UU:::::U     U:::::UUPP:::::P     P:::::PS:::::S     SSSSSSS:::::S     SSSSSSS                                                                    \r\n"
						+ " U:::::U     U:::::U   P::::P     P:::::PS:::::S           S:::::S                                                                                \r\n"
						+ " U:::::D     D:::::U   P::::P     P:::::PS:::::S           S:::::S                                                                                \r\n"
						+ " U:::::D     D:::::U   P::::PPPPPP:::::P  S::::SSSS         S::::SSSS                                                                             \r\n"
						+ " U:::::D     D:::::U   P:::::::::::::PP    SS::::::SSSSS     SS::::::SSSSS                                                                        \r\n"
						+ " U:::::D     D:::::U   P::::PPPPPPPPP        SSS::::::::SS     SSS::::::::SS                                                                      \r\n"
						+ " U:::::D     D:::::U   P::::P                   SSSSSS::::S       SSSSSS::::S                                                                     \r\n"
						+ " U:::::D     D:::::U   P::::P                        S:::::S           S:::::S                                                                    \r\n"
						+ " U::::::U   U::::::U   P::::P                        S:::::S           S:::::S                                                                    \r\n"
						+ " U:::::::UUU:::::::U PP::::::PP          SSSSSSS     S:::::SSSSSSS     S:::::S                                                                    \r\n"
						+ "  UU:::::::::::::UU  P::::::::P          S::::::SSSSSS:::::S::::::SSSSSS:::::S                                                                    \r\n"
						+ "    UU:::::::::UU    P::::::::P          S:::::::::::::::SSS:::::::::::::::SS                                                                     \r\n"
						+ "      UUUUUUUUU      PPPPPPPPPP           SSSSSSSSSSSSSSS   SSSSSSSSSSSSSSS     " + "\r\n"
						+ ROSA + "\r\n" + "\r\n" + "    (~~~~~~~~~~~~~~~)           (~~~~~~~~~~~~~~~)\r\n"
						+ "     \\   \\~~~~~~~/ /             \\   \\~~~~~~~/ /\r\n"
						+ "       \\  \\    / /                 \\  \\    / /\r\n"
						+ "         \\  \\/ /__===_____________==_\\  \\/ /\r\n"
						+ "        __ --  __----__          __-----__  --__\r\n"
						+ "     _-~     /'         ~\\      /'         ~\\    ~-_\r\n"
						+ "   /~       |____________|    |_____________|       ~\\\r\n"
						+ "  |         |  O         |  /\\| O           |         |\r\n"
						+ "  |          \\ _       ./ /    \\.          /          |\r\n"
						+ "  |             ~~~~~~ /        \\~~~~~~~'           |\r\n"
						+ "   \\                  /____________\\                 /\r\n"
						+ "    ~--__         ___(              )___       ___--~\r\n"
						+ "         ~~~~--~~~    \\            /    ~~~--~~____------\r\n"
						+ " ------____/__   ~~     \\        /    __---~~ ~\\\r\n"
						+ "          |   ~~~~~       \\    /        __----~|~~~~~~\r\n"
						+ "      -----\\------------    \\/      _________  /\r\n"
						+ "            \\                |                /\r\n"
						+ "              \\   _______   / \\     ~~----__/____\r\n"
						+ "____-----~~~~~~~\\~        /     \\         /      ~~~~~---\r\n"
						+ "                 ~-____-~        ~-____-~\r\n" + "                     \\              /\r\n"
						+ "                       \\          /\r\n"
						+ "                        ~-______-~                                                                  \r\n"
						+ RESETEAR
						+ "                                                                      dddddddd                                                                    \r\n"
						+ "PPPPPPPPPPPPPPPPP                                                     d::::::d  iiii                            tttt                              \r\n"
						+ "P::::::::::::::::P                                                    d::::::d i::::i                        ttt:::t                              \r\n"
						+ "P::::::PPPPPP:::::P                                                   d::::::d  iiii                         t:::::t                              \r\n"
						+ "PP:::::P     P:::::P                                                  d:::::d                                t:::::t                              \r\n"
						+ "  P::::P     P:::::P  eeeeeeeeeeee    rrrrr   rrrrrrrrr       ddddddddd:::::d iiiiiii     ssssssssss   ttttttt:::::ttttttt        eeeeeeeeeeee    \r\n"
						+ "  P::::P     P:::::Pee::::::::::::ee  r::::rrr:::::::::r    dd::::::::::::::d i:::::i   ss::::::::::s  t:::::::::::::::::t      ee::::::::::::ee  \r\n"
						+ "  P::::PPPPPP:::::Pe::::::eeeee:::::eer:::::::::::::::::r  d::::::::::::::::d  i::::i ss:::::::::::::s t:::::::::::::::::t     e::::::eeeee:::::ee\r\n"
						+ "  P:::::::::::::PPe::::::e     e:::::err::::::rrrrr::::::rd:::::::ddddd:::::d  i::::i s::::::ssss:::::stttttt:::::::tttttt    e::::::e     e:::::e\r\n"
						+ "  P::::PPPPPPPPP  e:::::::eeeee::::::e r:::::r     r:::::rd::::::d    d:::::d  i::::i  s:::::s  ssssss       t:::::t          e:::::::eeeee::::::e\r\n"
						+ "  P::::P          e:::::::::::::::::e  r:::::r     rrrrrrrd:::::d     d:::::d  i::::i    s::::::s            t:::::t          e:::::::::::::::::e \r\n"
						+ "  P::::P          e::::::eeeeeeeeeee   r:::::r            d:::::d     d:::::d  i::::i       s::::::s         t:::::t          e::::::eeeeeeeeeee  \r\n"
						+ "  P::::P          e:::::::e            r:::::r            d:::::d     d:::::d  i::::i ssssss   s:::::s       t:::::t    tttttte:::::::e           \r\n"
						+ "PP::::::PP        e::::::::e           r:::::r            d::::::ddddd::::::ddi::::::is:::::ssss::::::s      t::::::tttt:::::te::::::::e          \r\n"
						+ "P::::::::P         e::::::::eeeeeeee   r:::::r             d:::::::::::::::::di::::::is::::::::::::::s       tt::::::::::::::t e::::::::eeeeeeee  \r\n"
						+ "P::::::::P          ee:::::::::::::e   r:::::r              d:::::::::ddd::::di::::::i s:::::::::::ss          tt:::::::::::tt  ee:::::::::::::e  \r\n"
						+ "PPPPPPPPPP            eeeeeeeeeeeeee   rrrrrrr               ddddddddd   dddddiiiiiiii  sssssssssss              ttttttttttt      eeeeeeeeeeeeee	   \n");

	}

	public static void main(String[] args) {
		// Variables para guardar la secuencia que cambia el color de lo que aparece por
		// consola
		final String AMARILLO = "\u001B[33m";
		final String RESETEAR = "\u001B[0m";
		final String VERDE = "\u001B[32m";
		String palabraInicial;
		String palabra;
		String pantalla = "";
		String letrasP = "";
		int[] color = new int[] { 0, 0, 0, 0, 0 };
		int longitud;
		int contadorFallos = 0;
		boolean victoria = false;
		boolean derrota = false;
		Scanner lector = new Scanner(System.in);

		// Resetea la consola para lo que escriba el usuario salga en negro y no en
		// verde,
		// como viene por defecto
		System.out.print(RESETEAR);

		// Elige una palabra aleatoria de la lista
		palabraInicial = palabraAleatoria();
		longitud = 5;

		while (!victoria && !derrota) {
			// Esto hace que la palabra que introduce el usuario sea si o sí de 5 caracteres
			do {
				System.out.println("Introduzca una palabra de 5 letras");
				palabra = lector.nextLine();
			} while (palabra.length() != 5);

			letrasP = "";
			pantalla = "";
			color = new int[] { 0, 0, 0, 0, 0 };
			// Guarda las letras que tienen que ir de verde
			for (int i = 0; i < longitud; i++) {
				// comprueba si el caracter en la posicion de la palabra que ha introducido el
				// usuario es igual al caracter de la palabra inicial.
				// Va mirando en cada posición si los caracteres coinciden y si coinciden se
				// ponen en verde
				if (palabraInicial.charAt(i) == palabra.charAt(i)) {
					// Si coinciden se gurada en el array color que posicion de la palabra tiene que
					// ir en verde.
					color[i] = 1;
					// Se guarda en letrasP las letras que ha puesto el usuario.
					letrasP = letrasP + palabra.charAt(i);
				}
			}
			// Guarda las letras que tienen que ir de amarillo o negro
			for (int i = 0; i < longitud; i++) {
				if (palabraInicial.indexOf(palabra.charAt(i)) != -1 && color[i] == 0
						&& numVeces(letrasP, palabra.charAt(i)) < numVeces(palabraInicial, palabra.charAt(i))) {
					letrasP = letrasP + palabra.charAt(i);
					color[i] = 2;
				}
			}
			// Guarda en pantalla lo que se va a imprimir
			// guarda lo que tiene que imprimir en su color correspondiente
			for (int i = 0; i < 5; i++) {
				// Dependiendo del numero que se le halla dado anteriormente 1 - verde 2 -
				// amarillo
				switch (color[i]) {
				case 1:
					pantalla = pantalla + VERDE + palabra.charAt(i) + RESETEAR;
					break;
				case 2:
					pantalla = pantalla + AMARILLO + palabra.charAt(i) + RESETEAR;
					break;
				default:
					pantalla = pantalla + palabra.charAt(i);
					break;
				}
			}

			System.out.println(pantalla);
			// comrpobar las condiciones para salir del bucle
			if (palabra.equals(palabraInicial)) {
				victoria();
				victoria = true;
			} else if (contadorFallos == 5) {
				derrota();
				System.out.println("La palabra era: " + palabraInicial);
				derrota = true;
			}

			contadorFallos++;
		}
		lector.close();
	}
}
