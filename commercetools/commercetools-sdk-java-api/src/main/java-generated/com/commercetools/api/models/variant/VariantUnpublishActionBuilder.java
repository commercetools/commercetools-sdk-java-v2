
package com.commercetools.api.models.variant;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantUnpublishActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUnpublishAction variantUnpublishAction = VariantUnpublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantUnpublishActionBuilder implements Builder<VariantUnpublishAction> {

    /**
     * builds VariantUnpublishAction with checking for non-null required values
     * @return VariantUnpublishAction
     */
    public VariantUnpublishAction build() {
        return new VariantUnpublishActionImpl();
    }

    /**
     * builds VariantUnpublishAction without checking for non-null required values
     * @return VariantUnpublishAction
     */
    public VariantUnpublishAction buildUnchecked() {
        return new VariantUnpublishActionImpl();
    }

    /**
     * factory method for an instance of VariantUnpublishActionBuilder
     * @return builder
     */
    public static VariantUnpublishActionBuilder of() {
        return new VariantUnpublishActionBuilder();
    }

    /**
     * create builder for VariantUnpublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantUnpublishActionBuilder of(final VariantUnpublishAction template) {
        VariantUnpublishActionBuilder builder = new VariantUnpublishActionBuilder();
        return builder;
    }

}
