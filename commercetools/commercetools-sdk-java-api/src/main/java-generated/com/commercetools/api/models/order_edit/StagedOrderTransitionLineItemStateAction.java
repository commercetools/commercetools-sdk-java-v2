
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemStateTransitionMessage" rel="nofollow">Line Item State Transition</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionLineItemStateAction stagedOrderTransitionLineItemStateAction = StagedOrderTransitionLineItemStateAction.builder()
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("transitionLineItemState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderTransitionLineItemStateActionImpl.class)
public interface StagedOrderTransitionLineItemStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderTransitionLineItemStateAction
     */
    String TRANSITION_LINE_ITEM_STATE = "transitionLineItemState";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Number of Line Items that should transition <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition from.</p>
     * @return fromState
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition to.</p>
     * @return toState
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();

    /**
     *  <p>Date and time (UTC) to perform the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition.</p>
     * @return actualTransitionDate
     */

    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Number of Line Items that should transition <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition from.</p>
     * @param fromState value to be set
     */

    public void setFromState(final StateResourceIdentifier fromState);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition to.</p>
     * @param toState value to be set
     */

    public void setToState(final StateResourceIdentifier toState);

    /**
     *  <p>Date and time (UTC) to perform the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition.</p>
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
     * factory method to create a shallow copy StagedOrderTransitionLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderTransitionLineItemStateAction of(final StagedOrderTransitionLineItemStateAction template) {
        StagedOrderTransitionLineItemStateActionImpl instance = new StagedOrderTransitionLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    public StagedOrderTransitionLineItemStateAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderTransitionLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderTransitionLineItemStateAction deepCopy(
            @Nullable final StagedOrderTransitionLineItemStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderTransitionLineItemStateActionImpl instance = new StagedOrderTransitionLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(
            com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getFromState()));
        instance.setToState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getToState()));
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
