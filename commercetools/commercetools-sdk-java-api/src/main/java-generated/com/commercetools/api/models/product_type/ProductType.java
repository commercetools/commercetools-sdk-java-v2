
package com.commercetools.api.models.product_type;

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
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductType productType = ProductType.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeImpl.class)
public interface ProductType extends BaseResource, AttributeDefinitionContainer, ProductTypeMixin,
        com.commercetools.api.models.DomainResource<ProductType>,
        com.commercetools.api.models.Referencable<ProductType>,
        com.commercetools.api.models.ResourceIdentifiable<ProductType>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the ProductType.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the ProductType.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the ProductType was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ProductType was last updated.</p>
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
     *  <p>User-defined unique identifier of the ProductType.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the ProductType.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Description of the ProductType.</p>
     * @return description
     */
    @NotNull
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Attributes specified for the ProductType.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinition> getAttributes();

    /**
     *  <p>Unique identifier of the ProductType.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the ProductType.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the ProductType was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ProductType was last updated.</p>
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
     *  <p>User-defined unique identifier of the ProductType.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the ProductType.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Description of the ProductType.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Attributes specified for the ProductType.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final AttributeDefinition... attributes);

    /**
     *  <p>Attributes specified for the ProductType.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<AttributeDefinition> attributes);

    /**
     * factory method
     * @return instance of ProductType
     */
    public static ProductType of() {
        return new ProductTypeImpl();
    }

    /**
     * factory method to create a shallow copy ProductType
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductType of(final ProductType template) {
        ProductTypeImpl instance = new ProductTypeImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductType deepCopy(@Nullable final ProductType template) {
        if (template == null) {
            return null;
        }
        ProductTypeImpl instance = new ProductTypeImpl();
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
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_type.AttributeDefinition::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductType
     * @return builder
     */
    public static ProductTypeBuilder builder() {
        return ProductTypeBuilder.of();
    }

    /**
     * create builder for ProductType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeBuilder builder(final ProductType template) {
        return ProductTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductType(Function<ProductType, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.PRODUCT_TYPE;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductType>() {
            @Override
            public String toString() {
                return "TypeReference<ProductType>";
            }
        };
    }
}
