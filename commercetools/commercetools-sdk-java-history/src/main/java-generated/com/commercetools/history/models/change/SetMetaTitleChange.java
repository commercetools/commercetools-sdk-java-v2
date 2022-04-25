
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
@JsonDeserialize(as = SetMetaTitleChangeImpl.class)
public interface SetMetaTitleChange extends Change {

    String SET_META_TITLE_CHANGE = "SetMetaTitleChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMetaTitle</code></p>
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

    public static SetMetaTitleChange of() {
        return new SetMetaTitleChangeImpl();
    }

    public static SetMetaTitleChange of(final SetMetaTitleChange template) {
        SetMetaTitleChangeImpl instance = new SetMetaTitleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMetaTitleChangeBuilder builder() {
        return SetMetaTitleChangeBuilder.of();
    }

    public static SetMetaTitleChangeBuilder builder(final SetMetaTitleChange template) {
        return SetMetaTitleChangeBuilder.of(template);
    }

    default <T> T withSetMetaTitleChange(Function<SetMetaTitleChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMetaTitleChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMetaTitleChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMetaTitleChange>";
            }
        };
    }
}
