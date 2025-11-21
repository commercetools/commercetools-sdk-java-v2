
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateFieldWithConflictingResourceErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateFieldWithConflictingResourceError duplicateFieldWithConflictingResourceError = DuplicateFieldWithConflictingResourceError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateFieldWithConflictingResourceErrorBuilder
        implements Builder<DuplicateFieldWithConflictingResourceError> {

    private String message;

    /**
     *  <p><code>"A duplicate value $duplicateValue exists for field $field in request."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public DuplicateFieldWithConflictingResourceErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"A duplicate value $duplicateValue exists for field $field in request."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds DuplicateFieldWithConflictingResourceError with checking for non-null required values
     * @return DuplicateFieldWithConflictingResourceError
     */
    public DuplicateFieldWithConflictingResourceError build() {
        Objects.requireNonNull(message, DuplicateFieldWithConflictingResourceError.class + ": message is missing");
        return new DuplicateFieldWithConflictingResourceErrorImpl(message);
    }

    /**
     * builds DuplicateFieldWithConflictingResourceError without checking for non-null required values
     * @return DuplicateFieldWithConflictingResourceError
     */
    public DuplicateFieldWithConflictingResourceError buildUnchecked() {
        return new DuplicateFieldWithConflictingResourceErrorImpl(message);
    }

    /**
     * factory method for an instance of DuplicateFieldWithConflictingResourceErrorBuilder
     * @return builder
     */
    public static DuplicateFieldWithConflictingResourceErrorBuilder of() {
        return new DuplicateFieldWithConflictingResourceErrorBuilder();
    }

    /**
     * create builder for DuplicateFieldWithConflictingResourceError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateFieldWithConflictingResourceErrorBuilder of(
            final DuplicateFieldWithConflictingResourceError template) {
        DuplicateFieldWithConflictingResourceErrorBuilder builder = new DuplicateFieldWithConflictingResourceErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
