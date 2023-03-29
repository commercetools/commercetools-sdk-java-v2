
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductStateTransitionMessage productStateTransitionMessage = ProductStateTransitionMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductStateTransitionMessageImpl.class)
public interface ProductStateTransitionMessage extends Message {

    /**
     * discriminator value for ProductStateTransitionMessage
     */
    String PRODUCT_STATE_TRANSITION = "ProductStateTransition";

    /**
     *  <p>Product State after the Transition State update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>Product State after the Transition State update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of ProductStateTransitionMessage
     */
    public static ProductStateTransitionMessage of() {
        return new ProductStateTransitionMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductStateTransitionMessage of(final ProductStateTransitionMessage template) {
        ProductStateTransitionMessageImpl instance = new ProductStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductStateTransitionMessage deepCopy(@Nullable final ProductStateTransitionMessage template) {
        if (template == null) {
            return null;
        }
        ProductStateTransitionMessageImpl instance = new ProductStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for ProductStateTransitionMessage
     * @return builder
     */
    public static ProductStateTransitionMessageBuilder builder() {
        return ProductStateTransitionMessageBuilder.of();
    }

    /**
     * create builder for ProductStateTransitionMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductStateTransitionMessageBuilder builder(final ProductStateTransitionMessage template) {
        return ProductStateTransitionMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductStateTransitionMessage(Function<ProductStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductStateTransitionMessage>";
            }
        };
    }
}
