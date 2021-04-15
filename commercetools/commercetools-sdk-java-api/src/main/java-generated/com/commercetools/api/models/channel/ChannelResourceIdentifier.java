
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelResourceIdentifierImpl.class)
public interface ChannelResourceIdentifier extends ResourceIdentifier {

    String CHANNEL = "channel";

    public static ChannelResourceIdentifier of() {
        return new ChannelResourceIdentifierImpl();
    }

    public static ChannelResourceIdentifier of(final ChannelResourceIdentifier template) {
        ChannelResourceIdentifierImpl instance = new ChannelResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ChannelResourceIdentifierBuilder builder() {
        return ChannelResourceIdentifierBuilder.of();
    }

    public static ChannelResourceIdentifierBuilder builder(final ChannelResourceIdentifier template) {
        return ChannelResourceIdentifierBuilder.of(template);
    }

    default <T> T withChannelResourceIdentifier(Function<ChannelResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
