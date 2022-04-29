
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
@JsonDeserialize(as = SetMethodInfoNameChangeImpl.class)
public interface SetMethodInfoNameChange extends Change {

    String SET_METHOD_INFO_NAME_CHANGE = "SetMethodInfoNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMethodInfoName</code></p>
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

    public static SetMethodInfoNameChange of() {
        return new SetMethodInfoNameChangeImpl();
    }

    public static SetMethodInfoNameChange of(final SetMethodInfoNameChange template) {
        SetMethodInfoNameChangeImpl instance = new SetMethodInfoNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMethodInfoNameChangeBuilder builder() {
        return SetMethodInfoNameChangeBuilder.of();
    }

    public static SetMethodInfoNameChangeBuilder builder(final SetMethodInfoNameChange template) {
        return SetMethodInfoNameChangeBuilder.of(template);
    }

    default <T> T withSetMethodInfoNameChange(Function<SetMethodInfoNameChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoNameChange>";
            }
        };
    }
}
