
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
 * SearchPrefixExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchPrefixExpressionImpl implements SearchPrefixExpression, ModelBase {

    private com.commercetools.api.models.search.SearchAnyValue prefix;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchPrefixExpressionImpl(
            @JsonProperty("prefix") final com.commercetools.api.models.search.SearchAnyValue prefix) {
        this.prefix = prefix;
    }

    /**
     * create empty instance
     */
    public SearchPrefixExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.search.SearchAnyValue getPrefix() {
        return this.prefix;
    }

    public void setPrefix(final com.commercetools.api.models.search.SearchAnyValue prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchPrefixExpressionImpl that = (SearchPrefixExpressionImpl) o;

        return new EqualsBuilder().append(prefix, that.prefix).append(prefix, that.prefix).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(prefix).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("prefix", prefix).build();
    }

    @Override
    public SearchPrefixExpression copyDeep() {
        return SearchPrefixExpression.deepCopy(this);
    }
}
