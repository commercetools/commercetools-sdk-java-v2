
package com.commercetools.api.models.payment_method;

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
 * PaymentMethodDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodDraftImpl implements PaymentMethodDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    private String method;

    private String paymentInterface;

    private String interfaceAccount;

    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    private com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus;

    private Boolean _default;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit,
            @JsonProperty("method") final String method,
            @JsonProperty("paymentInterface") final String paymentInterface,
            @JsonProperty("interfaceAccount") final String interfaceAccount,
            @JsonProperty("token") final com.commercetools.api.models.payment_method.PaymentMethodToken token,
            @JsonProperty("paymentMethodStatus") final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus,
            @JsonProperty("default") final Boolean _default,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.name = name;
        this.customer = customer;
        this.businessUnit = businessUnit;
        this.method = method;
        this.paymentInterface = paymentInterface;
        this.interfaceAccount = interfaceAccount;
        this.token = token;
        this.paymentMethodStatus = paymentMethodStatus;
        this._default = _default;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public PaymentMethodDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the PaymentMethod.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Reference to a Customer the PaymentMethod should belong to.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer must be an Associate of the Business Unit.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Reference to a BusinessUnit the PaymentMethod should belong to.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Payment method to use for the Payment—for example, a credit card or direct debit.</p>
     */

    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     */

    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     */

    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Status of the PaymentMethod.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodStatus getPaymentMethodStatus() {
        return this.paymentMethodStatus;
    }

    /**
     *  <p>Set to <code>true</code> if the PaymentMethod should be the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     */

    public Boolean getDefault() {
        return this._default;
    }

    /**
     *  <p>Custom Fields for the PaymentMethod.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    public void setPaymentInterface(final String paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void setInterfaceAccount(final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
    }

    public void setToken(final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
    }

    public void setPaymentMethodStatus(
            final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
    }

    public void setDefault(final Boolean _default) {
        this._default = _default;
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

        PaymentMethodDraftImpl that = (PaymentMethodDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(customer, that.customer)
                .append(businessUnit, that.businessUnit)
                .append(method, that.method)
                .append(paymentInterface, that.paymentInterface)
                .append(interfaceAccount, that.interfaceAccount)
                .append(token, that.token)
                .append(paymentMethodStatus, that.paymentMethodStatus)
                .append(_default, that._default)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(name, that.name)
                .append(customer, that.customer)
                .append(businessUnit, that.businessUnit)
                .append(method, that.method)
                .append(paymentInterface, that.paymentInterface)
                .append(interfaceAccount, that.interfaceAccount)
                .append(token, that.token)
                .append(paymentMethodStatus, that.paymentMethodStatus)
                .append(_default, that._default)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(customer)
                .append(businessUnit)
                .append(method)
                .append(paymentInterface)
                .append(interfaceAccount)
                .append(token)
                .append(paymentMethodStatus)
                .append(_default)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("customer", customer)
                .append("businessUnit", businessUnit)
                .append("method", method)
                .append("paymentInterface", paymentInterface)
                .append("interfaceAccount", interfaceAccount)
                .append("token", token)
                .append("paymentMethodStatus", paymentMethodStatus)
                .append("default", _default)
                .append("custom", custom)
                .build();
    }

    @Override
    public PaymentMethodDraft copyDeep() {
        return PaymentMethodDraft.deepCopy(this);
    }
}
