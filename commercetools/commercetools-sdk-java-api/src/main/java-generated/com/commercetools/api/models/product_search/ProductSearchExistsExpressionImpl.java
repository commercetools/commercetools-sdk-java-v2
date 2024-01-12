
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
 * ProductSearchExistsExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchExistsExpressionImpl implements ProductSearchExistsExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchExistsValue exists;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchExistsExpressionImpl(
            @JsonProperty("exists") final com.commercetools.api.models.product_search.ProductSearchExistsValue exists) {
        this.exists = exists;
    }

    /**
     * create empty instance
     */
    public ProductSearchExistsExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchExistsValue getExists() {
        return this.exists;
    }

    public void setExists(final com.commercetools.api.models.product_search.ProductSearchExistsValue exists) {
        this.exists = exists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchExistsExpressionImpl that = (ProductSearchExistsExpressionImpl) o;

        return new EqualsBuilder().append(exists, that.exists).append(exists, that.exists).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(exists).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("exists", exists).build();
    }

}
