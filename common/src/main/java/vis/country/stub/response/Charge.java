package vis.country.stub.response;

public class Charge
{
    private String timestamp;

    private String category;

    private String charge;

    private String currency;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getCharge ()
    {
        return charge;
    }

    public void setCharge (String charge)
    {
        this.charge = charge;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", category = "+category+", charge = "+charge+", currency = "+currency+"]";
    }
}