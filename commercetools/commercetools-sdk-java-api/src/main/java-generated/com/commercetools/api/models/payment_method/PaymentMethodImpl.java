
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
 * PaymentMethod
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodImpl implements PaymentMethod, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    private String method;

    private String paymentInterface;

    private String interfaceAccount;

    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    private com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus;

    private Boolean _default;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit,
            @JsonProperty("method") final String method,
            @JsonProperty("paymentInterface") final String paymentInterface,
            @JsonProperty("interfaceAccount") final String interfaceAccount,
            @JsonProperty("token") final com.commercetools.api.models.payment_method.PaymentMethodToken token,
            @JsonProperty("paymentMethodStatus") final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus,
            @JsonProperty("default") final Boolean _default,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
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
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
    }

    /**
     * create empty instance
     */
    public PaymentMethodImpl() {
    }

    /**
     *  <p>Unique identifier of the PaymentMethod.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the PaymentMethod.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the PaymentMethod was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the PaymentMethod was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the PaymentMethod.</p>
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
     *  <p>Reference to a Customer associated with the PaymentMethod.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer is an Associate of the Business Unit.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Reference to a BusinessUnit associated with the PaymentMethod.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Payment Method used for the Payment—for example, a credit card or direct debit.</p>
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
     *  <p>Indicates if the PaymentMethod is the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     */

    public Boolean getDefault() {
        return this._default;
    }

    /**
     *  <p>Custom Fields of the PaymentMethod.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>IDs and references that last modified the PaymentMethod.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the PaymentMethod.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
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

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodImpl that = (PaymentMethodImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
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
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
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
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(key)
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
                .append(lastModifiedBy)
                .append(createdBy)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("key", key)
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
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .build();
    }

    @Override
    public PaymentMethod copyDeep() {
        return PaymentMethod.deepCopy(this);
    }
}
