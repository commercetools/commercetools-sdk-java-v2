
package com.commercetools.api.models.shipping_method;

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
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ShippingMethod
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethod shippingMethod = ShippingMethod.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .taxCategory(taxCategoryBuilder -> taxCategoryBuilder)
 *             .plusZoneRates(zoneRatesBuilder -> zoneRatesBuilder)
 *             .isDefault(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodImpl.class)
public interface ShippingMethod
        extends BaseResource, ShippingMethodMixin, com.commercetools.api.models.DomainResource<ShippingMethod>,
        com.commercetools.api.models.Referencable<ShippingMethod>,
        com.commercetools.api.models.ResourceIdentifiable<ShippingMethod>,
        com.commercetools.api.models.Customizable<ShippingMethod>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the ShippingMethod.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the ShippingMethod.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the ShippingMethod was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ShippingMethod was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the ShippingMethod.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the ShippingMethod.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the ShippingMethod.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique name of the ShippingMethod within a Project.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     * @return localizedName
     */
    @Valid
    @JsonProperty("localizedName")
    public LocalizedString getLocalizedName();

    /**
     *  <p>Description of the ShippingMethod.</p>
     * @return description
     */
    @Deprecated
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     * @return localizedDescription
     */
    @Valid
    @JsonProperty("localizedDescription")
    public LocalizedString getLocalizedDescription();

    /**
     *  <p>TaxCategory of all ZoneRates of the ShippingMethod.</p>
     * @return taxCategory
     */
    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     * @return zoneRates
     */
    @NotNull
    @Valid
    @JsonProperty("zoneRates")
    public List<ZoneRate> getZoneRates();

    /**
     *  <p>If <code>true</code> this ShippingMethod is the Project's default ShippingMethod.</p>
     * @return isDefault
     */
    @NotNull
    @JsonProperty("isDefault")
    public Boolean getIsDefault();

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     * @return predicate
     */

    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Custom Fields of the ShippingMethod.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the ShippingMethod.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the ShippingMethod.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the ShippingMethod was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ShippingMethod was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the ShippingMethod.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the ShippingMethod.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the ShippingMethod.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Unique name of the ShippingMethod within a Project.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     * @param localizedName value to be set
     */

    public void setLocalizedName(final LocalizedString localizedName);

    /**
     *  <p>Description of the ShippingMethod.</p>
     * @param description value to be set
     */
    @Deprecated
    public void setDescription(final String description);

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     * @param localizedDescription value to be set
     */

    public void setLocalizedDescription(final LocalizedString localizedDescription);

    /**
     *  <p>TaxCategory of all ZoneRates of the ShippingMethod.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     * @param zoneRates values to be set
     */

    @JsonIgnore
    public void setZoneRates(final ZoneRate... zoneRates);

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     * @param zoneRates values to be set
     */

    public void setZoneRates(final List<ZoneRate> zoneRates);

    /**
     *  <p>If <code>true</code> this ShippingMethod is the Project's default ShippingMethod.</p>
     * @param isDefault value to be set
     */

    public void setIsDefault(final Boolean isDefault);

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Custom Fields of the ShippingMethod.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of ShippingMethod
     */
    public static ShippingMethod of() {
        return new ShippingMethodImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethod
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of ShippingMethod
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethod deepCopy(@Nullable final ShippingMethod template) {
        if (template == null) {
            return null;
        }
        ShippingMethodImpl instance = new ShippingMethodImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setLocalizedName(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLocalizedName()));
        instance.setDescription(template.getDescription());
        instance.setLocalizedDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLocalizedDescription()));
        instance.setTaxCategory(
            com.commercetools.api.models.tax_category.TaxCategoryReference.deepCopy(template.getTaxCategory()));
        instance.setZoneRates(Optional.ofNullable(template.getZoneRates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shipping_method.ZoneRate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setIsDefault(template.getIsDefault());
        instance.setPredicate(template.getPredicate());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethod
     * @return builder
     */
    public static ShippingMethodBuilder builder() {
        return ShippingMethodBuilder.of();
    }

    /**
     * create builder for ShippingMethod instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodBuilder builder(final ShippingMethod template) {
        return ShippingMethodBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethod(Function<ShippingMethod, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.SHIPPING_METHOD;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethod> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethod>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethod>";
            }
        };
    }
}
