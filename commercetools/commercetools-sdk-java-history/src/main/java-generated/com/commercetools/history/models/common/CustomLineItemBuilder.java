
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItem customLineItem = CustomLineItem.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .plusTaxedPricePortions(taxedPricePortionsBuilder -> taxedPricePortionsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .slug("{slug}")
 *             .quantity(0.3)
 *             .plusState(stateBuilder -> stateBuilder)
 *             .plusPerMethodTaxRate(perMethodTaxRateBuilder -> perMethodTaxRateBuilder)
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .priceMode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemBuilder implements Builder<CustomLineItem> {

    private String id;

    @Nullable
    private String key;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.TypedMoney money;

    @Nullable
    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions;

    private com.commercetools.history.models.common.CentPrecisionMoney totalPrice;

    private String slug;

    private Long quantity;

    private java.util.List<com.commercetools.history.models.common.ItemState> state;

    @Nullable
    private com.commercetools.history.models.common.TaxCategoryReference taxCategory;

    @Nullable
    private com.commercetools.history.models.common.TaxRate taxRate;

    private java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate;

    private java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.history.models.common.CustomFields custom;

    @Nullable
    private com.commercetools.history.models.common.ItemShippingDetails shippingDetails;

    private com.commercetools.history.models.common.CustomLineItemPriceMode priceMode;

    @Nullable
    private com.commercetools.history.models.common.CustomLineItemRecurrenceInfo recurrenceInfo;

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomLineItemBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemBuilder withName(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomLineItemBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @param money value to be set
     * @return Builder
     */

    public CustomLineItemBuilder money(final com.commercetools.history.models.common.TypedMoney money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemBuilder money(
            Function<com.commercetools.history.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.history.models.common.TypedMoney>> builder) {
        this.money = builder.apply(com.commercetools.history.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxedPrice(
            @Nullable final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxedPricePortions(
            final com.commercetools.history.models.common.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxedPricePortions(
            final java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public CustomLineItemBuilder plusTaxedPricePortions(
            final com.commercetools.history.models.common.MethodTaxedPrice... taxedPricePortions) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions.addAll(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public CustomLineItemBuilder plusTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPriceBuilder> builder) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPriceBuilder> builder) {
        this.taxedPricePortions = new ArrayList<>();
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public CustomLineItemBuilder addTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPrice> builder) {
        return plusTaxedPricePortions(
            builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public CustomLineItemBuilder setTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPrice> builder) {
        return taxedPricePortions(builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CustomLineItemBuilder totalPrice(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CustomLineItemBuilder withTotalPrice(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoney> builder) {
        this.totalPrice = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public CustomLineItemBuilder totalPrice(
            final com.commercetools.history.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It matches the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CustomLineItemBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemBuilder state(final com.commercetools.history.models.common.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemBuilder state(final java.util.List<com.commercetools.history.models.common.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemBuilder plusState(final com.commercetools.history.models.common.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder plusState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder withState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder addState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder setState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return state(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemBuilder taxCategory(
            Function<com.commercetools.history.models.common.TaxCategoryReferenceBuilder, com.commercetools.history.models.common.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.history.models.common.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxCategory(
            Function<com.commercetools.history.models.common.TaxCategoryReferenceBuilder, com.commercetools.history.models.common.TaxCategoryReference> builder) {
        this.taxCategory = builder.apply(com.commercetools.history.models.common.TaxCategoryReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxCategory(
            @Nullable final com.commercetools.history.models.common.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemBuilder taxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @param taxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxRate(@Nullable final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder perMethodTaxRate(
            final com.commercetools.history.models.common.MethodTaxRate... perMethodTaxRate) {
        this.perMethodTaxRate = new ArrayList<>(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder perMethodTaxRate(
            final java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate) {
        this.perMethodTaxRate = perMethodTaxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder plusPerMethodTaxRate(
            final com.commercetools.history.models.common.MethodTaxRate... perMethodTaxRate) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate.addAll(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder plusPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRateBuilder> builder) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder withPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRateBuilder> builder) {
        this.perMethodTaxRate = new ArrayList<>();
        this.perMethodTaxRate
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder addPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRate> builder) {
        return plusPerMethodTaxRate(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()));
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder setPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRate> builder) {
        return perMethodTaxRate(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()));
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder discountedPricePerQuantity(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemBuilder addDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        return plusDiscountedPricePerQuantity(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemBuilder setDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        return discountedPricePerQuantity(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemBuilder withCustom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomLineItemBuilder custom(@Nullable final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemBuilder shippingDetails(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemBuilder withShippingDetails(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetails> builder) {
        this.shippingDetails = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public CustomLineItemBuilder shippingDetails(
            @Nullable final com.commercetools.history.models.common.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Indicates whether Cart Discounts with a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyCustomLineItemsTarget" rel="nofollow">MultiBuyCustomLineItemsTarget</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> are applied to the Custom Line Item.</p>
     * @param priceMode value to be set
     * @return Builder
     */

    public CustomLineItemBuilder priceMode(
            final com.commercetools.history.models.common.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public CustomLineItemBuilder recurrenceInfo(
            Function<com.commercetools.history.models.common.CustomLineItemRecurrenceInfoBuilder, com.commercetools.history.models.common.CustomLineItemRecurrenceInfoBuilder> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.history.models.common.CustomLineItemRecurrenceInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public CustomLineItemBuilder withRecurrenceInfo(
            Function<com.commercetools.history.models.common.CustomLineItemRecurrenceInfoBuilder, com.commercetools.history.models.common.CustomLineItemRecurrenceInfo> builder) {
        this.recurrenceInfo = builder
                .apply(com.commercetools.history.models.common.CustomLineItemRecurrenceInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param recurrenceInfo value to be set
     * @return Builder
     */

    public CustomLineItemBuilder recurrenceInfo(
            @Nullable final com.commercetools.history.models.common.CustomLineItemRecurrenceInfo recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
        return this;
    }

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @return name
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @return money
     */

    public com.commercetools.history.models.common.TypedMoney getMoney() {
        return this.money;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return taxedPricePortions
     */

    public java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     * @return totalPrice
     */

    public com.commercetools.history.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It matches the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @return slug
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>Number of Custom Line Items in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return state
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.history.models.common.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.history.models.common.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @return perMethodTaxRate
     */

    public java.util.List<com.commercetools.history.models.common.MethodTaxRate> getPerMethodTaxRate() {
        return this.perMethodTaxRate;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @return discountedPricePerQuantity
     */

    public java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.history.models.common.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Indicates whether Cart Discounts with a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyCustomLineItemsTarget" rel="nofollow">MultiBuyCustomLineItemsTarget</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> are applied to the Custom Line Item.</p>
     * @return priceMode
     */

    public com.commercetools.history.models.common.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @return recurrenceInfo
     */

    @Nullable
    public com.commercetools.history.models.common.CustomLineItemRecurrenceInfo getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    /**
     * builds CustomLineItem with checking for non-null required values
     * @return CustomLineItem
     */
    public CustomLineItem build() {
        Objects.requireNonNull(id, CustomLineItem.class + ": id is missing");
        Objects.requireNonNull(name, CustomLineItem.class + ": name is missing");
        Objects.requireNonNull(money, CustomLineItem.class + ": money is missing");
        Objects.requireNonNull(taxedPricePortions, CustomLineItem.class + ": taxedPricePortions is missing");
        Objects.requireNonNull(totalPrice, CustomLineItem.class + ": totalPrice is missing");
        Objects.requireNonNull(slug, CustomLineItem.class + ": slug is missing");
        Objects.requireNonNull(quantity, CustomLineItem.class + ": quantity is missing");
        Objects.requireNonNull(state, CustomLineItem.class + ": state is missing");
        Objects.requireNonNull(perMethodTaxRate, CustomLineItem.class + ": perMethodTaxRate is missing");
        Objects.requireNonNull(discountedPricePerQuantity,
            CustomLineItem.class + ": discountedPricePerQuantity is missing");
        Objects.requireNonNull(priceMode, CustomLineItem.class + ": priceMode is missing");
        return new CustomLineItemImpl(id, key, name, money, taxedPrice, taxedPricePortions, totalPrice, slug, quantity,
            state, taxCategory, taxRate, perMethodTaxRate, discountedPricePerQuantity, custom, shippingDetails,
            priceMode, recurrenceInfo);
    }

    /**
     * builds CustomLineItem without checking for non-null required values
     * @return CustomLineItem
     */
    public CustomLineItem buildUnchecked() {
        return new CustomLineItemImpl(id, key, name, money, taxedPrice, taxedPricePortions, totalPrice, slug, quantity,
            state, taxCategory, taxRate, perMethodTaxRate, discountedPricePerQuantity, custom, shippingDetails,
            priceMode, recurrenceInfo);
    }

    /**
     * factory method for an instance of CustomLineItemBuilder
     * @return builder
     */
    public static CustomLineItemBuilder of() {
        return new CustomLineItemBuilder();
    }

    /**
     * create builder for CustomLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemBuilder of(final CustomLineItem template) {
        CustomLineItemBuilder builder = new CustomLineItemBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.money = template.getMoney();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedPricePortions = template.getTaxedPricePortions();
        builder.totalPrice = template.getTotalPrice();
        builder.slug = template.getSlug();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        builder.taxCategory = template.getTaxCategory();
        builder.taxRate = template.getTaxRate();
        builder.perMethodTaxRate = template.getPerMethodTaxRate();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        builder.priceMode = template.getPriceMode();
        builder.recurrenceInfo = template.getRecurrenceInfo();
        return builder;
    }

}
