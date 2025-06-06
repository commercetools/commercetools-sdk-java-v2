
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
 *  <p>Produces the PurchaseOrderNumberSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetPurchaseOrderNumberActionImpl implements OrderSetPurchaseOrderNumberAction, ModelBase {

    private String action;

    private String purchaseOrderNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetPurchaseOrderNumberActionImpl(@JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.action = SET_PURCHASE_ORDER_NUMBER;
    }

    /**
     * create empty instance
     */
    public OrderSetPurchaseOrderNumberActionImpl() {
        this.action = SET_PURCHASE_ORDER_NUMBER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetPurchaseOrderNumberActionImpl that = (OrderSetPurchaseOrderNumberActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(action, that.action)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(purchaseOrderNumber).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("purchaseOrderNumber", purchaseOrderNumber)
                .build();
    }

    @Override
    public OrderSetPurchaseOrderNumberAction copyDeep() {
        return OrderSetPurchaseOrderNumberAction.deepCopy(this);
    }
}
