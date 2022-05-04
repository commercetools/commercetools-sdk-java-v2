
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
    *  <p>Platform-generated unique identifier of the ProductDiscount</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the product discount.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>User-defined unique identifier of the ProductDiscount.</p>
    */

    @JsonProperty("key")
    public String getKey();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValue getValue();

    /**
    *  <p>A valid ProductDiscount Predicate.</p>
    */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
    *  <p>The string contains a number between 0 and 1.
    *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.
    *  A sortOrder must be unambiguous.</p>
    */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
    *  <p>Only active discount will be applied to product prices.</p>
    */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
    *  <p>The platform will generate this array from the predicate.
    *  It contains the references of all the resources that are addressed in the predicate.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
    *  <p>The time from which the discount should be effective.
    *  Please take Eventual Consistency into account for calculated product discount values.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>The time from which the discount should be ineffective.
    *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
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
