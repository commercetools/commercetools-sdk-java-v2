
package com.commercetools.checkout.models.transaction;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionStatusBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionStatus transactionStatus = TransactionStatus.builder()
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionStatusBuilder implements Builder<TransactionStatus> {

    private com.commercetools.checkout.models.transaction.TransactionState state;

    @Nullable
    private java.util.List<com.commercetools.checkout.models.transaction.TransactionError> errors;

    /**
     *  <p>State of the Transaction.</p>
     * @param state value to be set
     * @return Builder
     */

    public TransactionStatusBuilder state(final com.commercetools.checkout.models.transaction.TransactionState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param errors value to be set
     * @return Builder
     */

    public TransactionStatusBuilder errors(
            @Nullable final com.commercetools.checkout.models.transaction.TransactionError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param errors value to be set
     * @return Builder
     */

    public TransactionStatusBuilder errors(
            @Nullable final java.util.List<com.commercetools.checkout.models.transaction.TransactionError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param errors value to be set
     * @return Builder
     */

    public TransactionStatusBuilder plusErrors(
            @Nullable final com.commercetools.checkout.models.transaction.TransactionError... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public TransactionStatusBuilder plusErrors(
            Function<com.commercetools.checkout.models.transaction.TransactionErrorBuilder, com.commercetools.checkout.models.transaction.TransactionErrorBuilder> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors
                .add(builder.apply(com.commercetools.checkout.models.transaction.TransactionErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public TransactionStatusBuilder withErrors(
            Function<com.commercetools.checkout.models.transaction.TransactionErrorBuilder, com.commercetools.checkout.models.transaction.TransactionErrorBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors
                .add(builder.apply(com.commercetools.checkout.models.transaction.TransactionErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public TransactionStatusBuilder addErrors(
            Function<com.commercetools.checkout.models.transaction.TransactionErrorBuilder, com.commercetools.checkout.models.transaction.TransactionError> builder) {
        return plusErrors(builder.apply(com.commercetools.checkout.models.transaction.TransactionErrorBuilder.of()));
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public TransactionStatusBuilder setErrors(
            Function<com.commercetools.checkout.models.transaction.TransactionErrorBuilder, com.commercetools.checkout.models.transaction.TransactionError> builder) {
        return errors(builder.apply(com.commercetools.checkout.models.transaction.TransactionErrorBuilder.of()));
    }

    /**
     *  <p>State of the Transaction.</p>
     * @return state
     */

    public com.commercetools.checkout.models.transaction.TransactionState getState() {
        return this.state;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.checkout.models.transaction.TransactionError> getErrors() {
        return this.errors;
    }

    /**
     * builds TransactionStatus with checking for non-null required values
     * @return TransactionStatus
     */
    public TransactionStatus build() {
        Objects.requireNonNull(state, TransactionStatus.class + ": state is missing");
        return new TransactionStatusImpl(state, errors);
    }

    /**
     * builds TransactionStatus without checking for non-null required values
     * @return TransactionStatus
     */
    public TransactionStatus buildUnchecked() {
        return new TransactionStatusImpl(state, errors);
    }

    /**
     * factory method for an instance of TransactionStatusBuilder
     * @return builder
     */
    public static TransactionStatusBuilder of() {
        return new TransactionStatusBuilder();
    }

    /**
     * create builder for TransactionStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionStatusBuilder of(final TransactionStatus template) {
        TransactionStatusBuilder builder = new TransactionStatusBuilder();
        builder.state = template.getState();
        builder.errors = template.getErrors();
        return builder;
    }

}
