
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
 * SearchExactExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchExactExpressionImpl implements SearchExactExpression, ModelBase {

    private com.commercetools.api.models.search.SearchExactValue exact;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchExactExpressionImpl(@JsonProperty("exact") final com.commercetools.api.models.search.SearchExactValue exact) {
        this.exact = exact;
    }

    /**
     * create empty instance
     */
    public SearchExactExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.search.SearchExactValue getExact() {
        return this.exact;
    }

    public void setExact(final com.commercetools.api.models.search.SearchExactValue exact) {
        this.exact = exact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchExactExpressionImpl that = (SearchExactExpressionImpl) o;

        return new EqualsBuilder().append(exact, that.exact).append(exact, that.exact).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(exact).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("exact", exact).build();
    }

    @Override
    public SearchExactExpression copyDeep() {
        return SearchExactExpression.deepCopy(this);
    }
}
