
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
@JsonDeserialize(as = SetLocalizedDescriptionChangeImpl.class)
public interface SetLocalizedDescriptionChange extends Change {

    String SET_LOCALIZED_DESCRIPTION_CHANGE = "SetLocalizedDescriptionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setDescription</code></p>
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

    public static SetLocalizedDescriptionChange of() {
        return new SetLocalizedDescriptionChangeImpl();
    }

    public static SetLocalizedDescriptionChange of(final SetLocalizedDescriptionChange template) {
        SetLocalizedDescriptionChangeImpl instance = new SetLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetLocalizedDescriptionChangeBuilder builder() {
        return SetLocalizedDescriptionChangeBuilder.of();
    }

    public static SetLocalizedDescriptionChangeBuilder builder(final SetLocalizedDescriptionChange template) {
        return SetLocalizedDescriptionChangeBuilder.of(template);
    }

    default <T> T withSetLocalizedDescriptionChange(Function<SetLocalizedDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLocalizedDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLocalizedDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLocalizedDescriptionChange>";
            }
        };
    }
}
