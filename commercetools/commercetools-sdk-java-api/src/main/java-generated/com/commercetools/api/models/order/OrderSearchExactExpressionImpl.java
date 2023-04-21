
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
 * OrderSearchExactExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchExactExpressionImpl implements OrderSearchExactExpression, ModelBase {

    private com.commercetools.api.models.order.OrderSearchAnyValue exact;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchExactExpressionImpl(
            @JsonProperty("exact") final com.commercetools.api.models.order.OrderSearchAnyValue exact) {
        this.exact = exact;
    }

    /**
     * create empty instance
     */
    public OrderSearchExactExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchAnyValue getExact() {
        return this.exact;
    }

    public void setExact(final com.commercetools.api.models.order.OrderSearchAnyValue exact) {
        this.exact = exact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchExactExpressionImpl that = (OrderSearchExactExpressionImpl) o;

        return new EqualsBuilder().append(exact, that.exact).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(exact).toHashCode();
    }

}
