
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelKeyReference channelKeyReference = ChannelKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelKeyReferenceBuilder implements Builder<ChannelKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced Channel.</p>
     * @param key value to be set
     * @return Builder
     */

    public ChannelKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Channel.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds ChannelKeyReference with checking for non-null required values
     * @return ChannelKeyReference
     */
    public ChannelKeyReference build() {
        Objects.requireNonNull(key, ChannelKeyReference.class + ": key is missing");
        return new ChannelKeyReferenceImpl(key);
    }

    /**
     * builds ChannelKeyReference without checking for non-null required values
     * @return ChannelKeyReference
     */
    public ChannelKeyReference buildUnchecked() {
        return new ChannelKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of ChannelKeyReferenceBuilder
     * @return builder
     */
    public static ChannelKeyReferenceBuilder of() {
        return new ChannelKeyReferenceBuilder();
    }

    /**
     * create builder for ChannelKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelKeyReferenceBuilder of(final ChannelKeyReference template) {
        ChannelKeyReferenceBuilder builder = new ChannelKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
