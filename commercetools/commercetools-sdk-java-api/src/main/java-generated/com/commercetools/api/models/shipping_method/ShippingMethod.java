
package com.commercetools.api.models.shipping_method;

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
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodImpl.class)
public interface ShippingMethod extends BaseResource, com.commercetools.api.models.DomainResource<ShippingMethod>,
        com.commercetools.api.models.Referencable<ShippingMethod>,
        com.commercetools.api.models.ResourceIdentifiable<ShippingMethod>,
        com.commercetools.api.models.Customizable<ShippingMethod> {

    /**
    *  <p>Platform-generated unique identifier of the ShippingMethod.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the shipping method.</p>
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

    /**
    *  <p>User-defined unique identifier of the ShippingMethod.</p>
    */

    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @Valid
    @JsonProperty("localizedName")
    public LocalizedString getLocalizedName();

    @JsonProperty("description")
    public String getDescription();

    @Valid
    @JsonProperty("localizedDescription")
    public LocalizedString getLocalizedDescription();

    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    @NotNull
    @Valid
    @JsonProperty("zoneRates")
    public List<ZoneRate> getZoneRates();

    /**
    *  <p>One shipping method in a project can be default.</p>
    */
    @NotNull
    @JsonProperty("isDefault")
    public Boolean getIsDefault();

    /**
    *  <p>A Cart predicate which can be used to more precisely select a shipping method for a cart.</p>
    */

    @JsonProperty("predicate")
    public String getPredicate();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setName(final String name);

    public void setLocalizedName(final LocalizedString localizedName);

    public void setDescription(final String description);

    public void setLocalizedDescription(final LocalizedString localizedDescription);

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    @JsonIgnore
    public void setZoneRates(final ZoneRate... zoneRates);

    public void setZoneRates(final List<ZoneRate> zoneRates);

    public void setIsDefault(final Boolean isDefault);

    public void setPredicate(final String predicate);

    public void setCustom(final CustomFields custom);

    public static ShippingMethod of() {
        return new ShippingMethodImpl();
    }

    public static ShippingMethod of(final ShippingMethod template) {
        ShippingMethodImpl instance = new ShippingMethodImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setLocalizedName(template.getLocalizedName());
        instance.setDescription(template.getDescription());
        instance.setLocalizedDescription(template.getLocalizedDescription());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setZoneRates(template.getZoneRates());
        instance.setIsDefault(template.getIsDefault());
        instance.setPredicate(template.getPredicate());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ShippingMethodBuilder builder() {
        return ShippingMethodBuilder.of();
    }

    public static ShippingMethodBuilder builder(final ShippingMethod template) {
        return ShippingMethodBuilder.of(template);
    }

    default <T> T withShippingMethod(Function<ShippingMethod, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier.builder()
                .id(getId())
                .build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.shipping_method.ShippingMethodReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethod> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethod>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethod>";
            }
        };
    }
}
