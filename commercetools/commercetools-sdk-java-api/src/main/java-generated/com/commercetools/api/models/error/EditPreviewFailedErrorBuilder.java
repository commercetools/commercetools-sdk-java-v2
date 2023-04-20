
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EditPreviewFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EditPreviewFailedError editPreviewFailedError = EditPreviewFailedError.builder()
 *             .message("{message}")
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EditPreviewFailedErrorBuilder implements Builder<EditPreviewFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.order_edit.OrderEditPreviewFailure result;

    /**
     *  <p><code>"Error while applying staged actions. ShippingMethods could not be determined."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public EditPreviewFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public EditPreviewFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public EditPreviewFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @param builder function to build the result value
     * @return Builder
     */

    public EditPreviewFailedErrorBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder, com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @param builder function to build the result value
     * @return Builder
     */

    public EditPreviewFailedErrorBuilder withResult(
            Function<com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder, com.commercetools.api.models.order_edit.OrderEditPreviewFailure> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder.of());
        return this;
    }

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @param result value to be set
     * @return Builder
     */

    public EditPreviewFailedErrorBuilder result(
            final com.commercetools.api.models.order_edit.OrderEditPreviewFailure result) {
        this.result = result;
        return this;
    }

    /**
     *  <p><code>"Error while applying staged actions. ShippingMethods could not be determined."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @return result
     */

    public com.commercetools.api.models.order_edit.OrderEditPreviewFailure getResult() {
        return this.result;
    }

    /**
     * builds EditPreviewFailedError with checking for non-null required values
     * @return EditPreviewFailedError
     */
    public EditPreviewFailedError build() {
        Objects.requireNonNull(message, EditPreviewFailedError.class + ": message is missing");
        Objects.requireNonNull(result, EditPreviewFailedError.class + ": result is missing");
        return new EditPreviewFailedErrorImpl(message, values, result);
    }

    /**
     * builds EditPreviewFailedError without checking for non-null required values
     * @return EditPreviewFailedError
     */
    public EditPreviewFailedError buildUnchecked() {
        return new EditPreviewFailedErrorImpl(message, values, result);
    }

    /**
     * factory method for an instance of EditPreviewFailedErrorBuilder
     * @return builder
     */
    public static EditPreviewFailedErrorBuilder of() {
        return new EditPreviewFailedErrorBuilder();
    }

    /**
     * create builder for EditPreviewFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EditPreviewFailedErrorBuilder of(final EditPreviewFailedError template) {
        EditPreviewFailedErrorBuilder builder = new EditPreviewFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.result = template.getResult();
        return builder;
    }

}
