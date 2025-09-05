
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
 * TransactionDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionDraftImpl implements TransactionDraft, ModelBase {

    private String key;

    private com.commercetools.checkout.models.application.ApplicationResourceIdentifier application;

    private java.util.List<com.commercetools.checkout.models.transaction.TransactionItemDraft> transactionItems;

    private com.commercetools.checkout.models.cart.CartResourceIdentifier cart;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("application") final com.commercetools.checkout.models.application.ApplicationResourceIdentifier application,
            @JsonProperty("transactionItems") final java.util.List<com.commercetools.checkout.models.transaction.TransactionItemDraft> transactionItems,
            @JsonProperty("cart") final com.commercetools.checkout.models.cart.CartResourceIdentifier cart) {
        this.key = key;
        this.application = application;
        this.transactionItems = transactionItems;
        this.cart = cart;
    }

    /**
     * create empty instance
     */
    public TransactionDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><span>Application</span> for which the payment is executed.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationResourceIdentifier getApplication() {
        return this.application;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     */

    public java.util.List<com.commercetools.checkout.models.transaction.TransactionItemDraft> getTransactionItems() {
        return this.transactionItems;
    }

    /**
     *  <p><span>Cart</span> for which the payment must be executed.</p>
     */

    public com.commercetools.checkout.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setApplication(
            final com.commercetools.checkout.models.application.ApplicationResourceIdentifier application) {
        this.application = application;
    }

    public void setTransactionItems(
            final com.commercetools.checkout.models.transaction.TransactionItemDraft... transactionItems) {
        this.transactionItems = new ArrayList<>(Arrays.asList(transactionItems));
    }

    public void setTransactionItems(
            final java.util.List<com.commercetools.checkout.models.transaction.TransactionItemDraft> transactionItems) {
        this.transactionItems = transactionItems;
    }

    public void setCart(final com.commercetools.checkout.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionDraftImpl that = (TransactionDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(application, that.application)
                .append(transactionItems, that.transactionItems)
                .append(cart, that.cart)
                .append(key, that.key)
                .append(application, that.application)
                .append(transactionItems, that.transactionItems)
                .append(cart, that.cart)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(application)
                .append(transactionItems)
                .append(cart)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("application", application)
                .append("transactionItems", transactionItems)
                .append("cart", cart)
                .build();
    }

    @Override
    public TransactionDraft copyDeep() {
        return TransactionDraft.deepCopy(this);
    }
}
