
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ValidFromAndUntilValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetValidFromAndUntilChangeImpl.class)
public interface SetValidFromAndUntilChange extends Change {

    String SET_VALID_FROM_AND_UNTIL_CHANGE = "SetValidFromAndUntilChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
    */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ValidFromAndUntilValue getPreviousValue();

    /**
    *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
    */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ValidFromAndUntilValue getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final ValidFromAndUntilValue previousValue);

    public void setNextValue(final ValidFromAndUntilValue nextValue);

    public static SetValidFromAndUntilChange of() {
        return new SetValidFromAndUntilChangeImpl();
    }

    public static SetValidFromAndUntilChange of(final SetValidFromAndUntilChange template) {
        SetValidFromAndUntilChangeImpl instance = new SetValidFromAndUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetValidFromAndUntilChangeBuilder builder() {
        return SetValidFromAndUntilChangeBuilder.of();
    }

    public static SetValidFromAndUntilChangeBuilder builder(final SetValidFromAndUntilChange template) {
        return SetValidFromAndUntilChangeBuilder.of(template);
    }

    default <T> T withSetValidFromAndUntilChange(Function<SetValidFromAndUntilChange, T> helper) {
        return helper.apply(this);
    }
}
