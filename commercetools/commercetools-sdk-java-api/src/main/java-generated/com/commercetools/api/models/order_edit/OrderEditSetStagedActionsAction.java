
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If the edit is applied, <code>stagedActions</code> cannot be updated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetStagedActionsAction orderEditSetStagedActionsAction = OrderEditSetStagedActionsAction.builder()
 *             .plusStagedActions(stagedActionsBuilder -> stagedActionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditSetStagedActionsActionImpl.class)
public interface OrderEditSetStagedActionsAction extends OrderEditUpdateAction {

    /**
     * discriminator value for OrderEditSetStagedActionsAction
     */
    String SET_STAGED_ACTIONS = "setStagedActions";

    /**
     *  <p>Value to replace the <code>stagedActions</code> of the Order Edit.</p>
     * @return stagedActions
     */
    @NotNull
    @Valid
    @JsonProperty("stagedActions")
    public List<StagedOrderUpdateAction> getStagedActions();

    /**
     *  <p>Value to replace the <code>stagedActions</code> of the Order Edit.</p>
     * @param stagedActions values to be set
     */

    @JsonIgnore
    public void setStagedActions(final StagedOrderUpdateAction... stagedActions);

    /**
     *  <p>Value to replace the <code>stagedActions</code> of the Order Edit.</p>
     * @param stagedActions values to be set
     */

    public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

    /**
     * factory method
     * @return instance of OrderEditSetStagedActionsAction
     */
    public static OrderEditSetStagedActionsAction of() {
        return new OrderEditSetStagedActionsActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditSetStagedActionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditSetStagedActionsAction of(final OrderEditSetStagedActionsAction template) {
        OrderEditSetStagedActionsActionImpl instance = new OrderEditSetStagedActionsActionImpl();
        instance.setStagedActions(template.getStagedActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditSetStagedActionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditSetStagedActionsAction deepCopy(@Nullable final OrderEditSetStagedActionsAction template) {
        if (template == null) {
            return null;
        }
        OrderEditSetStagedActionsActionImpl instance = new OrderEditSetStagedActionsActionImpl();
        instance.setStagedActions(Optional.ofNullable(template.getStagedActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.StagedOrderUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderEditSetStagedActionsAction
     * @return builder
     */
    public static OrderEditSetStagedActionsActionBuilder builder() {
        return OrderEditSetStagedActionsActionBuilder.of();
    }

    /**
     * create builder for OrderEditSetStagedActionsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetStagedActionsActionBuilder builder(final OrderEditSetStagedActionsAction template) {
        return OrderEditSetStagedActionsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditSetStagedActionsAction(Function<OrderEditSetStagedActionsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditSetStagedActionsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditSetStagedActionsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditSetStagedActionsAction>";
            }
        };
    }
}
