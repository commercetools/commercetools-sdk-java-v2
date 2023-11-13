
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * OrderSearchNotExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchNotExpressionImpl implements OrderSearchNotExpression, ModelBase {

    private java.util.List<com.commercetools.api.models.order.OrderSearchQuery> not;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchNotExpressionImpl(
            @JsonProperty("not") final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> not) {
        this.not = not;
    }

    /**
     * create empty instance
     */
    public OrderSearchNotExpressionImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.order.OrderSearchQuery> getNot() {
        return this.not;
    }

    public void setNot(final com.commercetools.api.models.order.OrderSearchQuery... not) {
        this.not = new ArrayList<>(Arrays.asList(not));
    }

    public void setNot(final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> not) {
        this.not = not;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchNotExpressionImpl that = (OrderSearchNotExpressionImpl) o;

        return new EqualsBuilder().append(not, that.not).append(not, that.not).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(not).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("not", not).build();
    }

}
