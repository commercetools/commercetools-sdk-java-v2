
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemImportDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemImportDraft lineItemImportDraft = LineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .variant(variantBuilder -> variantBuilder)
 *             .price(priceBuilder -> priceBuilder)
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemImportDraftImpl.class)
public interface LineItemImportDraft extends com.commercetools.api.models.CustomizableDraft<LineItemImportDraft>,
        io.vrap.rmf.base.client.Draft<LineItemImportDraft> {

    /**
     *  <p>ID of the existing product. You also need to specify the ID of the variant if this property is set or alternatively you can just specify SKU of the product variant.</p>
     * @return productId
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>The product name.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariantImportDraft getVariant();

    /**
     *
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p>Connection to a particular supplier. By providing supply channel information, you can uniquely identify inventory entries that should be reserved. The provided channel should have the InventorySupply role.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>The channel is used to select a ProductPrice. The provided channel should have the ProductDistribution role.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>The custom fields.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Inventory mode specific to the line item only, valid for the entire <code>quantity</code> of the line item. Set only if inventory mode should be different from the <code>inventoryMode</code> specified on the OrderImportDraft.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p>ID of the existing product. You also need to specify the ID of the variant if this property is set or alternatively you can just specify SKU of the product variant.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>The product name.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final ProductVariantImportDraft variant);

    /**
     * set price
     * @param price value to be set
     */

    public void setPrice(final PriceDraft price);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * set state
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     * set state
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     *  <p>Connection to a particular supplier. By providing supply channel information, you can uniquely identify inventory entries that should be reserved. The provided channel should have the InventorySupply role.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     *  <p>The channel is used to select a ProductPrice. The provided channel should have the ProductDistribution role.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     * set taxRate
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>The custom fields.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Inventory mode specific to the line item only, valid for the entire <code>quantity</code> of the line item. Set only if inventory mode should be different from the <code>inventoryMode</code> specified on the OrderImportDraft.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     * set shippingDetails
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     * factory method
     * @return instance of LineItemImportDraft
     */
    public static LineItemImportDraft of() {
        return new LineItemImportDraftImpl();
    }

    /**
     * factory method to copy an instance of LineItemImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemImportDraft of(final LineItemImportDraft template) {
        LineItemImportDraftImpl instance = new LineItemImportDraftImpl();
        instance.setProductId(template.getProductId());
        instance.setName(template.getName());
        instance.setVariant(template.getVariant());
        instance.setPrice(template.getPrice());
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setTaxRate(template.getTaxRate());
        instance.setCustom(template.getCustom());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * builder factory method for LineItemImportDraft
     * @return builder
     */
    public static LineItemImportDraftBuilder builder() {
        return LineItemImportDraftBuilder.of();
    }

    /**
     * create builder for LineItemImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemImportDraftBuilder builder(final LineItemImportDraft template) {
        return LineItemImportDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemImportDraft(Function<LineItemImportDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemImportDraft>";
            }
        };
    }
}
