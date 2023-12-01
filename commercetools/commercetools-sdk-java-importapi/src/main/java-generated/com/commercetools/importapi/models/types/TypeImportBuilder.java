
package com.commercetools.importapi.models.types;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeImport typeImport = TypeImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .plusResourceTypeIds(resourceTypeIdsBuilder -> resourceTypeIdsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeImportBuilder implements Builder<TypeImport> {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;

    private java.util.List<com.commercetools.importapi.models.types.ResourceTypeId> resourceTypeIds;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.types.FieldDefinition> fieldDefinitions;

    /**
     *  <p>User-defined unique identifier for the Type. If a Type with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public TypeImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>Type.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public TypeImportBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Type.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public TypeImportBuilder withName(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Type.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public TypeImportBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>Type.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public TypeImportBuilder description(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Type.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public TypeImportBuilder withDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Type.description</code>.</p>
     * @param description value to be set
     * @return Builder
     */

    public TypeImportBuilder description(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */

    public TypeImportBuilder resourceTypeIds(
            final com.commercetools.importapi.models.types.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
        return this;
    }

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */

    public TypeImportBuilder resourceTypeIds(
            final java.util.List<com.commercetools.importapi.models.types.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
        return this;
    }

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */

    public TypeImportBuilder plusResourceTypeIds(
            final com.commercetools.importapi.models.types.ResourceTypeId... resourceTypeIds) {
        if (this.resourceTypeIds == null) {
            this.resourceTypeIds = new ArrayList<>();
        }
        this.resourceTypeIds.addAll(Arrays.asList(resourceTypeIds));
        return this;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */

    public TypeImportBuilder fieldDefinitions(
            @Nullable final com.commercetools.importapi.models.types.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
        return this;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */

    public TypeImportBuilder fieldDefinitions(
            @Nullable final java.util.List<com.commercetools.importapi.models.types.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */

    public TypeImportBuilder plusFieldDefinitions(
            @Nullable final com.commercetools.importapi.models.types.FieldDefinition... fieldDefinitions) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions.addAll(Arrays.asList(fieldDefinitions));
        return this;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */

    public TypeImportBuilder plusFieldDefinitions(
            Function<com.commercetools.importapi.models.types.FieldDefinitionBuilder, com.commercetools.importapi.models.types.FieldDefinitionBuilder> builder) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions
                .add(builder.apply(com.commercetools.importapi.models.types.FieldDefinitionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */

    public TypeImportBuilder withFieldDefinitions(
            Function<com.commercetools.importapi.models.types.FieldDefinitionBuilder, com.commercetools.importapi.models.types.FieldDefinitionBuilder> builder) {
        this.fieldDefinitions = new ArrayList<>();
        this.fieldDefinitions
                .add(builder.apply(com.commercetools.importapi.models.types.FieldDefinitionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */

    public TypeImportBuilder addFieldDefinitions(
            Function<com.commercetools.importapi.models.types.FieldDefinitionBuilder, com.commercetools.importapi.models.types.FieldDefinition> builder) {
        return plusFieldDefinitions(
            builder.apply(com.commercetools.importapi.models.types.FieldDefinitionBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */

    public TypeImportBuilder setFieldDefinitions(
            Function<com.commercetools.importapi.models.types.FieldDefinitionBuilder, com.commercetools.importapi.models.types.FieldDefinition> builder) {
        return fieldDefinitions(builder.apply(com.commercetools.importapi.models.types.FieldDefinitionBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier for the Type. If a Type with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>Type.name</code>.</p>
     * @return name
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>Type.description</code>.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     * @return resourceTypeIds
     */

    public java.util.List<com.commercetools.importapi.models.types.ResourceTypeId> getResourceTypeIds() {
        return this.resourceTypeIds;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @return fieldDefinitions
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.types.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    /**
     * builds TypeImport with checking for non-null required values
     * @return TypeImport
     */
    public TypeImport build() {
        Objects.requireNonNull(key, TypeImport.class + ": key is missing");
        Objects.requireNonNull(name, TypeImport.class + ": name is missing");
        Objects.requireNonNull(resourceTypeIds, TypeImport.class + ": resourceTypeIds is missing");
        return new TypeImportImpl(key, name, description, resourceTypeIds, fieldDefinitions);
    }

    /**
     * builds TypeImport without checking for non-null required values
     * @return TypeImport
     */
    public TypeImport buildUnchecked() {
        return new TypeImportImpl(key, name, description, resourceTypeIds, fieldDefinitions);
    }

    /**
     * factory method for an instance of TypeImportBuilder
     * @return builder
     */
    public static TypeImportBuilder of() {
        return new TypeImportBuilder();
    }

    /**
     * create builder for TypeImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeImportBuilder of(final TypeImport template) {
        TypeImportBuilder builder = new TypeImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.resourceTypeIds = template.getResourceTypeIds();
        builder.fieldDefinitions = template.getFieldDefinitions();
        return builder;
    }

}
