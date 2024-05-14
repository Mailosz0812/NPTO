#include <iostream>
#include <stdlib.h>
#include <time.h>


using namespace std;

struct stack {
    int max_size;
    int *tab;
    int top_index;
};

struct stack *init(int max);
void destroy(struct stack *s);
int empty(struct stack *s);
int full(struct stack *s);
void push(struct stack *s, int number);
void pop(struct stack *s);
int top(struct stack *s);

int main() {
    srand(time(0));
    int size=rand()%20, rand_number;
    struct stack *stos = init(size);

    while (1){
        rand_number = rand() % 100;
        push(stos, rand_number);
        if (full(stos)){
            break;}}

    while (!empty(stos)){
        top(stos);
        pop(stos);}


    destroy(stos);
    return 0;
    
};


struct stack *init(int max){
    struct stack *s = (struct stack*)malloc(sizeof(struct stack));
    s->max_size = max;
    s->tab = (int*)malloc(sizeof(int)*max);
    s->top_index=-1;
    return s;
};

void destroy(struct stack *s){
    free(s->tab);
    s->tab=NULL;
    free(s);
    s=NULL;
};

int empty(struct stack *s){
    if (s->top_index==-1){
        return 1;}
    else {
        return 0;}
};

int full(struct stack *s){
    if (s->top_index+1==s->max_size){
        return 1;}
    else {
        return 0;}
};

void push(struct stack *s, int number){
    if (full(s)){
        cout << "Nie mozna dodac elementu, bo stos jest pelny" << endl;
    }
    else {
        s->top_index++;
        s->tab[s->top_index] = number;}
};

void pop(struct stack *s){
    if (empty(s)){
        cout << "Nie mozna usunac elementu, bo stos jest pelny" << endl;}
    else {
        s->top_index--;}
};

int top(struct stack *s){
    if (empty(s)){
        cout << "Nie mozna odczytac liczby z wierzcholka, bo stos jest pusty" << endl;}
    else {
        cout <<  s->tab[s->top_index] << endl;}
};