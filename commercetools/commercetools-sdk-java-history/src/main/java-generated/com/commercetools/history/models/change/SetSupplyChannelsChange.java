
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetSupplyChannelsChangeImpl.class)
public interface SetSupplyChannelsChange extends Change {

    String SET_SUPPLY_CHANNELS_CHANGE = "SetSupplyChannelsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setSupplyChannels</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    public void setPreviousValue(final List<Reference> previousValue);

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    public void setNextValue(final List<Reference> nextValue);

    public static SetSupplyChannelsChange of() {
        return new SetSupplyChannelsChangeImpl();
    }

    public static SetSupplyChannelsChange of(final SetSupplyChannelsChange template) {
        SetSupplyChannelsChangeImpl instance = new SetSupplyChannelsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetSupplyChannelsChangeBuilder builder() {
        return SetSupplyChannelsChangeBuilder.of();
    }

    public static SetSupplyChannelsChangeBuilder builder(final SetSupplyChannelsChange template) {
        return SetSupplyChannelsChangeBuilder.of(template);
    }

    default <T> T withSetSupplyChannelsChange(Function<SetSupplyChannelsChange, T> helper) {
        return helper.apply(this);
    }
}
