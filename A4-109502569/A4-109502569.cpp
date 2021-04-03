#include <iostream>

using namespace std;

class Square{
public:
    Square(int x){
        area = x*x;
    }
    float rtArea(){
        return area;
    }
private:
    float area;
};

class Circle{
public:
    Circle(int r){
        area = r*r*pi;
    }
    friend class Square;
    void compareArea(Square& s){
        if(s.rtArea() > area)
            printf("Square one is biggest\n");
        else
            printf("Circle one is biggest\n");
        return;
    }
    static int circleArea(int r){
        return r*r*pi;
    }
    float rtArea(){
        return area;
    }
private:
    static const int pi = 3;
    float area;
};

class Area{
public:
    Area(){};
    static void compare(Circle& c,Square& s){
        if(s.rtArea() > c.rtArea())
            printf("Square one is biggest\n");
        else
            printf("Circle one is biggest\n");
        return;
    }
};

int main(){
    int r;
    cin >> r;
    cout << "Circle Area:" << Circle::circleArea(r) << endl;

    Circle r1(10);
    Circle r2(3);
    Square s1(3);
    Square s2(10);
    r1.compareArea(s1);
    Area::compare(r2,s2);
    return 0;
}
