
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ReturnPaymentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set PaymentShipmentState on Orders.</li>
 *   <li>Set PaymentShipmentState on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnPaymentStateChange setReturnPaymentStateChange = SetReturnPaymentStateChange.builder()
 *             .change("{change}")
 *             .previousValue(ReturnPaymentState.NON_REFUNDABLE)
 *             .nextValue(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetReturnPaymentStateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReturnPaymentStateChangeImpl.class)
public interface SetReturnPaymentStateChange extends Change {

    /**
     * discriminator value for SetReturnPaymentStateChange
     */
    String SET_RETURN_PAYMENT_STATE_CHANGE = "SetReturnPaymentStateChange";

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
    @JsonProperty("previousValue")
    public ReturnPaymentState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public ReturnPaymentState getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ReturnPaymentState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ReturnPaymentState nextValue);

    /**
     * factory method
     * @return instance of SetReturnPaymentStateChange
     */
    public static SetReturnPaymentStateChange of() {
        return new SetReturnPaymentStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReturnPaymentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReturnPaymentStateChange of(final SetReturnPaymentStateChange template) {
        SetReturnPaymentStateChangeImpl instance = new SetReturnPaymentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetReturnPaymentStateChange copyDeep();

    /**
     * factory method to create a deep copy of SetReturnPaymentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReturnPaymentStateChange deepCopy(@Nullable final SetReturnPaymentStateChange template) {
        if (template == null) {
            return null;
        }
        SetReturnPaymentStateChangeImpl instance = new SetReturnPaymentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetReturnPaymentStateChange
     * @return builder
     */
    public static SetReturnPaymentStateChangeBuilder builder() {
        return SetReturnPaymentStateChangeBuilder.of();
    }

    /**
     * create builder for SetReturnPaymentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnPaymentStateChangeBuilder builder(final SetReturnPaymentStateChange template) {
        return SetReturnPaymentStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReturnPaymentStateChange(Function<SetReturnPaymentStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnPaymentStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnPaymentStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnPaymentStateChange>";
            }
        };
    }
}
