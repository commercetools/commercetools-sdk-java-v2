
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
 * OrderSearchAndExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchAndExpressionImpl implements OrderSearchAndExpression, ModelBase {

    private java.util.List<com.commercetools.api.models.order.OrderSearchQuery> and;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchAndExpressionImpl(
            @JsonProperty("and") final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> and) {
        this.and = and;
    }

    /**
     * create empty instance
     */
    public OrderSearchAndExpressionImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.order.OrderSearchQuery> getAnd() {
        return this.and;
    }

    public void setAnd(final com.commercetools.api.models.order.OrderSearchQuery... and) {
        this.and = new ArrayList<>(Arrays.asList(and));
    }

    public void setAnd(final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> and) {
        this.and = and;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchAndExpressionImpl that = (OrderSearchAndExpressionImpl) o;

        return new EqualsBuilder().append(and, that.and).append(and, that.and).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(and).toHashCode();
    }

}
