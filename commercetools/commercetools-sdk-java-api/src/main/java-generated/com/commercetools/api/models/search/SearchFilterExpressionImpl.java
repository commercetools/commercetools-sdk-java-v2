
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;

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
 * SearchFilterExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFilterExpressionImpl implements SearchFilterExpression, ModelBase {

    private java.util.List<com.commercetools.api.models.search.SearchQueryExpression> filter;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchFilterExpressionImpl(
            @JsonProperty("filter") final java.util.List<com.commercetools.api.models.search.SearchQueryExpression> filter) {
        this.filter = filter;
    }

    /**
     * create empty instance
     */
    public SearchFilterExpressionImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.search.SearchQueryExpression> getFilter() {
        return this.filter;
    }

    public void setFilter(final com.commercetools.api.models.search.SearchQueryExpression... filter) {
        this.filter = new ArrayList<>(Arrays.asList(filter));
    }

    public void setFilter(final java.util.List<com.commercetools.api.models.search.SearchQueryExpression> filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchFilterExpressionImpl that = (SearchFilterExpressionImpl) o;

        return new EqualsBuilder().append(filter, that.filter).append(filter, that.filter).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(filter).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("filter", filter).build();
    }

    @Override
    public SearchFilterExpression copyDeep() {
        return SearchFilterExpression.deepCopy(this);
    }
}
