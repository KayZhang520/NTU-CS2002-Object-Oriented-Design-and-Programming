#include <iostream>
#include <string>
using namespace std ;

enum COLOR { Green, Blue, White, Black, Brown};
const char* colors[5] = { "green", "blue", "white", "black", "brown"};
class Animal {
    protected :
    string _name;
    COLOR _color ;
    public :
    Animal() : _name("unknown") {
        cout << "constructing Animal object "<< _name << endl ;
    }
    Animal(string n, COLOR c):_name(n), _color(c){
        cout << "constructing an Animal object, of color " << colors[_color] << " and name " << _name << "." << endl;
    }
    ~Animal() {
        cout << "destructing Animal object "<< _name << endl ;
    }
    virtual void speak() const {
        cout << "Animal speaks "<< endl ;
    }
    virtual void move()=0;
};

class Mammal:public Animal{
    public:
    Mammal(){
        cout<<"constructing a Mammal object"<<endl;
    }
    Mammal(string n, COLOR c):Animal(n,c){
        cout << "constructing a Mammal object, of color " << colors[_color] << " and name " << _name << "." << endl;
    }
    ~Mammal() {
        cout << "destructing Mammal object "<< _name << endl ;
    }
    void eat() const {
        cout<<"Mammal eat"<<endl;
    }
    void move(){
        cout<<"Mammal move"<<endl;
    }
};

class Dog:public Mammal{
    private:
    string _owner;
    public:
    Dog(string n, COLOR c, string s):Mammal(n,c), _owner(s){
        cout << "constructing a Dog object, of color " << colors[_color] << ", name " << _name << ", owned by " << _owner << endl;
    }
    ~Dog() {
        cout << "destructing Dog object "<< _name << endl ;
    }
    void speak() const {
        cout<<"Woof"<<endl;
    }
    void move(){
        cout<<"Dog runs"<<endl;
    }
};

class Cat:public Mammal{
    private:
    string _owner;
    public:
    Cat(string n, COLOR c, string s):Mammal(n,c), _owner(s){
        cout << "constructing a Cat object, of color " << colors[_color] << ", name " << _name << ", owned by " << _owner << endl;
    }
    ~Cat() {
        cout << "destructing Cat object "<< _name << endl ;
    }
    void speak() const {
        cout<<"Meow"<<endl;
    }
    void move(){
        cout<<"Cat catwalks"<<endl;
    }
};

class Lion:public Mammal{
    private:
    string _owner;
    public:
    Lion(string n, COLOR c, string s):Mammal(n,c), _owner(s){
        cout << "constructing a Lion object, of color " << colors[_color] << ", name " << _name << ", owned by " << _owner << endl;
    }
    ~Lion() {
        cout << "destructing Lion object "<< _name << endl ;
    }
    void speak() const {
        cout<<"Roar"<<endl;
    }
    void move(){
        cout<<"Lion hunts"<<endl;
    }
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
    Mammal arr[5];
    int x, ctr;
    cin>>x;
    for(int i=0;i<5;i++){
        if(x==5)break;
        switch(x){
        case 1:
            arr[ctr++] = Dog("Ollie", COLOR::White, "John");
            break;
        case 2:
            arr[ctr++] = Cat("Coco", COLOR::Brown, "Maria");
            break;
        case 3:
            arr[ctr++] = Lion("Simba", COLOR::Brown, "Zookeeper");
            break;
        case 4: 
            for(int y=0;y<ctr-1;y++){
                arr[y].move();
                arr[y].eat();
                arr[y].speak();
            }
        }
        cin >> x;
    }
};