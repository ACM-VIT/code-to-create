package acm.event.codetocreate17.Model.Data;


public class AboutModel {
    private String name;
    private String designation;
    private Boolean isContact = false;
    private int imageResource;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Boolean getContact() {
        return isContact;
    }

    public void setContact(Boolean contact) {
        isContact = contact;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }


    public int getImageResource() {
        return imageResource;
    }
}

