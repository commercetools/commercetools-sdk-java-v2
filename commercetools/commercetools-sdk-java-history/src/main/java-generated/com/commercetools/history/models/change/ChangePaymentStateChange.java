
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.PaymentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change PaymentState on Orders.</li>
 *   <li>Change PaymentState on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePaymentStateChange changePaymentStateChange = ChangePaymentStateChange.builder()
 *             .change("{change}")
 *             .previousValue(PaymentState.BALANCE_DUE)
 *             .nextValue(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangePaymentStateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangePaymentStateChangeImpl.class)
public interface ChangePaymentStateChange extends Change {

    /**
     * discriminator value for ChangePaymentStateChange
     */
    String CHANGE_PAYMENT_STATE_CHANGE = "ChangePaymentStateChange";

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
    public PaymentState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public PaymentState getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final PaymentState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final PaymentState nextValue);

    /**
     * factory method
     * @return instance of ChangePaymentStateChange
     */
    public static ChangePaymentStateChange of() {
        return new ChangePaymentStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangePaymentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangePaymentStateChange of(final ChangePaymentStateChange template) {
        ChangePaymentStateChangeImpl instance = new ChangePaymentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangePaymentStateChange copyDeep();

    /**
     * factory method to create a deep copy of ChangePaymentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangePaymentStateChange deepCopy(@Nullable final ChangePaymentStateChange template) {
        if (template == null) {
            return null;
        }
        ChangePaymentStateChangeImpl instance = new ChangePaymentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangePaymentStateChange
     * @return builder
     */
    public static ChangePaymentStateChangeBuilder builder() {
        return ChangePaymentStateChangeBuilder.of();
    }

    /**
     * create builder for ChangePaymentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePaymentStateChangeBuilder builder(final ChangePaymentStateChange template) {
        return ChangePaymentStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangePaymentStateChange(Function<ChangePaymentStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangePaymentStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePaymentStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePaymentStateChange>";
            }
        };
    }
}
