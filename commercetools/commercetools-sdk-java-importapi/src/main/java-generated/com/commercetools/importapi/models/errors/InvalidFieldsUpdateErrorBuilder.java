
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidFieldsUpdateErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidFieldsUpdateError invalidFieldsUpdateError = InvalidFieldsUpdateError.builder()
 *             .message("{message}")
 *             .plusFields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidFieldsUpdateErrorBuilder implements Builder<InvalidFieldsUpdateError> {

    private String message;

    private java.util.List<String> fields;

    /**
     *  <p><code>"The following fields are currently not supported for changes/updates"</code></p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidFieldsUpdateErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Fields that cannot be updated.</p>
     * @param fields value to be set
     * @return Builder
     */

    public InvalidFieldsUpdateErrorBuilder fields(final String... fields) {
        this.fields = new ArrayList<>(Arrays.asList(fields));
        return this;
    }

    /**
     *  <p>Fields that cannot be updated.</p>
     * @param fields value to be set
     * @return Builder
     */

    public InvalidFieldsUpdateErrorBuilder fields(final java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Fields that cannot be updated.</p>
     * @param fields value to be set
     * @return Builder
     */

    public InvalidFieldsUpdateErrorBuilder plusFields(final String... fields) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.addAll(Arrays.asList(fields));
        return this;
    }

    /**
     *  <p><code>"The following fields are currently not supported for changes/updates"</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Fields that cannot be updated.</p>
     * @return fields
     */

    public java.util.List<String> getFields() {
        return this.fields;
    }

    /**
     * builds InvalidFieldsUpdateError with checking for non-null required values
     * @return InvalidFieldsUpdateError
     */
    public InvalidFieldsUpdateError build() {
        Objects.requireNonNull(message, InvalidFieldsUpdateError.class + ": message is missing");
        Objects.requireNonNull(fields, InvalidFieldsUpdateError.class + ": fields is missing");
        return new InvalidFieldsUpdateErrorImpl(message, fields);
    }

    /**
     * builds InvalidFieldsUpdateError without checking for non-null required values
     * @return InvalidFieldsUpdateError
     */
    public InvalidFieldsUpdateError buildUnchecked() {
        return new InvalidFieldsUpdateErrorImpl(message, fields);
    }

    /**
     * factory method for an instance of InvalidFieldsUpdateErrorBuilder
     * @return builder
     */
    public static InvalidFieldsUpdateErrorBuilder of() {
        return new InvalidFieldsUpdateErrorBuilder();
    }

    /**
     * create builder for InvalidFieldsUpdateError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidFieldsUpdateErrorBuilder of(final InvalidFieldsUpdateError template) {
        InvalidFieldsUpdateErrorBuilder builder = new InvalidFieldsUpdateErrorBuilder();
        builder.message = template.getMessage();
        builder.fields = template.getFields();
        return builder;
    }

}
