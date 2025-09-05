
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A single error on the <span>Transaction</span>. Multiple errors may be included in the <span>Transaction Status</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionError transactionError = TransactionError.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionErrorImpl.class)
public interface TransactionError {

    /**
     *  <p>Error identifier.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Error identifier.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of TransactionError
     */
    public static TransactionError of() {
        return new TransactionErrorImpl();
    }

    /**
     * factory method to create a shallow copy TransactionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionError of(final TransactionError template) {
        TransactionErrorImpl instance = new TransactionErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    public TransactionError copyDeep();

    /**
     * factory method to create a deep copy of TransactionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionError deepCopy(@Nullable final TransactionError template) {
        if (template == null) {
            return null;
        }
        TransactionErrorImpl instance = new TransactionErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for TransactionError
     * @return builder
     */
    public static TransactionErrorBuilder builder() {
        return TransactionErrorBuilder.of();
    }

    /**
     * create builder for TransactionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionErrorBuilder builder(final TransactionError template) {
        return TransactionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionError(Function<TransactionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransactionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionError>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionError>";
            }
        };
    }
}
