
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * SearchKeywords
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordsImpl implements SearchKeywords, ModelBase {

    private Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchKeywordsImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> values) {
        this.values = values;
    }

    /**
     * create empty instance
     */
    public SearchKeywordsImpl() {
    }

    /**
     *
     */

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

        return new EqualsBuilder().append(values, that.values).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("values", values).build();
    }

    @Override
    public SearchKeywords copyDeep() {
        return SearchKeywords.deepCopy(this);
    }
}
