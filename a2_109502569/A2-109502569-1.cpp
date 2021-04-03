#include<iostream>
#include<vector>
using namespace std;
class Book{
private:
	string Name;
	string ISBN;
	vector<string> Content;
public:
	Book(string name, string isbn, vector<string> content){
		Name = name;
		ISBN = isbn;
		Content = content;
	}
	string getName();
	string getISBN();
	string getContent(int Page);
	void addPage(string Sentence);
};
class BookShelf{
private:
	vector<Book> Shelf;
public:
	BookShelf(){};
	void addBook(Book MyBook);
	void showBookShelf();
};
string Book::getName(){
	return Name;
}
string Book::getISBN(){
	return ISBN;
}
string Book::getContent(int Page){
	string e="Error";
	if(Page>=Content.size())
		return e;
	return Content[Page];
}
void Book::addPage(string Sentence){
	Content.push_back(Sentence);
	return;
}
void BookShelf::addBook(Book MyBook){
	Shelf.push_back(MyBook);
	return;
}
void BookShelf::showBookShelf(){
	for(int i=0;i<Shelf.size();i++){
		cout<<i<<" "<<Shelf[i].getName()<<" "<<Shelf[i].getISBN()<<endl;
	}
	return;
}
int main()
{
    //Book1 information
    string N1 , iSBN1;
    vector<string> CONTENT1;
    N1="book1";
    iSBN1="978-3-14-131238-2";
    CONTENT1.push_back("book1p1");
    CONTENT1.push_back("book1p2");
    CONTENT1.push_back("book1p3");

    //Book2 information
    string N2 , iSBN2;
    vector<string> CONTENT2;
    N2="book2";
    iSBN2="278-33-4-133238-0";
    CONTENT2.push_back("book2p1");
    CONTENT2.push_back("book2p2");

    //Create class
    Book myBook1(N1,iSBN1,CONTENT1);
    Book myBook2(N2,iSBN2,CONTENT2);

    //Testing
    cout<<myBook1.getName()<<" "<<myBook1.getISBN()<<endl;
    cout<<myBook2.getName()<<" "<<myBook2.getISBN()<<endl;
    cout<<myBook1.getContent(0)<<" "<<myBook1.getContent(3)<<endl;
    myBook1.addPage("book1p4");
    cout<<myBook1.getContent(0)<<" "<<myBook1.getContent(3)<<endl;

    BookShelf myBookShelf;
    myBookShelf.addBook(myBook1);
    myBookShelf.addBook(myBook1);
    myBookShelf.addBook(myBook2);
    myBookShelf.showBookShelf();

    return 0;
}
