
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ItemShippingDetails;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemShippingDetailsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemShippingDetailsChange setLineItemShippingDetailsChange = SetLineItemShippingDetailsChange.builder()
 *             .change("{change}")
 *             .lineItemId("{lineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>setLineItemShippingDetails</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ItemShippingDetails getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ItemShippingDetails getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemShippingDetails</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ItemShippingDetails nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ItemShippingDetails previousValue);

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
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

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
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.ItemShippingDetails::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.ItemShippingDetails::deepCopy)
                .orElse(null));
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
