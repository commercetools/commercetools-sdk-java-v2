
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.application.ApplicationResourceIdentifier;
import com.commercetools.checkout.models.cart.CartReference;
import com.commercetools.checkout.models.cart.OrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Information for the request to the <span>Connector</span> to initiate the payment for a specific <span>Cart</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Transaction transaction = Transaction.builder()
 *             .id("{id}")
 *             .version(1)
 *             .application(applicationBuilder -> applicationBuilder)
 *             .plusTransactionItems(transactionItemsBuilder -> transactionItemsBuilder)
 *             .transactionStatus(transactionStatusBuilder -> transactionStatusBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionImpl.class)
public interface Transaction {

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Current version of the Transaction.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p><span>Application</span> for which the payment must be executed.</p>
     * @return application
     */
    @NotNull
    @Valid
    @JsonProperty("application")
    public ApplicationResourceIdentifier getApplication();

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @return transactionItems
     */
    @NotNull
    @Valid
    @JsonProperty("transactionItems")
    public List<TransactionItem> getTransactionItems();

    /**
     *  <p>Reference to the <span>Cart</span> for which the payment must be executed.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public CartReference getCart();

    /**
     *  <p>Status of the Transaction.</p>
     * @return transactionStatus
     */
    @NotNull
    @Valid
    @JsonProperty("transactionStatus")
    public TransactionStatus getTransactionStatus();

    /**
     *  <p>Reference to the <span>Order</span> created from the Cart when the Transaction is completed.</p>
     * @return order
     */
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p>Date and time (UTC) the Transaction was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Transaction was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Current version of the Transaction.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p><span>Application</span> for which the payment must be executed.</p>
     * @param application value to be set
     */

    public void setApplication(final ApplicationResourceIdentifier application);

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems values to be set
     */

    @JsonIgnore
    public void setTransactionItems(final TransactionItem... transactionItems);

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems values to be set
     */

    public void setTransactionItems(final List<TransactionItem> transactionItems);

    /**
     *  <p>Reference to the <span>Cart</span> for which the payment must be executed.</p>
     * @param cart value to be set
     */

    public void setCart(final CartReference cart);

    /**
     *  <p>Status of the Transaction.</p>
     * @param transactionStatus value to be set
     */

    public void setTransactionStatus(final TransactionStatus transactionStatus);

    /**
     *  <p>Reference to the <span>Order</span> created from the Cart when the Transaction is completed.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     *  <p>Date and time (UTC) the Transaction was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Transaction was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     * factory method
     * @return instance of Transaction
     */
    public static Transaction of() {
        return new TransactionImpl();
    }

    /**
     * factory method to create a shallow copy Transaction
     * @param template instance to be copied
     * @return copy instance
     */
    public static Transaction of(final Transaction template) {
        TransactionImpl instance = new TransactionImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        instance.setApplication(template.getApplication());
        instance.setTransactionItems(template.getTransactionItems());
        instance.setCart(template.getCart());
        instance.setTransactionStatus(template.getTransactionStatus());
        instance.setOrder(template.getOrder());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    public Transaction copyDeep();

    /**
     * factory method to create a deep copy of Transaction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Transaction deepCopy(@Nullable final Transaction template) {
        if (template == null) {
            return null;
        }
        TransactionImpl instance = new TransactionImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        instance.setApplication(com.commercetools.checkout.models.application.ApplicationResourceIdentifier
                .deepCopy(template.getApplication()));
        instance.setTransactionItems(Optional.ofNullable(template.getTransactionItems())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.transaction.TransactionItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCart(com.commercetools.checkout.models.cart.CartReference.deepCopy(template.getCart()));
        instance.setTransactionStatus(
            com.commercetools.checkout.models.transaction.TransactionStatus.deepCopy(template.getTransactionStatus()));
        instance.setOrder(com.commercetools.checkout.models.cart.OrderReference.deepCopy(template.getOrder()));
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    /**
     * builder factory method for Transaction
     * @return builder
     */
    public static TransactionBuilder builder() {
        return TransactionBuilder.of();
    }

    /**
     * create builder for Transaction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionBuilder builder(final Transaction template) {
        return TransactionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransaction(Function<Transaction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Transaction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Transaction>() {
            @Override
            public String toString() {
                return "TypeReference<Transaction>";
            }
        };
    }
}
