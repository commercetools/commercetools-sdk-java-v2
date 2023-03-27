
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set PurchaseOrderNumber update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPurchaseOrderNumberSetMessagePayloadImpl
        implements OrderPurchaseOrderNumberSetMessagePayload, ModelBase {

    private String type;

    private String purchaseOrderNumber;

    private String oldPurchaseOrderNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderPurchaseOrderNumberSetMessagePayloadImpl(@JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber,
            @JsonProperty("oldPurchaseOrderNumber") final String oldPurchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.oldPurchaseOrderNumber = oldPurchaseOrderNumber;
        this.type = ORDER_PURCHASE_ORDER_NUMBER_SET;
    }

    /**
     * create empty instance
     */
    public OrderPurchaseOrderNumberSetMessagePayloadImpl() {
        this.type = ORDER_PURCHASE_ORDER_NUMBER_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Purchase order number on the Order after the Set PurchaseOrderNumber update action.</p>
     */

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>Purchase order number on the Order before the Set PurchaseOrderNumber update action.</p>
     */

    public String getOldPurchaseOrderNumber() {
        return this.oldPurchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public void setOldPurchaseOrderNumber(final String oldPurchaseOrderNumber) {
        this.oldPurchaseOrderNumber = oldPurchaseOrderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderPurchaseOrderNumberSetMessagePayloadImpl that = (OrderPurchaseOrderNumberSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(oldPurchaseOrderNumber, that.oldPurchaseOrderNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(purchaseOrderNumber)
                .append(oldPurchaseOrderNumber)
                .toHashCode();
    }

}
