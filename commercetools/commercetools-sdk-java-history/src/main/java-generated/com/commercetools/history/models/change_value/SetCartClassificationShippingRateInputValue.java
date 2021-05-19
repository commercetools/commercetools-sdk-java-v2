
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the cart classification shipping input rate value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCartClassificationShippingRateInputValueImpl.class)
public interface SetCartClassificationShippingRateInputValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setType(final String type);

    public void setKey(final String key);

    public void setLabel(final LocalizedString label);

    public static SetCartClassificationShippingRateInputValue of() {
        return new SetCartClassificationShippingRateInputValueImpl();
    }

    public static SetCartClassificationShippingRateInputValue of(
            final SetCartClassificationShippingRateInputValue template) {
        SetCartClassificationShippingRateInputValueImpl instance = new SetCartClassificationShippingRateInputValueImpl();
        instance.setType(template.getType());
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static SetCartClassificationShippingRateInputValueBuilder builder() {
        return SetCartClassificationShippingRateInputValueBuilder.of();
    }

    public static SetCartClassificationShippingRateInputValueBuilder builder(
            final SetCartClassificationShippingRateInputValue template) {
        return SetCartClassificationShippingRateInputValueBuilder.of(template);
    }

    default <T> T withSetCartClassificationShippingRateInputValue(
            Function<SetCartClassificationShippingRateInputValue, T> helper) {
        return helper.apply(this);
    }
}
