package vis.csm.response.api;

public class CustomerParty
{
    private Parts parts;

    public Parts getParts ()
    {
        return parts;
    }

    public void setParts (Parts parts)
    {
        this.parts = parts;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [parts = "+parts+"]";
    }
}
		