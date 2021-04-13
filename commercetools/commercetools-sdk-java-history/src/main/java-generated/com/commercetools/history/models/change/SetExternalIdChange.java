
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetExternalIdChangeImpl.class)
public interface SetExternalIdChange extends Change {

    String SET_EXTERNAL_ID_CHANGE = "SetExternalIdChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setExternalId</code></p>
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

    public static SetExternalIdChange of() {
        return new SetExternalIdChangeImpl();
    }

    public static SetExternalIdChange of(final SetExternalIdChange template) {
        SetExternalIdChangeImpl instance = new SetExternalIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetExternalIdChangeBuilder builder() {
        return SetExternalIdChangeBuilder.of();
    }

    public static SetExternalIdChangeBuilder builder(final SetExternalIdChange template) {
        return SetExternalIdChangeBuilder.of(template);
    }

    default <T> T withSetExternalIdChange(Function<SetExternalIdChange, T> helper) {
        return helper.apply(this);
    }
}
