
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetActivePaymentComponentTypeUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetActivePaymentComponentTypeUpdateAction setActivePaymentComponentTypeUpdateAction = SetActivePaymentComponentTypeUpdateAction.builder()
 *             .activePaymentComponentType(PaymentComponentType.COMPONENT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetActivePaymentComponentTypeUpdateActionBuilder
        implements Builder<SetActivePaymentComponentTypeUpdateAction> {

    private com.commercetools.checkout.models.payment_integration.PaymentComponentType activePaymentComponentType;

    /**
     *  <p>Type of payment components that the Application will use.</p>
     * @param activePaymentComponentType value to be set
     * @return Builder
     */

    public SetActivePaymentComponentTypeUpdateActionBuilder activePaymentComponentType(
            final com.commercetools.checkout.models.payment_integration.PaymentComponentType activePaymentComponentType) {
        this.activePaymentComponentType = activePaymentComponentType;
        return this;
    }

    /**
     *  <p>Type of payment components that the Application will use.</p>
     * @return activePaymentComponentType
     */

    public com.commercetools.checkout.models.payment_integration.PaymentComponentType getActivePaymentComponentType() {
        return this.activePaymentComponentType;
    }

    /**
     * builds SetActivePaymentComponentTypeUpdateAction with checking for non-null required values
     * @return SetActivePaymentComponentTypeUpdateAction
     */
    public SetActivePaymentComponentTypeUpdateAction build() {
        Objects.requireNonNull(activePaymentComponentType,
            SetActivePaymentComponentTypeUpdateAction.class + ": activePaymentComponentType is missing");
        return new SetActivePaymentComponentTypeUpdateActionImpl(activePaymentComponentType);
    }

    /**
     * builds SetActivePaymentComponentTypeUpdateAction without checking for non-null required values
     * @return SetActivePaymentComponentTypeUpdateAction
     */
    public SetActivePaymentComponentTypeUpdateAction buildUnchecked() {
        return new SetActivePaymentComponentTypeUpdateActionImpl(activePaymentComponentType);
    }

    /**
     * factory method for an instance of SetActivePaymentComponentTypeUpdateActionBuilder
     * @return builder
     */
    public static SetActivePaymentComponentTypeUpdateActionBuilder of() {
        return new SetActivePaymentComponentTypeUpdateActionBuilder();
    }

    /**
     * create builder for SetActivePaymentComponentTypeUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetActivePaymentComponentTypeUpdateActionBuilder of(
            final SetActivePaymentComponentTypeUpdateAction template) {
        SetActivePaymentComponentTypeUpdateActionBuilder builder = new SetActivePaymentComponentTypeUpdateActionBuilder();
        builder.activePaymentComponentType = template.getActivePaymentComponentType();
        return builder;
    }

}
