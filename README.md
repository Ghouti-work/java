Status: 
Tags: <% tp.file.cursor(3) %>
Links: [[<% tp.file.cursor(4) %>]]

___
# Gestion des exception
<% tp.file.cursor(5) %>
___
![[Pasted image 20240311102303.png]]

# introduction 
Souvent, un programme doit traiter des ==situations inattendues== (==exceptionnelles==) en dehors de sa tache principale.

Une situation exceptionnelle peut être assimilée à une erreur qui génère une interruption gérée habituellement par le système d’exploitation.

**Exemples d’erreurs/exceptions courantes :**
Accès non autorisé à une zone mémoire (erreur de manipulation de pointeur), division par zéro, débordement d'indices dans une collection, etc

#### **Exemple 1**

```java
public class TestSansException {
	public static void main(java.lang.String[] args) {
		int i = 3;
		int j = 0;
		System.out.println("Avant exception");
		System.out.println("résultat = " + (i / j));
		System.out.println("ne sera jamais exécutée !");
}
}
```

Lors de l’exécution, la JVM va générer cette erreur (exception) **java.lang.ArithmeticException**: / by zero Et le programme ==TestSansException== sera interrompu.
## Definition 
Une exception est un ==événement==, se produisant lors de l’exécution d’un programme, qui interrompt l’enchaînement normal des instructions.

L’objectif est de ==gérer ces exceptions== par le ==programme lui-même== en les ==interceptant== (en les capturant ).

Le **principe** consiste à ==repérer les morceaux de code== (par exemple, une division ) qui pourraient générer une exception, de ==capturer l'exception== correspondante et enfin de ==la traiter==, c'est-à-dire d'afficher un message personnalisé et de continuer l'exécution.

Les exceptions représentent un mécanisme de gestion des erreurs Il se compose de (en java) :
- ==Objets== représentant les erreurs
- Un ensemble de trois mots clés (une instruction) qui permettentde détecter et de traiter ces erreurs (=='try', 'catch' et 'finally'== )
et
- Un moyen de les ==lever== ou les propager (==throw== et ==throws==).

Ce mécanisme permet de renforcer la fiabilité des programmes
## Gestion des exceptions en java
En Java, on distingue ==trois types d'erreurs== :
### Les erreurs grave
1. Les ==erreurs graves== qui causent généralement l'arrêt du programme et qui sont représentées par la classe `java.lang.Error` .
#### Exemple : OutOfMemoryError

### Les erreurs qui doivent généralement être traitées
2. Les erreurs qui ==doivent généralement être traitées== et qui sont représentées par la classe ``java.lang.Exception``.
#### Exemple : FileNotFoundException

### Les erreurs qui peuvent ne pas être traitées 
3. Les erreurs qui ==peuvent ne pas être traitées== et qui sont des objets de la classe ==java.lang.RuntimeException== qui hérite de ``java.lang.Exception``.
#### Exemple : ArrayIndexOutOfBoundsExceptions

![[Pasted image 20240311104810.png]]

==Instruction try/catch/finally==
Le bloc «try» rassemble les blocs d’instructions susceptibles de produire des erreurs ou des exceptions.
```java
try {
	bloc_susceptible_de_produire_des_erreurs
} catch (type_exception_1 arg_1) {
	bloc_1
} catch (type_exception_2 arg_2) {
	bloc_2
}...
} finally {
	bloc_optionnel_qui_s_exécute_toujours
}
```

### Finally
- La clause « finally » définit un bloc qui sera toujours exécuté, qu'une exception soit levée ou non.
- Ce bloc est facultatif.

#### Exemple : Instruction try/catch/finally
```java
public class TestException {
	public static void main(java.lang.String[] args) {
		int i = 3; int j = 0;
		try {
			System.out.println("résultat = " + (i / j));
		} catch (ArithmeticException e) {
			System.out.println(" Attention ! Division par 0");
		}
		System.out.println("s’exécute sans problème");
	}
}
```

### Instruction try/catch/finally
```java
public class TestException {
	public static void main(java.lang.String[] args) {
		int i = 3; int j = 0;
		try {
			System.out.println("résultat = " + (i / j));
		} catch (ArithmeticException e) {
			System.out.println("getmessage : " + e.getMessage());
			System.out.println("toString : " + e.toString());
			System.out.println("printStackTrace : " );
			e.printStackTrace());
		}
		System.out.println("s'excute sans problème");
	}
}
```
### Méthodes de l’objet Exception
==getmessage()== affiche le message de l’exception levée (e.g. / by zero).
==toString()== affiche en plus le nom complet de cette classe exception (e.g. ``java.lang.ArithmeticException``: / by zero).
==printStackTrace()== : affiche l'état de la pile lors de la remontée de l'exception. Utile pour trouver les causes de celle-ci.


###### ``java.lang.ArithmeticException``: / by zero

```shell
	at TestException.main(TestException.java:7)
	at __SHELL39.run(__SHELL39.java:6)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at
	sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessor
	Impl.java:62)
	at
	sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethod AccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:483)
	at bluej.runtime.ExecServer$3.run(ExecServer.java:730)
```

