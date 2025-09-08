
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscount productDiscount = ProductDiscount.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .predicate("{predicate}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountBuilder implements Builder<ProductDiscount> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.product_discount.ProductDiscountValue value;

    private String predicate;

    private String sortOrder;

    private Boolean isActive;

    private java.util.List<com.commercetools.api.models.common.Reference> references;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Unique identifier of the ProductDiscount.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductDiscountBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ProductDiscount.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductDiscountBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductDiscount was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ProductDiscountBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductDiscount was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ProductDiscountBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ProductDiscount.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductDiscountBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ProductDiscount.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductDiscountBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ProductDiscount.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ProductDiscountBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the ProductDiscount.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductDiscountBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the ProductDiscount.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductDiscountBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the ProductDiscount.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ProductDiscountBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDiscountBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDiscountBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductDiscountBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ProductDiscount.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductDiscountBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDiscountBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDiscountBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductDiscountBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductDiscountBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValue value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ProductDiscountBuilder value(
            Function<com.commercetools.api.models.product_discount.ProductDiscountValueBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_discount.ProductDiscountValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Valid <span>ProductDiscount predicate</span>.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ProductDiscountBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Unique decimal value between 0 and 1 (stored as String literal) defining the order of Product Discounts to apply in case more than one is applicable and active. A Product Discount with a higher value is prioritized.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public ProductDiscountBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>If <code>true</code> the Product Discount is applied to Products matching the <code>predicate</code>.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public ProductDiscountBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @param references value to be set
     * @return Builder
     */

    public ProductDiscountBuilder references(final com.commercetools.api.models.common.Reference... references) {
        this.references = new ArrayList<>(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @param references value to be set
     * @return Builder
     */

    public ProductDiscountBuilder references(
            final java.util.List<com.commercetools.api.models.common.Reference> references) {
        this.references = references;
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @param references value to be set
     * @return Builder
     */

    public ProductDiscountBuilder plusReferences(final com.commercetools.api.models.common.Reference... references) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.addAll(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @param builder function to build the references value
     * @return Builder
     */

    public ProductDiscountBuilder plusReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @param builder function to build the references value
     * @return Builder
     */

    public ProductDiscountBuilder withReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.references = new ArrayList<>();
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take <span>Eventual Consistency</span> into account for calculated discount values.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public ProductDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public ProductDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Unique identifier of the ProductDiscount.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the ProductDiscount.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ProductDiscount was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ProductDiscount was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the ProductDiscount.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the ProductDiscount.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier of the ProductDiscount.</p>
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

    public com.commercetools.api.models.product_discount.ProductDiscountValue getValue() {
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
     *  <p>Unique decimal value between 0 and 1 (stored as String literal) defining the order of Product Discounts to apply in case more than one is applicable and active. A Product Discount with a higher value is prioritized.</p>
     * @return sortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <p>If <code>true</code> the Product Discount is applied to Products matching the <code>predicate</code>.</p>
     * @return isActive
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @return references
     */

    public java.util.List<com.commercetools.api.models.common.Reference> getReferences() {
        return this.references;
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
     * builds ProductDiscount with checking for non-null required values
     * @return ProductDiscount
     */
    public ProductDiscount build() {
        Objects.requireNonNull(id, ProductDiscount.class + ": id is missing");
        Objects.requireNonNull(version, ProductDiscount.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductDiscount.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductDiscount.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ProductDiscount.class + ": name is missing");
        Objects.requireNonNull(value, ProductDiscount.class + ": value is missing");
        Objects.requireNonNull(predicate, ProductDiscount.class + ": predicate is missing");
        Objects.requireNonNull(sortOrder, ProductDiscount.class + ": sortOrder is missing");
        Objects.requireNonNull(isActive, ProductDiscount.class + ": isActive is missing");
        Objects.requireNonNull(references, ProductDiscount.class + ": references is missing");
        return new ProductDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, predicate, sortOrder, isActive, references, validFrom, validUntil);
    }

    /**
     * builds ProductDiscount without checking for non-null required values
     * @return ProductDiscount
     */
    public ProductDiscount buildUnchecked() {
        return new ProductDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, predicate, sortOrder, isActive, references, validFrom, validUntil);
    }

    /**
     * factory method for an instance of ProductDiscountBuilder
     * @return builder
     */
    public static ProductDiscountBuilder of() {
        return new ProductDiscountBuilder();
    }

    /**
     * create builder for ProductDiscount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountBuilder of(final ProductDiscount template) {
        ProductDiscountBuilder builder = new ProductDiscountBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.predicate = template.getPredicate();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.references = template.getReferences();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
