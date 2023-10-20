package me.dio.bibliotecaonlinev2.domain.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "tb_user")
public class User {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private Date birth;
    @OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private List<News> news;

    @OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private List<Share> share;

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public Date getBirth() {return birth;}

    public void setBirth(Date birth) {this.birth = birth;}

    public List<Feature> getFeatures() {return features;}

    public void setFeatures(List<Feature> features) {this.features = features;}

    public List<News> getNews() {return news;}

    public void setNews(List<News> news) {this.news = news;}

    public List<Share> getShare() {
        return share;
    }

    public void setShare(List<Share> share) {
        this.share = share;
    }
}
