package section6;

public class bookClassAccess {
    public static void main(String[] args){
        Book JavaBook = new Book();
        JavaBook.SetTitle("java programming"); // SetTitle, GetTitle은 public 이므로 class 밖에서 사용 O
        System.out.println("Book title: "+JavaBook.GetTitle());

        // JavaBook.m_title = "Java is interesting"; // m_title은 private이므로 class 밖에서 사용 X
        JavaBook.m_page = 5; // m_page는 public이므로 class 밖에서 사용 O 
    }    
}

class Book {
    private String m_title; // private: class 밖에서 사용 X
    public int m_page;
    
    public void SetTitle(String title){	// public: class 밖에서 사용 O
    	m_title = title;
    }
    public String GetTitle(){	
    	return m_title;
    }    
}