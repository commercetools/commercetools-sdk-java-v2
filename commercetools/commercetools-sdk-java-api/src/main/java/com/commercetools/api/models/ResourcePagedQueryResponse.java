
package com.commercetools.api.models;

import java.util.List;

public interface ResourcePagedQueryResponse<T> {
    public Long getLimit();

    public Long getCount();

    public Long getTotal();

    public Long getOffset();

    List<T> getResults();
}
