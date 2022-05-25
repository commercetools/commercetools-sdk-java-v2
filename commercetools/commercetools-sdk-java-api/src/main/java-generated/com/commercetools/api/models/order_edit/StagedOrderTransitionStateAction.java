
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *
     */

    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);

    public void setForce(final Boolean force);

    public static StagedOrderTransitionStateAction of() {
        return new StagedOrderTransitionStateActionImpl();
    }

    public static StagedOrderTransitionStateAction of(final StagedOrderTransitionStateAction template) {
        StagedOrderTransitionStateActionImpl instance = new StagedOrderTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static StagedOrderTransitionStateActionBuilder builder() {
        return StagedOrderTransitionStateActionBuilder.of();
    }

    public static StagedOrderTransitionStateActionBuilder builder(final StagedOrderTransitionStateAction template) {
        return StagedOrderTransitionStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderTransitionStateAction(Function<StagedOrderTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderTransitionStateAction>";
            }
        };
    }
}
