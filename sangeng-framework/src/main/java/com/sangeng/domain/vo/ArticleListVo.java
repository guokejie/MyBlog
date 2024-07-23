package com.sangeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleListVo {
    private Long id;

    private String title;

    private String summary;
    // 分类名
    private String categoryName;
    //缩略图
    private String thumbnail;

    //文章内容
    private String content;

    private Long viewCount;

    private Date createTime;
}