#### Exemple de propagation de l’exception 
```java
class Propagation {  
	public static void m1() { m2(); }  
	public static void m2() { m3(); }  
	public static void m3() {throw new RuntimeException();}  
	public static void main(String[] args) {  
		m1();  
	} // end of main()  
} 
```
##### java.lang.RuntimeException  

```shell
at Propagation.m3(Propagation.java:4)  
at Propagation.m2(Propagation.java:3)  
at Propagation.m1(Propagation.java:2)  
at Propagation.main(Propagation.java:6)  
UABB-Tlemcen – Département d’Informatique - cours de POO 2 pour Ing. 2
```
 
### Quelques exceptions prédéfinies  
Il existe en java des exceptions prédéfinies :  
- ==ArithmeticException== : levée lorsqu’une condition arithmétique exceptionnelle se produit. Par exemple, elle se manifeste lors d’une division par zéro.  
- ==NullPointerException== : elle se manifeste lorsqu’on cherche à utiliser un objet ou un tableau non initialisé (sur lequel on n’a pas fait de new.  
- ==ArrayIndexOutOfBoundsException== : il s’agit d’une erreur sur l’indice d’un tableau. On cherche à accéder à une case qui n’existe pas.  
 
#### Exemple d’exceptions prédéfinies  
```java
class Exemple3{  
	static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};  
	static int division(int indice, int diviseur){  
	return tableau[indice]/diviseur;  
}  
public static void main(String[] args){  
	int x, y;  
	boolean ok = true;  
	Integer i;  
	java.util.Scanner scan = new java.util.Scanner(System.in);  
	do{  
		System.out.print("Entrez l’indice de l’entier a diviser: ");  
		x = scan.nextInt();  
		System.out.print("Entrez le diviseur: ");  
		y = scan.nextInt();  
		System.out.println("Le resultat de la division est: ");  
		System.out.println(division(x,y));  
		i=null;  
		if (y==1) {i=y;ok=true;}  
		System.out.print("Objet initialisé : "+i.toString());  
	}while(!ok);  
	}  
}  

```

#### Aussi  
- Il est possible de créer ses ==propres exceptions== et de les lancer (throw) lors de l’exécution d’un programme.  
- Pour créer sa propre classe d’exception, il suffit donc de créer une classe qui hérite de ``java.lang.Exception``  

#### Exemple  
```java
class Point {  
	public static final int X_MAX = 1024, Y_MAX = 768;  
		private int x, y;  
		public Point (int a, int b) {  
			x = a;  
			y = b;  
		}  
		}  
```
## Créer son propre type d'exception
en héritant de la classe Exception
```java
class CoordonneesIllegalesException extends Exception {  
	public CoordonneesIllegalesException () {  
		super("Coordonnées illégales."); }  
	public CoordonneesIllegalesException (String msg) {  
		super(msg); }  
	}
}
```
### Lancer une exception
Une exception peut être lancée via la syntaxe suivante :
==throw== exception;
où exception est une expression dont la valeur doit être un objet de type ==Throwable==.

```java 
class Point { 
	public static final int X_MAX = 1024, Y_MAX = 768;
	private int x, y;
	public Point (int a, int b) throws CoordonneesIllegalesException{
		if (a < 0 || a > X_MAX || b < 0 || b >= Y_MAX) {
		throw new CoordonneesIllegalesException("Coordonnées illégales.");
	}
	x = a;
	y = b;
	}
}

public class TestException3 {
	public static void main(java.lang.String[] args) {
		try {
			Point p = new Point (-1, 5);
		} catch(CoordonneesIllegalesException e) {
			System.out.println(e.getMessage());
		}
	}
}
```
### Remarque
Si un événement indésirable survient dans le bloc try, la partie éventuellement non exécutée de ce bloc est abandonnée et le premier bloc catch est traité.
#### Exemple:

```java
try {
System.out.print("Entrez l’indice de l’entier a diviser: ");
x = scan.nextInt();
System.out.print("Entrez le diviseur: ");
y = scan.nextInt();
```

Dans cet exemple, les instructions qui suivent dans le bloc try:
```java
System.out.print("Entrez le diviseur: ");
y = scan.nextInt();
```
-  Ne sont pas exécutées.
Même l’instruction en cours "==scan.nextInt();=="
- Est abondannée.
- Sans consommer cette entrée invalide, le scanner reste bloqué sur cette entrée.

- **throws**  
indique qu'une méthode peut potentiellement lancer une exception ==vérifiée (checked)==.

Son utilité réside dans le fait qu'elle transmet la responsabilité de la gestion de cette exception à l'appelant de la méthode, plutôt que de la traiter localement dans la méthode elle-même.

Checked exceptions, also known as compile-time exceptions, are exceptions that must be either caught or declared in the method signature using the throws keyword. 

These exceptions are typically used to handle expected error scenarios that a program can recover from..  

### Utilisation de throws :  
**Transparence des exceptions** : déclare et informe explicitement les développeurs qui utilisent la méthode qu'elle peut lancer une exception particulière.  
**Définition de la responsabilité la responsabilité** de la gestion de ces exceptions incombe à l'appelant.  
**Propagation des exceptions** : propager les exceptions vers des niveaux supérieurs dans la pile d'appels..    
## La classe Throwable  
La classe de base pour le traitement des erreurs.  

Dans le constructeur Throwable(String) :  
La chaîne en paramètre permet de définir un message qui décrit l'exception  
==String getMessage( ) ==: retourne le message  
==void printStackTrace( ) ==: affiche l'exception et l'état de la pile d'exécution au moment de son appel.  
 
## Multiples exceptions dans une clause catch  
Il n'est pas rare d'avoir à dupliquer les mêmes lignes de code dans le bloc de code de plusieurs clauses catch().  
```java
try {  
	// traitements pouvant lever les exceptions  
} catch(ExceptionType1 e1) {  
	// Traitement de l'exception  
} catch(ExceptionType2 e2) {  
	// Traitement de l'exception  
} catch(ExceptionType3 e3) {  
	// Traitement de l'exception  
} 
```
 
A partir de Java 7, la même portion de code est simplifiée : il suffit de déclarer les exceptions dans une même clause  catch en les séparant par le caractère "|".  
```java
try {  
	// traitements pouvant lever les exceptions  
} catch(ExceptionType1|ExceptionType2|ExceptionType3 ex) {  
	// Traitement de l'exception  
}
```
  
Si plusieurs types d'exceptions sont déclarés dans une clause catch alors la variable qui permettra un accès à l'exception concernée est implicitement déclarée final.  
  
## try et la gestion des ressources  
- Les ressources comme des fichiers, des flux, des connexions, etc. doivent être ==fermées==.  
- Utilisation du bloc ==finally== pour la fermeture.  
- Il faut noter que les classes (les ressources) qui implémentent l'interface ==Closeable== peuvent être utilisées comme ressource dans une instruction try. Car elles sont fermées automatiquement.  
  
### L'instruction try-with-resources (Avant Java 7)  
Des ressources comme des fichiers, des flux, des connexions, ...  
doivent être fermées explicitement par le développeur pour libérer les ressources sous-jacentes qu'elles utilisent.  

Généralement cela est fait en utilisant un bloc try / finally pour garantir leur fermeture dans la quasi-totalité des cas.  

Fermer explicitement la ressource implique un risque potentiel d'oubli de fermeture qui entraine généralement une fuite de ressources.

#### Exemple de fuite de ressources :
- **Fuite de mémoire:** Si une ressource mémoire n'est pas libérée après son utilisation, cela peut entraîner une consommation continue de mémoire., ce qui peut éventuellement conduire à un épuisement de la mémoire disponible et au plantage du programme ou du système.
- **Fuite de fichiers:** Si un programme ouvre un fichier mais ne le ferme pas correctement après l'avoir utilisé, cela peut entraîner l'impossibilité d'ouvrir de nouveaux fichiers ou de faire fonctionner d'autres opérations d'I/O de manière fiable.
- **Fuite de connexions réseau:** Dans le cas des connexions réseau, si une connexion réseau n'est pas correctement fermée après son utilisation, cela peut entraîner l'épuisement des ressources réseau disponibles.

Avec Java 7, le mot clé try peut être utilisé pour déclarer une ou plusieurs ressources.
Une nouvelle interface a été définie pour indiquer qu'une ressource peut être fermée automatiquement :
```java
java.lang.AutoCloseable
```
Tous les objets qui implémentent l'interface AutoCloseable peuvent être utilisés dans une instruction de type try-with-resources. Cette dernière garantit que chaque ressource déclarée sera fermée à la fin de l'exécution de son bloc de traitement.

L'interface ``java.lang.Autocloseable`` possède une unique méthode ``close()`` qui sera invoquée pour fermer automatiquement la ressource encapsulée par l'implémentation de l'interface.

L'interface java.io.Closable introduite par Java 5 hérite de l'interface AutoCloseable : ainsi toutes les classes qui implémentent l'interface Closable peuvent être utilisées comme ressource dans une instruction try-with-resource.

#### Exemple de L'instruction try-with-resources
```java
try (BufferedReader bufferedReader = new BufferedReader(new FileReader("monfichier.txt"))) {
	String ligne=null;
while ((ligne = bufferedReader.readLine()) != null) {
	System.out.println(ligne);
}
} catch (IOException ioe) {
	ioe.printStackTrace();
}
```

L'instruction try-with-resource présente un petit inconvénient : il est obligatoire de définir la variable qui encapsule la ressource entre les parenthèses qui suivent l'instruction try. Il n'est par exemple pas possible de fournir en paramètre de
l'instruction try une instance déjà créé.
```java
public static void afficherFichier(Reader flux) throws IOException {
	try (Reader closeableReader = flux) {
		int donnee;
	while ((donnee = flux.read()) >= 0) {
		System.out.print((char) donnee);
	}
}
```

Dans l'exemple ci-dessus, comme la variable définie et celle existante pointent sur la même référence, les deux variables.
peuvent être utilisées indifféremment. L'instruction try-with-resource se charge de fermer automatiquement le flux.
### Voir Exemple de la classe TestCloseRessource

Une exception chaînée est une fonctionnalité qui permet à une exception d'être associée à une autre exception en tant que sa cause.
- Il est important de conserver des informations sur toutes ces exceptions pour un traitement ultérieur.
- En Java, la classe Throwable possède une méthode appelée getCause() qui permet d'obtenir la cause de l'exception actuelle.
- Cela permet de former une chaîne d'exceptions, où une exception peut avoir une autre exception comme sa cause.

#### Exemple de la classe ExceptionChainee
```java
class ExceptionA extends Exception {
	public ExceptionA(String message, Throwable cause) {
		super(message, cause);
	}
}
class ExceptionB extends Exception {
	public ExceptionB(String message) {
		super(message);
	}
}
public static void methodeB() throws ExceptionB {
	// Simuler une exception
	throw new ExceptionB("Exception B s'est produite.");
	}
} //fin du main

public static void methodeA() throws ExceptionA {
	try {
		// Appeler une autre méthode qui peut lever une exception
		methodeB();
	} catch (ExceptionB e) {
		// Lancer une nouvelle exception en chaînant l'exception
		// précédente
		throw new ExceptionA("Exception A s'est produite.", e);
	}
}
public class ExceptionChainee {
	public static void main(String[] args) {
		try {
			// Appeler une méthode qui peut lever une exception
			methodeA();
		} catch (ExceptionA e) {
			// Attraper l'exception et afficher la cause, si elle existe
			Throwable cause = e.getCause();
		if (cause != null) {
			System.out.println("Cause de l'exception : " + cause.getMessage());
		} else { System.out.println("Aucune cause trouvée."); }
	}
}
```
#### Explication
La methodeA() appelle methodeB(), qui peut lever une ExceptionB.

Lorsque ExceptionB est attrapée dans methodeA(), une nouvelle ExceptionA est lancée en chaînant l'exception précédente (ExceptionB) en tant que cause.

Dans le bloc catch dans main(), nous utilisons getCause() pour obtenir la cause de ExceptionA et afficher son message.
## Application Gestion des exception

### type 1

### type 1

### type 1

## Criticisms Gestion des exception

### type 1

### type 1

### type 1

## Future Of Gestion des exception

### type 1

### type 1

### type 1

References:
- P.O.O. 2(Programmation Orientée Objet 2) - CHOUITI Sidi Mohammed -  Cours pour 2ème année Ingénieurs - Département d’Informatique -  Université de Tlemcen - 2023-2024
- 


Created:: 2024-03-11 10:21


Status:
Tags: <% tp.file.cursor(3) %>
Links: [[<% tp.file.cursor(4) %>]]

___
# Les génériques (generics)
<% tp.file.cursor(5) %>
___

# introduction aux Les génériques (generics) en java 

## Problématique de la généricité.  
- Les versions de Java antérieures à 1.5 permettaient de créer des classes de structures contenant n'importe quels types d'objet :  
	- Cas des collections  
	- Cas des classes du programmeur travaillant sur des instances d'Object
### Problèmes  
- Utilisation massive du "downcasting".  
- Risque d'erreur de cast ("ClassCastException").  
- Impossibilité pour une collection de contenir un seul type d'objet.  

### Avant java 1.5  

```java
import java.util.*;  
public class SansGenerique {  
	public static void main(String[] args) {  
		List liste = new ArrayList();  
		String valeur = null;  
		for(int i = 0; i < 10; i++) { valeur = ""+i; liste.add(valeur); }  
		for (Iterator iter = liste.iterator(); iter.hasNext(); ) {  
			valeur = (String) iter.next(); // Utilisation du Cast  
			System.out.println(valeur.toUpperCase());  
			}  
	}  
}
```
 
#### Constatations  
- Le cast ne peut être vérifié qu'à l'exécution;  
- Possibilité d’échec en levant une ClassCastException.  
- Avec l'utilisation des génériques, la vérification se fait lors de la phase de compilation :  
- la sécurité du code est ainsi renforcée.  

### Après java 1.5  
```java
import java.util.*;  
public class AvecGenerique {  
	public static void main(String[] args) {  
		List<String> liste = new ArrayList();  
		String valeur = null;  
		for(int i = 0; i < 10; i++) { valeur = ""+i; liste.add(valeur); }  
		for (Iterator<String> iter = liste.iterator(); iter.hasNext(); ) {  
		System.out.println(iter.next().toUpperCase());  
		}  
	}  
} 
```
## Le besoin des génériques  
- De nombreuses classes de l'API Collection possèdaient des paramètres de type Object et renvoient les valeurs des méthodes sous forme d'Object.  
- Elles permettent donc de contenir des valeurs hétérogènes.  
- Pour garantir que seul un type d'objet est ajouté dans la collection, il fallait tester le type avant d'invoquer les méthodes d'ajouts.  
 ```java
import java.util.List; import java.util.ArrayList;  
import java.util.Iterator;  
public class MaClasse {  
	public static void main(String[] args) {  
		List liste = new ArrayList();  
		liste.add("test");  
		Iterator it = liste.iterator();  
		while(it.hasNext()) {  
			String valeur = it.next();  
			System.out.println(valeur);  
		}  
	}  
} 
```
### Après Compilation  
- error: incompatible types: Object cannot be converted to String  
- DownCating implicite   
- Il faut donc obligatoirement utiliser un downCasting explicite vers le type d'objet pour pouvoir le manipuler.  
```java
	String valeur = (String) it.next();  
```
### Autre problème  
Cela n'empêche cependant pas d'ajouter des objets d'un autre type et donc d'avoir une exception de type CastClassException à l'exécution.  

```java
	liste.add("test");  
	liste.add(new Integer(1));
```  
## L'apport des génériques  
- Les génériques permettent de définir des classes, des interfaces, des records et des méthodes qui utilisent un type précisé à la création de l'instance ou à l'invocation de la méthode.  
- La définition et l'utilisation d'un type générique se fait en utilisant  l'opérateur diamant <> dans lequel on précise le type à utiliser.  
- L'utilisation des génériques améliore significativement la robustesse du code et le rend plus lisible.
## Les génériques et l'API Collection.  
- Avant Java 5, il est possible d'ajouter des instances de différents types dans une collection  
- Après Java 5, l'API Collection a été revue pour utiliser les génériques .
```java
	List<String> liste = new ArrayList<String>();  
```
### L’idée derrière les génériques  
- Les génériques signifient des types paramétrés.  
Exemple : 
```java
ArrayList<T> 
``` 
- C’est-à-dire, permettre au type d'être un paramètre pour les méthodes, les classes et les interfaces.  
- En les utilisant, il est possible de créer des classes qui fonctionnent avec différents types de données.  
  
### Vocabulaire s utilisés pour les génériques  
- un type générique (generic type) est une classe, une interface  
ou un record, par Exemple : 
```java
ArrayList<T> 
```  
 - un paramètre de type (type parameter) ou variable de type :  
exemple T dans
```java
ArrayList<T> 
``` 
- un type paramétré (parameterized type) est une classe,  
par exemple, 
```java
ArrayList<Long> 
```   
- un argument de type (type argument) est le type précisé, par  
exemple Long dans 
```java
ArrayList<Long> 
```   
- un type brut (raw type) est un type générique qui n'est paramétré  
avec rien, comme new 
```java
ArrayList() 
```   
### L'utilisation de types génériques  
Les génériques peuvent être utilisés avec :  
- des types (classes, interfaces, records)  
- des méthodes et des constructeurs  
 
### // Création d’un type générique  
```java
public class MaClasseGenerique<T1, T2> {  
	private T1 param1; private T2 param2;  
	public MaClasseGenerique(T1 param1, T2 param2) {  
		this.param1 = param1; this.param2 = param2;  
	}  
	public T1 getParam1() {return this.param1;}  
	public T2 getParam2() {return this.param2;}  
} 
```

```java
import java.util.*;  
public class TestClasseGenerique {  
	public static void main(String[] args) {  
		MaClasseGenerique<Integer, String> maClasse = new MaClasseGenerique<Integer, String>(1, "valeur 1");  
		Integer param1 = maClasse.getParam1();  
		String param2 = maClasse.getParam2();  
	}  
} 
```
#### L'opérateur diamant  
**// Avant Java 7, il était obligatoire,**  
```java
MaClasseGenerique<Integer, String> maClasse =  new MaClasseGenerique<Integer, String>(1, "valeur 1"); 
``` 
**// Après Java 7**
```java
MaClasseGenerique<Integer, String> maClasse = new MaClasseGenerique<>(1, "valeur 1");  
```
**// ou**  
```java
MaClasseGenerique<Integer, String> maClasse = new MaClasseGenerique(1, "valeur 1");  
```

### Voir Exemple de classe interne anonyme dans :  
> ==MainOperation.java==  

```java
public class MainOperation {
    public static void main(String[] args) {
        //Non Obligatoire après la version java 9 lors de
        // l'utilisation d'une classe interne anonyme
        Operation<Integer> op = new Operation<>() {
            public Integer ajouter(Integer a, Integer b) {
                return a+b;
            }
        };
    }
}
```

### Utilisation de "raw type"  
Le rôle des types brutes est de conserver la rétrocompatibilité avec le code antérieure à Java 5 : il n'est donc pas recommandé de les utiliser dans un autre contexte.  
#### Voir Exemple de warning (raw type) avec : 
```shell
	javac -Xlint UtilisationGeneriques.java  
```  
L'exemple ==Test.java== génère plusieurs avertissements par le compilateur.  
```java
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List nombres = new ArrayList<Integer>();
        nombres.add(1);
        List chaines = new ArrayList<String>();
        chaines.add("1");
        List<String> liste;
        liste = chaines;
        String chaine = liste.get(0);
        liste = nombres;
        chaine = liste.get(0);
    }
}
```

Le dernier warning génère même une erreur d’exécution de Type ==ClassCastException==.  
==Donc==, Mixer des types bruts et des paramétrés doit être évité  

#### // Définition de type générique  
```java
class Test<T> {  
	T obj;  
	Test (T obj) { this.obj = obj; }  
	public T getObject() { return this.obj; }  
}
```
#### // Example of an instance of generic class  
```java
class Main {  
	public static void main (String[] args) {  
	// instance of Integer type  
	Test <Integer> obj = new Test<Integer>(15);  
	System.out.println(obj.getObject());  
	// instance of String type  
	Test <String> sObj = new Test<String>("Hello");  
	System.out.println(sObj.getObject());  
	}  
}  
```
Dans le JDK, les ==noms des paramètres de types== couramment  
utilisés sont :  
- T : un type comme premier paramètre  
- E : un élément notamment dans les types de l'API Collection  
- N : un nombre  
- S, U V : un type comme paramètre supplémentaire  
- K : la clé d'une Map  
- V : la valeur d'une map  
  
## Les génériques et l'héritage  
il n'y a pas de relation entre deux types paramétrés même si les arguments de types utilisés possèdent une relation.  
#### Exemple :
```java
import java.util.List; import java.util.ArrayList;  
	public class GenHer {  
		public static void main(String[] args) {  
			List<Number> nombres = new ArrayList<Number>();  
			List<Integer> entiers = new ArrayList<Integer>();  
			nombres = entiers; // Erreur de Compilation  
		}  
	}  
 
```

## Les classes génériques et le sous-typage
Il est possible de sous-typer une classe ou une interface générique en l'étendant ou en l'implémentant.  
Une classe qui hérite d'une classe générique peut spécifier les arguments de type, peut conserver les paramètres de type ou ajouter des paramètres de type supplémentaire.  
#### Voir Exemple :  
```java
	interface MaList<E>
```  
 Il est possible d'hériter d'un type paramétré.  
#### Exemple
```java
	class A implements I <Integer, String> { .. } 
```
 Il est possible d'hériter d'un type générique mixant paramètre de type et argument de type .
#### Exemple  
```java
	class A<V> implements I<Integer, V> { .. }  
```
## Le transtypage des instances génériques  
Il n'est pas possible non plus de caster l'affectation d'une variable d'un type générique même si c'est vers une variable d'un même type et d'un type générique qui soit un sous-type.  
#### Exemple :
```java
import java.util.ArrayList; import java.util.List;  
public class MaClasse<T> {  
	public static void main(String... args) {  
		List<String> chaines = new ArrayList<String>();  
		List<Object> objets = (List<Object>) chaines;  
		objets.add(new Object());  
	}  
}
```

### Les méthodes et les constructeurs génériques  
Parfois, la classe ne doit pas être générique mais seulement une méthode.  
```java
public class MethodeGen1 {  
	public static < E > void afficher( E[] donnees ) {  
		for(E element : donnees) { System.out.print(element); }  
		System.out.println(); }  
	public static void main(String args[]) {  
		Integer[] entiers = { 1, 2, 3, 4, 5 };  
		String[] chaines = { "a", "b", "c", "d", "e" };  
		afficher(entiers); afficher(chaines); }  
	} 
}
```

```java
public class MethodeGen2 {  
	public static <T extends Comparable<T>> T max(T x, T y) {  
		T max = x;  
		if(y.compareTo(max) > 0) {max = y;}  
			return max;  
		}  
		public static void main(String... args) {  
			System.out.println(MethodeGen2.max(123, 26));  
			System.out.println(MethodeGen2.max("abc", "xyz"));  
		}  
	}  
}
```
Il est aussi possible et parfois nécessaire d'indiquer explicitement le type générique notamment si le compilateur ne peut pas l'inférer.  
```java
public class MethodeGen3 {  
	public static <T extends Comparable<T>> T max(T x, T y) {  
		T max = x; if(y.compareTo(max) > 0) {max = y;} return max;  
	}  
	public static void main(String[] args) {  
		System.out.println(MethodeGen3.max(123, 26));  
		System.out.println(MethodeGen3.max("abc", "xyz"));  
		System.out.println(MethodeGen3.<Integer>max(123, 26));  
		System.out.println(MethodeGen3.<String>max("abc", "xyz"));  
	}  
} 
```

### Les paramètres de type bornés (bounded type parameters))  
Ce mécanisme permet une utilisation un peu moins stricte du typage dans les génériques.  
```java
import java.util.*;  
	public class MaClasseGenerique1<T extends Collection> {  
		private T param;  
		public MaClasseGenerique1(T param) {  
			this.param = param;  
		}  
		public T getParam() {return this.param;}  
} 
```
 
```java
import java.util.*;  
public class TestClasseGenerique1 {  
	public static void main(String[] args) {  
		MaClasseGenerique1<ArrayList> maClasseA =  new MaClasseGenerique1<ArrayList>(new ArrayList());  
		MaClasseGenerique1<TreeSet> maClasseB =  new MaClasseGenerique1<TreeSet>(new TreeSet());  
	}  
} 
```
  
restreindre le type d'objets qui peut être utilisé dans le type paramétré dans une méthode.
Exemple :
```java
public class MaClasse<T> {  
	public static <T extends Comparable<T>> int comparer(T t1, T t2){  
		return t1.compareTo(t2);  
	}  
}  
```

### Les paramètres de type avec wildcard)  
Toute tentative d'utiliser un autre type même d'un sous-type provoque une erreur à la compilation  
```java
	import java.util.ArrayList;  
	public class UtilisationGeneriques {  
		public static void main(String[] args) {  
			ArrayList<Integer> listInteger = new ArrayList<>();  
			// Erreur de compilation  
			ArrayList<Number> listNumber = listInteger;  
		}  
	} 
```
Pour permettre de contourner ces limitations et gagner en flexibilité Un "wildcard" désigne un type quelconque.
Seulement, Les types paramétrés avec un wildcard imposent des restrictions par rapport aux types paramétrés avec un type concret :  
- il n'est pas possible de créer une instance, par exemple :
```java 
	new ArrayList<?> `
```
-  il n'est pas possible d'hériter d'un type paramétré avec un wildcard, par exemple : 
```java
	 interface MaList extends List<?>
```  
#### Exemples  
Set $<?>$ : pour un ensemble qui peut contenir tout type d'objet.  
Cependant, à l'exécution, cet ensemble devra être assignée à un type concret.  
·
List<$?$extends Number> : pour une liste qui peut contenir des instances de type Number ou sous-type de Number.  
·  
· Comparator<$?$ super Integer> : pour une comparateur d'objets de type Integer ou d'un de ses super-types.  
#### Exemple  
Dans l'API Collections, la méthode addAll() de l'interface 
Collection permet d'ajouter tous les éléments de la Collection passée en paramètre et contenant des éléments du type de la collection ou d'un de ses sous-types.  
La signature de la méthode est de la forme :  
```java
	boolean addAll(Collection<? extends E> c) 
``` 
### Voir Exemple WilCard2.java  
```java
import java.util.List;
import java.util.ArrayList;

public class WilCard2 {
    public static void main(String... args) {
        List<Number> nombres = new ArrayList<Number>();
        ArrayList<Integer> entiers = new ArrayList<Integer>();
        ArrayList<Long> entierlongs = new ArrayList<Long>();
        ArrayList<Float> flottants = new ArrayList<Float>();
        //ArrayList<String> string = new ArrayList<String>();
        entiers.add(5);entiers.add(55555555);entiers.add(Integer.MAX_VALUE);
        entierlongs.add(Long.MAX_VALUE);
        flottants.add(14.5F);flottants.add(65.5F);
        // Nous pouvons ajouter n'importe quel type issu de Collection
        // grace au wilcard dans : boolean addAll(Collection<? extends E> c)
        nombres.addAll(entiers);
        nombres.addAll(entierlongs);
        nombres.addAll(flottants);
        //nombres.addAll(string); // provoque une erreur, String n'est pas une collection
        for (Number n:nombres) System.out.println(n);
    }
}
```
### Types paramétrés avec wildcard non bornés (Unbounded wildcard parameterized type)  
Pour définir une méthode générique qui affiche une liste d'objets  
quelconque, ce n’est pas évident sans générique.  
#### Voir Exemple SansWilCard.java  
```java
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SansWilCard {
    public static void afficher(List<Object> liste) {
        for (Object element : liste) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String... args) {
        List<Integer> entiers = Arrays.asList(1, 2, 3);
        List<String> chaines = Arrays.asList("A", "B", "C");
        // Erreurs de Compilation
        afficher(entiers);
        afficher(chaines);
    }
}
``` 
Pour définir une méthode générique qui affiche une liste d'objets quelconque, ce n’est pas évident sans générique.  
#### Voir Exemple SansWilCard.java  
```java
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SansWilCard {
    public static void afficher(List<Object> liste) {
        for (Object element : liste) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String... args) {
        List<Integer> entiers = Arrays.asList(1, 2, 3);
        List<String> chaines = Arrays.asList("A", "B", "C");
        // Erreurs de Compilation
        afficher(entiers);
        afficher(chaines);
    }
}
``` 

## References:
- P.O.O. 2(Programmation Orientée Objet 2) - CHOUITI Sidi Mohammed -  Cours pour 2ème année Ingénieurs - Département d’Informatique -  Université de Tlemcen - 2023-2024


Created:: 2024-03-11 12:03

Status:
Tags: <% tp.file.cursor(3) %>
Links: [[<% tp.file.cursor(4) %>]]

___
# Les collections
<% tp.file.cursor(5) %>
___

# introduction 

## definition 
Une collection est un objet qui contient d’autres objets  
### Exemple  
Un tableau est une collection  
### Classes  
• AbstractCollection, ArrayList, Arrays, Collections, HashSet, LinkedList, TreeSet, Vector…  
### Interfaces  
• List, Map, Set, SortedMap, SortedSet  
Ces classes et interfaces se trouvent dans le paquetage java.util  


# ArrayList  
## Description  
- ArrayList fournit un tableau ==dynamique== et  
- spécifie AbstractList et implémente List.  
### Déclaration  
```java
public class ArrayList<E> extends AbstractList<E>  
	implements List<E>, RandomAccess, Cloneable, Serializable 
```
## Quelques caractéristiques  
La classe ==java.util.ArrayList== est la classe la plus utilisée  
- Un ArrayList se comporte comme un tableau, il contient  
plusieurs objets (de la classe Object uniquement)  
- Ne peut contenir des types primitifs  
- Accède à ses éléments à l’aide d'un index  
- Pas de taille prédéfinie  
- Existe des méthodes pour ajouter ou enlever un élément  
  
## Création d’une instance ArrayList  
Il y a des constructeurs :  
```java
	ArrayList()  
	ArrayList(int initialCapacity)  
```
Il y a deux manières d’ajouter un élément :  
- à la fin d'un ArrayList : ==boolean add(Object newElement)==  
- à une position donnée : ==void add(int index, Object newElement)== 
le paramètre ==index== indique où insérer le nouvel élément  
## Autres méthodes d’ArrayList  
- Pour remplacer un objet à une position donnée Object :  
```java
	ArrayList()  
	ArrayList(int initialCapacity)  
```
set(int index, Object newElement)  
- Pour accéder à un élément ==Object get(int index)==  
- Pour tester le contenu ==boolean isEmpty() == 
- pour connaître le nombre d’éléments dans la liste 
```java
	int size();
```
- Pour savoir si un objet est présent ou non dans une liste  
```java
	boolean contains(Object obj)   
```
- Pour supprimer un élément à une position donnée,  
```java
	remove(int index)
```
#### Exemple  
```java
public class Etudiant{  
	private String leNom;  
	public Etudiant(String unNom){  
		leNom = unNom;  
	}  
	public void setNom(String nom) { leNom = nom; }  
	public String getNom() { return leNom; }  
}
```
#### Exemple (utilisant la classe Object)  
```java
public static void main(String [] args) {  
	ArrayList <Object> tableauEtudiants= new ArrayList<Object>();  
	Etudiant e1 = new Etudiant("Bachir")  
	Etudiant e2 = new Etudiant("Nadir");  
	tableauEtudiants.add(e1);  
	tableauEtudiants.add(e2);  
	if (! tableauEtudiants.isEmpty()) {  
		for (int i = 0; i< tableauEtudiants.size();i++)  
			System.out.println(((Etudiant) tableauEtudiants.get(i)).getNom());  
			tableauEtudiants.remove(1);}  
		}
	}
}
```  
#### Exemple (utilisant la classe Etudiant )  
```java 
public static void main(String [] args) {  
	ArrayList<Etudiant> tableauEtudiants =  new ArrayList<Etudiant> ();  
	Etudiant emp1 = new Etudiant(« Bachir ");  
	Etudiant emp2 = new Etudiant("Nadir");  
	tableauEtudiants.add(emp1);  
	tableauEtudiants.add(emp2);  
	if (!tableauEtudiants.isEmpty()) {  
		for (int i = 0; i< tableauEtudiants.size(),i++)  {
			System.out.println((Etudiant) tableauEtudiants.get(i).getNom());  
			tableauEtudiants.remove(1);}  
		}
	}
}
```

## Boucles
### Exemple
Utilisation d’un index :
```java
for (int i = 0; i< tableauEtudiants.size();i++)
	System.out.println( tableauEtudiants.get(i).getNom());
