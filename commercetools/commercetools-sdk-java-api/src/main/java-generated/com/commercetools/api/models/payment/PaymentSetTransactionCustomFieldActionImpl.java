
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
 * PaymentSetTransactionCustomFieldAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetTransactionCustomFieldActionImpl implements PaymentSetTransactionCustomFieldAction, ModelBase {

    private String action;

    private String transactionId;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetTransactionCustomFieldActionImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.transactionId = transactionId;
        this.name = name;
        this.value = value;
        this.action = SET_TRANSACTION_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public PaymentSetTransactionCustomFieldActionImpl() {
        this.action = SET_TRANSACTION_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Unique identifier of the Transaction.</p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetTransactionCustomFieldActionImpl that = (PaymentSetTransactionCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(name, that.name)
                .append(value, that.value)
                .append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transactionId).append(name).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("transactionId", transactionId)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public PaymentSetTransactionCustomFieldAction copyDeep() {
        return PaymentSetTransactionCustomFieldAction.deepCopy(this);
    }
}
