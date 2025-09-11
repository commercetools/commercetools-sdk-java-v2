
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderRemovePaymentAction" rel="nofollow">Remove Payment</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemovePaymentAction" rel="nofollow">Remove Payment</a> on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemovePaymentChange removePaymentChange = RemovePaymentChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemovePaymentChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemovePaymentChangeImpl.class)
public interface RemovePaymentChange extends Change {

    /**
     * discriminator value for RemovePaymentChange
     */
    String REMOVE_PAYMENT_CHANGE = "RemovePaymentChange";

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
     * @return instance of RemovePaymentChange
     */
    public static RemovePaymentChange of() {
        return new RemovePaymentChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemovePaymentChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemovePaymentChange of(final RemovePaymentChange template) {
        RemovePaymentChangeImpl instance = new RemovePaymentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public RemovePaymentChange copyDeep();

    /**
     * factory method to create a deep copy of RemovePaymentChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemovePaymentChange deepCopy(@Nullable final RemovePaymentChange template) {
        if (template == null) {
            return null;
        }
        RemovePaymentChangeImpl instance = new RemovePaymentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.PaymentInfo.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.PaymentInfo.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemovePaymentChange
     * @return builder
     */
    public static RemovePaymentChangeBuilder builder() {
        return RemovePaymentChangeBuilder.of();
    }

    /**
     * create builder for RemovePaymentChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemovePaymentChangeBuilder builder(final RemovePaymentChange template) {
        return RemovePaymentChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemovePaymentChange(Function<RemovePaymentChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemovePaymentChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemovePaymentChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemovePaymentChange>";
            }
        };
    }
}
