package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * OrderSetPurchaseOrderNumberAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetPurchaseOrderNumberActionImpl implements OrderSetPurchaseOrderNumberAction, ModelBase {

    
    private String action;
    
    
    private String purchaseOrderNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetPurchaseOrderNumberActionImpl(@JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.action =  SET_PURCHASE_ORDER_NUMBER;
    }
    /**
     * create empty instance
     */
    public OrderSetPurchaseOrderNumberActionImpl() {
        this.action =  SET_PURCHASE_ORDER_NUMBER;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     */
    
    public String getPurchaseOrderNumber(){
        return this.purchaseOrderNumber;
    }

    
    public void setPurchaseOrderNumber(final String purchaseOrderNumber){
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSetPurchaseOrderNumberActionImpl that = (OrderSetPurchaseOrderNumberActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(purchaseOrderNumber)
            .toHashCode();
    }

}
