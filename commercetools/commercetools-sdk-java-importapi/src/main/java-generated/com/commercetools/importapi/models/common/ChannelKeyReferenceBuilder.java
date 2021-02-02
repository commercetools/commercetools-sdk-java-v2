
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelKeyReferenceBuilder {

    private String key;

    public ChannelKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ChannelKeyReference build() {
        return new ChannelKeyReferenceImpl(key);
    }

    public static ChannelKeyReferenceBuilder of() {
        return new ChannelKeyReferenceBuilder();
    }

    public static ChannelKeyReferenceBuilder of(final ChannelKeyReference template) {
        ChannelKeyReferenceBuilder builder = new ChannelKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
