
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelSetAddressActionImpl.class)
public interface ChannelSetAddressAction extends ChannelUpdateAction {

    String SET_ADDRESS = "setAddress";

    /**
    *  <p>Value to set. If empty, any existing value will be removed.</p>
    */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static ChannelSetAddressAction of() {
        return new ChannelSetAddressActionImpl();
    }

    public static ChannelSetAddressAction of(final ChannelSetAddressAction template) {
        ChannelSetAddressActionImpl instance = new ChannelSetAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static ChannelSetAddressActionBuilder builder() {
        return ChannelSetAddressActionBuilder.of();
    }

    public static ChannelSetAddressActionBuilder builder(final ChannelSetAddressAction template) {
        return ChannelSetAddressActionBuilder.of(template);
    }

    default <T> T withChannelSetAddressAction(Function<ChannelSetAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetAddressAction>";
            }
        };
    }
}
