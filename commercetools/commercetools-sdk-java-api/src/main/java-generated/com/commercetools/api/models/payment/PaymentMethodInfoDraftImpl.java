
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
 * PaymentMethodInfoDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoDraftImpl implements PaymentMethodInfoDraft, ModelBase {

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
    PaymentMethodInfoDraftImpl(@JsonProperty("paymentInterface") final String paymentInterface,
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
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoDraftImpl() {
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     */

    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Payment method to use—for example, a credit card or direct debit.</p>
     */

    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Name of the Payment Method.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     */

    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Custom fields for the PaymentMethodInfo.</p>
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

        PaymentMethodInfoDraftImpl that = (PaymentMethodInfoDraftImpl) o;

        return new EqualsBuilder().append(paymentInterface, that.paymentInterface)
                .append(method, that.method)
                .append(name, that.name)
                .append(token, that.token)
                .append(interfaceAccount, that.interfaceAccount)
                .append(custom, that.custom)
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
        return new HashCodeBuilder(17, 37).append(paymentInterface)
                .append(method)
                .append(name)
                .append(token)
                .append(interfaceAccount)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("paymentInterface", paymentInterface)
                .append("method", method)
                .append("name", name)
                .append("token", token)
                .append("interfaceAccount", interfaceAccount)
                .append("custom", custom)
                .build();
    }

    @Override
    public PaymentMethodInfoDraft copyDeep() {
        return PaymentMethodInfoDraft.deepCopy(this);
    }
}
