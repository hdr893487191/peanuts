package com.soaringroad.peanuts.repository;

import org.springframework.stereotype.Repository;

import com.soaringroad.common.repository.RdbRepository;
import com.soaringroad.peanuts.entity.Tag;

/**
 * <pre>
 * Repository of {@link com.soaringroad.peanuts.entity.Tag}
 * </pre>
 * 
 * @author wangzhenhui1992
 * @since 2018/11/06
 */
@Repository
public interface TagRepository extends RdbRepository<Tag, Long> {
}
