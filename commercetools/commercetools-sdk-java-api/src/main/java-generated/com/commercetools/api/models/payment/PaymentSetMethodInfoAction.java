
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
 *  <p>This action lets you update multiple fields of a PaymentMethodInfo in one operation. Only fields with explicitly provided values will be updated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoAction paymentSetMethodInfoAction = PaymentSetMethodInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoActionImpl.class)
public interface PaymentSetMethodInfoAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoAction
     */
    String SET_METHOD_INFO = "setMethodInfo";

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique. The value cannot be modified after it is set.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterface</code> action and will generate the PaymentMethodInfoInterfaceSet Message.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Payment method to use—for example, a credit card or cash advance. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoMethod</code> action and will generate the PaymentMethodInfoMethodSet Message.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Name of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoName</code> action and will generate the PaymentMethodInfoNameSet Message.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Tokenized payment method information of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoToken</code> action and will generate the PaymentMethodInfoTokenSet Message.</p>
     * @return token
     */
    @Valid
    @JsonProperty("token")
    public PaymentMethodToken getToken();

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface). If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterfaceAccount</code> action and will generate the PaymentMethodInfoInterfaceAccountSet Message.</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Custom Fields for the PaymentMethodInfo. If not provided, any existing Custom Fields will be removed, including the Custom Type.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoCustomType</code> and <code>setMethodInfoCustomField</code> actions, and will generate the following Messages:</p>
     *  <ul>
     *   <li>Adding or updating a Custom Type on a Payment Method Info generates the PaymentMethodInfoCustomTypeSet Message, removing one generates the PaymentMethodInfoCustomTypeRemoved Message.</li>
     *   <li>Adding a Custom Field to a Payment generates the PaymentMethodInfoCustomFieldAdded Message, removing one generates the PaymentMethodInfoCustomFieldRemoved Message, and updating an existing one generates the PaymentMethodInfoCustomFieldChanged Message.</li>
     *  </ul>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique. The value cannot be modified after it is set.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterface</code> action and will generate the PaymentMethodInfoInterfaceSet Message.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Payment method to use—for example, a credit card or cash advance. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoMethod</code> action and will generate the PaymentMethodInfoMethodSet Message.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Name of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoName</code> action and will generate the PaymentMethodInfoNameSet Message.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Tokenized payment method information of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoToken</code> action and will generate the PaymentMethodInfoTokenSet Message.</p>
     * @param token value to be set
     */

    public void setToken(final PaymentMethodToken token);

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface). If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterfaceAccount</code> action and will generate the PaymentMethodInfoInterfaceAccountSet Message.</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Custom Fields for the PaymentMethodInfo. If not provided, any existing Custom Fields will be removed, including the Custom Type.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoCustomType</code> and <code>setMethodInfoCustomField</code> actions, and will generate the following Messages:</p>
     *  <ul>
     *   <li>Adding or updating a Custom Type on a Payment Method Info generates the PaymentMethodInfoCustomTypeSet Message, removing one generates the PaymentMethodInfoCustomTypeRemoved Message.</li>
     *   <li>Adding a Custom Field to a Payment generates the PaymentMethodInfoCustomFieldAdded Message, removing one generates the PaymentMethodInfoCustomFieldRemoved Message, and updating an existing one generates the PaymentMethodInfoCustomFieldChanged Message.</li>
     *  </ul>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of PaymentSetMethodInfoAction
     */
    public static PaymentSetMethodInfoAction of() {
        return new PaymentSetMethodInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoAction of(final PaymentSetMethodInfoAction template) {
        PaymentSetMethodInfoActionImpl instance = new PaymentSetMethodInfoActionImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(template.getName());
        instance.setToken(template.getToken());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public PaymentSetMethodInfoAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoAction deepCopy(@Nullable final PaymentSetMethodInfoAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoActionImpl instance = new PaymentSetMethodInfoActionImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoAction
     * @return builder
     */
    public static PaymentSetMethodInfoActionBuilder builder() {
        return PaymentSetMethodInfoActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoActionBuilder builder(final PaymentSetMethodInfoAction template) {
        return PaymentSetMethodInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoAction(Function<PaymentSetMethodInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoAction>";
            }
        };
    }
}
