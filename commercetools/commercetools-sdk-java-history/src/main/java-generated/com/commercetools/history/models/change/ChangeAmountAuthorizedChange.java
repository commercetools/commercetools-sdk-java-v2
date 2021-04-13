
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
@JsonDeserialize(as = ChangeAmountAuthorizedChangeImpl.class)
public interface ChangeAmountAuthorizedChange extends Change {

    String CHANGE_AMOUNT_AUTHORIZED_CHANGE = "ChangeAmountAuthorizedChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Internal Update action for <code>changeAmountAuthorized</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Money previousValue);

    public void setNextValue(final Money nextValue);

    public static ChangeAmountAuthorizedChange of() {
        return new ChangeAmountAuthorizedChangeImpl();
    }

    public static ChangeAmountAuthorizedChange of(final ChangeAmountAuthorizedChange template) {
        ChangeAmountAuthorizedChangeImpl instance = new ChangeAmountAuthorizedChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeAmountAuthorizedChangeBuilder builder() {
        return ChangeAmountAuthorizedChangeBuilder.of();
    }

    public static ChangeAmountAuthorizedChangeBuilder builder(final ChangeAmountAuthorizedChange template) {
        return ChangeAmountAuthorizedChangeBuilder.of(template);
    }

    default <T> T withChangeAmountAuthorizedChange(Function<ChangeAmountAuthorizedChange, T> helper) {
        return helper.apply(this);
    }
}
