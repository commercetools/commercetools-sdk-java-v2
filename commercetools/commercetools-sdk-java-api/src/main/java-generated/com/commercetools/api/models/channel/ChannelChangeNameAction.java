
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelChangeNameActionImpl.class)
public interface ChannelChangeNameAction extends ChannelUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
    *  <p>New value to set. Must not be empty.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ChannelChangeNameAction of() {
        return new ChannelChangeNameActionImpl();
    }

    public static ChannelChangeNameAction of(final ChannelChangeNameAction template) {
        ChannelChangeNameActionImpl instance = new ChannelChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ChannelChangeNameActionBuilder builder() {
        return ChannelChangeNameActionBuilder.of();
    }

    public static ChannelChangeNameActionBuilder builder(final ChannelChangeNameAction template) {
        return ChannelChangeNameActionBuilder.of(template);
    }

    default <T> T withChannelChangeNameAction(Function<ChannelChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelChangeNameAction>";
            }
        };
    }
}
