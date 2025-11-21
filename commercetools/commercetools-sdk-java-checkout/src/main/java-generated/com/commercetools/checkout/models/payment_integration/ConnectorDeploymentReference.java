
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a connector deployment for the payment integration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorDeploymentReference connectorDeploymentReference = ConnectorDeploymentReference.builder()
 *             .id("{id}")
 *             .typeId("{typeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConnectorDeploymentReferenceImpl.class)
public interface ConnectorDeploymentReference {

    /**
     *  <p>Unique identifier of the referenced Connect Deployment.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Type identifier, always <code>deployment</code> for Connector deployment references.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public String getTypeId();

    /**
     *  <p>Unique identifier of the referenced Connect Deployment.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Type identifier, always <code>deployment</code> for Connector deployment references.</p>
     * @param typeId value to be set
     */

    public void setTypeId(final String typeId);

    /**
     * factory method
     * @return instance of ConnectorDeploymentReference
     */
    public static ConnectorDeploymentReference of() {
        return new ConnectorDeploymentReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ConnectorDeploymentReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ConnectorDeploymentReference of(final ConnectorDeploymentReference template) {
        ConnectorDeploymentReferenceImpl instance = new ConnectorDeploymentReferenceImpl();
        instance.setId(template.getId());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    public ConnectorDeploymentReference copyDeep();

    /**
     * factory method to create a deep copy of ConnectorDeploymentReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ConnectorDeploymentReference deepCopy(@Nullable final ConnectorDeploymentReference template) {
        if (template == null) {
            return null;
        }
        ConnectorDeploymentReferenceImpl instance = new ConnectorDeploymentReferenceImpl();
        instance.setId(template.getId());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    /**
     * builder factory method for ConnectorDeploymentReference
     * @return builder
     */
    public static ConnectorDeploymentReferenceBuilder builder() {
        return ConnectorDeploymentReferenceBuilder.of();
    }

    /**
     * create builder for ConnectorDeploymentReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorDeploymentReferenceBuilder builder(final ConnectorDeploymentReference template) {
        return ConnectorDeploymentReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withConnectorDeploymentReference(Function<ConnectorDeploymentReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ConnectorDeploymentReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ConnectorDeploymentReference>() {
            @Override
            public String toString() {
                return "TypeReference<ConnectorDeploymentReference>";
            }
        };
    }
}
