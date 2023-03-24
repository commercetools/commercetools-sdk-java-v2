
package com.commercetools.api.models.discount_code;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeChangeIsActiveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeChangeIsActiveAction discountCodeChangeIsActiveAction = DiscountCodeChangeIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeChangeIsActiveActionBuilder implements Builder<DiscountCodeChangeIsActiveAction> {

    private Boolean isActive;

    /**
     *  <p>New value to set. Set to <code>true</code> to activate the DiscountCode for all matching Discounts.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public DiscountCodeChangeIsActiveActionBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * builds DiscountCodeChangeIsActiveAction with checking for non-null required values
     * @return DiscountCodeChangeIsActiveAction
     */
    public DiscountCodeChangeIsActiveAction build() {
        Objects.requireNonNull(isActive, DiscountCodeChangeIsActiveAction.class + ": isActive is missing");
        return new DiscountCodeChangeIsActiveActionImpl(isActive);
    }

    /**
     * builds DiscountCodeChangeIsActiveAction without checking for non-null required values
     * @return DiscountCodeChangeIsActiveAction
     */
    public DiscountCodeChangeIsActiveAction buildUnchecked() {
        return new DiscountCodeChangeIsActiveActionImpl(isActive);
    }

    public static DiscountCodeChangeIsActiveActionBuilder of() {
        return new DiscountCodeChangeIsActiveActionBuilder();
    }

    public static DiscountCodeChangeIsActiveActionBuilder of(final DiscountCodeChangeIsActiveAction template) {
        DiscountCodeChangeIsActiveActionBuilder builder = new DiscountCodeChangeIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
