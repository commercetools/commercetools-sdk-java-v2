package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.me.MyLineItemDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>For Product Variant identification, either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyLineItemDraft myLineItemDraft = MyLineItemDraft.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyLineItemDraftImpl.class)
public interface MyLineItemDraft extends com.commercetools.api.models.CustomizableDraft<MyLineItemDraft>, io.vrap.rmf.base.client.Draft<MyLineItemDraft> {


    /**
     *  <p><code>id</code> of the Product.</p>
     * @return productId
     */
    
    @JsonProperty("productId")
    public String getProductId();
    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     * @return variantId
     */
    
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @return sku
     */
    
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>Number of Product Variants to add to the Cart.</p>
     * @return quantity
     */
    
    @JsonProperty("quantity")
    public Long getQuantity();
    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     * @return addedAt
     */
    
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();
    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();
    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     *  <p>If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();
    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();
    /**
     *  <p>Custom Fields for the Cart.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p><code>id</code> of the Product.</p>
     * @param productId value to be set
     */
    
    public void setProductId(final String productId);
    
    
    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Long variantId);
    
    
    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>Number of Product Variants to add to the Cart.</p>
     * @param quantity value to be set
     */
    
    public void setQuantity(final Long quantity);
    
    
    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     * @param addedAt value to be set
     */
    
    public void setAddedAt(final ZonedDateTime addedAt);
    
    
    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel value to be set
     */
    
    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
    
    
    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     *  <p>If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param distributionChannel value to be set
     */
    
    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
    
    
    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     */
    
    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
    
    
    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    

    /**
     * factory method
     * @return instance of MyLineItemDraft
     */
    public static MyLineItemDraft of(){
        return new MyLineItemDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy MyLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyLineItemDraft of(final MyLineItemDraft template) {
        MyLineItemDraftImpl instance = new MyLineItemDraftImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyLineItemDraft deepCopy(@Nullable final MyLineItemDraft template) {
        if (template == null) {
            return null;
        }
        MyLineItemDraftImpl instance = new MyLineItemDraftImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setSupplyChannel(com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        instance.setDistributionChannel(com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
        instance.setShippingDetails(com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for MyLineItemDraft
     * @return builder
     */
    public static MyLineItemDraftBuilder builder() {
        return MyLineItemDraftBuilder.of();
    }
    
    /**
     * create builder for MyLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyLineItemDraftBuilder builder(final MyLineItemDraft template) {
        return MyLineItemDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyLineItemDraft(Function<MyLineItemDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyLineItemDraft>";
            }
        };
    }
}
