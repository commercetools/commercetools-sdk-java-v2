
package com.commercetools.checkout.models.transaction;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionBuilder
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
public class TransactionBuilder implements Builder<Transaction> {

    private String id;

    @Nullable
    private String key;

    private Integer version;

    private com.commercetools.checkout.models.application.ApplicationReference application;

    private java.util.List<com.commercetools.checkout.models.transaction.TransactionItem> transactionItems;

    @Nullable
    private com.commercetools.checkout.models.cart.CartReference cart;

    private com.commercetools.checkout.models.transaction.TransactionStatus transactionStatus;

    @Nullable
    private com.commercetools.checkout.models.cart.OrderReference order;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param id value to be set
     * @return Builder
     */

    public TransactionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     * @param key value to be set
     * @return Builder
     */

    public TransactionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Current version of the Transaction.</p>
     * @param version value to be set
     * @return Builder
     */

    public TransactionBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment must be executed.</p>
     * @param builder function to build the application value
     * @return Builder
     */

    public TransactionBuilder application(
            Function<com.commercetools.checkout.models.application.ApplicationReferenceBuilder, com.commercetools.checkout.models.application.ApplicationReferenceBuilder> builder) {
        this.application = builder.apply(com.commercetools.checkout.models.application.ApplicationReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment must be executed.</p>
     * @param builder function to build the application value
     * @return Builder
     */

    public TransactionBuilder withApplication(
            Function<com.commercetools.checkout.models.application.ApplicationReferenceBuilder, com.commercetools.checkout.models.application.ApplicationReference> builder) {
        this.application = builder
                .apply(com.commercetools.checkout.models.application.ApplicationReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment must be executed.</p>
     * @param application value to be set
     * @return Builder
     */

    public TransactionBuilder application(
            final com.commercetools.checkout.models.application.ApplicationReference application) {
        this.application = application;
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems value to be set
     * @return Builder
     */

    public TransactionBuilder transactionItems(
            final com.commercetools.checkout.models.transaction.TransactionItem... transactionItems) {
        this.transactionItems = new ArrayList<>(Arrays.asList(transactionItems));
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems value to be set
     * @return Builder
     */

    public TransactionBuilder transactionItems(
            final java.util.List<com.commercetools.checkout.models.transaction.TransactionItem> transactionItems) {
        this.transactionItems = transactionItems;
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems value to be set
     * @return Builder
     */

    public TransactionBuilder plusTransactionItems(
            final com.commercetools.checkout.models.transaction.TransactionItem... transactionItems) {
        if (this.transactionItems == null) {
            this.transactionItems = new ArrayList<>();
        }
        this.transactionItems.addAll(Arrays.asList(transactionItems));
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param builder function to build the transactionItems value
     * @return Builder
     */

    public TransactionBuilder plusTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemBuilder, com.commercetools.checkout.models.transaction.TransactionItemBuilder> builder) {
        if (this.transactionItems == null) {
            this.transactionItems = new ArrayList<>();
        }
        this.transactionItems
                .add(builder.apply(com.commercetools.checkout.models.transaction.TransactionItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param builder function to build the transactionItems value
     * @return Builder
     */

    public TransactionBuilder withTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemBuilder, com.commercetools.checkout.models.transaction.TransactionItemBuilder> builder) {
        this.transactionItems = new ArrayList<>();
        this.transactionItems
                .add(builder.apply(com.commercetools.checkout.models.transaction.TransactionItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param builder function to build the transactionItems value
     * @return Builder
     */

    public TransactionBuilder addTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemBuilder, com.commercetools.checkout.models.transaction.TransactionItem> builder) {
        return plusTransactionItems(
            builder.apply(com.commercetools.checkout.models.transaction.TransactionItemBuilder.of()));
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param builder function to build the transactionItems value
     * @return Builder
     */

    public TransactionBuilder setTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemBuilder, com.commercetools.checkout.models.transaction.TransactionItem> builder) {
        return transactionItems(
            builder.apply(com.commercetools.checkout.models.transaction.TransactionItemBuilder.of()));
    }

    /**
     *  <p>Reference to the <span>Cart</span> for which the payment must be executed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public TransactionBuilder cart(
            Function<com.commercetools.checkout.models.cart.CartReferenceBuilder, com.commercetools.checkout.models.cart.CartReferenceBuilder> builder) {
        this.cart = builder.apply(com.commercetools.checkout.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the <span>Cart</span> for which the payment must be executed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public TransactionBuilder withCart(
            Function<com.commercetools.checkout.models.cart.CartReferenceBuilder, com.commercetools.checkout.models.cart.CartReference> builder) {
        this.cart = builder.apply(com.commercetools.checkout.models.cart.CartReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <span>Cart</span> for which the payment must be executed.</p>
     * @param cart value to be set
     * @return Builder
     */

    public TransactionBuilder cart(@Nullable final com.commercetools.checkout.models.cart.CartReference cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Status of the Transaction.</p>
     * @param builder function to build the transactionStatus value
     * @return Builder
     */

    public TransactionBuilder transactionStatus(
            Function<com.commercetools.checkout.models.transaction.TransactionStatusBuilder, com.commercetools.checkout.models.transaction.TransactionStatusBuilder> builder) {
        this.transactionStatus = builder
                .apply(com.commercetools.checkout.models.transaction.TransactionStatusBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Status of the Transaction.</p>
     * @param builder function to build the transactionStatus value
     * @return Builder
     */

    public TransactionBuilder withTransactionStatus(
            Function<com.commercetools.checkout.models.transaction.TransactionStatusBuilder, com.commercetools.checkout.models.transaction.TransactionStatus> builder) {
        this.transactionStatus = builder
                .apply(com.commercetools.checkout.models.transaction.TransactionStatusBuilder.of());
        return this;
    }

    /**
     *  <p>Status of the Transaction.</p>
     * @param transactionStatus value to be set
     * @return Builder
     */

    public TransactionBuilder transactionStatus(
            final com.commercetools.checkout.models.transaction.TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    /**
     *  <p>Reference to the <span>Order</span> created from the Cart when the Transaction is completed.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public TransactionBuilder order(
            Function<com.commercetools.checkout.models.cart.OrderReferenceBuilder, com.commercetools.checkout.models.cart.OrderReferenceBuilder> builder) {
        this.order = builder.apply(com.commercetools.checkout.models.cart.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the <span>Order</span> created from the Cart when the Transaction is completed.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public TransactionBuilder withOrder(
            Function<com.commercetools.checkout.models.cart.OrderReferenceBuilder, com.commercetools.checkout.models.cart.OrderReference> builder) {
        this.order = builder.apply(com.commercetools.checkout.models.cart.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <span>Order</span> created from the Cart when the Transaction is completed.</p>
     * @param order value to be set
     * @return Builder
     */

    public TransactionBuilder order(@Nullable final com.commercetools.checkout.models.cart.OrderReference order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Transaction was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public TransactionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Transaction was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public TransactionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Current version of the Transaction.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment must be executed.</p>
     * @return application
     */

    public com.commercetools.checkout.models.application.ApplicationReference getApplication() {
        return this.application;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @return transactionItems
     */

    public java.util.List<com.commercetools.checkout.models.transaction.TransactionItem> getTransactionItems() {
        return this.transactionItems;
    }

    /**
     *  <p>Reference to the <span>Cart</span> for which the payment must be executed.</p>
     * @return cart
     */

    @Nullable
    public com.commercetools.checkout.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>Status of the Transaction.</p>
     * @return transactionStatus
     */

    public com.commercetools.checkout.models.transaction.TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }

    /**
     *  <p>Reference to the <span>Order</span> created from the Cart when the Transaction is completed.</p>
     * @return order
     */

    @Nullable
    public com.commercetools.checkout.models.cart.OrderReference getOrder() {
        return this.order;
    }

    /**
     *  <p>Date and time (UTC) the Transaction was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Transaction was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * builds Transaction with checking for non-null required values
     * @return Transaction
     */
    public Transaction build() {
        Objects.requireNonNull(id, Transaction.class + ": id is missing");
        Objects.requireNonNull(version, Transaction.class + ": version is missing");
        Objects.requireNonNull(application, Transaction.class + ": application is missing");
        Objects.requireNonNull(transactionItems, Transaction.class + ": transactionItems is missing");
        Objects.requireNonNull(transactionStatus, Transaction.class + ": transactionStatus is missing");
        Objects.requireNonNull(createdAt, Transaction.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Transaction.class + ": lastModifiedAt is missing");
        return new TransactionImpl(id, key, version, application, transactionItems, cart, transactionStatus, order,
            createdAt, lastModifiedAt);
    }

    /**
     * builds Transaction without checking for non-null required values
     * @return Transaction
     */
    public Transaction buildUnchecked() {
        return new TransactionImpl(id, key, version, application, transactionItems, cart, transactionStatus, order,
            createdAt, lastModifiedAt);
    }

    /**
     * factory method for an instance of TransactionBuilder
     * @return builder
     */
    public static TransactionBuilder of() {
        return new TransactionBuilder();
    }

    /**
     * create builder for Transaction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionBuilder of(final Transaction template) {
        TransactionBuilder builder = new TransactionBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.version = template.getVersion();
        builder.application = template.getApplication();
        builder.transactionItems = template.getTransactionItems();
        builder.cart = template.getCart();
        builder.transactionStatus = template.getTransactionStatus();
        builder.order = template.getOrder();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
