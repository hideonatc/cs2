#include<iostream>
#include<map>
#include<vector>
#include<memory>
using namespace std;
class My_sys{
private:
	string Id;
	string Name;
	int ChineseScore;
	int MathScore;
	int ScienceScore;
	int EnglishScore;
	float Average;
public:
	My_sys(string id,string name,int chinese,int math,int science,int english,float average){
		Id = id;
		Name = name;
		ChineseScore = chinese;
		MathScore = math;
		ScienceScore = science;
		EnglishScore = english;
		Average = average;
	}
	void ChangeScore(string i);
	void printall(string s);
	//void deletedata(string i);
	void insert(My_sys);
};
map <string, My_sys* > mymap;
void My_sys::insert(My_sys m){
	mymap.insert(std::make_pair(m.Id,new My_sys(m.Name,m.Id,m.ChineseScore,m.MathScore,m.ScienceScore,m.EnglishScore,m.Average)));
	return;
}
void My_sys::ChangeScore(string i){
	int c,s;
	cout<<"Which subject (1)Chinese (2)Math (3)Science (4)English"<<endl;
	cin>>c;
	cout<<"Please enter new score"<<endl;
	cin>>s;
	if(c==1)
		mymap[i]->ChineseScore = s;
	else if(c==2)
		mymap[i]->MathScore = s;
	else if(c==4)
		mymap[i]->EnglishScore = s;
	else
		mymap[i]->ScienceScore = s;
	int k = mymap[i]->ChineseScore+mymap[i]->MathScore+mymap[i]->ScienceScore+mymap[i]->EnglishScore;
	mymap[i]->Average = float(k)/4;
	return;
}
void My_sys::printall(string s){
	//for(map<string,My_sys*>::iterator i = mymap.begin();i!=mymap.end();i++){
		cout<<mymap[s]->Id<<" "<<mymap[s]->Name;
		printf(" %d %d %d %d %.2f\n",mymap[s]->ChineseScore,mymap[s]->MathScore,mymap[s]->ScienceScore,mymap[s]->EnglishScore,mymap[s]->Average);
	return;
}
void deletedata(string i){
	mymap.erase(i);
	return;
}
int main(){
	while(1){
		printf("(1)Insert (2)Change score (3)Print all (4)Delete (5)Exit\n");
		int mv;
		cin>>mv;
		if(mv == 5)
			break;
		else if(mv==1){
			string i,n;
			int c,ma,s,e;
			printf("Please enter student id/name/scores(Chinese/Math/Science/English)\n");
			cin>>i>>n>>c>>ma>>s>>e;
			My_sys m(i,n,c,ma,s,e,float(c+ma+s+e)/4);
			m.insert(m);
		}
		else if(mv==2){
			string i;
			cout<<"Please enter student id"<<endl;
			cin>>i;
			mymap[i]->ChangeScore(i);
		}
		else if(mv == 3){
			for(auto & it : mymap){
				mymap[it.first]->printall(it.first);
				/*cout<<it.second->Id<<" "<<it.second->Name;
				printf("%d %d %d %d %.2f\n",it.second->ChineseScore,it.second->MathScore,it.second->ScienceScore,it.second->EnglishScore,it.second->Average);
			*/}
		}
		else{
			cout<<"Please enter student id"<<endl;
			string i;
			cin>>i;
			deletedata(i);
		}
	}
}