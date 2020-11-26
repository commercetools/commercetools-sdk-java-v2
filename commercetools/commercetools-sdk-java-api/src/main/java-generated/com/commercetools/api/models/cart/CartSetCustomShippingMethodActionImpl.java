package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomShippingMethodActionImpl implements CartSetCustomShippingMethodAction {

    private String action;
    
    private String shippingMethodName;
    
    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    CartSetCustomShippingMethodActionImpl(@JsonProperty("shippingMethodName") final String shippingMethodName, @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.shippingMethodName = shippingMethodName;
        this.shippingRate = shippingRate;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.action = "setCustomShippingMethod";
    }
    public CartSetCustomShippingMethodActionImpl() {
        this.action = "setCustomShippingMethod";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getShippingMethodName(){
        return this.shippingMethodName;
    }
    
    
    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
        return this.shippingRate;
    }
    
    
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }
    
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    public void setShippingMethodName(final String shippingMethodName){
        this.shippingMethodName = shippingMethodName;
    }
    
    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate){
        this.shippingRate = shippingRate;
    }
    
    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
        this.taxCategory = taxCategory;
    }
    
    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }

}
