package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomLineItemDiscountSetMessagePayloadImpl implements OrderCustomLineItemDiscountSetMessagePayload {

    
    private String type;
    
    
    private String customLineItemId;
    
    
    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
    
    
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    @JsonCreator
    OrderCustomLineItemDiscountSetMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.customLineItemId = customLineItemId;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.taxedPrice = taxedPrice;
        this.type =  ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET;
    }
    public OrderCustomLineItemDiscountSetMessagePayloadImpl() {
        this.type =  ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET;
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
        return this.discountedPricePerQuantity;
    }
    
    
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
        return this.taxedPrice;
    }

    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    
    public void setDiscountedPricePerQuantity(final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity ...discountedPricePerQuantity){
       this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }
    
    
    public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
       this.discountedPricePerQuantity = discountedPricePerQuantity;
    }
    
    
    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderCustomLineItemDiscountSetMessagePayloadImpl that = (OrderCustomLineItemDiscountSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(taxedPrice, that.taxedPrice)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(customLineItemId)
            .append(discountedPricePerQuantity)
            .append(taxedPrice)
            .toHashCode();
    }

}
