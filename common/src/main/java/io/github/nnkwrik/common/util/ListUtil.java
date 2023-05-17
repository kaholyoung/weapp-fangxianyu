package io.github.nnkwrik.common.util;

import java.util.List;

/**
 * List工具类
 */
public class ListUtil {

    public static <T> T getFirst(List<T> list) {
        return list != null && !list.isEmpty() ? list.get(0) : null;
    }

    public static <T> T getLast(List<T> list) {
        return list != null && !list.isEmpty() ? list.get(list.size() - 1) : null;
    }
}
