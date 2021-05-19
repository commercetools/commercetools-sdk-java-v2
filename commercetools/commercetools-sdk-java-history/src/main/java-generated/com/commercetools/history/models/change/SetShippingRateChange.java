
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetShippingRateChangeImpl.class)
public interface SetShippingRateChange extends Change {

    String SET_SHIPPING_RATE_CHANGE = "SetShippingRateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingRate</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final Money nextValue);

    public void setPreviousValue(final Money previousValue);

    public static SetShippingRateChange of() {
        return new SetShippingRateChangeImpl();
    }

    public static SetShippingRateChange of(final SetShippingRateChange template) {
        SetShippingRateChangeImpl instance = new SetShippingRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingRateChangeBuilder builder() {
        return SetShippingRateChangeBuilder.of();
    }

    public static SetShippingRateChangeBuilder builder(final SetShippingRateChange template) {
        return SetShippingRateChangeBuilder.of(template);
    }

    default <T> T withSetShippingRateChange(Function<SetShippingRateChange, T> helper) {
        return helper.apply(this);
    }
}
