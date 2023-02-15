
package com.commercetools.api.models;

import java.util.List;
import java.util.Optional;

public interface ResourcePagedQueryResponse<T> {
    public Long getLimit();

    public Long getCount();

    public Long getTotal();

    public Long getOffset();

    List<T> getResults();

    /**
     * Tries to access the first element of the result list.
     * Use case: query by slug which should contain zero or one element in the result list.
     *
     * @return the first value or absent
     */
    default Optional<T> head() {
        final List<T> results = getResults();
        return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
    }

    /**
     * Calculates the page number of the result, the pages are indexed staring 0, which means that {@code getPageIndex()}
     * returns a value in [0,n) , given 'n' is the total number of pages
     *
     * @return the page number of the result
     */
    default Long getPageIndex() {
        if (getTotal() == null || getLimit() == null || getLimit() == 0) {
            throw new UnsupportedOperationException(
                    "Can only be used if the limit & total are known and limit is non-zero.");
        }
        return (long) Math.floor(getOffset() / getLimit().doubleValue());
    }

    /**
     * Calculates the total number of pages matching the request.
     *
     * @return the total number of pages
     */
    default Long getTotalPages() {
        if (getTotal() == null || getLimit() == null || getLimit() == 0) {
            throw new UnsupportedOperationException("Can only be used if the limit & total are known and limit is non-zero.");
        }
        return (long) Math.ceil(getTotal() / getLimit().doubleValue());
    }

    /**
     * Checks if this is the first page of a result.
     *
     * @return true if offset is 0 otherwise false
     */
    default boolean isFirst() {
        if (getOffset() == null) {
            throw new UnsupportedOperationException("Can only be used if the offset is known.");
        }
        return getOffset() == 0;
    }

    /**
     * Checks if it is the last possible page.
     *
     * @return true if doing a request with an incremented offset parameter would cause an empty result otherwise false.
     */
    default boolean isLast() {
        if (getOffset() == null || getTotal() == null) {
            throw new UnsupportedOperationException("Can only be used if the offset & total are known.");
        }
        //currently counting the total amount is performed in a second database call, so it is possible
        //that the left side can be greater than total
        return getOffset() + getCount() >= getTotal();
    }
}
