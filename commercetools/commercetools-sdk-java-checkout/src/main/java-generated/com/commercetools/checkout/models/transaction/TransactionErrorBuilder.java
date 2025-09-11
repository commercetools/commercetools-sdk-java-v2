
package com.commercetools.checkout.models.transaction;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionErrorBuilder
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
public class TransactionErrorBuilder implements Builder<TransactionError> {

    private String code;

    private String message;

    /**
     *  <p>Error identifier.</p>
     * @param code value to be set
     * @return Builder
     */

    public TransactionErrorBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public TransactionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error identifier.</p>
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds TransactionError with checking for non-null required values
     * @return TransactionError
     */
    public TransactionError build() {
        Objects.requireNonNull(code, TransactionError.class + ": code is missing");
        Objects.requireNonNull(message, TransactionError.class + ": message is missing");
        return new TransactionErrorImpl(code, message);
    }

    /**
     * builds TransactionError without checking for non-null required values
     * @return TransactionError
     */
    public TransactionError buildUnchecked() {
        return new TransactionErrorImpl(code, message);
    }

    /**
     * factory method for an instance of TransactionErrorBuilder
     * @return builder
     */
    public static TransactionErrorBuilder of() {
        return new TransactionErrorBuilder();
    }

    /**
     * create builder for TransactionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionErrorBuilder of(final TransactionError template) {
        TransactionErrorBuilder builder = new TransactionErrorBuilder();
        builder.code = template.getCode();
        builder.message = template.getMessage();
        return builder;
    }

}
