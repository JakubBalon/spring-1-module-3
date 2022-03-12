package com.module1.modul1.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {
    @Id @GeneratedValue
    private long id;
    private String name;
    private String genre;
    private String ismn;
    private String year;
    private String publisher;
    @Id @GeneratedValue
    private Set<Artist> artists = new HashSet<>();

    public Song(String name, String genre, String ismn, String year, String publisher) {
        this.name = name;
        this.genre = genre;
        this.ismn = ismn;
        this.year = year;
        this.publisher = publisher;
    }

    public Song() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsmn() {
        return ismn;
    }

    public String getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ismn='" + ismn + '\'' +
                ", year='" + year + '\'' +
                ", publisher='" + publisher + '\'' +
                ", artists=" + artists +
                '}';
    }
}