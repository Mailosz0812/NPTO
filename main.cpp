#include <iostream>
#include <cstring>
using namespace std;

class Stos {
private:
    int* tab;
    int capacity;
    int topIndex;

public:

    Stos(int size = 10) : capacity(size), topIndex(-1) {
        tab = new int[capacity];
        cout << "Konstruktor (" << (size == 10 ? "domyslny" : "parametrowy") << ") na adresie " << this << endl;
    }


    Stos(const Stos& other) : capacity(other.capacity), topIndex(other.topIndex) {
        tab = new int[capacity];
        memcpy(tab, other.tab, capacity * sizeof(int));
        cout << "Konstruktor kopiujacy na adresie " << this << endl;
    }

    ~Stos() {
        cout << "Destruktor na adresie " << this << endl;
        delete[] tab;
    }

    void push(int value) {
        if (topIndex < capacity - 1) {
            tab[++topIndex] = value;
        } else {
            cout << "Stos pe³ny!" << endl;
        }
    }

    bool empty() const {
        return topIndex == -1;
    }

    void pop() {
        if (!empty()) {
            --topIndex;
        } else {
            cout << "Stos pusty!" << endl;
        }
    }

    int top() const {
        if (!empty()) {
            return tab[topIndex];
        } else {
            cout << "Stos pusty!" << endl;
            return -1;
        }
    }
};

void f(Stos s, int a) {
    s.push(a);
}

int main() {
    Stos s;
    s.push(0);
    f(s, 1);
    f(s, 2);
    while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    return 0;
}
