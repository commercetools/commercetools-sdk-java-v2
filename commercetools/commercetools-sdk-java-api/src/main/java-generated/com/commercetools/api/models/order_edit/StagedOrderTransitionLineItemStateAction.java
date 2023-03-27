
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
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
 * StagedOrderTransitionLineItemStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionLineItemStateAction stagedOrderTransitionLineItemStateAction = StagedOrderTransitionLineItemStateAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderTransitionLineItemStateActionImpl.class)
public interface StagedOrderTransitionLineItemStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderTransitionLineItemStateAction
     */
    String TRANSITION_LINE_ITEM_STATE = "transitionLineItemState";

    /**
     *
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return fromState
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return toState
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();

    /**
     *
     * @return actualTransitionDate
     */

    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param fromState value to be set
     */

    public void setFromState(final StateResourceIdentifier fromState);

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param toState value to be set
     */

    public void setToState(final StateResourceIdentifier toState);

    /**
     * set actualTransitionDate
     * @param actualTransitionDate value to be set
     */

    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    /**
     * factory method
     * @return instance of StagedOrderTransitionLineItemStateAction
     */
    public static StagedOrderTransitionLineItemStateAction of() {
        return new StagedOrderTransitionLineItemStateActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderTransitionLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderTransitionLineItemStateAction of(final StagedOrderTransitionLineItemStateAction template) {
        StagedOrderTransitionLineItemStateActionImpl instance = new StagedOrderTransitionLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    /**
     * builder factory method for StagedOrderTransitionLineItemStateAction
     * @return builder
     */
    public static StagedOrderTransitionLineItemStateActionBuilder builder() {
        return StagedOrderTransitionLineItemStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderTransitionLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderTransitionLineItemStateActionBuilder builder(
            final StagedOrderTransitionLineItemStateAction template) {
        return StagedOrderTransitionLineItemStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderTransitionLineItemStateAction(
            Function<StagedOrderTransitionLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderTransitionLineItemStateAction>";
            }
        };
    }
}
