
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
@JsonDeserialize(as = SetDistributionChannelsChangeImpl.class)
public interface SetDistributionChannelsChange extends Change {

    String SET_DISTRIBUTION_CHANNELS_CHANGE = "SetDistributionChannelsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setDistributionChannels</code></p>
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

    public static SetDistributionChannelsChange of() {
        return new SetDistributionChannelsChangeImpl();
    }

    public static SetDistributionChannelsChange of(final SetDistributionChannelsChange template) {
        SetDistributionChannelsChangeImpl instance = new SetDistributionChannelsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetDistributionChannelsChangeBuilder builder() {
        return SetDistributionChannelsChangeBuilder.of();
    }

    public static SetDistributionChannelsChangeBuilder builder(final SetDistributionChannelsChange template) {
        return SetDistributionChannelsChangeBuilder.of(template);
    }

    default <T> T withSetDistributionChannelsChange(Function<SetDistributionChannelsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetDistributionChannelsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDistributionChannelsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDistributionChannelsChange>";
            }
        };
    }
}
