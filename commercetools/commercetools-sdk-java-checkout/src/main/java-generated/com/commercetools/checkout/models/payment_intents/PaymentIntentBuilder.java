
package com.commercetools.checkout.models.payment_intents;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntent paymentIntent = PaymentIntent.builder()
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentBuilder implements Builder<PaymentIntent> {

    private java.util.List<com.commercetools.checkout.models.payment_intents.PaymentIntentAction> actions;

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentIntentBuilder actions(
            final com.commercetools.checkout.models.payment_intents.PaymentIntentAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentIntentBuilder actions(
            final java.util.List<com.commercetools.checkout.models.payment_intents.PaymentIntentAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentIntentBuilder plusActions(
            final com.commercetools.checkout.models.payment_intents.PaymentIntentAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentIntentBuilder plusActions(
            Function<com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder, com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentIntentBuilder withActions(
            Function<com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder, com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentIntentBuilder addActions(
            Function<com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder, com.commercetools.checkout.models.payment_intents.PaymentIntentAction> builder) {
        return plusActions(
            builder.apply(com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder.of()));
    }

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentIntentBuilder setActions(
            Function<com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder, com.commercetools.checkout.models.payment_intents.PaymentIntentAction> builder) {
        return actions(
            builder.apply(com.commercetools.checkout.models.payment_intents.PaymentIntentActionBuilder.of()));
    }

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.checkout.models.payment_intents.PaymentIntentAction> getActions() {
        return this.actions;
    }

    /**
     * builds PaymentIntent with checking for non-null required values
     * @return PaymentIntent
     */
    public PaymentIntent build() {
        Objects.requireNonNull(actions, PaymentIntent.class + ": actions is missing");
        return new PaymentIntentImpl(actions);
    }

    /**
     * builds PaymentIntent without checking for non-null required values
     * @return PaymentIntent
     */
    public PaymentIntent buildUnchecked() {
        return new PaymentIntentImpl(actions);
    }

    /**
     * factory method for an instance of PaymentIntentBuilder
     * @return builder
     */
    public static PaymentIntentBuilder of() {
        return new PaymentIntentBuilder();
    }

    /**
     * create builder for PaymentIntent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentBuilder of(final PaymentIntent template) {
        PaymentIntentBuilder builder = new PaymentIntentBuilder();
        builder.actions = template.getActions();
        return builder;
    }

}
