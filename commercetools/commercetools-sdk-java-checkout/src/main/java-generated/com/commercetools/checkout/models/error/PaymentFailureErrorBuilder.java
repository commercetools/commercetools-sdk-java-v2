
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentFailureErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentFailureError paymentFailureError = PaymentFailureError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentFailureErrorBuilder implements Builder<PaymentFailureError> {

    private String message;

    /**
     *  <p><code>"Payment could not be completed successfully."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentFailureErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"Payment could not be completed successfully."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds PaymentFailureError with checking for non-null required values
     * @return PaymentFailureError
     */
    public PaymentFailureError build() {
        Objects.requireNonNull(message, PaymentFailureError.class + ": message is missing");
        return new PaymentFailureErrorImpl(message);
    }

    /**
     * builds PaymentFailureError without checking for non-null required values
     * @return PaymentFailureError
     */
    public PaymentFailureError buildUnchecked() {
        return new PaymentFailureErrorImpl(message);
    }

    /**
     * factory method for an instance of PaymentFailureErrorBuilder
     * @return builder
     */
    public static PaymentFailureErrorBuilder of() {
        return new PaymentFailureErrorBuilder();
    }

    /**
     * create builder for PaymentFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentFailureErrorBuilder of(final PaymentFailureError template) {
        PaymentFailureErrorBuilder builder = new PaymentFailureErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
