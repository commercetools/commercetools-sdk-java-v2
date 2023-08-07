
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * OrderSearchExistsExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchExistsExpressionImpl implements OrderSearchExistsExpression, ModelBase {

    private com.commercetools.api.models.order.OrderSearchQueryExpressionValue exists;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchExistsExpressionImpl(
            @JsonProperty("exists") final com.commercetools.api.models.order.OrderSearchQueryExpressionValue exists) {
        this.exists = exists;
    }

    /**
     * create empty instance
     */
    public OrderSearchExistsExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchQueryExpressionValue getExists() {
        return this.exists;
    }

    public void setExists(final com.commercetools.api.models.order.OrderSearchQueryExpressionValue exists) {
        this.exists = exists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchExistsExpressionImpl that = (OrderSearchExistsExpressionImpl) o;

        return new EqualsBuilder().append(exists, that.exists).append(exists, that.exists).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(exists).toHashCode();
    }

}
