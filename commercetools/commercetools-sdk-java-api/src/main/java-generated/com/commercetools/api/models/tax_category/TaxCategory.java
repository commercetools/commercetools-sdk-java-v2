
package com.commercetools.api.models.tax_category;

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
@JsonDeserialize(as = TaxCategoryImpl.class)
public interface TaxCategory extends BaseResource, com.commercetools.api.models.DomainResource<TaxCategory>,
        com.commercetools.api.models.Referencable<TaxCategory>,
        com.commercetools.api.models.ResourceIdentifiable<TaxCategory> {

    /**
    *  <p>Platform-generated unique identifier of the TaxCategory.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Current version of the TaxCategory.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Date and time (UTC) the TaxCategory was initially created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>Date and time (UTC) the TaxCategory was last updated.</p>
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
    *  <p>Name of the TaxCategory.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>Description of the TaxCategory.</p>
    */

    @JsonProperty("description")
    public String getDescription();

    /**
    *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID assigned by the platform.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("rates")
    public List<TaxRate> getRates();

    /**
    *  <p>User-defined unique identifier of the TaxCategory.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setName(final String name);

    public void setDescription(final String description);

    @JsonIgnore
    public void setRates(final TaxRate... rates);

    public void setRates(final List<TaxRate> rates);

    public void setKey(final String key);

    public static TaxCategory of() {
        return new TaxCategoryImpl();
    }

    public static TaxCategory of(final TaxCategory template) {
        TaxCategoryImpl instance = new TaxCategoryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(template.getRates());
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategoryBuilder builder() {
        return TaxCategoryBuilder.of();
    }

    public static TaxCategoryBuilder builder(final TaxCategory template) {
        return TaxCategoryBuilder.of(template);
    }

    default <T> T withTaxCategory(Function<TaxCategory, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.tax_category.TaxCategoryReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategory> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategory>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategory>";
            }
        };
    }
}
