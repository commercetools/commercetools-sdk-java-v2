
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
 * ProductSearchOrExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchOrExpressionImpl implements ProductSearchOrExpression, ModelBase {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> or;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchOrExpressionImpl(
            @JsonProperty("or") final java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> or) {
        this.or = or;
    }

    /**
     * create empty instance
     */
    public ProductSearchOrExpressionImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> getOr() {
        return this.or;
    }

    public void setOr(final com.commercetools.api.models.product_search.ProductSearchQuery... or) {
        this.or = new ArrayList<>(Arrays.asList(or));
    }

    public void setOr(final java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> or) {
        this.or = or;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchOrExpressionImpl that = (ProductSearchOrExpressionImpl) o;

        return new EqualsBuilder().append(or, that.or).append(or, that.or).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(or).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("or", or).build();
    }

}
