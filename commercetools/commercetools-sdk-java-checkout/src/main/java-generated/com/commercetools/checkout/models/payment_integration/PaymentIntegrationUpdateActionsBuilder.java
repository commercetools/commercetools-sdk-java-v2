
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationUpdateActionsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationUpdateActions paymentIntegrationUpdateActions = PaymentIntegrationUpdateActions.builder()
 *             .version(1)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationUpdateActionsBuilder implements Builder<PaymentIntegrationUpdateActions> {

    private Integer version;

    private java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction> actions;

    /**
     *  <p>Expected version of the PaymentIntegration on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public PaymentIntegrationUpdateActionsBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentIntegrationUpdateActionsBuilder actions(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentIntegrationUpdateActionsBuilder actions(
            final java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentIntegrationUpdateActionsBuilder plusActions(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentIntegrationUpdateActionsBuilder plusActions(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionBuilder, Builder<? extends com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder
                .apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionBuilder.of())
                .build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentIntegrationUpdateActionsBuilder withActions(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionBuilder, Builder<? extends com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder
                .apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionBuilder.of())
                .build());
        return this;
    }

    /**
     *  <p>Expected version of the PaymentIntegration on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the PaymentIntegration.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds PaymentIntegrationUpdateActions with checking for non-null required values
     * @return PaymentIntegrationUpdateActions
     */
    public PaymentIntegrationUpdateActions build() {
        Objects.requireNonNull(version, PaymentIntegrationUpdateActions.class + ": version is missing");
        Objects.requireNonNull(actions, PaymentIntegrationUpdateActions.class + ": actions is missing");
        return new PaymentIntegrationUpdateActionsImpl(version, actions);
    }

    /**
     * builds PaymentIntegrationUpdateActions without checking for non-null required values
     * @return PaymentIntegrationUpdateActions
     */
    public PaymentIntegrationUpdateActions buildUnchecked() {
        return new PaymentIntegrationUpdateActionsImpl(version, actions);
    }

    /**
     * factory method for an instance of PaymentIntegrationUpdateActionsBuilder
     * @return builder
     */
    public static PaymentIntegrationUpdateActionsBuilder of() {
        return new PaymentIntegrationUpdateActionsBuilder();
    }

    /**
     * create builder for PaymentIntegrationUpdateActions instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationUpdateActionsBuilder of(final PaymentIntegrationUpdateActions template) {
        PaymentIntegrationUpdateActionsBuilder builder = new PaymentIntegrationUpdateActionsBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
