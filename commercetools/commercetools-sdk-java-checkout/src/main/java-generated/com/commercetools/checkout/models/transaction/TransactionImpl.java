
package com.commercetools.checkout.models.transaction;

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
 *  <p>Information for the request to the <span>Connector</span> to initiate the payment for a specific <span>Cart</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionImpl implements Transaction, ModelBase {

    private String id;

    private String key;

    private Integer version;

    private com.commercetools.checkout.models.application.ApplicationResourceIdentifier application;

    private java.util.List<com.commercetools.checkout.models.transaction.TransactionItem> transactionItems;

    private com.commercetools.checkout.models.cart.CartReference cart;

    private com.commercetools.checkout.models.transaction.TransactionStatus transactionStatus;

    private com.commercetools.checkout.models.cart.OrderReference order;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("version") final Integer version,
            @JsonProperty("application") final com.commercetools.checkout.models.application.ApplicationResourceIdentifier application,
            @JsonProperty("transactionItems") final java.util.List<com.commercetools.checkout.models.transaction.TransactionItem> transactionItems,
            @JsonProperty("cart") final com.commercetools.checkout.models.cart.CartReference cart,
            @JsonProperty("transactionStatus") final com.commercetools.checkout.models.transaction.TransactionStatus transactionStatus,
            @JsonProperty("order") final com.commercetools.checkout.models.cart.OrderReference order,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.id = id;
        this.key = key;
        this.version = version;
        this.application = application;
        this.transactionItems = transactionItems;
        this.cart = cart;
        this.transactionStatus = transactionStatus;
        this.order = order;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * create empty instance
     */
    public TransactionImpl() {
    }

    /**
     *  <p>Unique identifier of the Transaction.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Current version of the Transaction.</p>
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p><span>Application</span> for which the payment must be executed.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationResourceIdentifier getApplication() {
        return this.application;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     */

    public java.util.List<com.commercetools.checkout.models.transaction.TransactionItem> getTransactionItems() {
        return this.transactionItems;
    }

    /**
     *  <p>Reference to the <span>Cart</span> for which the payment must be executed.</p>
     */

    public com.commercetools.checkout.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>Status of the Transaction.</p>
     */

    public com.commercetools.checkout.models.transaction.TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }

    /**
     *  <p>Reference to the <span>Order</span> created from the Cart when the Transaction is completed.</p>
     */

    public com.commercetools.checkout.models.cart.OrderReference getOrder() {
        return this.order;
    }

    /**
     *  <p>Date and time (UTC) the Transaction was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Transaction was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setVersion(final Integer version) {
        this.version = version;
    }

    public void setApplication(
            final com.commercetools.checkout.models.application.ApplicationResourceIdentifier application) {
        this.application = application;
    }

    public void setTransactionItems(
            final com.commercetools.checkout.models.transaction.TransactionItem... transactionItems) {
        this.transactionItems = new ArrayList<>(Arrays.asList(transactionItems));
    }

    public void setTransactionItems(
            final java.util.List<com.commercetools.checkout.models.transaction.TransactionItem> transactionItems) {
        this.transactionItems = transactionItems;
    }

    public void setCart(final com.commercetools.checkout.models.cart.CartReference cart) {
        this.cart = cart;
    }

    public void setTransactionStatus(
            final com.commercetools.checkout.models.transaction.TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public void setOrder(final com.commercetools.checkout.models.cart.OrderReference order) {
        this.order = order;
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

        TransactionImpl that = (TransactionImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(version, that.version)
                .append(application, that.application)
                .append(transactionItems, that.transactionItems)
                .append(cart, that.cart)
                .append(transactionStatus, that.transactionStatus)
                .append(order, that.order)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(id, that.id)
                .append(key, that.key)
                .append(version, that.version)
                .append(application, that.application)
                .append(transactionItems, that.transactionItems)
                .append(cart, that.cart)
                .append(transactionStatus, that.transactionStatus)
                .append(order, that.order)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(version)
                .append(application)
                .append(transactionItems)
                .append(cart)
                .append(transactionStatus)
                .append(order)
                .append(createdAt)
                .append(lastModifiedAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("version", version)
                .append("application", application)
                .append("transactionItems", transactionItems)
                .append("cart", cart)
                .append("transactionStatus", transactionStatus)
                .append("order", order)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .build();
    }

    @Override
    public Transaction copyDeep() {
        return Transaction.deepCopy(this);
    }
}
