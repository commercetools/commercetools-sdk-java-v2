
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetConnectorDeploymentUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetConnectorDeploymentUpdateAction setConnectorDeploymentUpdateAction = SetConnectorDeploymentUpdateAction.builder()
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetConnectorDeploymentUpdateActionBuilder implements Builder<SetConnectorDeploymentUpdateAction> {

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     *  <p>Value to set as the connector deployment reference of the PaymentIntegration.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public SetConnectorDeploymentUpdateActionBuilder connectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set as the connector deployment reference of the PaymentIntegration.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public SetConnectorDeploymentUpdateActionBuilder withConnectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set as the connector deployment reference of the PaymentIntegration.</p>
     * @param connectorDeployment value to be set
     * @return Builder
     */

    public SetConnectorDeploymentUpdateActionBuilder connectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
        return this;
    }

    /**
     *  <p>Value to set as the connector deployment reference of the PaymentIntegration.</p>
     * @return connectorDeployment
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    /**
     * builds SetConnectorDeploymentUpdateAction with checking for non-null required values
     * @return SetConnectorDeploymentUpdateAction
     */
    public SetConnectorDeploymentUpdateAction build() {
        Objects.requireNonNull(connectorDeployment,
            SetConnectorDeploymentUpdateAction.class + ": connectorDeployment is missing");
        return new SetConnectorDeploymentUpdateActionImpl(connectorDeployment);
    }

    /**
     * builds SetConnectorDeploymentUpdateAction without checking for non-null required values
     * @return SetConnectorDeploymentUpdateAction
     */
    public SetConnectorDeploymentUpdateAction buildUnchecked() {
        return new SetConnectorDeploymentUpdateActionImpl(connectorDeployment);
    }

    /**
     * factory method for an instance of SetConnectorDeploymentUpdateActionBuilder
     * @return builder
     */
    public static SetConnectorDeploymentUpdateActionBuilder of() {
        return new SetConnectorDeploymentUpdateActionBuilder();
    }

    /**
     * create builder for SetConnectorDeploymentUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetConnectorDeploymentUpdateActionBuilder of(final SetConnectorDeploymentUpdateAction template) {
        SetConnectorDeploymentUpdateActionBuilder builder = new SetConnectorDeploymentUpdateActionBuilder();
        builder.connectorDeployment = template.getConnectorDeployment();
        return builder;
    }

}
