
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionPredicateEvaluationFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionPredicateEvaluationFailedError extensionPredicateEvaluationFailedError = ExtensionPredicateEvaluationFailedError.builder()
 *             .message("{message}")
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionPredicateEvaluationFailedErrorBuilder
        implements Builder<ExtensionPredicateEvaluationFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

    /**
     *  <p><code>"The compared field $fieldName is not present."</code></p>
     * @param message
     * @return Builder
     */

    public ExtensionPredicateEvaluationFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExtensionPredicateEvaluationFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExtensionPredicateEvaluationFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @return Builder
     */

    public ExtensionPredicateEvaluationFailedErrorBuilder errorByExtension(
            Function<com.commercetools.api.models.error.ErrorByExtensionBuilder, com.commercetools.api.models.error.ErrorByExtensionBuilder> builder) {
        this.errorByExtension = builder.apply(com.commercetools.api.models.error.ErrorByExtensionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param errorByExtension
     * @return Builder
     */

    public ExtensionPredicateEvaluationFailedErrorBuilder errorByExtension(
            final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.errorByExtension = errorByExtension;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.error.ErrorByExtension getErrorByExtension() {
        return this.errorByExtension;
    }

    public ExtensionPredicateEvaluationFailedError build() {
        Objects.requireNonNull(message, ExtensionPredicateEvaluationFailedError.class + ": message is missing");
        Objects.requireNonNull(errorByExtension,
            ExtensionPredicateEvaluationFailedError.class + ": errorByExtension is missing");
        return new ExtensionPredicateEvaluationFailedErrorImpl(message, values, errorByExtension);
    }

    /**
     * builds ExtensionPredicateEvaluationFailedError without checking for non null required values
     */
    public ExtensionPredicateEvaluationFailedError buildUnchecked() {
        return new ExtensionPredicateEvaluationFailedErrorImpl(message, values, errorByExtension);
    }

    public static ExtensionPredicateEvaluationFailedErrorBuilder of() {
        return new ExtensionPredicateEvaluationFailedErrorBuilder();
    }

    public static ExtensionPredicateEvaluationFailedErrorBuilder of(
            final ExtensionPredicateEvaluationFailedError template) {
        ExtensionPredicateEvaluationFailedErrorBuilder builder = new ExtensionPredicateEvaluationFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.errorByExtension = template.getErrorByExtension();
        return builder;
    }

}
