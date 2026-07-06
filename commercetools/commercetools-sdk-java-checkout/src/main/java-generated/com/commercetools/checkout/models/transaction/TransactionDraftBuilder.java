
package com.commercetools.checkout.models.transaction;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionDraft transactionDraft = TransactionDraft.builder()
 *             .application(applicationBuilder -> applicationBuilder)
 *             .plusTransactionItems(transactionItemsBuilder -> transactionItemsBuilder)
 *             .cart(cartBuilder -> cartBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionDraftBuilder implements Builder<TransactionDraft> {

    @Nullable
    private String key;

    private com.commercetools.checkout.models.application.ApplicationResourceIdentifier application;

    private java.util.List<com.commercetools.checkout.models.transaction.TransactionItemDraft> transactionItems;

    private com.commercetools.checkout.models.cart.CartResourceIdentifier cart;

    /**
     *  <p>User-defined unique identifier of the Transaction.</p>
     * @param key value to be set
     * @return Builder
     */

    public TransactionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment is executed.</p>
     * @param builder function to build the application value
     * @return Builder
     */

    public TransactionDraftBuilder application(
            Function<com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder, com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder> builder) {
        this.application = builder
                .apply(com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment is executed.</p>
     * @param builder function to build the application value
     * @return Builder
     */

    public TransactionDraftBuilder withApplication(
            Function<com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder, com.commercetools.checkout.models.application.ApplicationResourceIdentifier> builder) {
        this.application = builder
                .apply(com.commercetools.checkout.models.application.ApplicationResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment is executed.</p>
     * @param application value to be set
     * @return Builder
     */

    public TransactionDraftBuilder application(
            final com.commercetools.checkout.models.application.ApplicationResourceIdentifier application) {
        this.application = application;
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems value to be set
     * @return Builder
     */

    public TransactionDraftBuilder transactionItems(
            final com.commercetools.checkout.models.transaction.TransactionItemDraft... transactionItems) {
        this.transactionItems = new ArrayList<>(Arrays.asList(transactionItems));
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems value to be set
     * @return Builder
     */

    public TransactionDraftBuilder transactionItems(
            final java.util.List<com.commercetools.checkout.models.transaction.TransactionItemDraft> transactionItems) {
        this.transactionItems = transactionItems;
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param transactionItems value to be set
     * @return Builder
     */

    public TransactionDraftBuilder plusTransactionItems(
            final com.commercetools.checkout.models.transaction.TransactionItemDraft... transactionItems) {
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

    public TransactionDraftBuilder plusTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder, com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder> builder) {
        if (this.transactionItems == null) {
            this.transactionItems = new ArrayList<>();
        }
        this.transactionItems.add(
            builder.apply(com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param builder function to build the transactionItems value
     * @return Builder
     */

    public TransactionDraftBuilder withTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder, com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder> builder) {
        this.transactionItems = new ArrayList<>();
        this.transactionItems.add(
            builder.apply(com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param builder function to build the transactionItems value
     * @return Builder
     */

    public TransactionDraftBuilder addTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder, com.commercetools.checkout.models.transaction.TransactionItemDraft> builder) {
        return plusTransactionItems(
            builder.apply(com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder.of()));
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @param builder function to build the transactionItems value
     * @return Builder
     */

    public TransactionDraftBuilder setTransactionItems(
            Function<com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder, com.commercetools.checkout.models.transaction.TransactionItemDraft> builder) {
        return transactionItems(
            builder.apply(com.commercetools.checkout.models.transaction.TransactionItemDraftBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> for which the payment must be executed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public TransactionDraftBuilder cart(
            Function<com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder, com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> for which the payment must be executed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public TransactionDraftBuilder withCart(
            Function<com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder, com.commercetools.checkout.models.cart.CartResourceIdentifier> builder) {
        this.cart = builder.apply(com.commercetools.checkout.models.cart.CartResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> for which the payment must be executed.</p>
     * @param cart value to be set
     * @return Builder
     */

    public TransactionDraftBuilder cart(final com.commercetools.checkout.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a> for which the payment is executed.</p>
     * @return application
     */

    public com.commercetools.checkout.models.application.ApplicationResourceIdentifier getApplication() {
        return this.application;
    }

    /**
     *  <p>Transaction Item associated with the Transaction.</p>
     * @return transactionItems
     */

    public java.util.List<com.commercetools.checkout.models.transaction.TransactionItemDraft> getTransactionItems() {
        return this.transactionItems;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> for which the payment must be executed.</p>
     * @return cart
     */

    public com.commercetools.checkout.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    /**
     * builds TransactionDraft with checking for non-null required values
     * @return TransactionDraft
     */
    public TransactionDraft build() {
        Objects.requireNonNull(application, TransactionDraft.class + ": application is missing");
        Objects.requireNonNull(transactionItems, TransactionDraft.class + ": transactionItems is missing");
        Objects.requireNonNull(cart, TransactionDraft.class + ": cart is missing");
        return new TransactionDraftImpl(key, application, transactionItems, cart);
    }

    /**
     * builds TransactionDraft without checking for non-null required values
     * @return TransactionDraft
     */
    public TransactionDraft buildUnchecked() {
        return new TransactionDraftImpl(key, application, transactionItems, cart);
    }

    /**
     * factory method for an instance of TransactionDraftBuilder
     * @return builder
     */
    public static TransactionDraftBuilder of() {
        return new TransactionDraftBuilder();
    }

    /**
     * create builder for TransactionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionDraftBuilder of(final TransactionDraft template) {
        TransactionDraftBuilder builder = new TransactionDraftBuilder();
        builder.key = template.getKey();
        builder.application = template.getApplication();
        builder.transactionItems = template.getTransactionItems();
        builder.cart = template.getCart();
        return builder;
    }

}
