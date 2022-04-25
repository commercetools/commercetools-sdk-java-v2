
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetFirstNameChangeImpl.class)
public interface SetFirstNameChange extends Change {

    String SET_FIRST_NAME_CHANGE = "SetFirstNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setFirstName</code></p>
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

    public static SetFirstNameChange of() {
        return new SetFirstNameChangeImpl();
    }

    public static SetFirstNameChange of(final SetFirstNameChange template) {
        SetFirstNameChangeImpl instance = new SetFirstNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetFirstNameChangeBuilder builder() {
        return SetFirstNameChangeBuilder.of();
    }

    public static SetFirstNameChangeBuilder builder(final SetFirstNameChange template) {
        return SetFirstNameChangeBuilder.of(template);
    }

    default <T> T withSetFirstNameChange(Function<SetFirstNameChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetFirstNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetFirstNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetFirstNameChange>";
            }
        };
    }
}
