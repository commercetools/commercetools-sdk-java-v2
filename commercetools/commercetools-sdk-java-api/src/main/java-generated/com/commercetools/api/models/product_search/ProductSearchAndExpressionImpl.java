
package com.commercetools.api.models.product_search;

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
 * ProductSearchAndExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchAndExpressionImpl implements ProductSearchAndExpression, ModelBase {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> and;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchAndExpressionImpl(
            @JsonProperty("and") final java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> and) {
        this.and = and;
    }

    /**
     * create empty instance
     */
    public ProductSearchAndExpressionImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> getAnd() {
        return this.and;
    }

    public void setAnd(final com.commercetools.api.models.product_search.ProductSearchQuery... and) {
        this.and = new ArrayList<>(Arrays.asList(and));
    }

    public void setAnd(final java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> and) {
        this.and = and;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchAndExpressionImpl that = (ProductSearchAndExpressionImpl) o;

        return new EqualsBuilder().append(and, that.and).append(and, that.and).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(and).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("and", and).build();
    }

}
