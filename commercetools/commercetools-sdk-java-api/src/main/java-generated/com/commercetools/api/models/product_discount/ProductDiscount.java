
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountImpl.class)
public interface ProductDiscount extends BaseResource, com.commercetools.api.models.DomainResource<ProductDiscount>,
        com.commercetools.api.models.Referencable<ProductDiscount>,
        com.commercetools.api.models.ResourceIdentifiable<ProductDiscount> {

    /**
    *  <p>Platform-generated unique identifier of the ProductDiscount.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Current version of the ProductDiscount.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Date and time (UTC) the ProductDiscount was initially created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>Date and time (UTC) the ProductDiscount was last updated.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>Name of the ProductDiscount.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>User-defined unique identifier of the ProductDiscount.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Description of the ProductDiscount.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Type of Discount and its corresponding value.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValue getValue();

    /**
    *  <p>Valid <a href="/../api/projects/predicates#productdiscount-predicates">ProductDiscount predicate</a>.</p>
    */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
    *  <p>Unique decimal value between 0 and 1 (stored as String literal) defining the order of Product Discounts to apply in case more than one is applicable and active.
    *  A Product Discount with a higher value is prioritized.</p>
    */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
    *  <p>If <code>true</code> the Product Discount is applied to Products matching the <code>predicate</code>.</p>
    */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
    *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
    *  <p>Date and time (UTC) from which the Discount is effective.
    *  Take <a href="/../api/general-concepts#eventual-consistency">Eventual Consistency</a> into account for calculated discount values.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Date and time (UTC) until which the Discount is effective.
    *  Take <a href="/../api/general-concepts#eventual-consistency">Eventual Consistency</a> into account for calculated undiscounted values.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setName(final LocalizedString name);

    public void setKey(final String key);

    public void setDescription(final LocalizedString description);

    public void setValue(final ProductDiscountValue value);

    public void setPredicate(final String predicate);

    public void setSortOrder(final String sortOrder);

    public void setIsActive(final Boolean isActive);

    @JsonIgnore
    public void setReferences(final Reference... references);

    public void setReferences(final List<Reference> references);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static ProductDiscount of() {
        return new ProductDiscountImpl();
    }

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

    public static ProductDiscountBuilder builder() {
        return ProductDiscountBuilder.of();
    }

    public static ProductDiscountBuilder builder(final ProductDiscount template) {
        return ProductDiscountBuilder.of(template);
    }

    default <T> T withProductDiscount(Function<ProductDiscount, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier.builder()
                .id(getId())
                .build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.product_discount.ProductDiscountReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscount>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscount>";
            }
        };
    }
}
