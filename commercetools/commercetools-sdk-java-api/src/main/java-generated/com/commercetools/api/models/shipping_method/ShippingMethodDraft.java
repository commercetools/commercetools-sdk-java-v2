
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodDraft shippingMethodDraft = ShippingMethodDraft.builder()
 *             .name("{name}")
 *             .taxCategory(taxCategoryBuilder -> taxCategoryBuilder)
 *             .plusZoneRates(zoneRatesBuilder -> zoneRatesBuilder)
 *             .isDefault(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodDraftImpl.class)
public interface ShippingMethodDraft extends com.commercetools.api.models.CustomizableDraft<ShippingMethodDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ShippingMethodDraft> {

    /**
     *  <p>User-defined unique identifier for the ShippingMethod.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the ShippingMethod.</p>
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
     *  <p>TaxCategory for all ZoneRates of the ShippingMethod.</p>
     * @return taxCategory
     */
    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @return zoneRates
     */
    @NotNull
    @Valid
    @JsonProperty("zoneRates")
    public List<ZoneRateDraft> getZoneRates();

    /**
     *  <p>If <code>true</code> the ShippingMethod will be the Project's default ShippingMethod.</p>
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
     *  <p>Custom Fields for the ShippingMethod.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier for the ShippingMethod.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the ShippingMethod.</p>
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
     *  <p>TaxCategory for all ZoneRates of the ShippingMethod.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param zoneRates values to be set
     */

    @JsonIgnore
    public void setZoneRates(final ZoneRateDraft... zoneRates);

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param zoneRates values to be set
     */

    public void setZoneRates(final List<ZoneRateDraft> zoneRates);

    /**
     *  <p>If <code>true</code> the ShippingMethod will be the Project's default ShippingMethod.</p>
     * @param isDefault value to be set
     */

    public void setIsDefault(final Boolean isDefault);

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Custom Fields for the ShippingMethod.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of ShippingMethodDraft
     */
    public static ShippingMethodDraft of() {
        return new ShippingMethodDraftImpl();
    }

    /**
     * factory method to copy an instance of ShippingMethodDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodDraft of(final ShippingMethodDraft template) {
        ShippingMethodDraftImpl instance = new ShippingMethodDraftImpl();
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
     * builder factory method for ShippingMethodDraft
     * @return builder
     */
    public static ShippingMethodDraftBuilder builder() {
        return ShippingMethodDraftBuilder.of();
    }

    /**
     * create builder for ShippingMethodDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodDraftBuilder builder(final ShippingMethodDraft template) {
        return ShippingMethodDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodDraft(Function<ShippingMethodDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodDraft>";
            }
        };
    }
}
