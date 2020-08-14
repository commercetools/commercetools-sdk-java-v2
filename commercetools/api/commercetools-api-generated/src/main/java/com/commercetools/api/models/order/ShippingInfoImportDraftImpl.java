package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.ShippingMethodState;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.DiscountedLineItemPriceDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingInfoImportDraftImpl implements ShippingInfoImportDraft {

    private String shippingMethodName;
    
    private com.commercetools.api.models.common.Money price;
    
    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;
    
    private com.commercetools.api.models.tax_category.TaxRate taxRate;
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
    
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
    
    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;
    
    private com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice;
    
    private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;

    @JsonCreator
    ShippingInfoImportDraftImpl(@JsonProperty("shippingMethodName") final String shippingMethodName, @JsonProperty("price") final com.commercetools.api.models.common.Money price, @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate, @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory, @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.Delivery> deliveries, @JsonProperty("discountedPrice") final com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice, @JsonProperty("shippingMethodState") final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
        this.shippingMethodName = shippingMethodName;
        this.price = price;
        this.shippingRate = shippingRate;
        this.taxRate = taxRate;
        this.taxCategory = taxCategory;
        this.shippingMethod = shippingMethod;
        this.deliveries = deliveries;
        this.discountedPrice = discountedPrice;
        this.shippingMethodState = shippingMethodState;
    }
    public ShippingInfoImportDraftImpl() {
       
    }

    
    public String getShippingMethodName(){
        return this.shippingMethodName;
    }
    
    
    public com.commercetools.api.models.common.Money getPrice(){
        return this.price;
    }
    
    /**
    *  <p>The shipping rate used to determine the price.</p>
    */
    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
        return this.shippingRate;
    }
    
    
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate(){
        return this.taxRate;
    }
    
    
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }
    
    /**
    *  <p>Not set if custom shipping method is used.</p>
    */
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
        return this.shippingMethod;
    }
    
    /**
    *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
    */
    public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries(){
        return this.deliveries;
    }
    
    
    public com.commercetools.api.models.order.DiscountedLineItemPriceDraft getDiscountedPrice(){
        return this.discountedPrice;
    }
    
    /**
    *  <p>Indicates whether the ShippingMethod referenced is allowed for the cart or not.</p>
    */
    public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState(){
        return this.shippingMethodState;
    }

    public void setShippingMethodName(final String shippingMethodName){
        this.shippingMethodName = shippingMethodName;
    }
    
    public void setPrice(final com.commercetools.api.models.common.Money price){
        this.price = price;
    }
    
    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate){
        this.shippingRate = shippingRate;
    }
    
    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate){
        this.taxRate = taxRate;
    }
    
    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
        this.taxCategory = taxCategory;
    }
    
    public void setShippingMethod(final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
        this.shippingMethod = shippingMethod;
    }
    
    public void setDeliveries(final java.util.List<com.commercetools.api.models.order.Delivery> deliveries){
        this.deliveries = deliveries;
    }
    
    public void setDiscountedPrice(final com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice){
        this.discountedPrice = discountedPrice;
    }
    
    public void setShippingMethodState(final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState){
        this.shippingMethodState = shippingMethodState;
    }

}
