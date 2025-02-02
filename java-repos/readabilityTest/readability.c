#include <stdio.h>
#include <cs50.h>
#include <string.h>
#include <ctype.h>

int main (void)
{
    string text = get_string("text: ");
    int p=0,q=0,r,j=0,k=0;
    {
        printf("Your Text is : %s\n", text);
    }
       for(p=0,r=strlen(text); p<r; p++)
        {
        // for counting Letters.
        if (text[p]!= ' ' && text[p]!= '\0' && text[p]!='-' && text[p]!='_' && text[p]!= '.')
        {
            q++;
        }
        }
        // for counting Words.
        for(p=0,r=strlen(text); p<r; p++)
        {
        if (text[p]==' ' || text[p]== '-' || text[p]== '\0'  || text[p]=='_'|| text[p]=='!')
        {
            j++;
        }
        }
        // for counting Sentences.
        for(p=0,r=strlen(text); p<r; p++)
        {
        if (text[p]== '.' || text[p]== '!' || text[p]== '\0')
        {
            k++;
        }
        }
        if (q>0 && text[strlen(text)-1]!='!' && text[strlen(text)-1]!= '.' && text [strlen(text)-1]!=' ')
	   {
	        k++;
       }
        printf("no.of chars is %i\n",q);
        printf("no.of words is %i\n",j);
        printf("no.of sentences is %i\n",k);
}

