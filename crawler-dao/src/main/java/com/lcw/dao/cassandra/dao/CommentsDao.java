package com.lcw.dao.cassandra.dao;

import com.lcw.dao.cassandra.entity.BilibiliComments;
import org.springframework.data.cassandra.repository.CassandraRepository;

/**
 * Created By lcw332
 * Time : 2020 06 18 21:16
 * Describe : 评论dao
 **/
public interface CommentsDao extends CassandraRepository<BilibiliComments,Long> {
}
