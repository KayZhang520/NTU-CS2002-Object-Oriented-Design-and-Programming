#include <iostream>
#include <string>
using namespace std;

class Polygon {
    protected: //'protected' allows access by subclasses!
    enum KindofPolygon { POLY_PLAIN, POLY_RECT, POLY_TRIANG }type; //this syntax creates enum and creates attribute of the enum in one line
    string name;
    float width;
    float height;

    public:
    Polygon(string _name, float _width, float _height) {
        name = _name;
        width = _width;
        height = _height;
        type = KindofPolygon::POLY_PLAIN;
    }
    void settype(KindofPolygon value) {
        type = value;       
    }
    string getName() { return name; }
    virtual float calArea()=0;
    virtual void printWidthHeight( ) {
        cout<<"Width = "<<width<<" Height = "<<height<<endl;
    }
};

class Triangle:public Polygon{
    public:
    Triangle(string _name, float _width, float _height):Polygon(_name, _width, _height){
        settype(KindofPolygon::POLY_TRIANG);
    }
    float calArea() { 
        return (float)0.5*width*height; 
    }
};

class TestPolygon {   
    public:
        static void printArea(Polygon& poly){
            cout<<"This polygon has an area of "<<poly.calArea();
        }
};

int main(){
    Triangle t1("myTri", 5.0, 5.0); //shortcut syntax for object delcaration??
    TestPolygon::printArea(t1); 
}