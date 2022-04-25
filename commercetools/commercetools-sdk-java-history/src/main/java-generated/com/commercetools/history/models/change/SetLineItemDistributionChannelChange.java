
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLineItemDistributionChannelChangeImpl.class)
public interface SetLineItemDistributionChannelChange extends Change {

    String SET_LINE_ITEM_DISTRIBUTION_CHANNEL_CHANGE = "SetLineItemDistributionChannelChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemDistributionChannel</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setVariant(final String variant);

    public void setNextValue(final Reference nextValue);

    public void setPreviousValue(final Reference previousValue);

    public static SetLineItemDistributionChannelChange of() {
        return new SetLineItemDistributionChannelChangeImpl();
    }

    public static SetLineItemDistributionChannelChange of(final SetLineItemDistributionChannelChange template) {
        SetLineItemDistributionChannelChangeImpl instance = new SetLineItemDistributionChannelChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemDistributionChannelChangeBuilder builder() {
        return SetLineItemDistributionChannelChangeBuilder.of();
    }

    public static SetLineItemDistributionChannelChangeBuilder builder(
            final SetLineItemDistributionChannelChange template) {
        return SetLineItemDistributionChannelChangeBuilder.of(template);
    }

    default <T> T withSetLineItemDistributionChannelChange(Function<SetLineItemDistributionChannelChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDistributionChannelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDistributionChannelChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDistributionChannelChange>";
            }
        };
    }
}
