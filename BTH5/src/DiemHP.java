
abstract class DiemHP 
{
    protected String tenHP;
    protected int sotinchi;
    
    public DiemHP(String thp, int stc)
    {
        tenHP=thp;
        sotinchi=stc;
    }
    public String laytenhp()
    {
        return tenHP;
    }
    public int laystc()
    {
        return sotinchi;
    }
    
    abstract double tinhdiem();
}

