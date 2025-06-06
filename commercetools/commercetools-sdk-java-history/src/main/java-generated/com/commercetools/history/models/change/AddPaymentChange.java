
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.PaymentInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Add Payment on Orders.</li>
 *   <li>Add Payment on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPaymentChange addPaymentChange = AddPaymentChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddPaymentChange")
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
    public PaymentInfo getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public PaymentInfo getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final PaymentInfo previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final PaymentInfo nextValue);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddPaymentChange copyDeep();

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
        instance.setPreviousValue(
            com.commercetools.history.models.common.PaymentInfo.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.PaymentInfo.deepCopy(template.getNextValue()));
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
