#include<iostream>
using namespace std;

class Student{
public:
    Student(string Id,string Name,int Score){
        id = Id;
        name = Name;
        score = Score;
    }
    string getId();
    string getName();
    int getScore();
    void changeScore(int);

private:
    string id;
    string name;
    int score;
};
string Student::getId(){
    return id;
}
string Student::getName(){
    return name;
}
int Student::getScore(){
    return score;
}
void Student::changeScore(int new_score){
    score = new_score;
    return;
}

int main()
{
    Student student1("109123456","Alex",90);
    Student student2("109876543","Kiki",75);

    cout << "Before" << endl;
    cout << student1.getId() << " : " << student1.getName() << " : " << student1.getScore() << endl;
    cout << student2.getId() << " : " << student2.getName() << " : " << student2.getScore() << endl;

    student1.changeScore(61);
    student2.changeScore(89);
    
    cout << "After" << endl;
    cout << student1.getId() << " : " << student1.getName() << " : " << student1.getScore() << endl;
    cout << student2.getId() << " : " << student2.getName() << " : " << student2.getScore() << endl;

    return 0;
}
