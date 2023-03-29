
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeDraft
 *
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
@JsonDeserialize(as = TypeDraftImpl.class)
public interface TypeDraft extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<TypeDraft> {

    /**
     *  <p>User-defined unique identifier for the Type.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Type.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the Type.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @return resourceTypeIds
     */
    @NotNull
    @JsonProperty("resourceTypeIds")
    public List<ResourceTypeId> getResourceTypeIds();

    /**
     *  <p>Defines Custom Fields.</p>
     * @return fieldDefinitions
     */
    @Valid
    @JsonProperty("fieldDefinitions")
    public List<FieldDefinition> getFieldDefinitions();

    /**
     *  <p>User-defined unique identifier for the Type.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Type.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the Type.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds values to be set
     */

    @JsonIgnore
    public void setResourceTypeIds(final ResourceTypeId... resourceTypeIds);

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     * @param resourceTypeIds values to be set
     */

    public void setResourceTypeIds(final List<ResourceTypeId> resourceTypeIds);

    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions values to be set
     */

    @JsonIgnore
    public void setFieldDefinitions(final FieldDefinition... fieldDefinitions);

    /**
     *  <p>Defines Custom Fields.</p>
     * @param fieldDefinitions values to be set
     */

    public void setFieldDefinitions(final List<FieldDefinition> fieldDefinitions);

    /**
     * factory method
     * @return instance of TypeDraft
     */
    public static TypeDraft of() {
        return new TypeDraftImpl();
    }

    /**
     * factory method to create a shallow copy TypeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeDraft of(final TypeDraft template) {
        TypeDraftImpl instance = new TypeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setResourceTypeIds(template.getResourceTypeIds());
        instance.setFieldDefinitions(template.getFieldDefinitions());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeDraft deepCopy(@Nullable final TypeDraft template) {
        if (template == null) {
            return null;
        }
        TypeDraftImpl instance = new TypeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setResourceTypeIds(
            Optional.ofNullable(template.getResourceTypeIds()).map(ArrayList::new).orElse(null));
        instance.setFieldDefinitions(Optional.ofNullable(template.getFieldDefinitions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.type.FieldDefinition::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeDraft
     * @return builder
     */
    public static TypeDraftBuilder builder() {
        return TypeDraftBuilder.of();
    }

    /**
     * create builder for TypeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeDraftBuilder builder(final TypeDraft template) {
        return TypeDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeDraft(Function<TypeDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TypeDraft>";
            }
        };
    }
}
