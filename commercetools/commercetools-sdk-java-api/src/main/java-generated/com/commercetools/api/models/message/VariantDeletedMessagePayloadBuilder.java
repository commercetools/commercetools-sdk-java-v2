
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantDeletedMessagePayload variantDeletedMessagePayload = VariantDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantDeletedMessagePayloadBuilder implements Builder<VariantDeletedMessagePayload> {

    /**
     * builds VariantDeletedMessagePayload with checking for non-null required values
     * @return VariantDeletedMessagePayload
     */
    public VariantDeletedMessagePayload build() {
        return new VariantDeletedMessagePayloadImpl();
    }

    /**
     * builds VariantDeletedMessagePayload without checking for non-null required values
     * @return VariantDeletedMessagePayload
     */
    public VariantDeletedMessagePayload buildUnchecked() {
        return new VariantDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of VariantDeletedMessagePayloadBuilder
     * @return builder
     */
    public static VariantDeletedMessagePayloadBuilder of() {
        return new VariantDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDeletedMessagePayloadBuilder of(final VariantDeletedMessagePayload template) {
        VariantDeletedMessagePayloadBuilder builder = new VariantDeletedMessagePayloadBuilder();
        return builder;
    }

}
