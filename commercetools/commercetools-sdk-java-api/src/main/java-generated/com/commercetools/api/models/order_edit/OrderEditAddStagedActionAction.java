
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditAddStagedActionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditAddStagedActionAction orderEditAddStagedActionAction = OrderEditAddStagedActionAction.builder()
 *             .stagedAction(stagedActionBuilder -> stagedActionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditAddStagedActionActionImpl.class)
public interface OrderEditAddStagedActionAction extends OrderEditUpdateAction {

    /**
     * discriminator value for OrderEditAddStagedActionAction
     */
    String ADD_STAGED_ACTION = "addStagedAction";

    /**
     *
     * @return stagedAction
     */
    @NotNull
    @Valid
    @JsonProperty("stagedAction")
    public StagedOrderUpdateAction getStagedAction();

    /**
     * set stagedAction
     * @param stagedAction value to be set
     */

    public void setStagedAction(final StagedOrderUpdateAction stagedAction);

    /**
     * factory method
     * @return instance of OrderEditAddStagedActionAction
     */
    public static OrderEditAddStagedActionAction of() {
        return new OrderEditAddStagedActionActionImpl();
    }

    /**
     * factory method to copy an instance of OrderEditAddStagedActionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditAddStagedActionAction of(final OrderEditAddStagedActionAction template) {
        OrderEditAddStagedActionActionImpl instance = new OrderEditAddStagedActionActionImpl();
        instance.setStagedAction(template.getStagedAction());
        return instance;
    }

    /**
     * builder factory method for OrderEditAddStagedActionAction
     * @return builder
     */
    public static OrderEditAddStagedActionActionBuilder builder() {
        return OrderEditAddStagedActionActionBuilder.of();
    }

    /**
     * create builder for OrderEditAddStagedActionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditAddStagedActionActionBuilder builder(final OrderEditAddStagedActionAction template) {
        return OrderEditAddStagedActionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditAddStagedActionAction(Function<OrderEditAddStagedActionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditAddStagedActionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditAddStagedActionAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditAddStagedActionAction>";
            }
        };
    }
}
