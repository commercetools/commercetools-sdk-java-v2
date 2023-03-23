
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
     * @param id
     * @return Builder
     */

    public CustomerGroupBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the CustomerGroup.</p>
     * @param version
     * @return Builder
     */

    public CustomerGroupBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomerGroup was initially created.</p>
     * @param createdAt
     * @return Builder
     */

    public CustomerGroupBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomerGroup was last updated.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public CustomerGroupBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public CustomerGroupBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public CustomerGroupBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public CustomerGroupBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public CustomerGroupBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @param key
     * @return Builder
     */

    public CustomerGroupBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique name of the CustomerGroup.</p>
     * @param name
     * @return Builder
     */

    public CustomerGroupBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @return Builder
     */

    public CustomerGroupBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @param custom
     * @return Builder
     */

    public CustomerGroupBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

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
     * builds CustomerGroup without checking for non null required values
     */
    public CustomerGroup buildUnchecked() {
        return new CustomerGroupImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            custom);
    }

    public static CustomerGroupBuilder of() {
        return new CustomerGroupBuilder();
    }

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
