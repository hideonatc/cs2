#include<iostream>
using namespace std;
class Fruit{
public:
	string Name1;
	string Name2;
	int Weight1;
	int Weight2;
	Fruit(string name1,string name2,int weight1,int weight2){
		Name1 = name1;
		Name2 = name2;
		Weight1 = weight1;
		Weight2 = weight2;
	}
	bool a_is_heavier();
};
bool Fruit::a_is_heavier(){
	return Weight1>Weight2;
}
int main(){
	string an,bn;
	int aw,bw;
	cin>>an>>aw>>bn>>bw;
	Fruit f(an,bn,aw,bw);
	if(f.a_is_heavier()){
		cout<<f.Name1<<" is heavy"<<endl<<f.Name1<<" > "<<f.Name2<<endl;
		f.Weight1 = 0;
		cout<<f.Name2<<" is heavy"<<endl;
	}
	else{
		cout<<f.Name2<<" is heavy"<<endl<<f.Name2<<" > "<<f.Name1<<endl;
		f.Weight2 = 0;
		cout<<f.Name1<<" is heavy";
	}
}