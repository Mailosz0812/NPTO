#include <iostream>

using namespace std;

class Stos {
private:
    int *tablica;
    int rozmiar;
    int wierzcholek;


public:
    Stos(int rozmiar){
        cout << "Wywolano konstruktor jednoparametrowy" << endl;
        this->rozmiar = rozmiar;
        tablica = new int[rozmiar];
        wierzcholek = -1;
        cout << this << endl;
    }
    Stos(){
        cout << "Wywolano konstruktor bezparametrowy" << endl;
        this->rozmiar = 5;
        tablica = new int[rozmiar];
        wierzcholek = -1;
        cout << this << endl;
    }
    Stos(const Stos& kopia)
    {
        rozmiar = kopia.rozmiar;
        wierzcholek = kopia.wierzcholek;
        tablica = new int[rozmiar];
        memcpy(tablica,kopia.tablica,rozmiar * sizeof(int));
        cout << "Konstruktor kopiujacy na adresie: " << this << endl;
    }

    ~Stos(){
        cout << " \nWywolano destruktor" << endl;
        cout << this << endl;
        delete[] tablica;
    }

    bool isEmpty() {
        return wierzcholek == -1;
    }

    bool isFull() {
        return wierzcholek == rozmiar - 1;
    }

    void push(int value){
        tablica[++wierzcholek] = value;
    }
    void pop() {
        --wierzcholek;
    }
    int top(){
        return tablica[wierzcholek];
    }

};

void f(Stos s, int a) {
    s.push(a);
}
main() {
   Stos s;
   s.push(0);
   f(s, 1);
   f(s, 2);
   while (!s.isEmpty()) {
      cout << s.top();
      s.pop();
   }
}
