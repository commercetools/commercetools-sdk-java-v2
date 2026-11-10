
package com.commercetools.checkout.models.recurring_payment_job;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentJobErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentJobError recurringPaymentJobError = RecurringPaymentJobError.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentJobErrorBuilder implements Builder<RecurringPaymentJobError> {

    private String code;

    private String message;

    /**
     *  <p>Error identifier.</p>
     * @param code value to be set
     * @return Builder
     */

    public RecurringPaymentJobErrorBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public RecurringPaymentJobErrorBuilder message(final String message) {
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
     * builds RecurringPaymentJobError with checking for non-null required values
     * @return RecurringPaymentJobError
     */
    public RecurringPaymentJobError build() {
        Objects.requireNonNull(code, RecurringPaymentJobError.class + ": code is missing");
        Objects.requireNonNull(message, RecurringPaymentJobError.class + ": message is missing");
        return new RecurringPaymentJobErrorImpl(code, message);
    }

    /**
     * builds RecurringPaymentJobError without checking for non-null required values
     * @return RecurringPaymentJobError
     */
    public RecurringPaymentJobError buildUnchecked() {
        return new RecurringPaymentJobErrorImpl(code, message);
    }

    /**
     * factory method for an instance of RecurringPaymentJobErrorBuilder
     * @return builder
     */
    public static RecurringPaymentJobErrorBuilder of() {
        return new RecurringPaymentJobErrorBuilder();
    }

    /**
     * create builder for RecurringPaymentJobError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentJobErrorBuilder of(final RecurringPaymentJobError template) {
        RecurringPaymentJobErrorBuilder builder = new RecurringPaymentJobErrorBuilder();
        builder.code = template.getCode();
        builder.message = template.getMessage();
        return builder;
    }

}
