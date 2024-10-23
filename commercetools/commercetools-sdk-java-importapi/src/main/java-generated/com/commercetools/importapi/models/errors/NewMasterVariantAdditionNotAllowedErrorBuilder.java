
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NewMasterVariantAdditionNotAllowedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NewMasterVariantAdditionNotAllowedError newMasterVariantAdditionNotAllowedError = NewMasterVariantAdditionNotAllowedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NewMasterVariantAdditionNotAllowedErrorBuilder
        implements Builder<NewMasterVariantAdditionNotAllowedError> {

    private String message;

    /**
     *  <p><code>"Adding a new variant as master variant is not allowed."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public NewMasterVariantAdditionNotAllowedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"Adding a new variant as master variant is not allowed."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds NewMasterVariantAdditionNotAllowedError with checking for non-null required values
     * @return NewMasterVariantAdditionNotAllowedError
     */
    public NewMasterVariantAdditionNotAllowedError build() {
        Objects.requireNonNull(message, NewMasterVariantAdditionNotAllowedError.class + ": message is missing");
        return new NewMasterVariantAdditionNotAllowedErrorImpl(message);
    }

    /**
     * builds NewMasterVariantAdditionNotAllowedError without checking for non-null required values
     * @return NewMasterVariantAdditionNotAllowedError
     */
    public NewMasterVariantAdditionNotAllowedError buildUnchecked() {
        return new NewMasterVariantAdditionNotAllowedErrorImpl(message);
    }

    /**
     * factory method for an instance of NewMasterVariantAdditionNotAllowedErrorBuilder
     * @return builder
     */
    public static NewMasterVariantAdditionNotAllowedErrorBuilder of() {
        return new NewMasterVariantAdditionNotAllowedErrorBuilder();
    }

    /**
     * create builder for NewMasterVariantAdditionNotAllowedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NewMasterVariantAdditionNotAllowedErrorBuilder of(
            final NewMasterVariantAdditionNotAllowedError template) {
        NewMasterVariantAdditionNotAllowedErrorBuilder builder = new NewMasterVariantAdditionNotAllowedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
