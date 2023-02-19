import java.util.Scanner;
public class Sentence
{
    int id_no;
    int no_subjects;
    String Subject_code[];
    int Subject_Credit[];
    String Grade[];
    double spi;

    Sentence(int id_no,int no_subjects)
    {
      this.id_no = id_no;
      this.no_subjects = no_subjects;
    }

    void spi()
    {
      System.out.println(spi);
    }

    
}