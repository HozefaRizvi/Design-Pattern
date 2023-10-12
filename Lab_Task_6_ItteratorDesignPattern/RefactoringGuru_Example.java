/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Itterator_Pattern;

/**
 *
 * @author TechEnclave Computer
 */
// Common interface for all iterators
import java.util.ArrayList;
import java.util.List;

// Common interface for all iterators
interface ProfileIterator {
    Profile getNext();
    boolean hasMore();
}

// Common interface for all social networks
interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}

// Concrete social network class - Facebook
class Facebook implements SocialNetwork {
    // ... The bulk of the Facebook class's code should go here ...

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    // This is a placeholder for your socialGraphRequest method
    public List<Profile> socialGraphRequest(String profileId, String type) {
        // Implement your logic to fetch profiles (returning dummy data for now)
        List<Profile> dummyData = new ArrayList<>();
        dummyData.add(new Profile("friend1@example.com"));
        dummyData.add(new Profile("friend2@example.com"));
        dummyData.add(new Profile("friend3@example.com"));
        dummyData.add(new Profile("friend4@example.com"));
        return dummyData;
    }
}

// Concrete iterator class for Facebook
class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId, type;
    private int currentPosition;
    private List<Profile> cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public Profile getNext() {
        if (hasMore()) {
            Profile result = cache.get(currentPosition);
            currentPosition++;
            return result;
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.size();
    }
}

// Common interface for profiles
class Profile {
    private String email;

    public Profile(String email) {
        this.email = email;
    }

    String getEmail() {
        return email;
    }
}

// Social spammer class
class SocialSpammer {
    void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Sending email to: " + profile.getEmail() + " Message: " + message);
        }
    }
}

// Application class
class Application {
    SocialNetwork network;
    SocialSpammer spammer;

    void config() {
        // Depending on the specific network (e.g., Facebook or LinkedIn),
        // you can create the appropriate network instance here.
        network = new Facebook();
        spammer = new SocialSpammer();
    }

    void sendSpamToFriends(String profileId) {
        ProfileIterator iterator = network.createFriendsIterator(profileId);
        spammer.send(iterator, "Very important message to friends");
    }

    void sendSpamToCoworkers(String profileId) {
        ProfileIterator iterator = network.createCoworkersIterator(profileId);
        spammer.send(iterator, "Very important message to coworkers");
    }
}




