
package com.commercetools.api.models.product_discount;

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
import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscount
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscount productDiscount = ProductDiscount.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .predicate("{predicate}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountImpl.class)
public interface ProductDiscount
        extends BaseResource, ProductDiscountMixin, com.commercetools.api.models.DomainResource<ProductDiscount>,
        com.commercetools.api.models.Referencable<ProductDiscount>,
        com.commercetools.api.models.ResourceIdentifiable<ProductDiscount>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the ProductDiscount.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the ProductDiscount.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the ProductDiscount was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ProductDiscount was last updated.</p>
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
     *  <p>Name of the ProductDiscount.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier of the ProductDiscount.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValue getValue();

    /**
     *  <p>Valid ProductDiscount predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Unique decimal value between 0 and 1 (stored as String literal) defining the order of Product Discounts to apply in case more than one is applicable and active. A Product Discount with a higher value is prioritized.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>If <code>true</code> the Product Discount is applied to Products matching the <code>predicate</code>.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @return references
     */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take Eventual Consistency into account for calculated discount values.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Unique identifier of the ProductDiscount.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the ProductDiscount.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the ProductDiscount was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ProductDiscount was last updated.</p>
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
     *  <p>Name of the ProductDiscount.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier of the ProductDiscount.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @param value value to be set
     */

    public void setValue(final ProductDiscountValue value);

    /**
     *  <p>Valid ProductDiscount predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Unique decimal value between 0 and 1 (stored as String literal) defining the order of Product Discounts to apply in case more than one is applicable and active. A Product Discount with a higher value is prioritized.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <p>If <code>true</code> the Product Discount is applied to Products matching the <code>predicate</code>.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @param references values to be set
     */

    @JsonIgnore
    public void setReferences(final Reference... references);

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     * @param references values to be set
     */

    public void setReferences(final List<Reference> references);

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take Eventual Consistency into account for calculated discount values.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of ProductDiscount
     */
    public static ProductDiscount of() {
        return new ProductDiscountImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscount
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscount of(final ProductDiscount template) {
        ProductDiscountImpl instance = new ProductDiscountImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setValue(template.getValue());
        instance.setPredicate(template.getPredicate());
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setReferences(template.getReferences());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscount
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscount deepCopy(@Nullable final ProductDiscount template) {
        if (template == null) {
            return null;
        }
        ProductDiscountImpl instance = new ProductDiscountImpl();
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
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setKey(template.getKey());
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(com.commercetools.api.models.product_discount.ProductDiscountValue::deepCopy)
                .orElse(null));
        instance.setPredicate(template.getPredicate());
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setReferences(Optional.ofNullable(template.getReferences())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Reference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for ProductDiscount
     * @return builder
     */
    public static ProductDiscountBuilder builder() {
        return ProductDiscountBuilder.of();
    }

    /**
     * create builder for ProductDiscount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountBuilder builder(final ProductDiscount template) {
        return ProductDiscountBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscount(Function<ProductDiscount, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.PRODUCT_DISCOUNT;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscount>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscount>";
            }
        };
    }
}
