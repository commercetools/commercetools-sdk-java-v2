
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelSetAddressCustomFieldActionImpl.class)
public interface ChannelSetAddressCustomFieldAction extends ChannelUpdateAction {

    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static ChannelSetAddressCustomFieldAction of() {
        return new ChannelSetAddressCustomFieldActionImpl();
    }

    public static ChannelSetAddressCustomFieldAction of(final ChannelSetAddressCustomFieldAction template) {
        ChannelSetAddressCustomFieldActionImpl instance = new ChannelSetAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ChannelSetAddressCustomFieldActionBuilder builder() {
        return ChannelSetAddressCustomFieldActionBuilder.of();
    }

    public static ChannelSetAddressCustomFieldActionBuilder builder(final ChannelSetAddressCustomFieldAction template) {
        return ChannelSetAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withChannelSetAddressCustomFieldAction(Function<ChannelSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
