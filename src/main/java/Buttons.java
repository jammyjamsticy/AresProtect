public class Buttons
{
    private String text;

    private String postback;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getPostback ()
    {
        return postback;
    }

    public void setPostback (String postback)
    {
        this.postback = postback;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", postback = "+postback+"]";
    }
}
	
