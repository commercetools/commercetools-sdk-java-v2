
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchFullTextValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchFullTextValue orderSearchFullTextValue = OrderSearchFullTextValue.builder()
 *             .field("{field}")
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchFullTextValueBuilder implements Builder<OrderSearchFullTextValue> {

    private String field;

    @Nullable
    private Integer boost;

    @Nullable
    private String customType;

    private String value;

    @Nullable
    private String language;

    @Nullable
    private com.commercetools.api.models.order.OrderSearchMatchType mustMatch;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public OrderSearchFullTextValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public OrderSearchFullTextValueBuilder boost(@Nullable final Integer boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the customType
     * @param customType value to be set
     * @return Builder
     */

    public OrderSearchFullTextValueBuilder customType(@Nullable final String customType) {
        this.customType = customType;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public OrderSearchFullTextValueBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     * set the value to the language
     * @param language value to be set
     * @return Builder
     */

    public OrderSearchFullTextValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the mustMatch
     * @param mustMatch value to be set
     * @return Builder
     */

    public OrderSearchFullTextValueBuilder mustMatch(
            @Nullable final com.commercetools.api.models.order.OrderSearchMatchType mustMatch) {
        this.mustMatch = mustMatch;
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

    public String getValue() {
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
     * value of mustMatch}
     * @return mustMatch
     */

    @Nullable
    public com.commercetools.api.models.order.OrderSearchMatchType getMustMatch() {
        return this.mustMatch;
    }

    /**
     * builds OrderSearchFullTextValue with checking for non-null required values
     * @return OrderSearchFullTextValue
     */
    public OrderSearchFullTextValue build() {
        Objects.requireNonNull(field, OrderSearchFullTextValue.class + ": field is missing");
        Objects.requireNonNull(value, OrderSearchFullTextValue.class + ": value is missing");
        return new OrderSearchFullTextValueImpl(field, boost, customType, value, language, mustMatch);
    }

    /**
     * builds OrderSearchFullTextValue without checking for non-null required values
     * @return OrderSearchFullTextValue
     */
    public OrderSearchFullTextValue buildUnchecked() {
        return new OrderSearchFullTextValueImpl(field, boost, customType, value, language, mustMatch);
    }

    /**
     * factory method for an instance of OrderSearchFullTextValueBuilder
     * @return builder
     */
    public static OrderSearchFullTextValueBuilder of() {
        return new OrderSearchFullTextValueBuilder();
    }

    /**
     * create builder for OrderSearchFullTextValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchFullTextValueBuilder of(final OrderSearchFullTextValue template) {
        OrderSearchFullTextValueBuilder builder = new OrderSearchFullTextValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.customType = template.getCustomType();
        builder.value = template.getValue();
        builder.language = template.getLanguage();
        builder.mustMatch = template.getMustMatch();
        return builder;
    }

}
