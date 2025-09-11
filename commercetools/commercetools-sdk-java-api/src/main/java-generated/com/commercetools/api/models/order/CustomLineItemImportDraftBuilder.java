
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemImportDraft customLineItemImportDraft = CustomLineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .slug("{slug}")
 *             .quantity(0.3)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemImportDraftBuilder implements Builder<CustomLineItemImportDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    private String slug;

    private Long quantity;

    private com.commercetools.api.models.common.Money money;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. This value should match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>The number of items in the Custom Line Item. Can be a negative value.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The cost of individual items in the Custom Line Item. The amount can be negative.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The cost of individual items in the Custom Line Item. The amount can be negative.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder withMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>The cost of individual items in the Custom Line Item. The amount can be negative.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param money value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder withTaxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder taxRate(
            @Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Include a value to associate a Tax Category with the Custom Line Item.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Include a value to associate a Tax Category with the Custom Line Item.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Include a value to associate a Tax Category with the Custom Line Item.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyCustomLineItemsTarget" rel="nofollow">MultiBuyCustomLineItemsTarget</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @param priceMode value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder priceMode(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder state(
            @Nullable final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder plusState(
            @Nullable final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder addState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder setState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return state(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>Custom Fields of the CustomLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the CustomLineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the CustomLineItem.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomLineItemImportDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
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
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. This value should match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @return slug
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>The number of items in the Custom Line Item. Can be a negative value.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>The cost of individual items in the Custom Line Item. The amount can be negative.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @return money
     */

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Include a value to associate a Tax Category with the Custom Line Item.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyCustomLineItemsTarget" rel="nofollow">MultiBuyCustomLineItemsTarget</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @return priceMode
     */

    @Nullable
    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>State of the Custom Line Items.</p>
     * @return state
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields of the CustomLineItem.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds CustomLineItemImportDraft with checking for non-null required values
     * @return CustomLineItemImportDraft
     */
    public CustomLineItemImportDraft build() {
        Objects.requireNonNull(name, CustomLineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(slug, CustomLineItemImportDraft.class + ": slug is missing");
        Objects.requireNonNull(quantity, CustomLineItemImportDraft.class + ": quantity is missing");
        Objects.requireNonNull(money, CustomLineItemImportDraft.class + ": money is missing");
        return new CustomLineItemImportDraftImpl(name, key, slug, quantity, money, taxRate, taxCategory, priceMode,
            shippingDetails, state, custom);
    }

    /**
     * builds CustomLineItemImportDraft without checking for non-null required values
     * @return CustomLineItemImportDraft
     */
    public CustomLineItemImportDraft buildUnchecked() {
        return new CustomLineItemImportDraftImpl(name, key, slug, quantity, money, taxRate, taxCategory, priceMode,
            shippingDetails, state, custom);
    }

    /**
     * factory method for an instance of CustomLineItemImportDraftBuilder
     * @return builder
     */
    public static CustomLineItemImportDraftBuilder of() {
        return new CustomLineItemImportDraftBuilder();
    }

    /**
     * create builder for CustomLineItemImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemImportDraftBuilder of(final CustomLineItemImportDraft template) {
        CustomLineItemImportDraftBuilder builder = new CustomLineItemImportDraftBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.slug = template.getSlug();
        builder.quantity = template.getQuantity();
        builder.money = template.getMoney();
        builder.taxRate = template.getTaxRate();
        builder.taxCategory = template.getTaxCategory();
        builder.priceMode = template.getPriceMode();
        builder.shippingDetails = template.getShippingDetails();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        return builder;
    }

}
