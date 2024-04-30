package sg.edu.np.mad.madpractical2;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(String ip_name, String ip_desc, int ip_id, boolean ip_isFollowed ){
        name = ip_name;
        description = ip_desc;
        id = ip_id;
        followed = ip_isFollowed;
    }

//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public boolean isFollowed() {
//        return followed;
//    }
//    public void setFollowed(boolean followed) {
//        this.followed = followed;
//    }
}
