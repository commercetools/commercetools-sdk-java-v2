
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   InvalidOperation invalidOperation = InvalidOperation.builder()
           .message("{message}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidOperationBuilder implements Builder<InvalidOperation> {

    private String message;

    public InvalidOperationBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidOperation build() {
        Objects.requireNonNull(message, InvalidOperation.class + ": message is missing");
        return new InvalidOperationImpl(message);
    }

    /**
     * builds InvalidOperation without checking for non null required values
     */
    public InvalidOperation buildUnchecked() {
        return new InvalidOperationImpl(message);
    }

    public static InvalidOperationBuilder of() {
        return new InvalidOperationBuilder();
    }

    public static InvalidOperationBuilder of(final InvalidOperation template) {
        InvalidOperationBuilder builder = new InvalidOperationBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
