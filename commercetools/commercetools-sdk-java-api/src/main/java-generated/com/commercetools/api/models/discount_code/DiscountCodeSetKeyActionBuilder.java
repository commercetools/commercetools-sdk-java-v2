
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetKeyAction discountCodeSetKeyAction = DiscountCodeSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetKeyActionBuilder implements Builder<DiscountCodeSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Unique value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountCodeSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds DiscountCodeSetKeyAction with checking for non-null required values
     * @return DiscountCodeSetKeyAction
     */
    public DiscountCodeSetKeyAction build() {
        return new DiscountCodeSetKeyActionImpl(key);
    }

    /**
     * builds DiscountCodeSetKeyAction without checking for non-null required values
     * @return DiscountCodeSetKeyAction
     */
    public DiscountCodeSetKeyAction buildUnchecked() {
        return new DiscountCodeSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of DiscountCodeSetKeyActionBuilder
     * @return builder
     */
    public static DiscountCodeSetKeyActionBuilder of() {
        return new DiscountCodeSetKeyActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetKeyActionBuilder of(final DiscountCodeSetKeyAction template) {
        DiscountCodeSetKeyActionBuilder builder = new DiscountCodeSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
