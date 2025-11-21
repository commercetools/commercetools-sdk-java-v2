
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStatusUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusUpdateAction setStatusUpdateAction = SetStatusUpdateAction.builder()
 *             .status(PaymentIntegrationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStatusUpdateActionBuilder implements Builder<SetStatusUpdateAction> {

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status;

    /**
     *  <p>Value to set as the status of the PaymentIntegration.</p>
     * @param status value to be set
     * @return Builder
     */

    public SetStatusUpdateActionBuilder status(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Value to set as the status of the PaymentIntegration.</p>
     * @return status
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus getStatus() {
        return this.status;
    }

    /**
     * builds SetStatusUpdateAction with checking for non-null required values
     * @return SetStatusUpdateAction
     */
    public SetStatusUpdateAction build() {
        Objects.requireNonNull(status, SetStatusUpdateAction.class + ": status is missing");
        return new SetStatusUpdateActionImpl(status);
    }

    /**
     * builds SetStatusUpdateAction without checking for non-null required values
     * @return SetStatusUpdateAction
     */
    public SetStatusUpdateAction buildUnchecked() {
        return new SetStatusUpdateActionImpl(status);
    }

    /**
     * factory method for an instance of SetStatusUpdateActionBuilder
     * @return builder
     */
    public static SetStatusUpdateActionBuilder of() {
        return new SetStatusUpdateActionBuilder();
    }

    /**
     * create builder for SetStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusUpdateActionBuilder of(final SetStatusUpdateAction template) {
        SetStatusUpdateActionBuilder builder = new SetStatusUpdateActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
