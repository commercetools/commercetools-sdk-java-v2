
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomTypeChangeImpl.class)
public interface SetCustomTypeChange extends Change {

    String SET_CUSTOM_TYPE_CHANGE = "SetCustomTypeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for setting a custom type</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final CustomFields nextValue);

    public void setPreviousValue(final CustomFields previousValue);

    public static SetCustomTypeChange of() {
        return new SetCustomTypeChangeImpl();
    }

    public static SetCustomTypeChange of(final SetCustomTypeChange template) {
        SetCustomTypeChangeImpl instance = new SetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomTypeChangeBuilder builder() {
        return SetCustomTypeChangeBuilder.of();
    }

    public static SetCustomTypeChangeBuilder builder(final SetCustomTypeChange template) {
        return SetCustomTypeChangeBuilder.of(template);
    }

    default <T> T withSetCustomTypeChange(Function<SetCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomTypeChange>";
            }
        };
    }
}
