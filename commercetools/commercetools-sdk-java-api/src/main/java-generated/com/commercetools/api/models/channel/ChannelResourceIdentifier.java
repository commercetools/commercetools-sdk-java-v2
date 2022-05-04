
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelResourceIdentifierImpl.class)
public interface ChannelResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Channel> {

    String CHANNEL = "channel";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Channel">Channel</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:Channel">Channel</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

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

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelResourceIdentifier>";
            }
        };
    }
}
