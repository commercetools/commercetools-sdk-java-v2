package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.MethodTaxedPrice;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.message.OrderMessagePayload;
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
 *  <p>Generated after a successful recalculation of a Discount on a Line Item.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderLineItemDiscountSetMessagePayloadImpl implements OrderLineItemDiscountSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private String lineItemId;
    
    
    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
    
    
    private com.commercetools.api.models.common.Money totalPrice;
    
    
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;
    
    
    private java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderLineItemDiscountSetMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("taxedPricePortions") final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions) {
        this.lineItemId = lineItemId;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.taxedPricePortions = taxedPricePortions;
        this.type =  ORDER_LINE_ITEM_DISCOUNT_SET;
    }
    /**
     * create empty instance
     */
    public OrderLineItemDiscountSetMessagePayloadImpl() {
        this.type =  ORDER_LINE_ITEM_DISCOUNT_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier for the Line Item.</p>
     */
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */
    
    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
        return this.discountedPricePerQuantity;
    }
    
    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     */
    
    public com.commercetools.api.models.common.Money getTotalPrice(){
        return this.totalPrice;
    }
    
    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     */
    
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
        return this.taxedPrice;
    }
    
    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode.</p>
     */
    
    public java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> getTaxedPricePortions(){
        return this.taxedPricePortions;
    }

    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    
    public void setDiscountedPricePerQuantity(final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity ...discountedPricePerQuantity){
       this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }
    
    
    public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
       this.discountedPricePerQuantity = discountedPricePerQuantity;
    }
    
    
    public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice){
        this.totalPrice = totalPrice;
    }
    
    
    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }
    
    
    public void setTaxedPricePortions(final com.commercetools.api.models.cart.MethodTaxedPrice ...taxedPricePortions){
       this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
    }
    
    
    public void setTaxedPricePortions(final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions){
       this.taxedPricePortions = taxedPricePortions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderLineItemDiscountSetMessagePayloadImpl that = (OrderLineItemDiscountSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(lineItemId, that.lineItemId)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedPricePortions, that.taxedPricePortions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(lineItemId)
            .append(discountedPricePerQuantity)
            .append(totalPrice)
            .append(taxedPrice)
            .append(taxedPricePortions)
            .toHashCode();
    }

}
