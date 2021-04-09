
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetDateOfBirthChangeImpl.class)
public interface SetDateOfBirthChange extends Change {

    String SET_DATE_OF_BIRTH_CHANGE = "SetDateOfBirthChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setDateOfBirth</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetDateOfBirthChange of() {
        return new SetDateOfBirthChangeImpl();
    }

    public static SetDateOfBirthChange of(final SetDateOfBirthChange template) {
        SetDateOfBirthChangeImpl instance = new SetDateOfBirthChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetDateOfBirthChangeBuilder builder() {
        return SetDateOfBirthChangeBuilder.of();
    }

    public static SetDateOfBirthChangeBuilder builder(final SetDateOfBirthChange template) {
        return SetDateOfBirthChangeBuilder.of(template);
    }

    default <T> T withSetDateOfBirthChange(Function<SetDateOfBirthChange, T> helper) {
        return helper.apply(this);
    }
}
