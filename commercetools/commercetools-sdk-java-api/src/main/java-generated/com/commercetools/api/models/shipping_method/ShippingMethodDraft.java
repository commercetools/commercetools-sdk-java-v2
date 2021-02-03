
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodDraftImpl.class)
public interface ShippingMethodDraft {

    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("description")
    public String getDescription();

    @Valid
    @JsonProperty("localizedDescription")
    public LocalizedString getLocalizedDescription();

    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    @NotNull
    @Valid
    @JsonProperty("zoneRates")
    public List<ZoneRateDraft> getZoneRates();

    /**
    *  <p>If <code>true</code> the shipping method will be the default one in a project.</p>
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
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setName(final String name);

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
}
