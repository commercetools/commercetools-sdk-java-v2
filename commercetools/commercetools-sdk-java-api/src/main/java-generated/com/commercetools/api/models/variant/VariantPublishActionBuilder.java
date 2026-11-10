
package com.commercetools.api.models.variant;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantPublishActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPublishAction variantPublishAction = VariantPublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantPublishActionBuilder implements Builder<VariantPublishAction> {

    /**
     * builds VariantPublishAction with checking for non-null required values
     * @return VariantPublishAction
     */
    public VariantPublishAction build() {
        return new VariantPublishActionImpl();
    }

    /**
     * builds VariantPublishAction without checking for non-null required values
     * @return VariantPublishAction
     */
    public VariantPublishAction buildUnchecked() {
        return new VariantPublishActionImpl();
    }

    /**
     * factory method for an instance of VariantPublishActionBuilder
     * @return builder
     */
    public static VariantPublishActionBuilder of() {
        return new VariantPublishActionBuilder();
    }

    /**
     * create builder for VariantPublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPublishActionBuilder of(final VariantPublishAction template) {
        VariantPublishActionBuilder builder = new VariantPublishActionBuilder();
        return builder;
    }

}
