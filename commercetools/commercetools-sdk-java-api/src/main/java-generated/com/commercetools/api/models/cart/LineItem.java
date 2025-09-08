
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.recurring_order.LineItemRecurrenceInfo;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The representation of a <span>Line Item</span> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or in an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
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
     *  <p>Unique identifier of the LineItem.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> when the <code>key</code> is available on that specific Product at the time the LineItem was created or updated on the Cart.</li>
     *   <li>Line Items in an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
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
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using <span>Reference Expansion</span>.</p>
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
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     *  <p>Number of Line Items of the given Product Variant present in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     *  <p>If <code>ExternalPrice</code> <span>LineItemPriceMode</span> is used with high-precision money, then the total price is rounded by using the <code>HalfEven</code> rounding mode.</p>
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
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return taxedPricePortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxedPricePortions")
    public List<MethodTaxedPrice> getTaxedPricePortions();

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @return perMethodTaxRate
     */
    @NotNull
    @Valid
    @JsonProperty("perMethodTaxRate")
    public List<MethodTaxRate> getPerMethodTaxRate();

    /**
     *  <p>Identifies <span>Inventory entries</span> that are reserved. The referenced Channel has the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>Used to <span>select</span> a Product Price. The referenced Channel has the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
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
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
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

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @return recurrenceInfo
     */
    @Valid
    @JsonProperty("recurrenceInfo")
    public LineItemRecurrenceInfo getRecurrenceInfo();

    /**
     *  <p>Unique identifier of the LineItem.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> when the <code>key</code> is available on that specific Product at the time the LineItem was created or updated on the Cart.</li>
     *   <li>Line Items in an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
     *  </ul>
     *  <p>Present on resources created or updated after 3 December 2021.</p>
     * @param productKey value to be set
     */

    public void setProductKey(final String productKey);

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using <span>Reference Expansion</span>.</p>
     * @param productSlug value to be set
     */

    public void setProductSlug(final LocalizedString productSlug);

    /**
     *  <p>Product Type of the Product.</p>
     * @param productType value to be set
     */

    public void setProductType(final ProductTypeReference productType);

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariant variant);

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @param price value to be set
     */

    public void setPrice(final Price price);

    /**
     *  <p>Number of Line Items of the given Product Variant present in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     *  <p>If <code>ExternalPrice</code> <span>LineItemPriceMode</span> is used with high-precision money, then the total price is rounded by using the <code>HalfEven</code> rounding mode.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final CentPrecisionMoney totalPrice);

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity values to be set
     */

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity values to be set
     */

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions values to be set
     */

    @JsonIgnore
    public void setTaxedPricePortions(final MethodTaxedPrice... taxedPricePortions);

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions values to be set
     */

    public void setTaxedPricePortions(final List<MethodTaxedPrice> taxedPricePortions);

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate values to be set
     */

    @JsonIgnore
    public void setPerMethodTaxRate(final MethodTaxRate... perMethodTaxRate);

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate values to be set
     */

    public void setPerMethodTaxRate(final List<MethodTaxRate> perMethodTaxRate);

    /**
     *  <p>Identifies <span>Inventory entries</span> that are reserved. The referenced Channel has the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     *  <p>Used to <span>select</span> a Product Price. The referenced Channel has the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelReference distributionChannel);

    /**
     *  <p>Indicates how the Price for the Line Item is set.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final LineItemPriceMode priceMode);

    /**
     *  <p>Indicates how the Line Item is added to the Cart.</p>
     * @param lineItemMode value to be set
     */

    public void setLineItemMode(final LineItemMode lineItemMode);

    /**
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetails shippingDetails);

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Date and time (UTC) the Line Item was added to the Cart.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Date and time (UTC) the Line Item was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param recurrenceInfo value to be set
     */

    public void setRecurrenceInfo(final LineItemRecurrenceInfo recurrenceInfo);

    /**
     * factory method
     * @return instance of LineItem
     */
    public static LineItem of() {
        return new LineItemImpl();
    }

    /**
     * factory method to create a shallow copy LineItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItem of(final LineItem template) {
        LineItemImpl instance = new LineItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
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
        instance.setRecurrenceInfo(template.getRecurrenceInfo());
        return instance;
    }

    public LineItem copyDeep();

    /**
     * factory method to create a deep copy of LineItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItem deepCopy(@Nullable final LineItem template) {
        if (template == null) {
            return null;
        }
        LineItemImpl instance = new LineItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setProductId(template.getProductId());
        instance.setProductKey(template.getProductKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setProductSlug(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getProductSlug()));
        instance.setProductType(
            com.commercetools.api.models.product_type.ProductTypeReference.deepCopy(template.getProductType()));
        instance.setVariant(com.commercetools.api.models.product.ProductVariant.deepCopy(template.getVariant()));
        instance.setPrice(com.commercetools.api.models.common.Price.deepCopy(template.getPrice()));
        instance.setQuantity(template.getQuantity());
        instance.setTotalPrice(
            com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getTotalPrice()));
        instance.setDiscountedPricePerQuantity(Optional.ofNullable(template.getDiscountedPricePerQuantity())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedItemPrice.deepCopy(template.getTaxedPrice()));
        instance.setTaxedPricePortions(Optional.ofNullable(template.getTaxedPricePortions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.MethodTaxedPrice::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRate.deepCopy(template.getTaxRate()));
        instance.setPerMethodTaxRate(Optional.ofNullable(template.getPerMethodTaxRate())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.MethodTaxRate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getDistributionChannel()));
        instance.setPriceMode(template.getPriceMode());
        instance.setLineItemMode(template.getLineItemMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetails.deepCopy(template.getShippingDetails()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setAddedAt(template.getAddedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setRecurrenceInfo(
            com.commercetools.api.models.recurring_order.LineItemRecurrenceInfo.deepCopy(template.getRecurrenceInfo()));
        return instance;
    }

    /**
     * builder factory method for LineItem
     * @return builder
     */
    public static LineItemBuilder builder() {
        return LineItemBuilder.of();
    }

    /**
     * create builder for LineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemBuilder builder(final LineItem template) {
        return LineItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItem(Function<LineItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItem>() {
            @Override
            public String toString() {
                return "TypeReference<LineItem>";
            }
        };
    }
}
