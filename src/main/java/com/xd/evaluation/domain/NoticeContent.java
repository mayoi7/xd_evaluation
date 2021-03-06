package com.xd.evaluation.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created By Cx On 2018/10/20 19:28
 */
@Data
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class NoticeContent {

    //公告描述id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noticeContentId;

    //公告id
    private Long noticeId;

    //公告内容
    private String noticeContent;

    //创建时间
    private Date createTime;

    //最近更新时间
    private Date updateTime;
}
