package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaoyu on 12/28/14.
 */
@Entity
@Table(name = "t_clientapp")
public class ClientAppDao extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, unique = true)
    public String clientNum;

    @Column(nullable = false)
    public String clientName;

    @ManyToOne
    @JoinColumn(name = "developer_id")
    public DeveloperDao developer;

    public String clientServerUrl;
    public String clientInfoUrl;
    public String version;
    public Double price;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "t_clientapp_photo",
            joinColumns = @JoinColumn(name = "client_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "id")
    )
    public List<PhotoDao> photos = new ArrayList<PhotoDao>();

    @ElementCollection
    @CollectionTable(
            name = "t_clientapp_tag",
            joinColumns = @JoinColumn(name = "client_id", referencedColumnName = "id")
    )
    @Column(name = "tag")
    public List<String> tags;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "t_clientapp_logo",
            joinColumns = @JoinColumn(name = "client_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "logo_id", referencedColumnName = "id")
    )
    public List<LogoDao> logos;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "t_clientapp_function",
            joinColumns = @JoinColumn(name = "client_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "function_id", referencedColumnName = "id")
    )
    public List<FunctionDao> functions;

    public String description;
    public String size;
    public Long downloads;

    @Temporal(TemporalType.TIMESTAMP)
    public Date onShelf;

    @OneToOne
    @JoinColumn(name = "type_id")
    public AppTypeDao type;

    public static Finder<Long, ClientAppDao> find = new Finder<Long, ClientAppDao>(
            Long.class, ClientAppDao.class
    );

    public ClientAppDao() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientAppDao clientApp = (ClientAppDao) o;

        if (clientNum != null ? !clientNum.equals(clientApp.clientNum) : clientApp.clientNum != null) return false;
        if (id != null ? !id.equals(clientApp.id) : clientApp.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (clientNum != null ? clientNum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClientApp{" +
                "id=" + id +
                ", clientNum='" + clientNum + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientServerUrl='" + clientServerUrl + '\'' +
                ", clientInfoUrl='" + clientInfoUrl + '\'' +
                ", version='" + version + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", downloads=" + downloads +
                ", onShelf=" + onShelf +
                '}';
    }
}
