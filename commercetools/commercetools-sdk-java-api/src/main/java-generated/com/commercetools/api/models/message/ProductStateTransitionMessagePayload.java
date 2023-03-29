
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
 *     ProductStateTransitionMessagePayload productStateTransitionMessagePayload = ProductStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductStateTransitionMessagePayloadImpl.class)
public interface ProductStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductStateTransitionMessagePayload
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
     * @return instance of ProductStateTransitionMessagePayload
     */
    public static ProductStateTransitionMessagePayload of() {
        return new ProductStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductStateTransitionMessagePayload of(final ProductStateTransitionMessagePayload template) {
        ProductStateTransitionMessagePayloadImpl instance = new ProductStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductStateTransitionMessagePayload deepCopy(
            @Nullable final ProductStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductStateTransitionMessagePayloadImpl instance = new ProductStateTransitionMessagePayloadImpl();
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for ProductStateTransitionMessagePayload
     * @return builder
     */
    public static ProductStateTransitionMessagePayloadBuilder builder() {
        return ProductStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductStateTransitionMessagePayloadBuilder builder(
            final ProductStateTransitionMessagePayload template) {
        return ProductStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductStateTransitionMessagePayload(Function<ProductStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductStateTransitionMessagePayload>";
            }
        };
    }
}
