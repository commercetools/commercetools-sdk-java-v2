
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ProductVariantAvailability;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetVariantAvailabilityChangeImpl.class)
public interface SetVariantAvailabilityChange extends Change {

    String SET_VARIANT_AVAILABILITY_CHANGE = "SetVariantAvailabilityChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setVariantAvailability</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ProductVariantAvailability getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ProductVariantAvailability getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setVariant(final String variant);

    public void setPreviousValue(final ProductVariantAvailability previousValue);

    public void setNextValue(final ProductVariantAvailability nextValue);

    public static SetVariantAvailabilityChange of() {
        return new SetVariantAvailabilityChangeImpl();
    }

    public static SetVariantAvailabilityChange of(final SetVariantAvailabilityChange template) {
        SetVariantAvailabilityChangeImpl instance = new SetVariantAvailabilityChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetVariantAvailabilityChangeBuilder builder() {
        return SetVariantAvailabilityChangeBuilder.of();
    }

    public static SetVariantAvailabilityChangeBuilder builder(final SetVariantAvailabilityChange template) {
        return SetVariantAvailabilityChangeBuilder.of(template);
    }

    default <T> T withSetVariantAvailabilityChange(Function<SetVariantAvailabilityChange, T> helper) {
        return helper.apply(this);
    }
}
