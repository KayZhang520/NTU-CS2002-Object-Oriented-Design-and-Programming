#include <string>
using namespace std;

class Dog:public Mammal
{
public:
    Dog();
    Dog(string n, COLOR c, string s);
    ~Dog();
    void eat() const;
    void move() const;
    void speak() const;
private:
    string _owner;
};

class Cat:public Mammal
{
public:
    Cat();
    Cat(string n, COLOR c, string s);
    ~Cat();
    void eat() const;
    void move() const;
    void speak() const;
private:
    string _owner;
};

class Lion:public Mammal
{
public:
    Lion();
    Lion(string n, COLOR c, string s);
    ~Lion();
    void eat() const;
    void move() const;
    void speak() const;
private:
    string _owner;
};