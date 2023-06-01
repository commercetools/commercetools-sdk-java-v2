package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
 * StagedOrderSetLineItemPriceAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetLineItemPriceActionImpl implements StagedOrderSetLineItemPriceAction, ModelBase {

    
    private String action;
    
    
    private String lineItemId;
    
    
    private com.commercetools.api.models.common.Money externalPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetLineItemPriceActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice) {
        this.lineItemId = lineItemId;
        this.externalPrice = externalPrice;
        this.action =  SET_LINE_ITEM_PRICE;
    }
    /**
     * create empty instance
     */
    public StagedOrderSetLineItemPriceActionImpl() {
        this.action =  SET_LINE_ITEM_PRICE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *
     */
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     */
    
    public com.commercetools.api.models.common.Money getExternalPrice(){
        return this.externalPrice;
    }

    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    
    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice){
        this.externalPrice = externalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderSetLineItemPriceActionImpl that = (StagedOrderSetLineItemPriceActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(externalPrice, that.externalPrice)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(lineItemId)
            .append(externalPrice)
            .toHashCode();
    }

}
