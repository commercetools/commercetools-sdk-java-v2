
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ContentionError contentionError = ContentionError.builder()
           .message("{message}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ContentionErrorBuilder implements Builder<ContentionError> {

    private String message;

    public ContentionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ContentionError build() {
        Objects.requireNonNull(message, ContentionError.class + ": message is missing");
        return new ContentionErrorImpl(message);
    }

    /**
     * builds ContentionError without checking for non null required values
     */
    public ContentionError buildUnchecked() {
        return new ContentionErrorImpl(message);
    }

    public static ContentionErrorBuilder of() {
        return new ContentionErrorBuilder();
    }

    public static ContentionErrorBuilder of(final ContentionError template) {
        ContentionErrorBuilder builder = new ContentionErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
