
package com.commercetools.api.models.variant;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantRemoveStagedChangesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantRemoveStagedChangesAction variantRemoveStagedChangesAction = VariantRemoveStagedChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantRemoveStagedChangesActionBuilder implements Builder<VariantRemoveStagedChangesAction> {

    /**
     * builds VariantRemoveStagedChangesAction with checking for non-null required values
     * @return VariantRemoveStagedChangesAction
     */
    public VariantRemoveStagedChangesAction build() {
        return new VariantRemoveStagedChangesActionImpl();
    }

    /**
     * builds VariantRemoveStagedChangesAction without checking for non-null required values
     * @return VariantRemoveStagedChangesAction
     */
    public VariantRemoveStagedChangesAction buildUnchecked() {
        return new VariantRemoveStagedChangesActionImpl();
    }

    /**
     * factory method for an instance of VariantRemoveStagedChangesActionBuilder
     * @return builder
     */
    public static VariantRemoveStagedChangesActionBuilder of() {
        return new VariantRemoveStagedChangesActionBuilder();
    }

    /**
     * create builder for VariantRemoveStagedChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantRemoveStagedChangesActionBuilder of(final VariantRemoveStagedChangesAction template) {
        VariantRemoveStagedChangesActionBuilder builder = new VariantRemoveStagedChangesActionBuilder();
        return builder;
    }

}
