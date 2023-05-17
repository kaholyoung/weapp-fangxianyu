package io.github.nnkwrik.imservice.service;

import io.github.nnkwrik.imservice.model.vo.ChatIndex;

import java.util.Date;

/**
 */
public interface IndexService {
    ChatIndex showIndex(String userId, int size, Date offsetTime);

}
