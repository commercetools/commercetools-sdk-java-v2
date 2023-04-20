
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeDraft typeDraft = TypeDraft.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .plusResourceTypeIds(resourceTypeIdsBuilder -> resourceTypeIdsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeDraftBuilder implements Builder<TypeDraft> {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;

    @Nullable
    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    /**
     *  <p>User-defined unique identifier for the Type.</p>
     * @param key value to be set
     * @return Builder
     */

    public TypeDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Type.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public TypeDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Type.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public TypeDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public TypeDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Type.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public TypeDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Type.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public TypeDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Type.</p>
     * @param description value to be set
     * @return Builder
     */

    public TypeDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */

    public TypeDraftBuilder resourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */

    public TypeDraftBuilder resourceTypeIds(
            final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds value to be set
     * @return Builder
     */

    public TypeDraftBuilder plusResourceTypeIds(
            final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
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

    public TypeDraftBuilder fieldDefinitions(
            @Nullable final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */

    public TypeDraftBuilder fieldDefinitions(
            @Nullable final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions value to be set
     * @return Builder
     */

    public TypeDraftBuilder plusFieldDefinitions(
            @Nullable final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
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

    public TypeDraftBuilder plusFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
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

    public TypeDraftBuilder withFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        this.fieldDefinitions = new ArrayList<>();
        this.fieldDefinitions.add(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */

    public TypeDraftBuilder addFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinition> builder) {
        return plusFieldDefinitions(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()));
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @param builder function to build the fieldDefinitions value
     * @return Builder
     */

    public TypeDraftBuilder setFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinition> builder) {
        return fieldDefinitions(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier for the Type.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Type.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Type.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @return resourceTypeIds
     */

    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds() {
        return this.resourceTypeIds;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     * @return fieldDefinitions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    /**
     * builds TypeDraft with checking for non-null required values
     * @return TypeDraft
     */
    public TypeDraft build() {
        Objects.requireNonNull(key, TypeDraft.class + ": key is missing");
        Objects.requireNonNull(name, TypeDraft.class + ": name is missing");
        Objects.requireNonNull(resourceTypeIds, TypeDraft.class + ": resourceTypeIds is missing");
        return new TypeDraftImpl(key, name, description, resourceTypeIds, fieldDefinitions);
    }

    /**
     * builds TypeDraft without checking for non-null required values
     * @return TypeDraft
     */
    public TypeDraft buildUnchecked() {
        return new TypeDraftImpl(key, name, description, resourceTypeIds, fieldDefinitions);
    }

    /**
     * factory method for an instance of TypeDraftBuilder
     * @return builder
     */
    public static TypeDraftBuilder of() {
        return new TypeDraftBuilder();
    }

    /**
     * create builder for TypeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeDraftBuilder of(final TypeDraft template) {
        TypeDraftBuilder builder = new TypeDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.resourceTypeIds = template.getResourceTypeIds();
        builder.fieldDefinitions = template.getFieldDefinitions();
        return builder;
    }

}
