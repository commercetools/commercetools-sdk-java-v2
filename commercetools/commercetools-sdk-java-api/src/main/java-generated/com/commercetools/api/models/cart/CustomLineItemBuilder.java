
package com.commercetools.api.models.cart;

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

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.TypedMoney money;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    private String slug;

    private Long quantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

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
     *  <p>Name of the Custom Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomLineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @param money value to be set
     * @return Builder
     */

    public CustomLineItemBuilder money(final com.commercetools.api.models.common.TypedMoney money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemBuilder money(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CustomLineItemBuilder totalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CustomLineItemBuilder withTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public CustomLineItemBuilder totalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
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
     *  <p>Number of Custom Line Items in the Cart.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemBuilder state(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemBuilder state(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemBuilder plusState(final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder addState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemBuilder setState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return state(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReference> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @param taxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder perMethodTaxRate(
            final com.commercetools.api.models.cart.MethodTaxRate... perMethodTaxRate) {
        this.perMethodTaxRate = new ArrayList<>(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder perMethodTaxRate(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate) {
        this.perMethodTaxRate = perMethodTaxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemBuilder plusPerMethodTaxRate(
            final com.commercetools.api.models.cart.MethodTaxRate... perMethodTaxRate) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate.addAll(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder plusPerMethodTaxRate(
            Function<com.commercetools.api.models.cart.MethodTaxRateBuilder, com.commercetools.api.models.cart.MethodTaxRateBuilder> builder) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate.add(builder.apply(com.commercetools.api.models.cart.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder withPerMethodTaxRate(
            Function<com.commercetools.api.models.cart.MethodTaxRateBuilder, com.commercetools.api.models.cart.MethodTaxRateBuilder> builder) {
        this.perMethodTaxRate = new ArrayList<>();
        this.perMethodTaxRate.add(builder.apply(com.commercetools.api.models.cart.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder addPerMethodTaxRate(
            Function<com.commercetools.api.models.cart.MethodTaxRateBuilder, com.commercetools.api.models.cart.MethodTaxRate> builder) {
        return plusPerMethodTaxRate(builder.apply(com.commercetools.api.models.cart.MethodTaxRateBuilder.of()));
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public CustomLineItemBuilder setPerMethodTaxRate(
            Function<com.commercetools.api.models.cart.MethodTaxRateBuilder, com.commercetools.api.models.cart.MethodTaxRate> builder) {
        return perMethodTaxRate(builder.apply(com.commercetools.api.models.cart.MethodTaxRateBuilder.of()));
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
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
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemBuilder addDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return plusDiscountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemBuilder setDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return discountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetails> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public CustomLineItemBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Indicates whether Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</p>
     * @param priceMode value to be set
     * @return Builder
     */

    public CustomLineItemBuilder priceMode(final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
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
     *  <p>Name of the Custom Line Item.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @return money
     */

    public com.commercetools.api.models.common.TypedMoney getMoney() {
        return this.money;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
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
     *  <p>Number of Custom Line Items in the Cart.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @return state
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @return perMethodTaxRate
     */

    public java.util.List<com.commercetools.api.models.cart.MethodTaxRate> getPerMethodTaxRate() {
        return this.perMethodTaxRate;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @return discountedPricePerQuantity
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Indicates whether Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</p>
     * @return priceMode
     */

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     * builds CustomLineItem with checking for non-null required values
     * @return CustomLineItem
     */
    public CustomLineItem build() {
        Objects.requireNonNull(id, CustomLineItem.class + ": id is missing");
        Objects.requireNonNull(name, CustomLineItem.class + ": name is missing");
        Objects.requireNonNull(money, CustomLineItem.class + ": money is missing");
        Objects.requireNonNull(totalPrice, CustomLineItem.class + ": totalPrice is missing");
        Objects.requireNonNull(slug, CustomLineItem.class + ": slug is missing");
        Objects.requireNonNull(quantity, CustomLineItem.class + ": quantity is missing");
        Objects.requireNonNull(state, CustomLineItem.class + ": state is missing");
        Objects.requireNonNull(perMethodTaxRate, CustomLineItem.class + ": perMethodTaxRate is missing");
        Objects.requireNonNull(discountedPricePerQuantity,
            CustomLineItem.class + ": discountedPricePerQuantity is missing");
        Objects.requireNonNull(priceMode, CustomLineItem.class + ": priceMode is missing");
        return new CustomLineItemImpl(id, name, money, taxedPrice, totalPrice, slug, quantity, state, taxCategory,
            taxRate, perMethodTaxRate, discountedPricePerQuantity, custom, shippingDetails, priceMode);
    }

    /**
     * builds CustomLineItem without checking for non-null required values
     * @return CustomLineItem
     */
    public CustomLineItem buildUnchecked() {
        return new CustomLineItemImpl(id, name, money, taxedPrice, totalPrice, slug, quantity, state, taxCategory,
            taxRate, perMethodTaxRate, discountedPricePerQuantity, custom, shippingDetails, priceMode);
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
        builder.name = template.getName();
        builder.money = template.getMoney();
        builder.taxedPrice = template.getTaxedPrice();
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
        return builder;
    }

}
