
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchKeywordsImpl implements SearchKeywords {

    private Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> values;

    @JsonCreator
    SearchKeywordsImpl(
            @JsonProperty("values") final Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> values) {
        this.values = values;
    }

    public SearchKeywordsImpl() {
    }

    public Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> values() {
        return values;
    }

    public void setValue(String key, java.util.List<com.commercetools.history.models.common.SearchKeyword> value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchKeywordsImpl that = (SearchKeywordsImpl) o;

        return new EqualsBuilder().append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

}
