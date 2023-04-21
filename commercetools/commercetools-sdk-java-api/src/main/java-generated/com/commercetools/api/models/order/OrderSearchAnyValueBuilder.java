
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchAnyValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchAnyValue orderSearchAnyValue = OrderSearchAnyValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchAnyValueBuilder implements Builder<OrderSearchAnyValue> {

    private String field;

    @Nullable
    private Integer boost;

    @Nullable
    private String customType;

    private java.lang.Object value;

    @Nullable
    private String language;

    @Nullable
    private Boolean caseInsensitive;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public OrderSearchAnyValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public OrderSearchAnyValueBuilder boost(@Nullable final Integer boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the customType
     * @param customType value to be set
     * @return Builder
     */

    public OrderSearchAnyValueBuilder customType(@Nullable final String customType) {
        this.customType = customType;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public OrderSearchAnyValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     * set the value to the language
     * @param language value to be set
     * @return Builder
     */

    public OrderSearchAnyValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the caseInsensitive
     * @param caseInsensitive value to be set
     * @return Builder
     */

    public OrderSearchAnyValueBuilder caseInsensitive(@Nullable final Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
        return this;
    }

    /**
     * value of field}
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     * value of boost}
     * @return boost
     */

    @Nullable
    public Integer getBoost() {
        return this.boost;
    }

    /**
     * value of customType}
     * @return customType
     */

    @Nullable
    public String getCustomType() {
        return this.customType;
    }

    /**
     * value of value}
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * value of language}
     * @return language
     */

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    /**
     * value of caseInsensitive}
     * @return caseInsensitive
     */

    @Nullable
    public Boolean getCaseInsensitive() {
        return this.caseInsensitive;
    }

    /**
     * builds OrderSearchAnyValue with checking for non-null required values
     * @return OrderSearchAnyValue
     */
    public OrderSearchAnyValue build() {
        Objects.requireNonNull(field, OrderSearchAnyValue.class + ": field is missing");
        Objects.requireNonNull(value, OrderSearchAnyValue.class + ": value is missing");
        return new OrderSearchAnyValueImpl(field, boost, customType, value, language, caseInsensitive);
    }

    /**
     * builds OrderSearchAnyValue without checking for non-null required values
     * @return OrderSearchAnyValue
     */
    public OrderSearchAnyValue buildUnchecked() {
        return new OrderSearchAnyValueImpl(field, boost, customType, value, language, caseInsensitive);
    }

    /**
     * factory method for an instance of OrderSearchAnyValueBuilder
     * @return builder
     */
    public static OrderSearchAnyValueBuilder of() {
        return new OrderSearchAnyValueBuilder();
    }

    /**
     * create builder for OrderSearchAnyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchAnyValueBuilder of(final OrderSearchAnyValue template) {
        OrderSearchAnyValueBuilder builder = new OrderSearchAnyValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.customType = template.getCustomType();
        builder.value = template.getValue();
        builder.language = template.getLanguage();
        builder.caseInsensitive = template.getCaseInsensitive();
        return builder;
    }

}
