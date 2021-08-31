
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelChangeKeyActionBuilder implements Builder<ChannelChangeKeyAction> {

    private String key;

    public ChannelChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ChannelChangeKeyAction build() {
        Objects.requireNonNull(key, ChannelChangeKeyAction.class + ": key is missing");
        return new ChannelChangeKeyActionImpl(key);
    }

    /**
     * builds ChannelChangeKeyAction without checking for non null required values
     */
    public ChannelChangeKeyAction buildUnchecked() {
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
