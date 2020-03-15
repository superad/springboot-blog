package com.mengma.pojo;

/**
 * @author fgm
 * @description  文章实体类
 * @date 2020-03-15
 ***/
public class Article {
    private Integer id;
    private String title;
    private String content;
    private String created;
    private String modified;
    private String categories;
    private String tags;
    private String allowComment;
    private String thumbnail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(String allowComment) {
        this.allowComment = allowComment;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Article{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", created='" + created + '\'' +
            ", modified='" + modified + '\'' +
            ", categories='" + categories + '\'' +
            ", tags='" + tags + '\'' +
            ", allowComment='" + allowComment + '\'' +
            ", thumbnail='" + thumbnail + '\'' +
            '}';
    }
}
