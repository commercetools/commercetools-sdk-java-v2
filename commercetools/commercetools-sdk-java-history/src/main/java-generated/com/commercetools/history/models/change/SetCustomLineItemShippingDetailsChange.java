
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ItemShippingDetails;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemShippingDetailsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemShippingDetailsChange setCustomLineItemShippingDetailsChange = SetCustomLineItemShippingDetailsChange.builder()
 *             .change("{change}")
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemShippingDetailsChangeImpl.class)
public interface SetCustomLineItemShippingDetailsChange extends Change {

    /**
     * discriminator value for SetCustomLineItemShippingDetailsChange
     */
    String SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_CHANGE = "SetCustomLineItemShippingDetailsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCustomLineItemShippingDetails</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

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
     *  <p>Update action for <code>setCustomLineItemShippingDetails</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

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
     * @return instance of SetCustomLineItemShippingDetailsChange
     */
    public static SetCustomLineItemShippingDetailsChange of() {
        return new SetCustomLineItemShippingDetailsChangeImpl();
    }

    /**
     * factory method to copy an instance of SetCustomLineItemShippingDetailsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemShippingDetailsChange of(final SetCustomLineItemShippingDetailsChange template) {
        SetCustomLineItemShippingDetailsChangeImpl instance = new SetCustomLineItemShippingDetailsChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemShippingDetailsChange
     * @return builder
     */
    public static SetCustomLineItemShippingDetailsChangeBuilder builder() {
        return SetCustomLineItemShippingDetailsChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemShippingDetailsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemShippingDetailsChangeBuilder builder(
            final SetCustomLineItemShippingDetailsChange template) {
        return SetCustomLineItemShippingDetailsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemShippingDetailsChange(
            Function<SetCustomLineItemShippingDetailsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemShippingDetailsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemShippingDetailsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemShippingDetailsChange>";
            }
        };
    }
}
