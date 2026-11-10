
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroup customerGroup = CustomerGroup.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupBuilder implements Builder<CustomerGroup> {

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

    private String name;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the CustomerGroup.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerGroupBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the CustomerGroup.</p>
     * @param version value to be set
     * @return Builder
     */

    public CustomerGroupBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomerGroup was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CustomerGroupBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomerGroup was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CustomerGroupBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CustomerGroup.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CustomerGroupBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CustomerGroup.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CustomerGroupBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CustomerGroup.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public CustomerGroupBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the CustomerGroup.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CustomerGroupBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the CustomerGroup.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CustomerGroupBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the CustomerGroup.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public CustomerGroupBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomerGroupBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique name of the CustomerGroup.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerGroupBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Custom Fields of the CustomerGroup.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomerGroupBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the CustomerGroup.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomerGroupBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the CustomerGroup.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomerGroupBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Unique identifier of the CustomerGroup.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the CustomerGroup.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the CustomerGroup was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the CustomerGroup was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the CustomerGroup.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the CustomerGroup.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique name of the CustomerGroup.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Custom Fields of the CustomerGroup.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds CustomerGroup with checking for non-null required values
     * @return CustomerGroup
     */
    public CustomerGroup build() {
        Objects.requireNonNull(id, CustomerGroup.class + ": id is missing");
        Objects.requireNonNull(version, CustomerGroup.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomerGroup.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CustomerGroup.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, CustomerGroup.class + ": name is missing");
        return new CustomerGroupImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            custom);
    }

    /**
     * builds CustomerGroup without checking for non-null required values
     * @return CustomerGroup
     */
    public CustomerGroup buildUnchecked() {
        return new CustomerGroupImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            custom);
    }

    /**
     * factory method for an instance of CustomerGroupBuilder
     * @return builder
     */
    public static CustomerGroupBuilder of() {
        return new CustomerGroupBuilder();
    }

    /**
     * create builder for CustomerGroup instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupBuilder of(final CustomerGroup template) {
        CustomerGroupBuilder builder = new CustomerGroupBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.custom = template.getCustom();
        return builder;
    }

}
