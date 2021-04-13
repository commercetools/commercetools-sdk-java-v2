
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetVatIdChangeImpl.class)
public interface SetVatIdChange extends Change {

    String SET_VAT_ID_CHANGE = "SetVatIdChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setVatId</code></p>
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

    public static SetVatIdChange of() {
        return new SetVatIdChangeImpl();
    }

    public static SetVatIdChange of(final SetVatIdChange template) {
        SetVatIdChangeImpl instance = new SetVatIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetVatIdChangeBuilder builder() {
        return SetVatIdChangeBuilder.of();
    }

    public static SetVatIdChangeBuilder builder(final SetVatIdChange template) {
        return SetVatIdChangeBuilder.of(template);
    }

    default <T> T withSetVatIdChange(Function<SetVatIdChange, T> helper) {
        return helper.apply(this);
    }
}
