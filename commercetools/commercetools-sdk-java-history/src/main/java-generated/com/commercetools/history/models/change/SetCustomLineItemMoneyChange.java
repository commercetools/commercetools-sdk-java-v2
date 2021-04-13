
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemMoneyChangeImpl.class)
public interface SetCustomLineItemMoneyChange extends Change {

    String SET_CUSTOM_LINE_ITEM_MONEY_CHANGE = "SetCustomLineItemMoneyChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomLineItemMoney</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    public void setChange(final String change);

    public void setCustomLineItem(final LocalizedString customLineItem);

    public void setCustomLineItemId(final String customLineItemId);

    public void setNextValue(final Money nextValue);

    public void setPreviousValue(final Money previousValue);

    public static SetCustomLineItemMoneyChange of() {
        return new SetCustomLineItemMoneyChangeImpl();
    }

    public static SetCustomLineItemMoneyChange of(final SetCustomLineItemMoneyChange template) {
        SetCustomLineItemMoneyChangeImpl instance = new SetCustomLineItemMoneyChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomLineItemMoneyChangeBuilder builder() {
        return SetCustomLineItemMoneyChangeBuilder.of();
    }

    public static SetCustomLineItemMoneyChangeBuilder builder(final SetCustomLineItemMoneyChange template) {
        return SetCustomLineItemMoneyChangeBuilder.of(template);
    }

    default <T> T withSetCustomLineItemMoneyChange(Function<SetCustomLineItemMoneyChange, T> helper) {
        return helper.apply(this);
    }
}
