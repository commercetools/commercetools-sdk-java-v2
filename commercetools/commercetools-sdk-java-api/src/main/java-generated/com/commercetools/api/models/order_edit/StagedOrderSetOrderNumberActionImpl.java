
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetOrderNumberActionImpl implements StagedOrderSetOrderNumberAction {

    private String action;

    private String orderNumber;

    @JsonCreator
    StagedOrderSetOrderNumberActionImpl(@JsonProperty("orderNumber") final String orderNumber) {
        this.orderNumber = orderNumber;
        this.action = SET_ORDER_NUMBER;
    }

    public StagedOrderSetOrderNumberActionImpl() {
        this.action = SET_ORDER_NUMBER;
    }

    public String getAction() {
        return this.action;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetOrderNumberActionImpl that = (StagedOrderSetOrderNumberActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(orderNumber, that.orderNumber).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(orderNumber).toHashCode();
    }

}
