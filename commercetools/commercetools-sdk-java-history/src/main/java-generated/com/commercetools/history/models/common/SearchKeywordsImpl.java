
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
 *  <p>Search keywords are JSON objects primarily used by <span>Search Term Suggestions</span>, but are also considered for a <span>full text search</span> in the Product Projection Search API. The keys are of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a>, and the values are an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchKeyword" rel="nofollow">SearchKeyword</a>.</p>
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
     *  <p>Key-value pair where the keys are of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a> and the values are an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchKeyword" rel="nofollow">SearchKeyword</a>.</p>
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
