#include <string>
using namespace std;

enum COLOR { Green, Blue, White, Black, Brown};
class Animal
{
public:
    virtual void speak() const;
    virtual void move() const =0;
protected:
    string _name;
    COLOR _color;
    Animal();
    Animal(string n, COLOR c);
    ~Animal();

};

class Mammal:public Animal
{
public:
    Mammal();
    Mammal(string n, COLOR c);
    ~Mammal();
    virtual void eat() const;
    void move() const;
};