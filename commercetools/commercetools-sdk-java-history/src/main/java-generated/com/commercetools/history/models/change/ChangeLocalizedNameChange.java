
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
@JsonDeserialize(as = ChangeLocalizedNameChangeImpl.class)
public interface ChangeLocalizedNameChange extends Change {

    String CHANGE_LOCALIZED_NAME_CHANGE = "ChangeLocalizedNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeName</code></p>
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

    public static ChangeLocalizedNameChange of() {
        return new ChangeLocalizedNameChangeImpl();
    }

    public static ChangeLocalizedNameChange of(final ChangeLocalizedNameChange template) {
        ChangeLocalizedNameChangeImpl instance = new ChangeLocalizedNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeLocalizedNameChangeBuilder builder() {
        return ChangeLocalizedNameChangeBuilder.of();
    }

    public static ChangeLocalizedNameChangeBuilder builder(final ChangeLocalizedNameChange template) {
        return ChangeLocalizedNameChangeBuilder.of(template);
    }

    default <T> T withChangeLocalizedNameChange(Function<ChangeLocalizedNameChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLocalizedNameChange>";
            }
        };
    }
}
