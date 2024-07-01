
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetMaxApplicationsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetMaxApplicationsAction discountCodeSetMaxApplicationsAction = DiscountCodeSetMaxApplicationsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetMaxApplicationsActionBuilder implements Builder<DiscountCodeSetMaxApplicationsAction> {

    @Nullable
    private Long maxApplications;

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times.</p>
     * @param maxApplications value to be set
     * @return Builder
     */

    public DiscountCodeSetMaxApplicationsActionBuilder maxApplications(@Nullable final Long maxApplications) {
        this.maxApplications = maxApplications;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times.</p>
     * @return maxApplications
     */

    @Nullable
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    /**
     * builds DiscountCodeSetMaxApplicationsAction with checking for non-null required values
     * @return DiscountCodeSetMaxApplicationsAction
     */
    public DiscountCodeSetMaxApplicationsAction build() {
        return new DiscountCodeSetMaxApplicationsActionImpl(maxApplications);
    }

    /**
     * builds DiscountCodeSetMaxApplicationsAction without checking for non-null required values
     * @return DiscountCodeSetMaxApplicationsAction
     */
    public DiscountCodeSetMaxApplicationsAction buildUnchecked() {
        return new DiscountCodeSetMaxApplicationsActionImpl(maxApplications);
    }

    /**
     * factory method for an instance of DiscountCodeSetMaxApplicationsActionBuilder
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsActionBuilder of() {
        return new DiscountCodeSetMaxApplicationsActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetMaxApplicationsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsActionBuilder of(final DiscountCodeSetMaxApplicationsAction template) {
        DiscountCodeSetMaxApplicationsActionBuilder builder = new DiscountCodeSetMaxApplicationsActionBuilder();
        builder.maxApplications = template.getMaxApplications();
        return builder;
    }

}
