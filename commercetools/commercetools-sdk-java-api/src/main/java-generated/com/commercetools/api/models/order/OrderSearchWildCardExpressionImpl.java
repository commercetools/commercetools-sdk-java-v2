
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
 * OrderSearchWildCardExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchWildCardExpressionImpl implements OrderSearchWildCardExpression, ModelBase {

    private com.commercetools.api.models.order.OrderSearchStringValue wildcard;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchWildCardExpressionImpl(
            @JsonProperty("wildcard") final com.commercetools.api.models.order.OrderSearchStringValue wildcard) {
        this.wildcard = wildcard;
    }

    /**
     * create empty instance
     */
    public OrderSearchWildCardExpressionImpl() {
    }

    /**
     *
     */

    public com.commercetools.api.models.order.OrderSearchStringValue getWildcard() {
        return this.wildcard;
    }

    public void setWildcard(final com.commercetools.api.models.order.OrderSearchStringValue wildcard) {
        this.wildcard = wildcard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchWildCardExpressionImpl that = (OrderSearchWildCardExpressionImpl) o;

        return new EqualsBuilder().append(wildcard, that.wildcard).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(wildcard).toHashCode();
    }

}
