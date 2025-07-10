
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>This action lets you update multiple fields of a PaymentMethodInfo in one operation. Only fields with explicitly provided values will be updated.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoActionImpl implements PaymentSetMethodInfoAction, ModelBase {

    private String action;

    private String paymentInterface;

    private String method;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    private String interfaceAccount;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetMethodInfoActionImpl(@JsonProperty("paymentInterface") final String paymentInterface,
            @JsonProperty("method") final String method,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("token") final com.commercetools.api.models.payment_method.PaymentMethodToken token,
            @JsonProperty("interfaceAccount") final String interfaceAccount,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.paymentInterface = paymentInterface;
        this.method = method;
        this.name = name;
        this.token = token;
        this.interfaceAccount = interfaceAccount;
        this.custom = custom;
        this.action = SET_METHOD_INFO;
    }

    /**
     * create empty instance
     */
    public PaymentSetMethodInfoActionImpl() {
        this.action = SET_METHOD_INFO;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique. The value cannot be modified after it is set.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterface</code> action and will generate the PaymentMethodInfoInterfaceSet Message.</p>
     */

    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Payment method to use—for example, a credit card or direct debit. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoMethod</code> action and will generate the PaymentMethodInfoMethodSet Message.</p>
     */

    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Name of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoName</code> action and will generate the PaymentMethodInfoNameSet Message.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Tokenized payment method information of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoToken</code> action and will generate the PaymentMethodInfoTokenSet Message.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface). If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterfaceAccount</code> action and will generate the PaymentMethodInfoInterfaceAccountSet Message.</p>
     */

    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Custom Fields for the PaymentMethodInfo. If not provided, any existing Custom Fields will be removed, including the Custom Type.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoCustomType</code> and <code>setMethodInfoCustomField</code> actions, and will generate the following Messages:</p>
     *  <ul>
     *   <li>Adding or updating a Custom Type on a Payment Method Info generates the PaymentMethodInfoCustomTypeSet Message, removing one generates the PaymentMethodInfoCustomTypeRemoved Message.</li>
     *   <li>Adding a Custom Field to a Payment generates the PaymentMethodInfoCustomFieldAdded Message, removing one generates the PaymentMethodInfoCustomFieldRemoved Message, and updating an existing one generates the PaymentMethodInfoCustomFieldChanged Message.</li>
     *  </ul>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setPaymentInterface(final String paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setToken(final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
    }

    public void setInterfaceAccount(final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetMethodInfoActionImpl that = (PaymentSetMethodInfoActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentInterface, that.paymentInterface)
                .append(method, that.method)
                .append(name, that.name)
                .append(token, that.token)
                .append(interfaceAccount, that.interfaceAccount)
                .append(custom, that.custom)
                .append(action, that.action)
                .append(paymentInterface, that.paymentInterface)
                .append(method, that.method)
                .append(name, that.name)
                .append(token, that.token)
                .append(interfaceAccount, that.interfaceAccount)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(paymentInterface)
                .append(method)
                .append(name)
                .append(token)
                .append(interfaceAccount)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentInterface", paymentInterface)
                .append("method", method)
                .append("name", name)
                .append("token", token)
                .append("interfaceAccount", interfaceAccount)
                .append("custom", custom)
                .build();
    }

    @Override
    public PaymentSetMethodInfoAction copyDeep() {
        return PaymentSetMethodInfoAction.deepCopy(this);
    }
}
