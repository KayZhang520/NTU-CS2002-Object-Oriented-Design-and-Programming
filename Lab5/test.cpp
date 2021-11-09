#include <iostream>

class Thing
{
public:
    ~Thing()
    {
        std::cout<<"Thing " << i << " destructing\n";
    }
    
    Thing & operator =( const Thing & )
    {
        std::cout << "Thing " << i << " assigning\n";
        return *this;
    }
    
    Thing() : i( ++n )
    {
        std::cout << "Thing " << i << " constructing\n";
    }

private:    
    size_t i;
    static size_t n;
};

size_t Thing::n = 0;

int main() 
{
    {
        Thing arr[1];
        arr[0] = Thing();
    }
    
    std::cin.get();
    
    return 0;
}