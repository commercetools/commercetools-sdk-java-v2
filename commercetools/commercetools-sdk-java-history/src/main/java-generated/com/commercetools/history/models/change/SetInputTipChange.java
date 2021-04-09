
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
@JsonDeserialize(as = SetInputTipChangeImpl.class)
public interface SetInputTipChange extends Change {

    String SET_INPUT_TIP_CHANGE = "SetInputTipChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setInputTip</code> on product types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>The name of the updated attribute.</p>
    */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    public void setNextValue(final LocalizedString nextValue);

    public void setPreviousValue(final LocalizedString previousValue);

    public static SetInputTipChange of() {
        return new SetInputTipChangeImpl();
    }

    public static SetInputTipChange of(final SetInputTipChange template) {
        SetInputTipChangeImpl instance = new SetInputTipChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetInputTipChangeBuilder builder() {
        return SetInputTipChangeBuilder.of();
    }

    public static SetInputTipChangeBuilder builder(final SetInputTipChange template) {
        return SetInputTipChangeBuilder.of(template);
    }

    default <T> T withSetInputTipChange(Function<SetInputTipChange, T> helper) {
        return helper.apply(this);
    }
}
