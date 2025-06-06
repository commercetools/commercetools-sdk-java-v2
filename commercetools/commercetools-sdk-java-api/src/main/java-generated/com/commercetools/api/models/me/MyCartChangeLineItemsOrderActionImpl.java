
package com.commercetools.api.models.me;

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
 * MyCartChangeLineItemsOrderAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartChangeLineItemsOrderActionImpl implements MyCartChangeLineItemsOrderAction, ModelBase {

    private String action;

    private java.util.List<String> lineItemOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartChangeLineItemsOrderActionImpl(@JsonProperty("lineItemOrder") final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        this.action = CHANGE_LINE_ITEMS_ORDER;
    }

    /**
     * create empty instance
     */
    public MyCartChangeLineItemsOrderActionImpl() {
        this.action = CHANGE_LINE_ITEMS_ORDER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>All existing LineItem <code>id</code>s of the Cart in the desired new order.</p>
     */

    public java.util.List<String> getLineItemOrder() {
        return this.lineItemOrder;
    }

    public void setLineItemOrder(final String... lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
    }

    public void setLineItemOrder(final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartChangeLineItemsOrderActionImpl that = (MyCartChangeLineItemsOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemOrder, that.lineItemOrder)
                .append(action, that.action)
                .append(lineItemOrder, that.lineItemOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemOrder", lineItemOrder)
                .build();
    }

    @Override
    public MyCartChangeLineItemsOrderAction copyDeep() {
        return MyCartChangeLineItemsOrderAction.deepCopy(this);
    }
}
