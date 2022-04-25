
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
@JsonDeserialize(as = ChangeLocalizedDescriptionChangeImpl.class)
public interface ChangeLocalizedDescriptionChange extends Change {

    String CHANGE_LOCALIZED_DESCRIPTION_CHANGE = "ChangeLocalizedDescriptionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeDescription</code></p>
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

    public static ChangeLocalizedDescriptionChange of() {
        return new ChangeLocalizedDescriptionChangeImpl();
    }

    public static ChangeLocalizedDescriptionChange of(final ChangeLocalizedDescriptionChange template) {
        ChangeLocalizedDescriptionChangeImpl instance = new ChangeLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeLocalizedDescriptionChangeBuilder builder() {
        return ChangeLocalizedDescriptionChangeBuilder.of();
    }

    public static ChangeLocalizedDescriptionChangeBuilder builder(final ChangeLocalizedDescriptionChange template) {
        return ChangeLocalizedDescriptionChangeBuilder.of(template);
    }

    default <T> T withChangeLocalizedDescriptionChange(Function<ChangeLocalizedDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLocalizedDescriptionChange>";
            }
        };
    }
}
