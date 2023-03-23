
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The representation of a Line Item in a Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItem lineItem = LineItem.builder()
 *             .id("{id}")
 *             .productId("{productId}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .variant(variantBuilder -> variantBuilder)
 *             .price(priceBuilder -> priceBuilder)
 *             .quantity(0.3)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .plusTaxedPricePortions(taxedPricePortionsBuilder -> taxedPricePortionsBuilder)
 *             .plusState(stateBuilder -> stateBuilder)
 *             .plusPerMethodTaxRate(perMethodTaxRateBuilder -> perMethodTaxRateBuilder)
 *             .priceMode(LineItemPriceMode.PLATFORM)
 *             .lineItemMode(LineItemMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemImpl.class)
public interface LineItem extends com.commercetools.api.models.Customizable<LineItem> {

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p><code>id</code> of the Product the Line Item is based on.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>key</code> of the Product.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a Cart when the <code>key</code> is available on that specific Product at the time the Line Item was created or updated on the Cart.</li>
     *   <li>Orders when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
     *  </ul>
     *  <p>Present on resources created or updated after 3 December 2021.</p>
     * @return productKey
     */

    @JsonProperty("productKey")
    public String getProductKey();

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using Reference Expansion.</p>
     * @return productSlug
     */
    @Valid
    @JsonProperty("productSlug")
    public LocalizedString getProductSlug();

    /**
     *  <p>Product Type of the Product.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the Recalculate update action.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the Product <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> ProductPriceMode and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     *  <p>Number of Line Items of the given Product Variant present in the Cart.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public CentPrecisionMoney getTotalPrice();

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @return discountedPricePerQuantity
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Taxed price of the Shipping Method that is automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return taxedPricePortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxedPricePortions")
    public List<MethodTaxedPrice> getTaxedPricePortions();

    /**
     *  <p>State of the Line Item in the Cart.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @return perMethodTaxRate
     */
    @NotNull
    @Valid
    @JsonProperty("perMethodTaxRate")
    public List<MethodTaxRate> getPerMethodTaxRate();

    /**
     *  <p>Identifies Inventory entries that are reserved. The referenced Channel has the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>Used to select a Product Price. The referenced Channel has the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    /**
     *  <p>Indicates how the Price for the Line Item is set.</p>
     * @return priceMode
     */
    @NotNull
    @JsonProperty("priceMode")
    public LineItemPriceMode getPriceMode();

    /**
     *  <p>Indicates how the Line Item is added to the Cart.</p>
     * @return lineItemMode
     */
    @NotNull
    @JsonProperty("lineItemMode")
    public LineItemMode getLineItemMode();

    /**
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetails getShippingDetails();

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Date and time (UTC) the Line Item was added to the Cart.</p>
     * @return addedAt
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Date and time (UTC) the Line Item was last updated.</p>
     * @return lastModifiedAt
     */

    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    public void setId(final String id);

    public void setProductId(final String productId);

    public void setProductKey(final String productKey);

    public void setName(final LocalizedString name);

    public void setProductSlug(final LocalizedString productSlug);

    public void setProductType(final ProductTypeReference productType);

    public void setVariant(final ProductVariant variant);

    public void setPrice(final Price price);

    public void setQuantity(final Long quantity);

    public void setTotalPrice(final CentPrecisionMoney totalPrice);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    @JsonIgnore
    public void setTaxedPricePortions(final MethodTaxedPrice... taxedPricePortions);

    public void setTaxedPricePortions(final List<MethodTaxedPrice> taxedPricePortions);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public void setTaxRate(final TaxRate taxRate);

    @JsonIgnore
    public void setPerMethodTaxRate(final MethodTaxRate... perMethodTaxRate);

    public void setPerMethodTaxRate(final List<MethodTaxRate> perMethodTaxRate);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public void setDistributionChannel(final ChannelReference distributionChannel);

    public void setPriceMode(final LineItemPriceMode priceMode);

    public void setLineItemMode(final LineItemMode lineItemMode);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setShippingDetails(final ItemShippingDetails shippingDetails);

    public void setCustom(final CustomFields custom);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public static LineItem of() {
        return new LineItemImpl();
    }

    public static LineItem of(final LineItem template) {
        LineItemImpl instance = new LineItemImpl();
        instance.setId(template.getId());
        instance.setProductId(template.getProductId());
        instance.setProductKey(template.getProductKey());
        instance.setName(template.getName());
        instance.setProductSlug(template.getProductSlug());
        instance.setProductType(template.getProductType());
        instance.setVariant(template.getVariant());
        instance.setPrice(template.getPrice());
        instance.setQuantity(template.getQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedPricePortions(template.getTaxedPricePortions());
        instance.setState(template.getState());
        instance.setTaxRate(template.getTaxRate());
        instance.setPerMethodTaxRate(template.getPerMethodTaxRate());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setPriceMode(template.getPriceMode());
        instance.setLineItemMode(template.getLineItemMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setCustom(template.getCustom());
        instance.setAddedAt(template.getAddedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    public static LineItemBuilder builder() {
        return LineItemBuilder.of();
    }

    public static LineItemBuilder builder(final LineItem template) {
        return LineItemBuilder.of(template);
    }

    default <T> T withLineItem(Function<LineItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItem>() {
            @Override
            public String toString() {
                return "TypeReference<LineItem>";
            }
        };
    }
}
