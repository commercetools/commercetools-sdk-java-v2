
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ItemShippingDetails;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a> on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemShippingDetailsChange setLineItemShippingDetailsChange = SetLineItemShippingDetailsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemShippingDetailsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemShippingDetailsChangeImpl.class)
public interface SetLineItemShippingDetailsChange extends Change {

    /**
     * discriminator value for SetLineItemShippingDetailsChange
     */
    String SET_LINE_ITEM_SHIPPING_DETAILS_CHANGE = "SetLineItemShippingDetailsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ItemShippingDetails getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ItemShippingDetails getNextValue();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ItemShippingDetails previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ItemShippingDetails nextValue);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * factory method
     * @return instance of SetLineItemShippingDetailsChange
     */
    public static SetLineItemShippingDetailsChange of() {
        return new SetLineItemShippingDetailsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemShippingDetailsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemShippingDetailsChange of(final SetLineItemShippingDetailsChange template) {
        SetLineItemShippingDetailsChangeImpl instance = new SetLineItemShippingDetailsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    public SetLineItemShippingDetailsChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemShippingDetailsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemShippingDetailsChange deepCopy(@Nullable final SetLineItemShippingDetailsChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemShippingDetailsChangeImpl instance = new SetLineItemShippingDetailsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.ItemShippingDetails.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.ItemShippingDetails.deepCopy(template.getNextValue()));
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    /**
     * builder factory method for SetLineItemShippingDetailsChange
     * @return builder
     */
    public static SetLineItemShippingDetailsChangeBuilder builder() {
        return SetLineItemShippingDetailsChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemShippingDetailsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemShippingDetailsChangeBuilder builder(final SetLineItemShippingDetailsChange template) {
        return SetLineItemShippingDetailsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemShippingDetailsChange(Function<SetLineItemShippingDetailsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemShippingDetailsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemShippingDetailsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemShippingDetailsChange>";
            }
        };
    }
}
