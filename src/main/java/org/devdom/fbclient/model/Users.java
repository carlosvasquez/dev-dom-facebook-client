package org.devdom.fbclient.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Vásquez Polanco
 */
@Entity
@Table(name = "dev_dom_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserId", query = "SELECT u FROM Users u WHERE u.userId = :userId"),
    @NamedQuery(name = "Users.findByUid", query = "SELECT u FROM Users u WHERE u.uid = :uid"),
    @NamedQuery(name = "Users.findByFirstName", query = "SELECT u FROM Users u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Users.findByLastName", query = "SELECT u FROM Users u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Users.findByPicSmall", query = "SELECT u FROM Users u WHERE u.picSmall = :picSmall"),
    @NamedQuery(name = "Users.findByPicBig", query = "SELECT u FROM Users u WHERE u.picBig = :picBig"),
    @NamedQuery(name = "Users.findByPic", query = "SELECT u FROM Users u WHERE u.pic = :pic"),
    @NamedQuery(name = "Users.findByIsPageLiked", query = "SELECT u FROM Users u WHERE u.isPageLiked = :isPageLiked"),
    @NamedQuery(name = "Users.findBySex", query = "SELECT u FROM Users u WHERE u.sex = :sex"),
    @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username"),
    @NamedQuery(name = "Users.findByPicCover", query = "SELECT u FROM Users u WHERE u.picCover = :picCover"),
    @NamedQuery(name = "Users.findByOffsetY", query = "SELECT u FROM Users u WHERE u.offsetY = :offsetY")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "uid")
    private String uid;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "pic_small")
    private String picSmall;
    @Column(name = "pic_big")
    private String picBig;
    @Column(name = "pic")
    private String pic;
    @Column(name = "is_page_liked")
    private Short isPageLiked;
    @Column(name = "sex")
    private String sex;
    @Column(name = "username")
    private String username;
    @Column(name = "pic_cover")
    private String picCover;
    @Column(name = "offset_y")
    private String offsetY;

    public Users() {
    }

    public Users(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPicSmall() {
        return picSmall;
    }

    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    public String getPicBig() {
        return picBig;
    }

    public void setPicBig(String picBig) {
        this.picBig = picBig;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Short getIsPageLiked() {
        return isPageLiked;
    }

    public void setIsPageLiked(Short isPageLiked) {
        this.isPageLiked = isPageLiked;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPicCover() {
        return picCover;
    }

    public void setPicCover(String picCover) {
        this.picCover = picCover;
    }

    public String getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(String offsetY) {
        this.offsetY = offsetY;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.devdom.fbclient.model.Users[ userId=" + userId + " ]";
    }
    
}
