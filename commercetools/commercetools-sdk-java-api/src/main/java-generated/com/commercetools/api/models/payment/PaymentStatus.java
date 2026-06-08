
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * PaymentStatus
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatus paymentStatus = PaymentStatus.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusImpl.class)
public interface PaymentStatus {

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     * @return interfaceCode
     */

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    /**
     *  <p>Text describing the current status of the Payment.</p>
     * @return interfaceText
     */

    @JsonProperty("interfaceText")
    public String getInterfaceText();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     * @param interfaceCode value to be set
     */

    public void setInterfaceCode(final String interfaceCode);

    /**
     *  <p>Text describing the current status of the Payment.</p>
     * @param interfaceText value to be set
     */

    public void setInterfaceText(final String interfaceText);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     * factory method
     * @return instance of PaymentStatus
     */
    public static PaymentStatus of() {
        return new PaymentStatusImpl();
    }

    /**
     * factory method to create a shallow copy PaymentStatus
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentStatus of(final PaymentStatus template) {
        PaymentStatusImpl instance = new PaymentStatusImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(template.getState());
        return instance;
    }

    public PaymentStatus copyDeep();

    /**
     * factory method to create a deep copy of PaymentStatus
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentStatus deepCopy(@Nullable final PaymentStatus template) {
        if (template == null) {
            return null;
        }
        PaymentStatusImpl instance = new PaymentStatusImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        return instance;
    }

    /**
     * builder factory method for PaymentStatus
     * @return builder
     */
    public static PaymentStatusBuilder builder() {
        return PaymentStatusBuilder.of();
    }

    /**
     * create builder for PaymentStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusBuilder builder(final PaymentStatus template) {
        return PaymentStatusBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentStatus(Function<PaymentStatus, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatus>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatus>";
            }
        };
    }
}
