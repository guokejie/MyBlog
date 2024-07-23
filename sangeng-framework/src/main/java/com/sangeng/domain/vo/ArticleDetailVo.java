package com.sangeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDetailVo {
    private Long id;

    private String title;

    private String summary;

    private Long categoryId;
    // 分类名
    private String categoryName;

    //文章内容
    private String content;

    //缩略图
    private String thumbnail;

    private Long viewCount;

    private Date createTime;
}
