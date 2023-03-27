
package com.commercetools.api.models.order_edit;

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
 * StagedOrderSetPurchaseOrderNumberAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetPurchaseOrderNumberActionImpl implements StagedOrderSetPurchaseOrderNumberAction, ModelBase {

    private String action;

    private String purchaseOrderNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetPurchaseOrderNumberActionImpl(@JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.action = SET_PURCHASE_ORDER_NUMBER;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetPurchaseOrderNumberActionImpl() {
        this.action = SET_PURCHASE_ORDER_NUMBER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
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

        StagedOrderSetPurchaseOrderNumberActionImpl that = (StagedOrderSetPurchaseOrderNumberActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(purchaseOrderNumber).toHashCode();
    }

}
