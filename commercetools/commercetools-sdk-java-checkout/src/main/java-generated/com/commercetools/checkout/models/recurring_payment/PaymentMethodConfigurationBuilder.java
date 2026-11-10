
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodConfiguration paymentMethodConfiguration = PaymentMethodConfiguration.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodConfigurationBuilder implements Builder<PaymentMethodConfiguration> {

    private com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentMethodConfigurationBuilder paymentMethod(
            Function<com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder, com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder> builder) {
        this.paymentMethod = builder.apply(com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentMethodConfigurationBuilder withPaymentMethod(
            Function<com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder, com.commercetools.checkout.models.common.PaymentMethodReference> builder) {
        this.paymentMethod = builder.apply(com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param paymentMethod value to be set
     * @return Builder
     */

    public PaymentMethodConfigurationBuilder paymentMethod(
            final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     *  <p><span>Connector</span> Deployment that processes the future payments of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public PaymentMethodConfigurationBuilder connectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><span>Connector</span> Deployment that processes the future payments of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public PaymentMethodConfigurationBuilder withConnectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><span>Connector</span> Deployment that processes the future payments of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param connectorDeployment value to be set
     * @return Builder
     */

    public PaymentMethodConfigurationBuilder connectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @return paymentMethod
     */

    public com.commercetools.checkout.models.common.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p><span>Connector</span> Deployment that processes the future payments of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @return connectorDeployment
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    /**
     * builds PaymentMethodConfiguration with checking for non-null required values
     * @return PaymentMethodConfiguration
     */
    public PaymentMethodConfiguration build() {
        Objects.requireNonNull(paymentMethod, PaymentMethodConfiguration.class + ": paymentMethod is missing");
        Objects.requireNonNull(connectorDeployment,
            PaymentMethodConfiguration.class + ": connectorDeployment is missing");
        return new PaymentMethodConfigurationImpl(paymentMethod, connectorDeployment);
    }

    /**
     * builds PaymentMethodConfiguration without checking for non-null required values
     * @return PaymentMethodConfiguration
     */
    public PaymentMethodConfiguration buildUnchecked() {
        return new PaymentMethodConfigurationImpl(paymentMethod, connectorDeployment);
    }

    /**
     * factory method for an instance of PaymentMethodConfigurationBuilder
     * @return builder
     */
    public static PaymentMethodConfigurationBuilder of() {
        return new PaymentMethodConfigurationBuilder();
    }

    /**
     * create builder for PaymentMethodConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodConfigurationBuilder of(final PaymentMethodConfiguration template) {
        PaymentMethodConfigurationBuilder builder = new PaymentMethodConfigurationBuilder();
        builder.paymentMethod = template.getPaymentMethod();
        builder.connectorDeployment = template.getConnectorDeployment();
        return builder;
    }

}
