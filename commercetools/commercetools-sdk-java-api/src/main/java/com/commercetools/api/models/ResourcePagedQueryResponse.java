package com.commercetools.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface ResourcePagedQueryResponse<T> {
    public Long getLimit();

    public Long getCount();

    public Long getTotal();

    public Long getOffset();

    List<T> getResults();
}
