
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAutomatedReversalConfigurationStatusUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAutomatedReversalConfigurationStatusUpdateAction setAutomatedReversalConfigurationStatusUpdateAction = SetAutomatedReversalConfigurationStatusUpdateAction.builder()
 *             .status("{status}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAutomatedReversalConfigurationStatusUpdateActionBuilder
        implements Builder<SetAutomatedReversalConfigurationStatusUpdateAction> {

    private String status;

    /**
     *  <p>Value to set as the automated reversal configuration status of the PaymentIntegration.</p>
     * @param status value to be set
     * @return Builder
     */

    public SetAutomatedReversalConfigurationStatusUpdateActionBuilder status(final String status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Value to set as the automated reversal configuration status of the PaymentIntegration.</p>
     * @return status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * builds SetAutomatedReversalConfigurationStatusUpdateAction with checking for non-null required values
     * @return SetAutomatedReversalConfigurationStatusUpdateAction
     */
    public SetAutomatedReversalConfigurationStatusUpdateAction build() {
        Objects.requireNonNull(status,
            SetAutomatedReversalConfigurationStatusUpdateAction.class + ": status is missing");
        return new SetAutomatedReversalConfigurationStatusUpdateActionImpl(status);
    }

    /**
     * builds SetAutomatedReversalConfigurationStatusUpdateAction without checking for non-null required values
     * @return SetAutomatedReversalConfigurationStatusUpdateAction
     */
    public SetAutomatedReversalConfigurationStatusUpdateAction buildUnchecked() {
        return new SetAutomatedReversalConfigurationStatusUpdateActionImpl(status);
    }

    /**
     * factory method for an instance of SetAutomatedReversalConfigurationStatusUpdateActionBuilder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationStatusUpdateActionBuilder of() {
        return new SetAutomatedReversalConfigurationStatusUpdateActionBuilder();
    }

    /**
     * create builder for SetAutomatedReversalConfigurationStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationStatusUpdateActionBuilder of(
            final SetAutomatedReversalConfigurationStatusUpdateAction template) {
        SetAutomatedReversalConfigurationStatusUpdateActionBuilder builder = new SetAutomatedReversalConfigurationStatusUpdateActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
