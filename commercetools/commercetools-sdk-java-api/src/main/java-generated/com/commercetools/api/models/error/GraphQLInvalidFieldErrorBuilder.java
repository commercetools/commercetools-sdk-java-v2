
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidFieldError graphQLInvalidFieldError = GraphQLInvalidFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInvalidFieldErrorBuilder implements Builder<GraphQLInvalidFieldError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    private java.lang.Object invalidValue;

    @Nullable
    private java.util.List<java.lang.Object> allowedValues;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLInvalidFieldErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLInvalidFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Name of the field with the invalid value.</p>
     * @param field value to be set
     * @return Builder
     */

    public GraphQLInvalidFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>Value invalid for the field.</p>
     * @param invalidValue value to be set
     * @return Builder
     */

    public GraphQLInvalidFieldErrorBuilder invalidValue(final java.lang.Object invalidValue) {
        this.invalidValue = invalidValue;
        return this;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public GraphQLInvalidFieldErrorBuilder allowedValues(@Nullable final java.lang.Object... allowedValues) {
        this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
        return this;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public GraphQLInvalidFieldErrorBuilder allowedValues(
            @Nullable final java.util.List<java.lang.Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public GraphQLInvalidFieldErrorBuilder plusAllowedValues(@Nullable final java.lang.Object... allowedValues) {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<>();
        }
        this.allowedValues.addAll(Arrays.asList(allowedValues));
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>Name of the field with the invalid value.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Value invalid for the field.</p>
     * @return invalidValue
     */

    public java.lang.Object getInvalidValue() {
        return this.invalidValue;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @return allowedValues
     */

    @Nullable
    public java.util.List<java.lang.Object> getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * builds GraphQLInvalidFieldError with checking for non-null required values
     * @return GraphQLInvalidFieldError
     */
    public GraphQLInvalidFieldError build() {
        Objects.requireNonNull(field, GraphQLInvalidFieldError.class + ": field is missing");
        Objects.requireNonNull(invalidValue, GraphQLInvalidFieldError.class + ": invalidValue is missing");
        return new GraphQLInvalidFieldErrorImpl(values, field, invalidValue, allowedValues);
    }

    /**
     * builds GraphQLInvalidFieldError without checking for non-null required values
     * @return GraphQLInvalidFieldError
     */
    public GraphQLInvalidFieldError buildUnchecked() {
        return new GraphQLInvalidFieldErrorImpl(values, field, invalidValue, allowedValues);
    }

    /**
     * factory method for an instance of GraphQLInvalidFieldErrorBuilder
     * @return builder
     */
    public static GraphQLInvalidFieldErrorBuilder of() {
        return new GraphQLInvalidFieldErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidFieldErrorBuilder of(final GraphQLInvalidFieldError template) {
        GraphQLInvalidFieldErrorBuilder builder = new GraphQLInvalidFieldErrorBuilder();
        builder.values = template.values();
        builder.field = template.getField();
        builder.invalidValue = template.getInvalidValue();
        builder.allowedValues = template.getAllowedValues();
        return builder;
    }

}
