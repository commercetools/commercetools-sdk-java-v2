
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
 * OrderSearchPrefixExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchPrefixExpressionImpl implements OrderSearchPrefixExpression, ModelBase {

    private com.commercetools.api.models.order.OrderSearchStringValue prefix;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchPrefixExpressionImpl(
            @JsonProperty("prefix") final com.commercetools.api.models.order.OrderSearchStringValue prefix) {
        this.prefix = prefix;
    }

    /**
     * create empty instance
     */
    public OrderSearchPrefixExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchStringValue getPrefix() {
        return this.prefix;
    }

    public void setPrefix(final com.commercetools.api.models.order.OrderSearchStringValue prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchPrefixExpressionImpl that = (OrderSearchPrefixExpressionImpl) o;

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
