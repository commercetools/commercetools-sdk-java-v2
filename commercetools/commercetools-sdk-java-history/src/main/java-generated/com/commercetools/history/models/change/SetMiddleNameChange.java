
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetMiddleNameChangeImpl.class)
public interface SetMiddleNameChange extends Change {

    String SET_MIDDLE_NAME_CHANGE = "SetMiddleNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMiddleName</code></p>
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

    public static SetMiddleNameChange of() {
        return new SetMiddleNameChangeImpl();
    }

    public static SetMiddleNameChange of(final SetMiddleNameChange template) {
        SetMiddleNameChangeImpl instance = new SetMiddleNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMiddleNameChangeBuilder builder() {
        return SetMiddleNameChangeBuilder.of();
    }

    public static SetMiddleNameChangeBuilder builder(final SetMiddleNameChange template) {
        return SetMiddleNameChangeBuilder.of(template);
    }

    default <T> T withSetMiddleNameChange(Function<SetMiddleNameChange, T> helper) {
        return helper.apply(this);
    }
}
