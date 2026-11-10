
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.PaymentMethodReference;
import com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> and the <span>Connector</span> that processes it.</p>
 *  <p>Checkout only supports processing a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a> with one PaymentMethodConfiguration.</p>
 *
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
@JsonDeserialize(as = PaymentMethodConfigurationImpl.class)
public interface PaymentMethodConfiguration {

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @return paymentMethod
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethod")
    public PaymentMethodReference getPaymentMethod();

    /**
     *  <p><span>Connector</span> Deployment that processes the future payments of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @return connectorDeployment
     */
    @NotNull
    @Valid
    @JsonProperty("connectorDeployment")
    public ConnectorDeploymentReference getConnectorDeployment();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param paymentMethod value to be set
     */

    public void setPaymentMethod(final PaymentMethodReference paymentMethod);

    /**
     *  <p><span>Connector</span> Deployment that processes the future payments of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     * @param connectorDeployment value to be set
     */

    public void setConnectorDeployment(final ConnectorDeploymentReference connectorDeployment);

    /**
     * factory method
     * @return instance of PaymentMethodConfiguration
     */
    public static PaymentMethodConfiguration of() {
        return new PaymentMethodConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodConfiguration of(final PaymentMethodConfiguration template) {
        PaymentMethodConfigurationImpl instance = new PaymentMethodConfigurationImpl();
        instance.setPaymentMethod(template.getPaymentMethod());
        instance.setConnectorDeployment(template.getConnectorDeployment());
        return instance;
    }

    public PaymentMethodConfiguration copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodConfiguration deepCopy(@Nullable final PaymentMethodConfiguration template) {
        if (template == null) {
            return null;
        }
        PaymentMethodConfigurationImpl instance = new PaymentMethodConfigurationImpl();
        instance.setPaymentMethod(
            com.commercetools.checkout.models.common.PaymentMethodReference.deepCopy(template.getPaymentMethod()));
        instance.setConnectorDeployment(
            com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference
                    .deepCopy(template.getConnectorDeployment()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodConfiguration
     * @return builder
     */
    public static PaymentMethodConfigurationBuilder builder() {
        return PaymentMethodConfigurationBuilder.of();
    }

    /**
     * create builder for PaymentMethodConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodConfigurationBuilder builder(final PaymentMethodConfiguration template) {
        return PaymentMethodConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodConfiguration(Function<PaymentMethodConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<PaymentMethodConfiguration> typeReference() {
        return new tools.jackson.core.type.TypeReference<PaymentMethodConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodConfiguration>";
            }
        };
    }
}
