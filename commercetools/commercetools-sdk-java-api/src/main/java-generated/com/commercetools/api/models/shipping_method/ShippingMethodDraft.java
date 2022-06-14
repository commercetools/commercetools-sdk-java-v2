
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
public interface ShippingMethodDraft extends com.commercetools.api.models.CustomizableDraft<ShippingMethodDraft> {

    /**
     *  <p>User-defined unique identifier for the ShippingMethod.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the ShippingMethod.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     */
    @Valid
    @JsonProperty("localizedName")
    public LocalizedString getLocalizedName();

    /**
     *  <p>Description of the ShippingMethod.</p>
     */
    @Deprecated
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     */
    @Valid
    @JsonProperty("localizedDescription")
    public LocalizedString getLocalizedDescription();

    /**
     *  <p>TaxCategory for all ZoneRates of the ShippingMethod.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("zoneRates")
    public List<ZoneRateDraft> getZoneRates();

    /**
     *  <p>If <code>true</code> the ShippingMethod will be the Project's default ShippingMethod.</p>
     */
    @NotNull
    @JsonProperty("isDefault")
    public Boolean getIsDefault();

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     */

    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Custom Fields for the ShippingMethod.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setName(final String name);

    public void setLocalizedName(final LocalizedString localizedName);

    @Deprecated
    public void setDescription(final String description);

    public void setLocalizedDescription(final LocalizedString localizedDescription);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    @JsonIgnore
    public void setZoneRates(final ZoneRateDraft... zoneRates);

    public void setZoneRates(final List<ZoneRateDraft> zoneRates);

    public void setIsDefault(final Boolean isDefault);

    public void setPredicate(final String predicate);

    public void setCustom(final CustomFieldsDraft custom);

    public static ShippingMethodDraft of() {
        return new ShippingMethodDraftImpl();
    }

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

    public static ShippingMethodDraftBuilder builder() {
        return ShippingMethodDraftBuilder.of();
    }

    public static ShippingMethodDraftBuilder builder(final ShippingMethodDraft template) {
        return ShippingMethodDraftBuilder.of(template);
    }

    default <T> T withShippingMethodDraft(Function<ShippingMethodDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodDraft>";
            }
        };
    }
}
