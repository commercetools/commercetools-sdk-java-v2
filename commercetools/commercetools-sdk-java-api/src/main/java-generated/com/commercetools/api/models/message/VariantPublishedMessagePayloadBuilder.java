
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantPublishedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPublishedMessagePayload variantPublishedMessagePayload = VariantPublishedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantPublishedMessagePayloadBuilder implements Builder<VariantPublishedMessagePayload> {

    /**
     * builds VariantPublishedMessagePayload with checking for non-null required values
     * @return VariantPublishedMessagePayload
     */
    public VariantPublishedMessagePayload build() {
        return new VariantPublishedMessagePayloadImpl();
    }

    /**
     * builds VariantPublishedMessagePayload without checking for non-null required values
     * @return VariantPublishedMessagePayload
     */
    public VariantPublishedMessagePayload buildUnchecked() {
        return new VariantPublishedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of VariantPublishedMessagePayloadBuilder
     * @return builder
     */
    public static VariantPublishedMessagePayloadBuilder of() {
        return new VariantPublishedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantPublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPublishedMessagePayloadBuilder of(final VariantPublishedMessagePayload template) {
        VariantPublishedMessagePayloadBuilder builder = new VariantPublishedMessagePayloadBuilder();
        return builder;
    }

}
