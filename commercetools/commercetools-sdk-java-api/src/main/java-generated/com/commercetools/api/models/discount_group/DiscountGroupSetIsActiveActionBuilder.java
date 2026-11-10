
package com.commercetools.api.models.discount_group;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupSetIsActiveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetIsActiveAction discountGroupSetIsActiveAction = DiscountGroupSetIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSetIsActiveActionBuilder implements Builder<DiscountGroupSetIsActiveAction> {

    private Boolean isActive;

    /**
     *  <p>New value to set.</p>
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public DiscountGroupSetIsActiveActionBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @return isActive
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * builds DiscountGroupSetIsActiveAction with checking for non-null required values
     * @return DiscountGroupSetIsActiveAction
     */
    public DiscountGroupSetIsActiveAction build() {
        Objects.requireNonNull(isActive, DiscountGroupSetIsActiveAction.class + ": isActive is missing");
        return new DiscountGroupSetIsActiveActionImpl(isActive);
    }

    /**
     * builds DiscountGroupSetIsActiveAction without checking for non-null required values
     * @return DiscountGroupSetIsActiveAction
     */
    public DiscountGroupSetIsActiveAction buildUnchecked() {
        return new DiscountGroupSetIsActiveActionImpl(isActive);
    }

    /**
     * factory method for an instance of DiscountGroupSetIsActiveActionBuilder
     * @return builder
     */
    public static DiscountGroupSetIsActiveActionBuilder of() {
        return new DiscountGroupSetIsActiveActionBuilder();
    }

    /**
     * create builder for DiscountGroupSetIsActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetIsActiveActionBuilder of(final DiscountGroupSetIsActiveAction template) {
        DiscountGroupSetIsActiveActionBuilder builder = new DiscountGroupSetIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
