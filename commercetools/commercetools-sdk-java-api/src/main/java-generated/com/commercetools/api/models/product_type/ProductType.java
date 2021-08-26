
package com.commercetools.api.models.product_type;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeImpl.class)
public interface ProductType extends BaseResource, com.commercetools.api.models.DomainResource<ProductType> {

    /**
    *  <p>The unique ID of the product type.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the product type.</p>
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
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-specific unique identifier for the product type (max.
    *  256 characters).</p>
    */

    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("description")
    public String getDescription();

    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinition> getAttributes();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setName(final String name);

    public void setDescription(final String description);

    @JsonIgnore
    public void setAttributes(final AttributeDefinition... attributes);

    public void setAttributes(final List<AttributeDefinition> attributes);

    public static ProductType of() {
        return new ProductTypeImpl();
    }

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

    public static ProductTypeBuilder builder() {
        return ProductTypeBuilder.of();
    }

    public static ProductTypeBuilder builder(final ProductType template) {
        return ProductTypeBuilder.of(template);
    }

    default <T> T withProductType(Function<ProductType, T> helper) {
        return helper.apply(this);
    }
}
