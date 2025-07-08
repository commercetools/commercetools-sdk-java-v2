
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the recurrence information on the LineItem. If the Cart is already associated with a Recurring Order, this action will fail.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemRecurrenceInfoAction cartSetLineItemRecurrenceInfoAction = CartSetLineItemRecurrenceInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemRecurrenceInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemRecurrenceInfoActionImpl.class)
public interface CartSetLineItemRecurrenceInfoAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemRecurrenceInfoAction
     */
    String SET_LINE_ITEM_RECURRENCE_INFO = "setLineItemRecurrenceInfo";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return recurrenceInfo
     */
    @Valid
    @JsonProperty("recurrenceInfo")
    public LineItemRecurrenceInfoDraft getRecurrenceInfo();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param recurrenceInfo value to be set
     */

    public void setRecurrenceInfo(final LineItemRecurrenceInfoDraft recurrenceInfo);

    /**
     * factory method
     * @return instance of CartSetLineItemRecurrenceInfoAction
     */
    public static CartSetLineItemRecurrenceInfoAction of() {
        return new CartSetLineItemRecurrenceInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLineItemRecurrenceInfoAction of(final CartSetLineItemRecurrenceInfoAction template) {
        CartSetLineItemRecurrenceInfoActionImpl instance = new CartSetLineItemRecurrenceInfoActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setRecurrenceInfo(template.getRecurrenceInfo());
        return instance;
    }

    public CartSetLineItemRecurrenceInfoAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLineItemRecurrenceInfoAction deepCopy(
            @Nullable final CartSetLineItemRecurrenceInfoAction template) {
        if (template == null) {
            return null;
        }
        CartSetLineItemRecurrenceInfoActionImpl instance = new CartSetLineItemRecurrenceInfoActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setRecurrenceInfo(com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft
                .deepCopy(template.getRecurrenceInfo()));
        return instance;
    }

    /**
     * builder factory method for CartSetLineItemRecurrenceInfoAction
     * @return builder
     */
    public static CartSetLineItemRecurrenceInfoActionBuilder builder() {
        return CartSetLineItemRecurrenceInfoActionBuilder.of();
    }

    /**
     * create builder for CartSetLineItemRecurrenceInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemRecurrenceInfoActionBuilder builder(
            final CartSetLineItemRecurrenceInfoAction template) {
        return CartSetLineItemRecurrenceInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLineItemRecurrenceInfoAction(Function<CartSetLineItemRecurrenceInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemRecurrenceInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemRecurrenceInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemRecurrenceInfoAction>";
            }
        };
    }
}
