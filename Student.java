public class Student
{
    private String name;  // Zeilen commentare: Name Studierende
    private int alter;    
    private String religion;
    private boolean matura;
    
    /* Block kommentare:
     * hier wird geschrieben 
     * conctructor
     */
    public Student(String neuName, int neuAlter,String neuReligion,boolean neuMatura)
    { 
         setName(neuName);
         setAlter(neuAlter);
         setReligion(neuReligion);
         setMatura(neuMatura);
    }
    public void setName(String neuName)
    {
        name=neuName;
    }
    public void setAlter(int neuAlter)
    {
        alter=neuAlter;
    }
    public void setReligion(String neuReligion)
    {
        religion=neuReligion;
    }  
    public void setMatura(boolean neuMatura)
    {
        matura=neuMatura;
    }
    public String getName()
    {
        return name;
    }
    public int getAlter()
    {
        return alter;
    }
    public String getReligion()
    {
        return religion;
    }
    public boolean getMatura()
    {
        return matura;
    }
    public void printStudent()
    {
      System.out.println (name + " " + alter + " Jahre alt " + religion + " " + matura);
    }
    
}