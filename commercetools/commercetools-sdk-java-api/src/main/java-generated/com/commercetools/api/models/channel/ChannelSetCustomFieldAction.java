
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelSetCustomFieldActionImpl.class)
public interface ChannelSetCustomFieldAction extends ChannelUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static ChannelSetCustomFieldAction of() {
        return new ChannelSetCustomFieldActionImpl();
    }

    public static ChannelSetCustomFieldAction of(final ChannelSetCustomFieldAction template) {
        ChannelSetCustomFieldActionImpl instance = new ChannelSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ChannelSetCustomFieldActionBuilder builder() {
        return ChannelSetCustomFieldActionBuilder.of();
    }

    public static ChannelSetCustomFieldActionBuilder builder(final ChannelSetCustomFieldAction template) {
        return ChannelSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withChannelSetCustomFieldAction(Function<ChannelSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
