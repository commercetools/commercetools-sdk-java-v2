
package com.commercetools.api.models.payment_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodUpdate paymentMethodUpdate = PaymentMethodUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodUpdateBuilder implements Builder<PaymentMethodUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.payment_method.PaymentMethodUpdateAction> actions;

    /**
     *  <p>Expected version of the PaymentMethod on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public PaymentMethodUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentMethodUpdateBuilder actions(
            final com.commercetools.api.models.payment_method.PaymentMethodUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentMethodUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.payment_method.PaymentMethodUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @param actions value to be set
     * @return Builder
     */

    public PaymentMethodUpdateBuilder plusActions(
            final com.commercetools.api.models.payment_method.PaymentMethodUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentMethodUpdateBuilder plusActions(
            Function<com.commercetools.api.models.payment_method.PaymentMethodUpdateActionBuilder, Builder<? extends com.commercetools.api.models.payment_method.PaymentMethodUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.payment_method.PaymentMethodUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public PaymentMethodUpdateBuilder withActions(
            Function<com.commercetools.api.models.payment_method.PaymentMethodUpdateActionBuilder, Builder<? extends com.commercetools.api.models.payment_method.PaymentMethodUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.payment_method.PaymentMethodUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the PaymentMethod on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the PaymentMethod.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.payment_method.PaymentMethodUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds PaymentMethodUpdate with checking for non-null required values
     * @return PaymentMethodUpdate
     */
    public PaymentMethodUpdate build() {
        Objects.requireNonNull(version, PaymentMethodUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, PaymentMethodUpdate.class + ": actions is missing");
        return new PaymentMethodUpdateImpl(version, actions);
    }

    /**
     * builds PaymentMethodUpdate without checking for non-null required values
     * @return PaymentMethodUpdate
     */
    public PaymentMethodUpdate buildUnchecked() {
        return new PaymentMethodUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of PaymentMethodUpdateBuilder
     * @return builder
     */
    public static PaymentMethodUpdateBuilder of() {
        return new PaymentMethodUpdateBuilder();
    }

    /**
     * create builder for PaymentMethodUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodUpdateBuilder of(final PaymentMethodUpdate template) {
        PaymentMethodUpdateBuilder builder = new PaymentMethodUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
