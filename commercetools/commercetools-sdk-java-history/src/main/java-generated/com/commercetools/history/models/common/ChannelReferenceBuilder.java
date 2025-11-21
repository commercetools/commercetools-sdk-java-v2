
package com.commercetools.history.models.common;

import java.util.*;

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

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ChannelReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds ChannelReference with checking for non-null required values
     * @return ChannelReference
     */
    public ChannelReference build() {
        Objects.requireNonNull(id, ChannelReference.class + ": id is missing");
        return new ChannelReferenceImpl(id);
    }

    /**
     * builds ChannelReference without checking for non-null required values
     * @return ChannelReference
     */
    public ChannelReference buildUnchecked() {
        return new ChannelReferenceImpl(id);
    }

    /**
     * factory method for an instance of ChannelReferenceBuilder
     * @return builder
     */
    public static ChannelReferenceBuilder of() {
        return new ChannelReferenceBuilder();
    }

    /**
     * create builder for ChannelReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelReferenceBuilder of(final ChannelReference template) {
        ChannelReferenceBuilder builder = new ChannelReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
