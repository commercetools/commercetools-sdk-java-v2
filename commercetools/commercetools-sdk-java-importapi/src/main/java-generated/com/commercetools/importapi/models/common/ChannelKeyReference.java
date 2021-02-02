
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a channel by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelKeyReferenceImpl.class)
public interface ChannelKeyReference extends KeyReference {

    String CHANNEL = "channel";

    public static ChannelKeyReference of() {
        return new ChannelKeyReferenceImpl();
    }

    public static ChannelKeyReference of(final ChannelKeyReference template) {
        ChannelKeyReferenceImpl instance = new ChannelKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ChannelKeyReferenceBuilder builder() {
        return ChannelKeyReferenceBuilder.of();
    }

    public static ChannelKeyReferenceBuilder builder(final ChannelKeyReference template) {
        return ChannelKeyReferenceBuilder.of(template);
    }

    default <T> T withChannelKeyReference(Function<ChannelKeyReference, T> helper) {
        return helper.apply(this);
    }
}
