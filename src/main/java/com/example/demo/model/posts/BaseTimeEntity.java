package com.example.demo.model.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   // JPA Entity Ŭ�������� BaseTimeEntity�� ����� ��� �ʵ�鵵 Į������ �ν��ϵ��� ����
@EntityListeners(AuditingEntityListener.class)  // BaseTimeEntity Ŭ������ Auditing ����� ���Խ�Ŵ
public abstract class BaseTimeEntity {

    @CreatedDate    // Entity�� �����Ǿ� ����� �� �ð��� �ڵ� �����
    private LocalDateTime createdDate;

    @LastModifiedDate   // ��ȸ�� Entity ���� ������ �� �ð��� �ڵ� �����
    private LocalDateTime modifiedDate;
}