```
## Boucle for-each
Répéter des actions pour chaque objet d'une collection donnée

![[Pasted image 20240312112111.png]]
### Exemple
```java
for (Etudiant e : tableauEtudiants)
	System.out.println( e.getNom());
```
### Exemple
### Utilisation de Iterator
ArrayList implémente la méthode ==Iterator iterator()== qui retourne un itérateur sur l’ensemble des éléments.
```java
for (Iterator<Etudiant> i=tableauEtudiants.iterator();i.hasNext();)
	System.out.println( i.next().getNom());
```
## Exercice
Ecrire une classe ==TestClientIterator== qui
1. Remplira les 03 objets suivant dans un objet ArrayList.

| Element | Type    | Valeur |
| ------- | ------- | ------ |
| 1       | Integer | 42     |
| 2       | String  | "test" |
| 3       | Bouble  | -12.34 |

2. Parcourir cette liste (comme ==Iterator== et/ou ==non==), afind’ afficher ces trois éléments.
```java
import java.util.*;
class TestClientIterator {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new Integer(42));
		al.add(new String("test"));
		al.add(new Double("-12.34"));
		// Commme Iterator
		for(Iterator<Object> iter=al.iterator(); iter.hasNext();)
			System.out.println( iter.next() );
		//Pas comme Iterator
		for(Object o:al) System.out.println( o );
	}
} 
```

Comme ArrayList, ==LinkedList== implémentent l'interface ==List==.
- ArrayList utilise un ==tableau== extensible
- Utilise ==efficacement== les méthodes ==get() et set()==.
- LinkedList est implémentée sous forme d'une ==liste chaînée==,
- Ces performances ==d'ajout et de suppression== sont meilleures que celles de ArrayList, mais mauvaises pour les méthodes get() et set().
## Comparaison de temps d’exécution de méthodes entre objets LinkedList et ArrayList
--------------méthode ==add== ----------------
	ArrayList : 101
	LinkedList : 469
--------------méthode ==get== -----------------
	ArrayList : 1
	LinkedList : 24592
--------------méthode ==remove== ------------
	ArrayList : 2671
	LinkedList : 94
----------------------------------------------
# Autres Collections

![[Pasted image 20240312113558.png]]
Plusieurs types de collections :
- Interfaces ==List== et ==Set== qui héritent l'interface ==Collection==
	- Les objets List acceptent toutes les valeurs, même les valeurs null
	- Set n'autorisent pas deux fois la même valeur (le même objet), ce qui est pratique pour une liste d'éléments uniques.
- Ainsi que l'interface ==Map== 
	Les Map fonctionnent avec un système clé - valeur pour ranger et retrouver les objets qu'elles contiennent.
## application {Untitled}

### type 1

### type 1

### type 1

## Criticisms {Untitled}

### type 1

### type 1

### type 1

## Future of {Untitled}

### type 1

### type 1

### type 1

References:
- l


Created:: 2024-03-12 11:08

