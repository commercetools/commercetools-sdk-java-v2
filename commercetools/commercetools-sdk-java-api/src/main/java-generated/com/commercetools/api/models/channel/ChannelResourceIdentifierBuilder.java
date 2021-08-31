
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelResourceIdentifierBuilder implements Builder<ChannelResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ChannelResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ChannelResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ChannelResourceIdentifier build() {
        return new ChannelResourceIdentifierImpl(id, key);
    }

    /**
     * builds ChannelResourceIdentifier without checking for non null required values
     */
    public ChannelResourceIdentifier buildUnchecked() {
        return new ChannelResourceIdentifierImpl(id, key);
    }

    public static ChannelResourceIdentifierBuilder of() {
        return new ChannelResourceIdentifierBuilder();
    }

    public static ChannelResourceIdentifierBuilder of(final ChannelResourceIdentifier template) {
        ChannelResourceIdentifierBuilder builder = new ChannelResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
