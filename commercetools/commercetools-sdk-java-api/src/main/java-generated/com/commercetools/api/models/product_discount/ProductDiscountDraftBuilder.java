
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountDraft productDiscountDraft = ProductDiscountDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .predicate("{predicate}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountDraftBuilder implements Builder<ProductDiscountDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.product_discount.ProductDiscountValueDraft value;

    private String predicate;

    private String sortOrder;

    private Boolean isActive;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDiscountDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDiscountDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the ProductDiscount.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDiscountDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDiscountDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ProductDiscountDraftBuilder value(
            Function<com.commercetools.api.models.product_discount.ProductDiscountValueDraftBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountValueDraft>> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_discount.ProductDiscountValueDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Valid <span>ProductDiscount predicate</span>.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Decimal value between 0 and 1 (passed as String literal) that defines the order of ProductDiscounts to apply in case more than one is applicable and active. A ProductDiscount with a higher <code>sortOrder</code> is prioritized. The value must be <strong>unique</strong> among all ProductDiscounts in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> to activate the ProductDiscount, set to <code>false</code> to deactivate it (even though the <code>predicate</code> matches).</p>
     * @param isActive value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take <span>Eventual Consistency</span> into account for calculated discount values.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public ProductDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier for the ProductDiscount.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @return value
     */

    public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue() {
        return this.value;
    }

    /**
     *  <p>Valid <span>ProductDiscount predicate</span>.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Decimal value between 0 and 1 (passed as String literal) that defines the order of ProductDiscounts to apply in case more than one is applicable and active. A ProductDiscount with a higher <code>sortOrder</code> is prioritized. The value must be <strong>unique</strong> among all ProductDiscounts in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @return sortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <p>Set to <code>true</code> to activate the ProductDiscount, set to <code>false</code> to deactivate it (even though the <code>predicate</code> matches).</p>
     * @return isActive
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take <span>Eventual Consistency</span> into account for calculated discount values.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * builds ProductDiscountDraft with checking for non-null required values
     * @return ProductDiscountDraft
     */
    public ProductDiscountDraft build() {
        Objects.requireNonNull(name, ProductDiscountDraft.class + ": name is missing");
        Objects.requireNonNull(value, ProductDiscountDraft.class + ": value is missing");
        Objects.requireNonNull(predicate, ProductDiscountDraft.class + ": predicate is missing");
        Objects.requireNonNull(sortOrder, ProductDiscountDraft.class + ": sortOrder is missing");
        Objects.requireNonNull(isActive, ProductDiscountDraft.class + ": isActive is missing");
        return new ProductDiscountDraftImpl(name, key, description, value, predicate, sortOrder, isActive, validFrom,
            validUntil);
    }

    /**
     * builds ProductDiscountDraft without checking for non-null required values
     * @return ProductDiscountDraft
     */
    public ProductDiscountDraft buildUnchecked() {
        return new ProductDiscountDraftImpl(name, key, description, value, predicate, sortOrder, isActive, validFrom,
            validUntil);
    }

    /**
     * factory method for an instance of ProductDiscountDraftBuilder
     * @return builder
     */
    public static ProductDiscountDraftBuilder of() {
        return new ProductDiscountDraftBuilder();
    }

    /**
     * create builder for ProductDiscountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountDraftBuilder of(final ProductDiscountDraft template) {
        ProductDiscountDraftBuilder builder = new ProductDiscountDraftBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.predicate = template.getPredicate();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
