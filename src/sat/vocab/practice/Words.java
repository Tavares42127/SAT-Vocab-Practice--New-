/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat.vocab.practice;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Brandon
 */
@Entity
@Table(name = "WORDS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Words.findAll", query = "SELECT w FROM Words w"),
    @NamedQuery(name = "Words.findByWordnumber", query = "SELECT w FROM Words w WHERE w.wordnumber = :wordnumber"),
    @NamedQuery(name = "Words.findByLevel", query = "SELECT w FROM Words w WHERE w.level = :level"),
    @NamedQuery(name = "Words.findByWord", query = "SELECT w FROM Words w WHERE w.word = :word")})
public class Words implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WORDNUMBER")
    private Integer wordnumber;
    @Column(name = "LEVEL")
    private Integer level;
    @Column(name = "WORD")
    private String word;
    @Lob
    @Column(name = "DEFINITION")
    private String definition;

    public Words() {
    }

    public Words(Integer wordnumber) {
        this.wordnumber = wordnumber;
    }

    public Integer getWordnumber() {
        return wordnumber;
    }

    public void setWordnumber(Integer wordnumber) {
        this.wordnumber = wordnumber;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wordnumber != null ? wordnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Words)) {
            return false;
        }
        Words other = (Words) object;
        if ((this.wordnumber == null && other.wordnumber != null) || (this.wordnumber != null && !this.wordnumber.equals(other.wordnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sat.vocab.practice.Words[ wordnumber=" + wordnumber + " ]";
    }
    
}
