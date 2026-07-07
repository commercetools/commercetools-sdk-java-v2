
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetKeyAction variantSetKeyAction = VariantSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetKeyActionBuilder implements Builder<VariantSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. Must be unique.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds VariantSetKeyAction with checking for non-null required values
     * @return VariantSetKeyAction
     */
    public VariantSetKeyAction build() {
        return new VariantSetKeyActionImpl(key);
    }

    /**
     * builds VariantSetKeyAction without checking for non-null required values
     * @return VariantSetKeyAction
     */
    public VariantSetKeyAction buildUnchecked() {
        return new VariantSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of VariantSetKeyActionBuilder
     * @return builder
     */
    public static VariantSetKeyActionBuilder of() {
        return new VariantSetKeyActionBuilder();
    }

    /**
     * create builder for VariantSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetKeyActionBuilder of(final VariantSetKeyAction template) {
        VariantSetKeyActionBuilder builder = new VariantSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
