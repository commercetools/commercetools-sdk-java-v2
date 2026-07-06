
package com.commercetools.api.models.discount_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroup discountGroup = DiscountGroup.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupBuilder implements Builder<DiscountGroup> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private String sortOrder;

    private Boolean isActive;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the DiscountGroup.</p>
     * @param id value to be set
     * @return Builder
     */

    public DiscountGroupBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the DiscountGroup.</p>
     * @param version value to be set
     * @return Builder
     */

    public DiscountGroupBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the DiscountGroup was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public DiscountGroupBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the DiscountGroup was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public DiscountGroupBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountGroupBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountGroupBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountGroupBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the DiscountGroup.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountGroupBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the DiscountGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountGroupBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the DiscountGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountGroupBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the DiscountGroup.</p>
     * @param description value to be set
     * @return Builder
     */

    public DiscountGroupBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup is applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>The sort order is unique among all DiscountGroups and CartDiscounts.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public DiscountGroupBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public DiscountGroupBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the DiscountGroup.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public DiscountGroupBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the DiscountGroup.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public DiscountGroupBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the DiscountGroup.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public DiscountGroupBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the DiscountGroup.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public DiscountGroupBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the DiscountGroup.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public DiscountGroupBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the DiscountGroup.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public DiscountGroupBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the DiscountGroup.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the DiscountGroup.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the DiscountGroup was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the DiscountGroup was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier of the DiscountGroup.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the DiscountGroup.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup is applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>The sort order is unique among all DiscountGroups and CartDiscounts.</p>
     * @return sortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @return isActive
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>IDs and references that last modified the DiscountGroup.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the DiscountGroup.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     * builds DiscountGroup with checking for non-null required values
     * @return DiscountGroup
     */
    public DiscountGroup build() {
        Objects.requireNonNull(id, DiscountGroup.class + ": id is missing");
        Objects.requireNonNull(version, DiscountGroup.class + ": version is missing");
        Objects.requireNonNull(createdAt, DiscountGroup.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, DiscountGroup.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, DiscountGroup.class + ": key is missing");
        Objects.requireNonNull(sortOrder, DiscountGroup.class + ": sortOrder is missing");
        Objects.requireNonNull(isActive, DiscountGroup.class + ": isActive is missing");
        return new DiscountGroupImpl(id, version, createdAt, lastModifiedAt, name, key, description, sortOrder,
            isActive, lastModifiedBy, createdBy);
    }

    /**
     * builds DiscountGroup without checking for non-null required values
     * @return DiscountGroup
     */
    public DiscountGroup buildUnchecked() {
        return new DiscountGroupImpl(id, version, createdAt, lastModifiedAt, name, key, description, sortOrder,
            isActive, lastModifiedBy, createdBy);
    }

    /**
     * factory method for an instance of DiscountGroupBuilder
     * @return builder
     */
    public static DiscountGroupBuilder of() {
        return new DiscountGroupBuilder();
    }

    /**
     * create builder for DiscountGroup instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupBuilder of(final DiscountGroup template) {
        DiscountGroupBuilder builder = new DiscountGroupBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
