#include <iostream>
#include <string>
#include "Animal.h"
#include "childAnimal.h"
using namespace std ;


const char* colors[5] = { "green", "blue", "white", "black", "brown"};
Animal::Animal() : _name("unknown") {
    cout << "constructing Animal object "<< _name << endl ;
}
Animal::Animal(string n, COLOR c) : _name(n), _color(c){
    cout << "constructing Animal object, of color " << colors[_color] << " and name " << _name << "." << endl;
}
Animal::~Animal() {
    cout << "destructing Animal object "<< _name << endl ;
}
void Animal::speak() const {
    cout << "Animal speaks "<< endl ;
}



Mammal::Mammal(){
    cout<<"constructing a Mammal object"<<endl;
}
Mammal::Mammal(string n, COLOR c):Animal(n,c){
    cout << "constructing Mammal object, of color " << colors[_color] << " and name " << _name << "." << endl;
}
Mammal::~Mammal() {
    cout << "destructing Mammal object "<< _name << endl ;
}
void Mammal::eat() const {
    cout<<"Mammal eat"<<endl;
}
void Mammal::move() const {
    cout<<"Mammal move"<<endl;
}

Dog::Dog(string n, COLOR c, string s):Mammal(n,c), _owner(s){
    cout << "constructing Dog object, of color " << colors[_color] << ", name " << _name << ", owned by " << _owner << endl;
}
Dog::~Dog() {
    cout << "destructing Dog object "<< _name << endl ;
}
void Dog::speak() const {
    cout<<"Woof"<<endl;
}
void Dog::eat() const {
    cout<<"Dog eat bone"<<endl;
}
void Dog::move() const{
    cout<<"Dog runs"<<endl;
};

Cat::Cat(string n, COLOR c, string s):Mammal(n,c), _owner(s){
    cout << "constructing Cat object, of color " << colors[_color] << ", name " << _name << ", owned by " << _owner << endl;
}
Cat::~Cat() {
    cout << "destructing Cat object "<< _name << endl ;
}
void Cat::speak() const {
    cout<<"Meow"<<endl;
}
void Cat::eat() const {
    cout<<"Cat eat fish"<<endl;
}
void Cat::move() const{
    cout<<"Cat hide"<<endl;
};


Lion::Lion(string n, COLOR c, string s):Mammal(n,c), _owner(s){
    cout << "constructing Lion object, of color " << colors[_color] << ", name " << _name << ", owned by " << _owner << endl;
}
Lion::~Lion() {
    cout << "destructing Lion object "<< _name << endl ;
}
void Lion::speak() const {
    cout<<"Roar"<<endl;
}
void Lion::eat() const {
    cout<<"Lion eat deer"<<endl;
}
void Lion::move() const{
    cout<<"Lion hunt"<<endl;
};


int main() {
    // Dog d("Chestnut", COLOR::Brown, "Ben");
    // d.speak();
    // d.move();
    // Animal *animalPtr = new Dog("Lassie", White, "Andy");
    // animalPtr->speak();
    // animalPtr->move();
    // delete animalPtr;
    // Dog dogi("Lassie", White, "Andy");
    // Mammal *aniPtr = &dogi ;
    // Mammal &aniRef = dogi ;
    // Mammal aniVal = dogi ;
    // aniPtr->speak() ;
    // aniRef.speak() ;
    // aniVal.speak() ;
    cout << "Select the animal to send to Zoo :"<<endl;
    cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit"<<endl;
    Mammal* arr[5];
    int x, ctr;
    ctr = 0;
    cin>>x;
    for(int i=0;i<5;i++){
        if(x==5)break;
        switch(x){
        case 1:
            arr[ctr++] = new Dog("Ollie", COLOR::White, "John");
            break;
        case 2:
            arr[ctr++] = new Cat("Coco", COLOR::Brown, "Maria");
            break;
        case 3:
            arr[ctr++] = new Lion("Simba", COLOR::Brown, "Zookeeper");
            break;
        case 4: 
            for(int y=0;y<ctr;y++){
                arr[y]->move();
                arr[y]->eat();
                arr[y]->speak();
            }
        }
        cin >> x;
    }
};