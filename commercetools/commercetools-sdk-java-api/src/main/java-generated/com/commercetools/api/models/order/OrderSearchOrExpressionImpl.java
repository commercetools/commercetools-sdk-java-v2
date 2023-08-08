
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
 * OrderSearchOrExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchOrExpressionImpl implements OrderSearchOrExpression, ModelBase {

    private java.util.List<com.commercetools.api.models.order.OrderSearchQuery> or;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchOrExpressionImpl(
            @JsonProperty("or") final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> or) {
        this.or = or;
    }

    /**
     * create empty instance
     */
    public OrderSearchOrExpressionImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.order.OrderSearchQuery> getOr() {
        return this.or;
    }

    public void setOr(final com.commercetools.api.models.order.OrderSearchQuery... or) {
        this.or = new ArrayList<>(Arrays.asList(or));
    }

    public void setOr(final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> or) {
        this.or = or;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchOrExpressionImpl that = (OrderSearchOrExpressionImpl) o;

        return new EqualsBuilder().append(or, that.or).append(or, that.or).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(or).toHashCode();
    }

}
