
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
@JsonDeserialize(as = SetSlugChangeImpl.class)
public interface SetSlugChange extends Change {

    String SET_SLUG_CHANGE = "SetSlugChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setSlug</code></p>
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

    public static SetSlugChange of() {
        return new SetSlugChangeImpl();
    }

    public static SetSlugChange of(final SetSlugChange template) {
        SetSlugChangeImpl instance = new SetSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetSlugChangeBuilder builder() {
        return SetSlugChangeBuilder.of();
    }

    public static SetSlugChangeBuilder builder(final SetSlugChange template) {
        return SetSlugChangeBuilder.of(template);
    }

    default <T> T withSetSlugChange(Function<SetSlugChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetSlugChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSlugChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSlugChange>";
            }
        };
    }
}
