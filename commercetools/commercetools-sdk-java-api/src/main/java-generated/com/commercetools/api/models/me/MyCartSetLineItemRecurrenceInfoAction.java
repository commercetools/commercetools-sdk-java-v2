
package com.commercetools.api.models.me;

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
 *  <p>Sets the recurrence information on the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>. If the Cart is already associated with a Recurring Order, this action will fail.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemRecurrenceInfoAction myCartSetLineItemRecurrenceInfoAction = MyCartSetLineItemRecurrenceInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemRecurrenceInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemRecurrenceInfoActionImpl.class)
public interface MyCartSetLineItemRecurrenceInfoAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetLineItemRecurrenceInfoAction
     */
    String SET_LINE_ITEM_RECURRENCE_INFO = "setLineItemRecurrenceInfo";

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return recurrenceInfo
     */
    @Valid
    @JsonProperty("recurrenceInfo")
    public LineItemRecurrenceInfoDraft getRecurrenceInfo();

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param recurrenceInfo value to be set
     */

    public void setRecurrenceInfo(final LineItemRecurrenceInfoDraft recurrenceInfo);

    /**
     * factory method
     * @return instance of MyCartSetLineItemRecurrenceInfoAction
     */
    public static MyCartSetLineItemRecurrenceInfoAction of() {
        return new MyCartSetLineItemRecurrenceInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetLineItemRecurrenceInfoAction of(final MyCartSetLineItemRecurrenceInfoAction template) {
        MyCartSetLineItemRecurrenceInfoActionImpl instance = new MyCartSetLineItemRecurrenceInfoActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setRecurrenceInfo(template.getRecurrenceInfo());
        return instance;
    }

    public MyCartSetLineItemRecurrenceInfoAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetLineItemRecurrenceInfoAction deepCopy(
            @Nullable final MyCartSetLineItemRecurrenceInfoAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetLineItemRecurrenceInfoActionImpl instance = new MyCartSetLineItemRecurrenceInfoActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setRecurrenceInfo(com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft
                .deepCopy(template.getRecurrenceInfo()));
        return instance;
    }

    /**
     * builder factory method for MyCartSetLineItemRecurrenceInfoAction
     * @return builder
     */
    public static MyCartSetLineItemRecurrenceInfoActionBuilder builder() {
        return MyCartSetLineItemRecurrenceInfoActionBuilder.of();
    }

    /**
     * create builder for MyCartSetLineItemRecurrenceInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLineItemRecurrenceInfoActionBuilder builder(
            final MyCartSetLineItemRecurrenceInfoAction template) {
        return MyCartSetLineItemRecurrenceInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetLineItemRecurrenceInfoAction(Function<MyCartSetLineItemRecurrenceInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemRecurrenceInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemRecurrenceInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemRecurrenceInfoAction>";
            }
        };
    }
}
