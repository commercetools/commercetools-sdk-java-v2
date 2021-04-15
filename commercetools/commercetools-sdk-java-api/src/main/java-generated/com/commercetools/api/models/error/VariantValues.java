
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = VariantValuesImpl.class)
public interface VariantValues {

    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    public void setSku(final String sku);

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    public void setPrices(final List<PriceDraft> prices);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    public static VariantValues of() {
        return new VariantValuesImpl();
    }

    public static VariantValues of(final VariantValues template) {
        VariantValuesImpl instance = new VariantValuesImpl();
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public static VariantValuesBuilder builder() {
        return VariantValuesBuilder.of();
    }

    public static VariantValuesBuilder builder(final VariantValues template) {
        return VariantValuesBuilder.of(template);
    }

    default <T> T withVariantValues(Function<VariantValues, T> helper) {
        return helper.apply(this);
    }
}
