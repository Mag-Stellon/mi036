struct calcul {

 int a;
 int b;

} ;

struct identite {

 char prenom[250];
 char nom[250];

} ;


program Calculette {

 version v1 {
  int calculerDouble(int)=1;
  int calculerSomme(struct calcul)=2;
  string afficherIdentite(struct identite)=3;
  void afficherConcatenationIdentite(struct identite)=4;
  int nombreCalcul(void)=5;

 }=1;

}=1;