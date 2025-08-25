
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * PaymentStatusDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusDraft paymentStatusDraft = PaymentStatusDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusDraftImpl.class)
public interface PaymentStatusDraft extends io.vrap.rmf.base.client.Draft<PaymentStatusDraft> {

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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     * factory method
     * @return instance of PaymentStatusDraft
     */
    public static PaymentStatusDraft of() {
        return new PaymentStatusDraftImpl();
    }

    /**
     * factory method to create a shallow copy PaymentStatusDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentStatusDraft of(final PaymentStatusDraft template) {
        PaymentStatusDraftImpl instance = new PaymentStatusDraftImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(template.getState());
        return instance;
    }

    public PaymentStatusDraft copyDeep();

    /**
     * factory method to create a deep copy of PaymentStatusDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentStatusDraft deepCopy(@Nullable final PaymentStatusDraft template) {
        if (template == null) {
            return null;
        }
        PaymentStatusDraftImpl instance = new PaymentStatusDraftImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        return instance;
    }

    /**
     * builder factory method for PaymentStatusDraft
     * @return builder
     */
    public static PaymentStatusDraftBuilder builder() {
        return PaymentStatusDraftBuilder.of();
    }

    /**
     * create builder for PaymentStatusDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusDraftBuilder builder(final PaymentStatusDraft template) {
        return PaymentStatusDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentStatusDraft(Function<PaymentStatusDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusDraft>";
            }
        };
    }
}
