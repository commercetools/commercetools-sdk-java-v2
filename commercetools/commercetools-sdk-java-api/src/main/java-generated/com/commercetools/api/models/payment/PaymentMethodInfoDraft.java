
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment_method.PaymentMethodToken;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * PaymentMethodInfoDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoDraft paymentMethodInfoDraft = PaymentMethodInfoDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoDraftImpl.class)
public interface PaymentMethodInfoDraft extends io.vrap.rmf.base.client.Draft<PaymentMethodInfoDraft> {

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Payment method to use—for example, a credit card or cash advance.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Name of the Payment Method.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @return token
     */
    @Valid
    @JsonProperty("token")
    public PaymentMethodToken getToken();

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Custom fields for the PaymentMethodInfo.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Payment method to use—for example, a credit card or cash advance.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Name of the Payment Method.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @param token value to be set
     */

    public void setToken(final PaymentMethodToken token);

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Custom fields for the PaymentMethodInfo.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of PaymentMethodInfoDraft
     */
    public static PaymentMethodInfoDraft of() {
        return new PaymentMethodInfoDraftImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoDraft of(final PaymentMethodInfoDraft template) {
        PaymentMethodInfoDraftImpl instance = new PaymentMethodInfoDraftImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(template.getName());
        instance.setToken(template.getToken());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public PaymentMethodInfoDraft copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoDraft deepCopy(@Nullable final PaymentMethodInfoDraft template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoDraftImpl instance = new PaymentMethodInfoDraftImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoDraft
     * @return builder
     */
    public static PaymentMethodInfoDraftBuilder builder() {
        return PaymentMethodInfoDraftBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoDraftBuilder builder(final PaymentMethodInfoDraft template) {
        return PaymentMethodInfoDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoDraft(Function<PaymentMethodInfoDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoDraft>";
            }
        };
    }
}
