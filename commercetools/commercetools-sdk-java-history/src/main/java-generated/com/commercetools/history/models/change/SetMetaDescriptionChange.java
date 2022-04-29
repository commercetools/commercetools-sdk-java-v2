
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
@JsonDeserialize(as = SetMetaDescriptionChangeImpl.class)
public interface SetMetaDescriptionChange extends Change {

    String SET_META_DESCRIPTION_CHANGE = "SetMetaDescriptionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMetaDescription</code></p>
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

    public static SetMetaDescriptionChange of() {
        return new SetMetaDescriptionChangeImpl();
    }

    public static SetMetaDescriptionChange of(final SetMetaDescriptionChange template) {
        SetMetaDescriptionChangeImpl instance = new SetMetaDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMetaDescriptionChangeBuilder builder() {
        return SetMetaDescriptionChangeBuilder.of();
    }

    public static SetMetaDescriptionChangeBuilder builder(final SetMetaDescriptionChange template) {
        return SetMetaDescriptionChangeBuilder.of(template);
    }

    default <T> T withSetMetaDescriptionChange(Function<SetMetaDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMetaDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMetaDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMetaDescriptionChange>";
            }
        };
    }
}
