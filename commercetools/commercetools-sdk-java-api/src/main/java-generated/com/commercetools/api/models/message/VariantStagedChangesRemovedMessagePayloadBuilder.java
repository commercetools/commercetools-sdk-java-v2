
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantStagedChangesRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantStagedChangesRemovedMessagePayload variantStagedChangesRemovedMessagePayload = VariantStagedChangesRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantStagedChangesRemovedMessagePayloadBuilder
        implements Builder<VariantStagedChangesRemovedMessagePayload> {

    /**
     * builds VariantStagedChangesRemovedMessagePayload with checking for non-null required values
     * @return VariantStagedChangesRemovedMessagePayload
     */
    public VariantStagedChangesRemovedMessagePayload build() {
        return new VariantStagedChangesRemovedMessagePayloadImpl();
    }

    /**
     * builds VariantStagedChangesRemovedMessagePayload without checking for non-null required values
     * @return VariantStagedChangesRemovedMessagePayload
     */
    public VariantStagedChangesRemovedMessagePayload buildUnchecked() {
        return new VariantStagedChangesRemovedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of VariantStagedChangesRemovedMessagePayloadBuilder
     * @return builder
     */
    public static VariantStagedChangesRemovedMessagePayloadBuilder of() {
        return new VariantStagedChangesRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantStagedChangesRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantStagedChangesRemovedMessagePayloadBuilder of(
            final VariantStagedChangesRemovedMessagePayload template) {
        VariantStagedChangesRemovedMessagePayloadBuilder builder = new VariantStagedChangesRemovedMessagePayloadBuilder();
        return builder;
    }

}
