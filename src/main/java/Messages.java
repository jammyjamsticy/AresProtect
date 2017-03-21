public class Messages
{
    private String title;

    private String imageUrl;

    private Buttons[] buttons;

    private String type;
    	 private String speech;
	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public Buttons[] getButtons ()
    {
        return buttons;
    }

    public void setButtons (Buttons[] buttons)
    {
        this.buttons = buttons;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

   
}
