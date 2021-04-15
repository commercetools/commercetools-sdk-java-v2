
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelChangeKeyActionBuilder {

    private String key;

    public ChannelChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ChannelChangeKeyAction build() {
        return new ChannelChangeKeyActionImpl(key);
    }

    public static ChannelChangeKeyActionBuilder of() {
        return new ChannelChangeKeyActionBuilder();
    }

    public static ChannelChangeKeyActionBuilder of(final ChannelChangeKeyAction template) {
        ChannelChangeKeyActionBuilder builder = new ChannelChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
