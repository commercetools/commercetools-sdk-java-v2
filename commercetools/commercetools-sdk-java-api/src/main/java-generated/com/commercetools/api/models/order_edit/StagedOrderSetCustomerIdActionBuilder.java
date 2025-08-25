
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomerIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerIdAction stagedOrderSetCustomerIdAction = StagedOrderSetCustomerIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomerIdActionBuilder implements Builder<StagedOrderSetCustomerIdAction> {

    @Nullable
    private String customerId;

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>. If empty, any existing value is removed.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>. If empty, any existing value is removed.</p>
     * @return customerId
     */

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * builds StagedOrderSetCustomerIdAction with checking for non-null required values
     * @return StagedOrderSetCustomerIdAction
     */
    public StagedOrderSetCustomerIdAction build() {
        return new StagedOrderSetCustomerIdActionImpl(customerId);
    }

    /**
     * builds StagedOrderSetCustomerIdAction without checking for non-null required values
     * @return StagedOrderSetCustomerIdAction
     */
    public StagedOrderSetCustomerIdAction buildUnchecked() {
        return new StagedOrderSetCustomerIdActionImpl(customerId);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomerIdActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomerIdActionBuilder of() {
        return new StagedOrderSetCustomerIdActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomerIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomerIdActionBuilder of(final StagedOrderSetCustomerIdAction template) {
        StagedOrderSetCustomerIdActionBuilder builder = new StagedOrderSetCustomerIdActionBuilder();
        builder.customerId = template.getCustomerId();
        return builder;
    }

}
