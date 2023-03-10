package com.example.demo.model.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.demo.model.mategroup.MateGroup;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length = 500, nullable = false)
    private String content;
	
	@Column(length = 50, nullable = false)
    private String author;
	
    private boolean pin;
    
    //@OneToOne	// fetch type lazy
	//private MateGroup mateGroup; //******
    private int gid;
    
    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", content=" + content +
                ", author=" + author +
                ", pin=" + pin +
                ", gid=" + gid +
                '}';
    }
    
    @Builder    // �ش� Ŭ������ ���� ���� Ŭ���� ���� (������ ��ܿ� ���� �� �����ڿ� ���Ե� �ʵ常 ������ ����)
    public Posts(String content, String author, boolean pin, int gid) {
        this.content = content;
        this.author = author;
        this.pin = pin;
        this.gid = gid;
    }
    
 // update ��ɿ��� DB�� ������ ������ �κ��� ���� <- JPA�� ���Ӽ� ���ؽ�Ʈ ����! --- dirty checking
    public void update(String content, boolean pin) {
        this.content = content;
        this.pin = pin;
    }
    
}
