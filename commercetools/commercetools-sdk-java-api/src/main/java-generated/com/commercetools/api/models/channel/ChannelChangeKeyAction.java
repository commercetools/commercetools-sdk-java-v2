
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelChangeKeyActionImpl.class)
public interface ChannelChangeKeyAction extends ChannelUpdateAction {

    String CHANGE_KEY = "changeKey";

    /**
    *  <p>New value to set. Must not be empty.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ChannelChangeKeyAction of() {
        return new ChannelChangeKeyActionImpl();
    }

    public static ChannelChangeKeyAction of(final ChannelChangeKeyAction template) {
        ChannelChangeKeyActionImpl instance = new ChannelChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ChannelChangeKeyActionBuilder builder() {
        return ChannelChangeKeyActionBuilder.of();
    }

    public static ChannelChangeKeyActionBuilder builder(final ChannelChangeKeyAction template) {
        return ChannelChangeKeyActionBuilder.of(template);
    }

    default <T> T withChannelChangeKeyAction(Function<ChannelChangeKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelChangeKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelChangeKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelChangeKeyAction>";
            }
        };
    }
}
