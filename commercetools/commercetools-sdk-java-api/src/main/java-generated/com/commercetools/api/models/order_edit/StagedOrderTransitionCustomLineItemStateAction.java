
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
 * StagedOrderTransitionCustomLineItemStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionCustomLineItemStateAction stagedOrderTransitionCustomLineItemStateAction = StagedOrderTransitionCustomLineItemStateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderTransitionCustomLineItemStateActionImpl.class)
public interface StagedOrderTransitionCustomLineItemStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderTransitionCustomLineItemStateAction
     */
    String TRANSITION_CUSTOM_LINE_ITEM_STATE = "transitionCustomLineItemState";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

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
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

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
     * @return instance of StagedOrderTransitionCustomLineItemStateAction
     */
    public static StagedOrderTransitionCustomLineItemStateAction of() {
        return new StagedOrderTransitionCustomLineItemStateActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderTransitionCustomLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderTransitionCustomLineItemStateAction of(
            final StagedOrderTransitionCustomLineItemStateAction template) {
        StagedOrderTransitionCustomLineItemStateActionImpl instance = new StagedOrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    /**
     * builder factory method for StagedOrderTransitionCustomLineItemStateAction
     * @return builder
     */
    public static StagedOrderTransitionCustomLineItemStateActionBuilder builder() {
        return StagedOrderTransitionCustomLineItemStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderTransitionCustomLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderTransitionCustomLineItemStateActionBuilder builder(
            final StagedOrderTransitionCustomLineItemStateAction template) {
        return StagedOrderTransitionCustomLineItemStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderTransitionCustomLineItemStateAction(
            Function<StagedOrderTransitionCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionCustomLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionCustomLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderTransitionCustomLineItemStateAction>";
            }
        };
    }
}
