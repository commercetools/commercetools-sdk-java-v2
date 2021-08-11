
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelKeyReferenceBuilder implements Builder<ChannelKeyReference> {

    private String key;

    public ChannelKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ChannelKeyReference build() {
        Objects.requireNonNull(key, ChannelKeyReference.class + ": key is missing");
        return new ChannelKeyReferenceImpl(key);
    }

    /**
     * builds ChannelKeyReference without checking for non null required values
     */
    public ChannelKeyReference buildUnchecked() {
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
