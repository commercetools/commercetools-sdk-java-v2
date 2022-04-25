
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetNameChangeImpl.class)
public interface SetNameChange extends Change {

    String SET_NAME_CHANGE = "SetNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setName</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final LocalizedString previousValue);

    public void setNextValue(final LocalizedString nextValue);

    public static SetNameChange of() {
        return new SetNameChangeImpl();
    }

    public static SetNameChange of(final SetNameChange template) {
        SetNameChangeImpl instance = new SetNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetNameChangeBuilder builder() {
        return SetNameChangeBuilder.of();
    }

    public static SetNameChangeBuilder builder(final SetNameChange template) {
        return SetNameChangeBuilder.of(template);
    }

    default <T> T withSetNameChange(Function<SetNameChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetNameChange>";
            }
        };
    }
}
