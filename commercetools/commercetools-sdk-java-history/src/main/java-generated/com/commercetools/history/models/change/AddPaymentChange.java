
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.PaymentInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPaymentChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPaymentChange addPaymentChange = AddPaymentChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddPaymentChangeImpl.class)
public interface AddPaymentChange extends Change {

    /**
     * discriminator value for AddPaymentChange
     */
    String ADD_PAYMENT_CHANGE = "AddPaymentChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public PaymentInfo getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public PaymentInfo getPreviousValue();

    /**
     *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final PaymentInfo nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final PaymentInfo previousValue);

    /**
     * factory method
     * @return instance of AddPaymentChange
     */
    public static AddPaymentChange of() {
        return new AddPaymentChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddPaymentChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddPaymentChange of(final AddPaymentChange template) {
        AddPaymentChangeImpl instance = new AddPaymentChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddPaymentChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddPaymentChange deepCopy(@Nullable final AddPaymentChange template) {
        if (template == null) {
            return null;
        }
        AddPaymentChangeImpl instance = new AddPaymentChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.PaymentInfo.deepCopy(template.getNextValue()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.PaymentInfo.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for AddPaymentChange
     * @return builder
     */
    public static AddPaymentChangeBuilder builder() {
        return AddPaymentChangeBuilder.of();
    }

    /**
     * create builder for AddPaymentChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPaymentChangeBuilder builder(final AddPaymentChange template) {
        return AddPaymentChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddPaymentChange(Function<AddPaymentChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddPaymentChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddPaymentChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddPaymentChange>";
            }
        };
    }
}
