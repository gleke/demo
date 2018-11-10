package cn.nuofankj.myblog.repository;


import cn.nuofankj.myblog.entity.ArticleTagMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleTagMapperRepository extends JpaRepository<ArticleTagMapper, Long> {
}
