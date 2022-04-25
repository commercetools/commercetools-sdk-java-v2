
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
@JsonDeserialize(as = SetShippingInfoPriceChangeImpl.class)
public interface SetShippingInfoPriceChange extends Change {

    String SET_SHIPPING_INFO_PRICE_CHANGE = "SetShippingInfoPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingInfoPrice</code></p>
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

    public static SetShippingInfoPriceChange of() {
        return new SetShippingInfoPriceChangeImpl();
    }

    public static SetShippingInfoPriceChange of(final SetShippingInfoPriceChange template) {
        SetShippingInfoPriceChangeImpl instance = new SetShippingInfoPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingInfoPriceChangeBuilder builder() {
        return SetShippingInfoPriceChangeBuilder.of();
    }

    public static SetShippingInfoPriceChangeBuilder builder(final SetShippingInfoPriceChange template) {
        return SetShippingInfoPriceChangeBuilder.of(template);
    }

    default <T> T withSetShippingInfoPriceChange(Function<SetShippingInfoPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingInfoPriceChange>";
            }
        };
    }
}
