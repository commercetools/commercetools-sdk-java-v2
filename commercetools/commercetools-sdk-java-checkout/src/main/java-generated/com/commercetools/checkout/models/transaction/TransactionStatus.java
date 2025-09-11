
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The state of the <span>Transaction</span> and the related errors in case of a failed Transaction.</p>
 *
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
@JsonDeserialize(as = TransactionStatusImpl.class)
public interface TransactionStatus {

    /**
     *  <p>State of the Transaction.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<TransactionError> getErrors();

    /**
     *  <p>State of the Transaction.</p>
     * @param state value to be set
     */

    public void setState(final TransactionState state);

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final TransactionError... errors);

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<TransactionError> errors);

    /**
     * factory method
     * @return instance of TransactionStatus
     */
    public static TransactionStatus of() {
        return new TransactionStatusImpl();
    }

    /**
     * factory method to create a shallow copy TransactionStatus
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionStatus of(final TransactionStatus template) {
        TransactionStatusImpl instance = new TransactionStatusImpl();
        instance.setState(template.getState());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public TransactionStatus copyDeep();

    /**
     * factory method to create a deep copy of TransactionStatus
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionStatus deepCopy(@Nullable final TransactionStatus template) {
        if (template == null) {
            return null;
        }
        TransactionStatusImpl instance = new TransactionStatusImpl();
        instance.setState(template.getState());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.transaction.TransactionError::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TransactionStatus
     * @return builder
     */
    public static TransactionStatusBuilder builder() {
        return TransactionStatusBuilder.of();
    }

    /**
     * create builder for TransactionStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionStatusBuilder builder(final TransactionStatus template) {
        return TransactionStatusBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionStatus(Function<TransactionStatus, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransactionStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionStatus>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionStatus>";
            }
        };
    }
}
