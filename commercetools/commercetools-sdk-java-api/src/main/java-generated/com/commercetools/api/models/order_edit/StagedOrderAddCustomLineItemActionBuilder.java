
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddCustomLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddCustomLineItemAction stagedOrderAddCustomLineItemAction = StagedOrderAddCustomLineItemAction.builder()
 *             .money(moneyBuilder -> moneyBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug("{slug}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddCustomLineItemActionBuilder implements Builder<StagedOrderAddCustomLineItemAction> {

    private com.commercetools.api.models.common.Money money;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private Long quantity;

    private String slug;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder withMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param money value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * set the value to the slug
     * @param slug value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @param priceMode value to be set
     * @return Builder
     */

    public StagedOrderAddCustomLineItemActionBuilder priceMode(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @return money
     */

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * value of quantity}
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * value of slug}
     * @return slug
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @return priceMode
     */

    @Nullable
    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     * builds StagedOrderAddCustomLineItemAction with checking for non-null required values
     * @return StagedOrderAddCustomLineItemAction
     */
    public StagedOrderAddCustomLineItemAction build() {
        Objects.requireNonNull(money, StagedOrderAddCustomLineItemAction.class + ": money is missing");
        Objects.requireNonNull(name, StagedOrderAddCustomLineItemAction.class + ": name is missing");
        Objects.requireNonNull(slug, StagedOrderAddCustomLineItemAction.class + ": slug is missing");
        return new StagedOrderAddCustomLineItemActionImpl(money, name, quantity, slug, taxCategory, custom,
            externalTaxRate, priceMode);
    }

    /**
     * builds StagedOrderAddCustomLineItemAction without checking for non-null required values
     * @return StagedOrderAddCustomLineItemAction
     */
    public StagedOrderAddCustomLineItemAction buildUnchecked() {
        return new StagedOrderAddCustomLineItemActionImpl(money, name, quantity, slug, taxCategory, custom,
            externalTaxRate, priceMode);
    }

    /**
     * factory method for an instance of StagedOrderAddCustomLineItemActionBuilder
     * @return builder
     */
    public static StagedOrderAddCustomLineItemActionBuilder of() {
        return new StagedOrderAddCustomLineItemActionBuilder();
    }

    /**
     * create builder for StagedOrderAddCustomLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddCustomLineItemActionBuilder of(final StagedOrderAddCustomLineItemAction template) {
        StagedOrderAddCustomLineItemActionBuilder builder = new StagedOrderAddCustomLineItemActionBuilder();
        builder.money = template.getMoney();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        builder.slug = template.getSlug();
        builder.taxCategory = template.getTaxCategory();
        builder.custom = template.getCustom();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
