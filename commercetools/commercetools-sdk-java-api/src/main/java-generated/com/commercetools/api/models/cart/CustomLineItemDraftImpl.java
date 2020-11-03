package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFields;
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
public final class CustomLineItemDraftImpl implements CustomLineItemDraft {

    private com.commercetools.api.models.common.LocalizedString name;
    
    private Long quantity;
    
    private com.commercetools.api.models.common.Money money;
    
    private String slug;
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;
    
    private com.commercetools.api.models.type.CustomFields custom;
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    CustomLineItemDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("quantity") final Long quantity, @JsonProperty("money") final com.commercetools.api.models.common.Money money, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.name = name;
        this.quantity = quantity;
        this.money = money;
        this.slug = slug;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.custom = custom;
        this.shippingDetails = shippingDetails;
    }
    public CustomLineItemDraftImpl() {
       
    }

    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
    *  <p>The amount of a CustomLineItemin the cart.
    *  Must be a positive integer.</p>
    */
    public Long getQuantity(){
        return this.quantity;
    }
    
    
    public com.commercetools.api.models.common.Money getMoney(){
        return this.money;
    }
    
    
    public String getSlug(){
        return this.slug;
    }
    
    /**
    *  <p>The given tax category will be used to select a tax rate when a cart has the TaxMode <code>Platform</code>.</p>
    */
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }
    
    /**
    *  <p>An external tax rate can be set if the cart has the <code>External</code> TaxMode.</p>
    */
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }
    
    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }
    
    /**
    *  <p>Container for custom line item specific address(es).</p>
    */
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    public void setMoney(final com.commercetools.api.models.common.Money money){
        this.money = money;
    }
    
    public void setSlug(final String slug){
        this.slug = slug;
    }
    
    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
        this.taxCategory = taxCategory;
    }
    
    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
        this.custom = custom;
    }
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }

}
