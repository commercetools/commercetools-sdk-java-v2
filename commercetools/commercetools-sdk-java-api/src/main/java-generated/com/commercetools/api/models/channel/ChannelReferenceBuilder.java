
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelReference channelReference = ChannelReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelReferenceBuilder implements Builder<ChannelReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.channel.Channel obj;

    /**
     *  <p>Unique identifier of the referenced Channel.</p>
     * @param id
     * @return Builder
     */

    public ChannelReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Channel. Only present in responses to requests with Reference Expansion for Channels.</p>
     * @return Builder
     */

    public ChannelReferenceBuilder obj(
            Function<com.commercetools.api.models.channel.ChannelBuilder, com.commercetools.api.models.channel.ChannelBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.channel.ChannelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Channel. Only present in responses to requests with Reference Expansion for Channels.</p>
     * @param obj
     * @return Builder
     */

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
        Objects.requireNonNull(id, ChannelReference.class + ": id is missing");
        return new ChannelReferenceImpl(id, obj);
    }

    /**
     * builds ChannelReference without checking for non null required values
     */
    public ChannelReference buildUnchecked() {
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
