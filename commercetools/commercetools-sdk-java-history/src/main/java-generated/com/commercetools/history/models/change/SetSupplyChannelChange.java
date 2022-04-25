
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
@JsonDeserialize(as = SetSupplyChannelChangeImpl.class)
public interface SetSupplyChannelChange extends Change {

    String SET_SUPPLY_CHANNEL_CHANGE = "SetSupplyChannelChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setSupplyChannel</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static SetSupplyChannelChange of() {
        return new SetSupplyChannelChangeImpl();
    }

    public static SetSupplyChannelChange of(final SetSupplyChannelChange template) {
        SetSupplyChannelChangeImpl instance = new SetSupplyChannelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetSupplyChannelChangeBuilder builder() {
        return SetSupplyChannelChangeBuilder.of();
    }

    public static SetSupplyChannelChangeBuilder builder(final SetSupplyChannelChange template) {
        return SetSupplyChannelChangeBuilder.of(template);
    }

    default <T> T withSetSupplyChannelChange(Function<SetSupplyChannelChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetSupplyChannelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSupplyChannelChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSupplyChannelChange>";
            }
        };
    }
}
