package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.customfields.Custom;
import com.commercetools.importapi.models.orders.ItemShippingDetailsDraft;
import com.commercetools.importapi.models.orders.ItemState;
import com.commercetools.importapi.models.orders.LineItemPrice;
import com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft;
import com.commercetools.importapi.models.prices.TaxRate;
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
 *  <p>Represents an individual Line Item in an Order. A line item is a snapshot of a product at the time it was added to the order.</p>
 *  <p>You cannot create an Order that includes line item operations that do not exist in the Project or have been deleted. Products and Product Variants referenced by a line item must already exist in the Project.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LineItemImportDraftImpl implements LineItemImportDraft, ModelBase {

    
    private com.commercetools.importapi.models.common.ProductKeyReference product;
    
    
    private com.commercetools.importapi.models.common.LocalizedString name;
    
    
    private com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft variant;
    
    
    private com.commercetools.importapi.models.orders.LineItemPrice price;
    
    
    private Double quantity;
    
    
    private java.util.List<com.commercetools.importapi.models.orders.ItemState> state;
    
    
    private com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel;
    
    
    private com.commercetools.importapi.models.common.ChannelKeyReference distributionChannel;
    
    
    private com.commercetools.importapi.models.prices.TaxRate taxRate;
    
    
    private com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails;
    
    
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemImportDraftImpl(@JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product, @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name, @JsonProperty("variant") final com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft variant, @JsonProperty("price") final com.commercetools.importapi.models.orders.LineItemPrice price, @JsonProperty("quantity") final Double quantity, @JsonProperty("state") final java.util.List<com.commercetools.importapi.models.orders.ItemState> state, @JsonProperty("supplyChannel") final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.importapi.models.common.ChannelKeyReference distributionChannel, @JsonProperty("taxRate") final com.commercetools.importapi.models.prices.TaxRate taxRate, @JsonProperty("shippingDetails") final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails, @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.product = product;
        this.name = name;
        this.variant = variant;
        this.price = price;
        this.quantity = quantity;
        this.state = state;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.taxRate = taxRate;
        this.shippingDetails = shippingDetails;
        this.custom = custom;
    }
    /**
     * create empty instance
     */
    public LineItemImportDraftImpl() {
    }

    /**
     *  <p>Maps to <code>LineItem.productId</code>.</p>
     */
    
    public com.commercetools.importapi.models.common.ProductKeyReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     */
    
    public com.commercetools.importapi.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
     */
    
    public com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft getVariant(){
        return this.variant;
    }
    
    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     */
    
    public com.commercetools.importapi.models.orders.LineItemPrice getPrice(){
        return this.price;
    }
    
    /**
     *  <p>Maps to <code>LineItem.quantity</code>.</p>
     */
    
    public Double getQuantity(){
        return this.quantity;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.importapi.models.orders.ItemState> getState(){
        return this.state;
    }
    
    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. The Reference to the Supply Channel with which the LineItem is associated. If referenced Supply Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Supply Channel is created.</p>
     */
    
    public com.commercetools.importapi.models.common.ChannelKeyReference getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. The Reference to the Distribution Channel with which the LineItem is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Distribution Channel is created.</p>
     */
    
    public com.commercetools.importapi.models.common.ChannelKeyReference getDistributionChannel(){
        return this.distributionChannel;
    }
    
    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     */
    
    public com.commercetools.importapi.models.prices.TaxRate getTaxRate(){
        return this.taxRate;
    }
    
    /**
     *  <p>Maps to LineItem.shippingDetails.</p>
     */
    
    public com.commercetools.importapi.models.orders.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }
    
    /**
     *  <p>Custom Fields for this Line Item.</p>
     */
    
    public com.commercetools.importapi.models.customfields.Custom getCustom(){
        return this.custom;
    }

    
    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product){
        this.product = product;
    }
    
    
    public void setName(final com.commercetools.importapi.models.common.LocalizedString name){
        this.name = name;
    }
    
    
    public void setVariant(final com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft variant){
        this.variant = variant;
    }
    
    
    public void setPrice(final com.commercetools.importapi.models.orders.LineItemPrice price){
        this.price = price;
    }
    
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    
    public void setState(final com.commercetools.importapi.models.orders.ItemState ...state){
       this.state = new ArrayList<>(Arrays.asList(state));
    }
    
    
    public void setState(final java.util.List<com.commercetools.importapi.models.orders.ItemState> state){
       this.state = state;
    }
    
    
    public void setSupplyChannel(final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel){
        this.supplyChannel = supplyChannel;
    }
    
    
    public void setDistributionChannel(final com.commercetools.importapi.models.common.ChannelKeyReference distributionChannel){
        this.distributionChannel = distributionChannel;
    }
    
    
    public void setTaxRate(final com.commercetools.importapi.models.prices.TaxRate taxRate){
        this.taxRate = taxRate;
    }
    
    
    public void setShippingDetails(final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }
    
    
    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom){
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        LineItemImportDraftImpl that = (LineItemImportDraftImpl) o;
    
        return new EqualsBuilder()
                .append(product, that.product)
                .append(name, that.name)
                .append(variant, that.variant)
                .append(price, that.price)
                .append(quantity, that.quantity)
                .append(state, that.state)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .append(taxRate, that.taxRate)
                .append(shippingDetails, that.shippingDetails)
                .append(custom, that.custom)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(product)
            .append(name)
            .append(variant)
            .append(price)
            .append(quantity)
            .append(state)
            .append(supplyChannel)
            .append(distributionChannel)
            .append(taxRate)
            .append(shippingDetails)
            .append(custom)
            .toHashCode();
    }

}
