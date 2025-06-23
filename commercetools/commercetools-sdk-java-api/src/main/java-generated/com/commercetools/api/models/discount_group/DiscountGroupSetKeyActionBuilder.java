
package com.commercetools.api.models.discount_group;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetKeyAction discountGroupSetKeyAction = DiscountGroupSetKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSetKeyActionBuilder implements Builder<DiscountGroupSetKeyAction> {

    private String key;

    /**
     *  <p>New value to set.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountGroupSetKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds DiscountGroupSetKeyAction with checking for non-null required values
     * @return DiscountGroupSetKeyAction
     */
    public DiscountGroupSetKeyAction build() {
        Objects.requireNonNull(key, DiscountGroupSetKeyAction.class + ": key is missing");
        return new DiscountGroupSetKeyActionImpl(key);
    }

    /**
     * builds DiscountGroupSetKeyAction without checking for non-null required values
     * @return DiscountGroupSetKeyAction
     */
    public DiscountGroupSetKeyAction buildUnchecked() {
        return new DiscountGroupSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of DiscountGroupSetKeyActionBuilder
     * @return builder
     */
    public static DiscountGroupSetKeyActionBuilder of() {
        return new DiscountGroupSetKeyActionBuilder();
    }

    /**
     * create builder for DiscountGroupSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetKeyActionBuilder of(final DiscountGroupSetKeyAction template) {
        DiscountGroupSetKeyActionBuilder builder = new DiscountGroupSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
