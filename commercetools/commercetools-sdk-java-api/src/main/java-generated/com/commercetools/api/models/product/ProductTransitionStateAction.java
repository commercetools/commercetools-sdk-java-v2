
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. Produces the ProductStateTransition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTransitionStateAction productTransitionStateAction = ProductTransitionStateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTransitionStateActionImpl.class)
public interface ProductTransitionStateAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>The State to transition to. If there is no existing State, this must be an initial State.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>If <code>true</code>, validations are disabled.</p>
     * @return force
     */

    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>The State to transition to. If there is no existing State, this must be an initial State.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>If <code>true</code>, validations are disabled.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of ProductTransitionStateAction
     */
    public static ProductTransitionStateAction of() {
        return new ProductTransitionStateActionImpl();
    }

    /**
     * factory method to copy an instance of ProductTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTransitionStateAction of(final ProductTransitionStateAction template) {
        ProductTransitionStateActionImpl instance = new ProductTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for ProductTransitionStateAction
     * @return builder
     */
    public static ProductTransitionStateActionBuilder builder() {
        return ProductTransitionStateActionBuilder.of();
    }

    /**
     * create builder for ProductTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTransitionStateActionBuilder builder(final ProductTransitionStateAction template) {
        return ProductTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTransitionStateAction(Function<ProductTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTransitionStateAction>";
            }
        };
    }
}
