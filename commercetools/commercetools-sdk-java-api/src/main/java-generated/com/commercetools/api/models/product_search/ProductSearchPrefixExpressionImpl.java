
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
 * ProductSearchPrefixExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchPrefixExpressionImpl implements ProductSearchPrefixExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchAnyValue prefix;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchPrefixExpressionImpl(
            @JsonProperty("prefix") final com.commercetools.api.models.product_search.ProductSearchAnyValue prefix) {
        this.prefix = prefix;
    }

    /**
     * create empty instance
     */
    public ProductSearchPrefixExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchAnyValue getPrefix() {
        return this.prefix;
    }

    public void setPrefix(final com.commercetools.api.models.product_search.ProductSearchAnyValue prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchPrefixExpressionImpl that = (ProductSearchPrefixExpressionImpl) o;

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

}
