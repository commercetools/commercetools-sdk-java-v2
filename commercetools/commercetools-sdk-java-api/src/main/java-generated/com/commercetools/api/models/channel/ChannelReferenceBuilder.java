
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.channel.Channel obj;

    public ChannelReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ChannelReferenceBuilder obj(@Nullable final com.commercetools.api.models.channel.Channel obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.channel.Channel getObj() {
        return this.obj;
    }

    public ChannelReference build() {
        return new ChannelReferenceImpl(id, obj);
    }

    public static ChannelReferenceBuilder of() {
        return new ChannelReferenceBuilder();
    }

    public static ChannelReferenceBuilder of(final ChannelReference template) {
        ChannelReferenceBuilder builder = new ChannelReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
