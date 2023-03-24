
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentUpdate paymentUpdate = PaymentUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentUpdateBuilder implements Builder<PaymentUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions;

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public PaymentUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentUpdateBuilder actions(final com.commercetools.api.models.payment.PaymentUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentUpdateBuilder plusActions(final com.commercetools.api.models.payment.PaymentUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentUpdateBuilder plusActions(
            Function<com.commercetools.api.models.payment.PaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.payment.PaymentUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.payment.PaymentUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentUpdateBuilder withActions(
            Function<com.commercetools.api.models.payment.PaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.payment.PaymentUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.payment.PaymentUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds PaymentUpdate with checking for non-null required values
     * @return PaymentUpdate
     */
    public PaymentUpdate build() {
        Objects.requireNonNull(version, PaymentUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, PaymentUpdate.class + ": actions is missing");
        return new PaymentUpdateImpl(version, actions);
    }

    /**
     * builds PaymentUpdate without checking for non-null required values
     * @return PaymentUpdate
     */
    public PaymentUpdate buildUnchecked() {
        return new PaymentUpdateImpl(version, actions);
    }

    public static PaymentUpdateBuilder of() {
        return new PaymentUpdateBuilder();
    }

    public static PaymentUpdateBuilder of(final PaymentUpdate template) {
        PaymentUpdateBuilder builder = new PaymentUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
