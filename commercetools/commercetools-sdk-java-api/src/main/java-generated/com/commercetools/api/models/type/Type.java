
package com.commercetools.api.models.type;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Type
 *
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
@JsonDeserialize(as = TypeImpl.class)
public interface Type extends BaseResource, TypeMixin, com.commercetools.api.models.DomainResource<Type>,
        com.commercetools.api.models.Referencable<Type>, com.commercetools.api.models.ResourceIdentifiable<Type>,
        com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Type.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Type.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Type was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Type was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Type.</p>
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
    @NotNull
    @Valid
    @JsonProperty("fieldDefinitions")
    public List<FieldDefinition> getFieldDefinitions();

    /**
     *  <p>Unique identifier of the Type.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Type.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Type was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Type was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the Type.</p>
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
     * @return instance of Type
     */
    public static Type of() {
        return new TypeImpl();
    }

    /**
     * factory method to create a shallow copy Type
     * @param template instance to be copied
     * @return copy instance
     */
    public static Type of(final Type template) {
        TypeImpl instance = new TypeImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setResourceTypeIds(template.getResourceTypeIds());
        instance.setFieldDefinitions(template.getFieldDefinitions());
        return instance;
    }

    /**
     * factory method to create a deep copy of Type
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Type deepCopy(@Nullable final Type template) {
        if (template == null) {
            return null;
        }
        TypeImpl instance = new TypeImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
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
     * builder factory method for Type
     * @return builder
     */
    public static TypeBuilder builder() {
        return TypeBuilder.of();
    }

    /**
     * create builder for Type instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeBuilder builder(final Type template) {
        return TypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withType(Function<Type, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.TYPE;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Type> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Type>() {
            @Override
            public String toString() {
                return "TypeReference<Type>";
            }
        };
    }
}
