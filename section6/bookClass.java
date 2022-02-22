package section6;

public class bookClass {
    public static void main(String[] args){
        Book JavaBook = new Book();
        JavaBook.SetTitle("java programming");
        System.out.println("Book title: " + JavaBook.GetTitle());
    }
}

class Book {
    String m_title;
    int m_page;
    
    void SetTitle(String title){	
    	m_title = title;
    }
    String GetTitle(){	
    	return m_title;
    }    
}
