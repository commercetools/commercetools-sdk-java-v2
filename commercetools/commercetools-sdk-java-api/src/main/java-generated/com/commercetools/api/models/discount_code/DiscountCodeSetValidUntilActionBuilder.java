
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidUntilAction discountCodeSetValidUntilAction = DiscountCodeSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetValidUntilActionBuilder implements Builder<DiscountCodeSetValidUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     * @param validUntil
     * @return Builder
     */

    public DiscountCodeSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public DiscountCodeSetValidUntilAction build() {
        return new DiscountCodeSetValidUntilActionImpl(validUntil);
    }

    /**
     * builds DiscountCodeSetValidUntilAction without checking for non null required values
     */
    public DiscountCodeSetValidUntilAction buildUnchecked() {
        return new DiscountCodeSetValidUntilActionImpl(validUntil);
    }

    public static DiscountCodeSetValidUntilActionBuilder of() {
        return new DiscountCodeSetValidUntilActionBuilder();
    }

    public static DiscountCodeSetValidUntilActionBuilder of(final DiscountCodeSetValidUntilAction template) {
        DiscountCodeSetValidUntilActionBuilder builder = new DiscountCodeSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
