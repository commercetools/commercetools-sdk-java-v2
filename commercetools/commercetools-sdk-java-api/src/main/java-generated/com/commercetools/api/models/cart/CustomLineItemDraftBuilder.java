
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemDraft customLineItemDraft = CustomLineItemDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .slug("{slug}")
 *             .priceMode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemDraftBuilder implements Builder<CustomLineItemDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private Long quantity;

    private com.commercetools.api.models.common.Money money;

    private String slug;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items to add to the Cart.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemDraftBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
     * @param money value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode. This field is required for <code>Platform</code> TaxMode.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode. This field is required for <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CustomLineItemDraftBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Custom Fields for the Custom Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Custom Line Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemDraftBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
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

    public CustomLineItemDraftBuilder priceMode(
            final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public String getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     * builds CustomLineItemDraft with checking for non-null required values
     * @return CustomLineItemDraft
     */
    public CustomLineItemDraft build() {
        Objects.requireNonNull(name, CustomLineItemDraft.class + ": name is missing");
        Objects.requireNonNull(money, CustomLineItemDraft.class + ": money is missing");
        Objects.requireNonNull(slug, CustomLineItemDraft.class + ": slug is missing");
        Objects.requireNonNull(priceMode, CustomLineItemDraft.class + ": priceMode is missing");
        return new CustomLineItemDraftImpl(name, quantity, money, slug, taxCategory, externalTaxRate, custom,
            shippingDetails, priceMode);
    }

    /**
     * builds CustomLineItemDraft without checking for non-null required values
     * @return CustomLineItemDraft
     */
    public CustomLineItemDraft buildUnchecked() {
        return new CustomLineItemDraftImpl(name, quantity, money, slug, taxCategory, externalTaxRate, custom,
            shippingDetails, priceMode);
    }

    public static CustomLineItemDraftBuilder of() {
        return new CustomLineItemDraftBuilder();
    }

    public static CustomLineItemDraftBuilder of(final CustomLineItemDraft template) {
        CustomLineItemDraftBuilder builder = new CustomLineItemDraftBuilder();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        builder.money = template.getMoney();
        builder.slug = template.getSlug();
        builder.taxCategory = template.getTaxCategory();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
