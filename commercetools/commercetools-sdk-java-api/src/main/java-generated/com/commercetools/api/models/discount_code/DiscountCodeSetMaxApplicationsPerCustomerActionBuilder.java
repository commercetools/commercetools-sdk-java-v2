
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetMaxApplicationsPerCustomerActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetMaxApplicationsPerCustomerAction discountCodeSetMaxApplicationsPerCustomerAction = DiscountCodeSetMaxApplicationsPerCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetMaxApplicationsPerCustomerActionBuilder
        implements Builder<DiscountCodeSetMaxApplicationsPerCustomerAction> {

    @Nullable
    private Long maxApplicationsPerCustomer;

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times. This field does not limit discount applications for Orders created from a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
     * @param maxApplicationsPerCustomer value to be set
     * @return Builder
     */

    public DiscountCodeSetMaxApplicationsPerCustomerActionBuilder maxApplicationsPerCustomer(
            @Nullable final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times. This field does not limit discount applications for Orders created from a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
     * @return maxApplicationsPerCustomer
     */

    @Nullable
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    /**
     * builds DiscountCodeSetMaxApplicationsPerCustomerAction with checking for non-null required values
     * @return DiscountCodeSetMaxApplicationsPerCustomerAction
     */
    public DiscountCodeSetMaxApplicationsPerCustomerAction build() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionImpl(maxApplicationsPerCustomer);
    }

    /**
     * builds DiscountCodeSetMaxApplicationsPerCustomerAction without checking for non-null required values
     * @return DiscountCodeSetMaxApplicationsPerCustomerAction
     */
    public DiscountCodeSetMaxApplicationsPerCustomerAction buildUnchecked() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionImpl(maxApplicationsPerCustomer);
    }

    /**
     * factory method for an instance of DiscountCodeSetMaxApplicationsPerCustomerActionBuilder
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder of() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetMaxApplicationsPerCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder of(
            final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
        DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder = new DiscountCodeSetMaxApplicationsPerCustomerActionBuilder();
        builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
        return builder;
    }

}
