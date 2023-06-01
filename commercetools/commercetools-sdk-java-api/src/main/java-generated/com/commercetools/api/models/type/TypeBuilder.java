package com.commercetools.api.models.type;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.ResourceTypeId;
import java.time.ZonedDateTime;
import com.commercetools.api.models.type.Type;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
     * @param id value to be set
     * @return Builder
     */
    
    public TypeBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Current version of the Type.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public TypeBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Type was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public TypeBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Type was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public TypeBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public TypeBuilder lastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public TypeBuilder withLastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */
    
    public TypeBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public TypeBuilder createdBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public TypeBuilder withCreatedBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */
    
    public TypeBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the Type.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public TypeBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Type.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TypeBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Name of the Type.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TypeBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Name of the Type.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public TypeBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the Type.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public TypeBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Description of the Type.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public TypeBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Description of the Type.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public TypeBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */
    
    public TypeBuilder resourceTypeIds( final com.commercetools.api.models.type.ResourceTypeId ...resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
        return this;
    }
    
    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */
    
    public TypeBuilder resourceTypeIds( final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
        return this;
    }
    
    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */
    
    public TypeBuilder plusResourceTypeIds( final com.commercetools.api.models.type.ResourceTypeId ...resourceTypeIds) {
        if (this.resourceTypeIds == null) {
            this.resourceTypeIds = new ArrayList<>();
        }
        this.resourceTypeIds.addAll(Arrays.asList(resourceTypeIds));
        return this;
    }
    
    
    
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */
    
    public TypeBuilder fieldDefinitions( final com.commercetools.api.models.type.FieldDefinition ...fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
        return this;
    }
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */
    
    public TypeBuilder fieldDefinitions( final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */
    
    public TypeBuilder plusFieldDefinitions( final com.commercetools.api.models.type.FieldDefinition ...fieldDefinitions) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions.addAll(Arrays.asList(fieldDefinitions));
        return this;
    }
    
    
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */
    
    public TypeBuilder plusFieldDefinitions(Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions.add(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */
    
    public TypeBuilder withFieldDefinitions(Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        this.fieldDefinitions = new ArrayList<>();
        this.fieldDefinitions.add(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */
    
    public TypeBuilder addFieldDefinitions(Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinition> builder) {
        return plusFieldDefinitions(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()));
    }
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */
    
    public TypeBuilder setFieldDefinitions(Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinition> builder) {
        return fieldDefinitions(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()));
    }
                    

    /**
     *  <p>Unique identifier of the Type.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Current version of the Type.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the Type was initially created.</p>
     * @return createdAt
     */
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Date and time (UTC) the Type was last updated.</p>
     * @return lastModifiedAt
     */
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
     *  <p>User-defined unique identifier of the Type.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Name of the Type.</p>
     * @return name
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Description of the Type.</p>
     * @return description
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @return resourceTypeIds
     */
    
    
    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds(){
        return this.resourceTypeIds;
    }
    
    /**
     *  <p>Defines Custom Fields.</p>
     * @return fieldDefinitions
     */
    
    
    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions(){
        return this.fieldDefinitions;
    }

    /**
     * builds Type with checking for non-null required values
     * @return Type
     */
    public Type build() {
        Objects.requireNonNull(id, Type.class + ": id is missing");
        Objects.requireNonNull(version, Type.class + ": version is missing");
        Objects.requireNonNull(createdAt, Type.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Type.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, Type.class + ": key is missing");
        Objects.requireNonNull(name, Type.class + ": name is missing");
        Objects.requireNonNull(resourceTypeIds, Type.class + ": resourceTypeIds is missing");
        Objects.requireNonNull(fieldDefinitions, Type.class + ": fieldDefinitions is missing");
        return new TypeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description, resourceTypeIds, fieldDefinitions);
    }
    
    /**
     * builds Type without checking for non-null required values
     * @return Type
     */
    public Type buildUnchecked() {
        return new TypeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description, resourceTypeIds, fieldDefinitions);
    }

    /**
     * factory method for an instance of TypeBuilder
     * @return builder 
     */
    public static TypeBuilder of() {
        return new TypeBuilder();
    }

    /**
     * create builder for Type instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
