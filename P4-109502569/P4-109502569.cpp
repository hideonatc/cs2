#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int ip(){
	int x;
	cin>>x;
	return x;
}
class myvector{
public:
	myvector(int z){
		vsize = z;
		for(int i=0;i<z;i++)
			v.push_back(0);
	}
	friend istream &operator>> (istream &input, myvector &vt){
		vt.v.clear();
		for(int i=0;i<vt.vsize;i++)
			vt.v.push_back(ip());
		return input;
	}
	friend ostream &operator<< (ostream &output,const myvector &vt){
		output<<"[";
		for(int i=0;i<vt.vsize-1;i++)
			output<<vt.v[i]<<", ";
		output<<vt.v[vt.vsize-1]<<"]"<<endl;
		return output;
	}
	friend myvector operator+ (myvector &vt1, myvector &vt2){
		myvector *pt = new myvector(vt1.vsize + vt2.vsize);
		int idx=0;
		for(auto &it : vt1.v)
			pt->v[idx++]=it;
		for(auto &it : vt2.v)
			pt->v[idx++]=it;
		sort(pt->v.begin(),pt->v.end());
		return *pt;
	}
private:
	vector<int> v;
	int vsize;
};
int main(){
	myvector v1(ip());
	myvector v2(ip());
	cin>>v1>>v2;
	cout<<v1;
	cout<<v2;
	cout<<v1+v2;
}