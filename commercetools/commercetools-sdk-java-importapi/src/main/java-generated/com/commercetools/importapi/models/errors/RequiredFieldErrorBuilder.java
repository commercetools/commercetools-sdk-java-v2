
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RequiredFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RequiredFieldError requiredFieldError = RequiredFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RequiredFieldErrorBuilder implements Builder<RequiredFieldError> {

    private String message;

    private String field;

    /**
     <>
     */

    public RequiredFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     <*  <p>The name of the field.</p>>
     */

    public RequiredFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getField() {
        return this.field;
    }

    public RequiredFieldError build() {
        Objects.requireNonNull(message, RequiredFieldError.class + ": message is missing");
        Objects.requireNonNull(field, RequiredFieldError.class + ": field is missing");
        return new RequiredFieldErrorImpl(message, field);
    }

    /**
     * builds RequiredFieldError without checking for non null required values
     */
    public RequiredFieldError buildUnchecked() {
        return new RequiredFieldErrorImpl(message, field);
    }

    public static RequiredFieldErrorBuilder of() {
        return new RequiredFieldErrorBuilder();
    }

    public static RequiredFieldErrorBuilder of(final RequiredFieldError template) {
        RequiredFieldErrorBuilder builder = new RequiredFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        return builder;
    }

}
