
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelection productSelection = ProductSelection.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .productCount(0.3)
 *             .mode(ProductSelectionMode.INDIVIDUAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionBuilder implements Builder<ProductSelection> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private Integer productCount;

    private com.commercetools.api.models.product_selection.ProductSelectionMode mode;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the ProductSelection.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductSelectionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ProductSelection.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductSelectionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductSelection was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ProductSelectionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductSelection was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ProductSelectionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductSelectionBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductSelectionBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ProductSelectionBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductSelectionBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductSelectionBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ProductSelectionBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ProductSelection.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSelectionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the ProductSelection.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductSelectionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ProductSelection.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductSelectionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the ProductSelection.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSelectionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Number of Products that are currently assigned to this ProductSelection.</p>
     * @param productCount value to be set
     * @return Builder
     */

    public ProductSelectionBuilder productCount(final Integer productCount) {
        this.productCount = productCount;
        return this;
    }

    /**
     *  <p>Specifies in which way the Products are assigned to the ProductSelection. Currently, the only way of doing this is to specify each Product individually, either by including or excluding them explicitly.</p>
     * @param mode value to be set
     * @return Builder
     */

    public ProductSelectionBuilder mode(
            final com.commercetools.api.models.product_selection.ProductSelectionMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <p>Custom Fields of the ProductSelection.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ProductSelectionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the ProductSelection.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ProductSelectionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the ProductSelection.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ProductSelectionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Unique identifier of the ProductSelection.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the ProductSelection.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ProductSelection was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ProductSelection was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the ProductSelection.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the ProductSelection.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Number of Products that are currently assigned to this ProductSelection.</p>
     * @return productCount
     */

    public Integer getProductCount() {
        return this.productCount;
    }

    /**
     *  <p>Specifies in which way the Products are assigned to the ProductSelection. Currently, the only way of doing this is to specify each Product individually, either by including or excluding them explicitly.</p>
     * @return mode
     */

    public com.commercetools.api.models.product_selection.ProductSelectionMode getMode() {
        return this.mode;
    }

    /**
     *  <p>Custom Fields of the ProductSelection.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds ProductSelection with checking for non-null required values
     * @return ProductSelection
     */
    public ProductSelection build() {
        Objects.requireNonNull(id, ProductSelection.class + ": id is missing");
        Objects.requireNonNull(version, ProductSelection.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductSelection.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductSelection.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ProductSelection.class + ": name is missing");
        Objects.requireNonNull(productCount, ProductSelection.class + ": productCount is missing");
        Objects.requireNonNull(mode, ProductSelection.class + ": mode is missing");
        return new ProductSelectionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            productCount, mode, custom);
    }

    /**
     * builds ProductSelection without checking for non-null required values
     * @return ProductSelection
     */
    public ProductSelection buildUnchecked() {
        return new ProductSelectionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            productCount, mode, custom);
    }

    /**
     * factory method for an instance of ProductSelectionBuilder
     * @return builder
     */
    public static ProductSelectionBuilder of() {
        return new ProductSelectionBuilder();
    }

    /**
     * create builder for ProductSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionBuilder of(final ProductSelection template) {
        ProductSelectionBuilder builder = new ProductSelectionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.productCount = template.getProductCount();
        builder.mode = template.getMode();
        builder.custom = template.getCustom();
        return builder;
    }

}
