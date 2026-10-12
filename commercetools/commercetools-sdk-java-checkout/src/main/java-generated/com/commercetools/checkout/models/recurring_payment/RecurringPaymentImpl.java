
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Maps a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> and <span>Connector</span> that process its future payments.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentImpl implements RecurringPayment, ModelBase {

    private String id;

    private Integer version;

    private String key;

    private com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder;

    private java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Integer version,
            @JsonProperty("key") final String key,
            @JsonProperty("recurringOrder") final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder,
            @JsonProperty("paymentMethodConfigurations") final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.id = id;
        this.version = version;
        this.key = key;
        this.recurringOrder = recurringOrder;
        this.paymentMethodConfigurations = paymentMethodConfigurations;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentImpl() {
    }

    /**
     *  <p>Unique identifier of the RecurringPayment.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the RecurringPayment.</p>
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments are processed using Checkout.</p>
     */

    public com.commercetools.checkout.models.recurring_payment.RecurringOrderReference getRecurringOrder() {
        return this.recurringOrder;
    }

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> getPaymentMethodConfigurations() {
        return this.paymentMethodConfigurations;
    }

    /**
     *  <p>Date and time (UTC) the RecurringPayment was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the RecurringPayment was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Integer version) {
        this.version = version;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setRecurringOrder(
            final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder) {
        this.recurringOrder = recurringOrder;
    }

    public void setPaymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        this.paymentMethodConfigurations = new ArrayList<>(Arrays.asList(paymentMethodConfigurations));
    }

    public void setPaymentMethodConfigurations(
            final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations) {
        this.paymentMethodConfigurations = paymentMethodConfigurations;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentImpl that = (RecurringPaymentImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(key, that.key)
                .append(recurringOrder, that.recurringOrder)
                .append(paymentMethodConfigurations, that.paymentMethodConfigurations)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(id, that.id)
                .append(version, that.version)
                .append(key, that.key)
                .append(recurringOrder, that.recurringOrder)
                .append(paymentMethodConfigurations, that.paymentMethodConfigurations)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(key)
                .append(recurringOrder)
                .append(paymentMethodConfigurations)
                .append(createdAt)
                .append(lastModifiedAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("key", key)
                .append("recurringOrder", recurringOrder)
                .append("paymentMethodConfigurations", paymentMethodConfigurations)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .build();
    }

    @Override
    public RecurringPayment copyDeep() {
        return RecurringPayment.deepCopy(this);
    }
}
