
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderTransitionStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionStateAction stagedOrderTransitionStateAction = StagedOrderTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderTransitionStateActionImpl.class)
public interface StagedOrderTransitionStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *
     * @return force
     */

    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     * set force
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of StagedOrderTransitionStateAction
     */
    public static StagedOrderTransitionStateAction of() {
        return new StagedOrderTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderTransitionStateAction of(final StagedOrderTransitionStateAction template) {
        StagedOrderTransitionStateActionImpl instance = new StagedOrderTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderTransitionStateAction deepCopy(@Nullable final StagedOrderTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderTransitionStateActionImpl instance = new StagedOrderTransitionStateActionImpl();
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for StagedOrderTransitionStateAction
     * @return builder
     */
    public static StagedOrderTransitionStateActionBuilder builder() {
        return StagedOrderTransitionStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderTransitionStateActionBuilder builder(final StagedOrderTransitionStateAction template) {
        return StagedOrderTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderTransitionStateAction(Function<StagedOrderTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderTransitionStateAction>";
            }
        };
    }
}
