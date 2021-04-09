
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
@JsonDeserialize(as = SetOrderTotalPriceChangeImpl.class)
public interface SetOrderTotalPriceChange extends Change {

    String SET_ORDER_TOTAL_PRICE_CHANGE = "SetOrderTotalPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setOrderTotalPrice</code></p>
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

    public static SetOrderTotalPriceChange of() {
        return new SetOrderTotalPriceChangeImpl();
    }

    public static SetOrderTotalPriceChange of(final SetOrderTotalPriceChange template) {
        SetOrderTotalPriceChangeImpl instance = new SetOrderTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetOrderTotalPriceChangeBuilder builder() {
        return SetOrderTotalPriceChangeBuilder.of();
    }

    public static SetOrderTotalPriceChangeBuilder builder(final SetOrderTotalPriceChange template) {
        return SetOrderTotalPriceChangeBuilder.of(template);
    }

    default <T> T withSetOrderTotalPriceChange(Function<SetOrderTotalPriceChange, T> helper) {
        return helper.apply(this);
    }
}
