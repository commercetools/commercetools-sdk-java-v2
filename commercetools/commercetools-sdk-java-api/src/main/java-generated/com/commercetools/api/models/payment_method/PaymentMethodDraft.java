
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * PaymentMethodDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodDraft paymentMethodDraft = PaymentMethodDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodDraftImpl.class)
public interface PaymentMethodDraft extends io.vrap.rmf.base.client.Draft<PaymentMethodDraft> {

    /**
     *  <p>User-defined unique identifier for the PaymentMethod.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Reference to a Customer the PaymentMethod should belong to.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer must be an Associate of the Business Unit.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Reference to a BusinessUnit the PaymentMethod should belong to.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>Payment method to use for the Payment—for example, a credit card or cash advance.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @return token
     */
    @Valid
    @JsonProperty("token")
    public PaymentMethodToken getToken();

    /**
     *  <p>Status of the PaymentMethod.</p>
     * @return paymentMethodStatus
     */

    @JsonProperty("paymentMethodStatus")
    public PaymentMethodStatus getPaymentMethodStatus();

    /**
     *  <p>Set to <code>true</code> if the PaymentMethod should be the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @return default
     */

    @JsonProperty("default")
    public Boolean getDefault();

    /**
     *  <p>Custom Fields for the PaymentMethod.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier for the PaymentMethod.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Reference to a Customer the PaymentMethod should belong to.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer must be an Associate of the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

    /**
     *  <p>Reference to a BusinessUnit the PaymentMethod should belong to.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p>Payment method to use for the Payment—for example, a credit card or cash advance.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param token value to be set
     */

    public void setToken(final PaymentMethodToken token);

    /**
     *  <p>Status of the PaymentMethod.</p>
     * @param paymentMethodStatus value to be set
     */

    public void setPaymentMethodStatus(final PaymentMethodStatus paymentMethodStatus);

    /**
     *  <p>Set to <code>true</code> if the PaymentMethod should be the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @param _default value to be set
     */

    public void setDefault(final Boolean _default);

    /**
     *  <p>Custom Fields for the PaymentMethod.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of PaymentMethodDraft
     */
    public static PaymentMethodDraft of() {
        return new PaymentMethodDraftImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodDraft of(final PaymentMethodDraft template) {
        PaymentMethodDraftImpl instance = new PaymentMethodDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCustomer(template.getCustomer());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setMethod(template.getMethod());
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setToken(template.getToken());
        instance.setPaymentMethodStatus(template.getPaymentMethodStatus());
        instance.setDefault(template.getDefault());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public PaymentMethodDraft copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodDraft deepCopy(@Nullable final PaymentMethodDraft template) {
        if (template == null) {
            return null;
        }
        PaymentMethodDraftImpl instance = new PaymentMethodDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setMethod(template.getMethod());
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        instance.setPaymentMethodStatus(template.getPaymentMethodStatus());
        instance.setDefault(template.getDefault());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodDraft
     * @return builder
     */
    public static PaymentMethodDraftBuilder builder() {
        return PaymentMethodDraftBuilder.of();
    }

    /**
     * create builder for PaymentMethodDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDraftBuilder builder(final PaymentMethodDraft template) {
        return PaymentMethodDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodDraft(Function<PaymentMethodDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodDraft>";
            }
        };
    }
}
