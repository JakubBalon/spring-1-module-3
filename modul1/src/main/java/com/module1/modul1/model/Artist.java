package com.module1.modul1.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {
   @Id @GeneratedValue
   private long id;
   private String firstName;
   private String lastName;
   private String nick;
   @ManyToMany(mappedBy = "artists")
   private Set<Song> songs = new HashSet<>();

    public Artist(String firstName, String lastName, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
    }

    public Artist() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNick() {
        return nick;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nick='" + nick + '\'' +
                ", songs=" + songs +
                '}';
    }
}
