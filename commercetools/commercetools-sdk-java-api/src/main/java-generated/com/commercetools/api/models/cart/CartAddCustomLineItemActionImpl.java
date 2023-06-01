package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CustomLineItemPriceMode;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
 *  <p>If the Cart already contains a CustomLineItem with the same <code>slug</code>, <code>name</code>, <code>money</code>, <code>taxCategory</code>, <code>state</code>, and Custom Fields, then only the quantity of the existing Custom Line Item is increased. If CustomLineItem <code>shippingDetails</code> are set, they are merged with the <code>targets</code> that already exist on the ItemShippingDetails of the Custom Line Item. In case of overlapping address keys the ItemShippingTarget <code>quantity</code> is summed up.</p>
 *  <p>If the Cart already contains a Custom Line Item with the same slug that is otherwise not identical, an InvalidOperation error is returned.</p>
 *  <p>If the Tax Rate is not set, a MissingTaxRateForCountry error is returned.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartAddCustomLineItemActionImpl implements CartAddCustomLineItemAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.Money money;
    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    private Long quantity;
    
    
    private String slug;
    
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
    
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;
    
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;
    
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    
    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartAddCustomLineItemActionImpl(@JsonProperty("money") final com.commercetools.api.models.common.Money money, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("quantity") final Long quantity, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("priceMode") final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.money = money;
        this.name = name;
        this.quantity = quantity;
        this.slug = slug;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.shippingDetails = shippingDetails;
        this.custom = custom;
        this.priceMode = priceMode;
        this.action =  ADD_CUSTOM_LINE_ITEM;
    }
    /**
     * create empty instance
     */
    public CartAddCustomLineItemActionImpl() {
        this.action =  ADD_CUSTOM_LINE_ITEM;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
     */
    
    public com.commercetools.api.models.common.Money getMoney(){
        return this.money;
    }
    
    /**
     *  <p>Name of the Custom Line Item.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Number of Custom Line Items to add to the Cart.</p>
     */
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */
    
    public String getSlug(){
        return this.slug;
    }
    
    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     *  <p>If TaxMode is <code>Platform</code>, this field must not be empty.</p>
     */
    
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }
    
    /**
     *  <p>An external Tax Rate can be set if the Cart has <code>External</code> TaxMode.</p>
     */
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }
    
    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     */
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }
    
    /**
     *  <p>Custom Fields for the Custom Line Item.</p>
     */
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     */
    
    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode(){
        return this.priceMode;
    }

    
    public void setMoney(final com.commercetools.api.models.common.Money money){
        this.money = money;
    }
    
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
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
    
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    
    public void setPriceMode(final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode){
        this.priceMode = priceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartAddCustomLineItemActionImpl that = (CartAddCustomLineItemActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(money, that.money)
                .append(name, that.name)
                .append(quantity, that.quantity)
                .append(slug, that.slug)
                .append(taxCategory, that.taxCategory)
                .append(externalTaxRate, that.externalTaxRate)
                .append(shippingDetails, that.shippingDetails)
                .append(custom, that.custom)
                .append(priceMode, that.priceMode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(money)
            .append(name)
            .append(quantity)
            .append(slug)
            .append(taxCategory)
            .append(externalTaxRate)
            .append(shippingDetails)
            .append(custom)
            .append(priceMode)
            .toHashCode();
    }

}
