
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidJsonInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInputError invalidJsonInputError = InvalidJsonInputError.builder()
 *             .message("{message}")
 *             .detailedErrorMessage("{detailedErrorMessage}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidJsonInputErrorBuilder implements Builder<InvalidJsonInputError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String detailedErrorMessage;

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
     * @param message
     * @return Builder
     */

    public InvalidJsonInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidJsonInputErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidJsonInputErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @param detailedErrorMessage
     * @return Builder
     */

    public InvalidJsonInputErrorBuilder detailedErrorMessage(final String detailedErrorMessage) {
        this.detailedErrorMessage = detailedErrorMessage;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getDetailedErrorMessage() {
        return this.detailedErrorMessage;
    }

    public InvalidJsonInputError build() {
        Objects.requireNonNull(message, InvalidJsonInputError.class + ": message is missing");
        Objects.requireNonNull(detailedErrorMessage, InvalidJsonInputError.class + ": detailedErrorMessage is missing");
        return new InvalidJsonInputErrorImpl(message, values, detailedErrorMessage);
    }

    /**
     * builds InvalidJsonInputError without checking for non null required values
     */
    public InvalidJsonInputError buildUnchecked() {
        return new InvalidJsonInputErrorImpl(message, values, detailedErrorMessage);
    }

    public static InvalidJsonInputErrorBuilder of() {
        return new InvalidJsonInputErrorBuilder();
    }

    public static InvalidJsonInputErrorBuilder of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorBuilder builder = new InvalidJsonInputErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.detailedErrorMessage = template.getDetailedErrorMessage();
        return builder;
    }

}
