/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "calculette.h"
#include "string.h"

int nbCalcul=0;


int *
calculerdouble_1_svc(int *argp, struct svc_req *rqstp)
{
	static int  result;

	nbCalcul++;
	result = (*argp) * 2;

	return &result;
}

int *
calculersomme_1_svc(struct calcul *argp, struct svc_req *rqstp)
{
	static int  result;

	result=(argp->a)+(argp->b);
	nbCalcul++;	

	return &result;
}

char **
afficheridentite_1_svc(struct identite *argp, struct svc_req *rqstp)
{
	static char * result;

	char *tmp;

	tmp = strcat(argp->prenom," ");
	tmp = strcat(tmp,argp->nom);
	result=tmp;

	return &result;
}

void *
afficherconcatenationidentite_1_svc(struct identite *argp, struct svc_req *rqstp)
{
	static char * result;

	char *tmp;

	tmp = strcat(argp->prenom," ");
	tmp = strcat(tmp,argp->nom);
	
	printf("%s\n",tmp);


	

	return (void *) &result;
}

int *
nombrecalcul_1_svc(void *argp, struct svc_req *rqstp)
{
	static int  result;

	result=nbCalcul;

	return &result;
}