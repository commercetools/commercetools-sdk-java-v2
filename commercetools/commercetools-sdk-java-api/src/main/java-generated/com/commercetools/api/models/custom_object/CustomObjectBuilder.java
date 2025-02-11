
package com.commercetools.api.models.custom_object;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObject customObject = CustomObject.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .container("{container}")
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectBuilder implements Builder<CustomObject> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String container;

    private String key;

    private java.lang.Object value;

    /**
     *  <p>Unique identifier of the CustomObject.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomObjectBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the CustomObject.</p>
     * @param version value to be set
     * @return Builder
     */

    public CustomObjectBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomObject was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CustomObjectBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomObject was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CustomObjectBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CustomObject.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CustomObjectBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CustomObject.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CustomObjectBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CustomObject.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public CustomObjectBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the CustomObject.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CustomObjectBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the CustomObject.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CustomObjectBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the CustomObject.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public CustomObjectBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Namespace to group CustomObjects.</p>
     * @param container value to be set
     * @return Builder
     */

    public CustomObjectBuilder container(final String container) {
        this.container = container;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomObjectBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Can be any JSON standard type, such as number, string, boolean, array, object, or a common API data type.</p>
     *  <ul>
     *   <li>For values of type Reference the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</li>
     *  </ul>
     * @param value value to be set
     * @return Builder
     */

    public CustomObjectBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Unique identifier of the CustomObject.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the CustomObject.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the CustomObject was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the CustomObject was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the CustomObject.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the CustomObject.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Namespace to group CustomObjects.</p>
     * @return container
     */

    public String getContainer() {
        return this.container;
    }

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Can be any JSON standard type, such as number, string, boolean, array, object, or a common API data type.</p>
     *  <ul>
     *   <li>For values of type Reference the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</li>
     *  </ul>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds CustomObject with checking for non-null required values
     * @return CustomObject
     */
    public CustomObject build() {
        Objects.requireNonNull(id, CustomObject.class + ": id is missing");
        Objects.requireNonNull(version, CustomObject.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomObject.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CustomObject.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(container, CustomObject.class + ": container is missing");
        Objects.requireNonNull(key, CustomObject.class + ": key is missing");
        Objects.requireNonNull(value, CustomObject.class + ": value is missing");
        return new CustomObjectImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, container, key,
            value);
    }

    /**
     * builds CustomObject without checking for non-null required values
     * @return CustomObject
     */
    public CustomObject buildUnchecked() {
        return new CustomObjectImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, container, key,
            value);
    }

    /**
     * factory method for an instance of CustomObjectBuilder
     * @return builder
     */
    public static CustomObjectBuilder of() {
        return new CustomObjectBuilder();
    }

    /**
     * create builder for CustomObject instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectBuilder of(final CustomObject template) {
        CustomObjectBuilder builder = new CustomObjectBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.container = template.getContainer();
        builder.key = template.getKey();
        builder.value = template.getValue();
        return builder;
    }

}
