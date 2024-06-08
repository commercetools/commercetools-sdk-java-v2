
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AttributeGroup
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroup attributeGroup = AttributeGroup.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupImpl.class)
public interface AttributeGroup extends BaseResource, com.commercetools.api.models.DomainResource<AttributeGroup>,
        com.commercetools.api.models.WithKey {

    /**
     *  <p>Platform-generated unique identifier of the AttributeGroup.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the AttributeGroup.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the AttributeGroup was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the AttributeGroup was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the AttributeGroup.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the AttributeGroup.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Name of the AttributeGroup.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the AttributeGroup.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Attributes with unique values.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<AttributeReference> getAttributes();

    /**
     *  <p>User-defined unique identifier of the AttributeGroup.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Platform-generated unique identifier of the AttributeGroup.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the AttributeGroup.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the AttributeGroup was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the AttributeGroup was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the AttributeGroup.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the AttributeGroup.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final AttributeReference... attributes);

    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<AttributeReference> attributes);

    /**
     *  <p>User-defined unique identifier of the AttributeGroup.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of AttributeGroup
     */
    public static AttributeGroup of() {
        return new AttributeGroupImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroup
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroup of(final AttributeGroup template) {
        AttributeGroupImpl instance = new AttributeGroupImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeGroup
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroup deepCopy(@Nullable final AttributeGroup template) {
        if (template == null) {
            return null;
        }
        AttributeGroupImpl instance = new AttributeGroupImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.attribute_group.AttributeReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AttributeGroup
     * @return builder
     */
    public static AttributeGroupBuilder builder() {
        return AttributeGroupBuilder.of();
    }

    /**
     * create builder for AttributeGroup instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupBuilder builder(final AttributeGroup template) {
        return AttributeGroupBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroup(Function<AttributeGroup, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroup> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroup>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroup>";
            }
        };
    }
}
