package com.example.demo.model.rule;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.example.demo.model.mategroup.MateGroup;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Rule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	
	//@Column(columnDefinition = "TEXT", nullable = false)
	@Column
	private String content;

	//@OneToOne(mappedBy="rule_id", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
	//@OneToOne(mappedBy="rule", cascade=CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@OneToOne
	private MateGroup mateGroup;
	//(fetch = FetchType.LAZY)
	
	@Override
    public String toString() {
        return "Rule{" +
                "rid=" + rid +
                ", content=" + content +
                //", mategroup=" + mateGroup.getGid() +
                '}';
    }
	
	@Builder
	public Rule(String content, MateGroup mateGroup) {
		this.content = content;
		this.mateGroup = mateGroup;
		//mateGroup.setRule(this);
	}
	
	public void update(String content) {
        this.content = content;
        
        System.out.println(this.toString());
    }
}
