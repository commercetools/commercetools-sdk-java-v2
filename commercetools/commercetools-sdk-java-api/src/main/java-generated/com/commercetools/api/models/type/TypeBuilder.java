
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Type type = Type.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .plusResourceTypeIds(resourceTypeIdsBuilder -> resourceTypeIdsBuilder)
 *             .plusFieldDefinitions(fieldDefinitionsBuilder -> fieldDefinitionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeBuilder implements Builder<Type> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;

    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    /**
     *  <p>Unique identifier of the Type.</p>
     * @param id
     * @return Builder
     */

    public TypeBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Type.</p>
     * @param version
     * @return Builder
     */

    public TypeBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Type was initially created.</p>
     * @param createdAt
     * @return Builder
     */

    public TypeBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Type was last updated.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public TypeBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public TypeBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public TypeBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public TypeBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public TypeBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Type.</p>
     * @param key
     * @return Builder
     */

    public TypeBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Type.</p>
     * @return Builder
     */

    public TypeBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Type.</p>
     * @param name
     * @return Builder
     */

    public TypeBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Type.</p>
     * @return Builder
     */

    public TypeBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Type.</p>
     * @param description
     * @return Builder
     */

    public TypeBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds
     * @return Builder
     */

    public TypeBuilder resourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds
     * @return Builder
     */

    public TypeBuilder resourceTypeIds(
            final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds
     * @return Builder
     */

    public TypeBuilder plusResourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        if (this.resourceTypeIds == null) {
            this.resourceTypeIds = new ArrayList<>();
        }
        this.resourceTypeIds.addAll(Arrays.asList(resourceTypeIds));
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions
     * @return Builder
     */

    public TypeBuilder fieldDefinitions(final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions
     * @return Builder
     */

    public TypeBuilder fieldDefinitions(
            final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions
     * @return Builder
     */

    public TypeBuilder plusFieldDefinitions(
            final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions.addAll(Arrays.asList(fieldDefinitions));
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @return Builder
     */

    public TypeBuilder plusFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions.add(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @return Builder
     */

    public TypeBuilder withFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        this.fieldDefinitions = new ArrayList<>();
        this.fieldDefinitions.add(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build());
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

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds() {
        return this.resourceTypeIds;
    }

    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    public Type build() {
        Objects.requireNonNull(id, Type.class + ": id is missing");
        Objects.requireNonNull(version, Type.class + ": version is missing");
        Objects.requireNonNull(createdAt, Type.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Type.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, Type.class + ": key is missing");
        Objects.requireNonNull(name, Type.class + ": name is missing");
        Objects.requireNonNull(resourceTypeIds, Type.class + ": resourceTypeIds is missing");
        Objects.requireNonNull(fieldDefinitions, Type.class + ": fieldDefinitions is missing");
        return new TypeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description,
            resourceTypeIds, fieldDefinitions);
    }

    /**
     * builds Type without checking for non null required values
     */
    public Type buildUnchecked() {
        return new TypeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description,
            resourceTypeIds, fieldDefinitions);
    }

    public static TypeBuilder of() {
        return new TypeBuilder();
    }

    public static TypeBuilder of(final Type template) {
        TypeBuilder builder = new TypeBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.resourceTypeIds = template.getResourceTypeIds();
        builder.fieldDefinitions = template.getFieldDefinitions();
        return builder;
    }

}
