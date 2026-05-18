
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the connector deployment reference of a PaymentIntegration.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setConnectorDeployment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetConnectorDeploymentUpdateActionImpl.class)
public interface SetConnectorDeploymentUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetConnectorDeploymentUpdateAction
     */
    String SET_CONNECTOR_DEPLOYMENT = "setConnectorDeployment";

    /**
     *  <p>Value to set as the connector deployment reference of the PaymentIntegration.</p>
     * @return connectorDeployment
     */
    @NotNull
    @Valid
    @JsonProperty("connectorDeployment")
    public ConnectorDeploymentReference getConnectorDeployment();

    /**
     *  <p>Value to set as the connector deployment reference of the PaymentIntegration.</p>
     * @param connectorDeployment value to be set
     */

    public void setConnectorDeployment(final ConnectorDeploymentReference connectorDeployment);

    /**
     * factory method
     * @return instance of SetConnectorDeploymentUpdateAction
     */
    public static SetConnectorDeploymentUpdateAction of() {
        return new SetConnectorDeploymentUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetConnectorDeploymentUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetConnectorDeploymentUpdateAction of(final SetConnectorDeploymentUpdateAction template) {
        SetConnectorDeploymentUpdateActionImpl instance = new SetConnectorDeploymentUpdateActionImpl();
        instance.setConnectorDeployment(template.getConnectorDeployment());
        return instance;
    }

    public SetConnectorDeploymentUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetConnectorDeploymentUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetConnectorDeploymentUpdateAction deepCopy(
            @Nullable final SetConnectorDeploymentUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetConnectorDeploymentUpdateActionImpl instance = new SetConnectorDeploymentUpdateActionImpl();
        instance.setConnectorDeployment(
            com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference
                    .deepCopy(template.getConnectorDeployment()));
        return instance;
    }

    /**
     * builder factory method for SetConnectorDeploymentUpdateAction
     * @return builder
     */
    public static SetConnectorDeploymentUpdateActionBuilder builder() {
        return SetConnectorDeploymentUpdateActionBuilder.of();
    }

    /**
     * create builder for SetConnectorDeploymentUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetConnectorDeploymentUpdateActionBuilder builder(final SetConnectorDeploymentUpdateAction template) {
        return SetConnectorDeploymentUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetConnectorDeploymentUpdateAction(Function<SetConnectorDeploymentUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetConnectorDeploymentUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetConnectorDeploymentUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetConnectorDeploymentUpdateAction>";
            }
        };
    }
}
