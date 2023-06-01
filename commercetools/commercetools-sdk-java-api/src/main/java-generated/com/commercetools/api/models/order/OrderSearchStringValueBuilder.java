package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchQueryExpressionValue;
import com.commercetools.api.models.order.OrderSearchStringValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchStringValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchStringValue orderSearchStringValue = OrderSearchStringValue.builder()
 *             .field("{field}")
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchStringValueBuilder implements Builder<OrderSearchStringValue> {

    
    
    private String field;
    
    
    @Nullable
    private Integer boost;
    
    
    @Nullable
    private String customType;
    
    
    
    private String value;
    
    
    @Nullable
    private String language;
    
    
    @Nullable
    private Boolean caseInsensitive;

    
    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */
    
    public OrderSearchStringValueBuilder field( final String field) {
        this.field = field;
        return this;
    }
    
    
    
    
    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */
    
    public OrderSearchStringValueBuilder boost(@Nullable final Integer boost) {
        this.boost = boost;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customType
     * @param customType value to be set
     * @return Builder
     */
    
    public OrderSearchStringValueBuilder customType(@Nullable final String customType) {
        this.customType = customType;
        return this;
    }
    
    
    
    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public OrderSearchStringValueBuilder value( final String value) {
        this.value = value;
        return this;
    }
    
    
    
    
    /**
     * set the value to the language
     * @param language value to be set
     * @return Builder
     */
    
    public OrderSearchStringValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }
    
    
    
    
    /**
     * set the value to the caseInsensitive
     * @param caseInsensitive value to be set
     * @return Builder
     */
    
    public OrderSearchStringValueBuilder caseInsensitive(@Nullable final Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
        return this;
    }
    
    

    /**
     * value of field}
     * @return field
     */
    
    
    public String getField(){
        return this.field;
    }
    
    /**
     * value of boost}
     * @return boost
     */
    
    @Nullable
    public Integer getBoost(){
        return this.boost;
    }
    
    /**
     * value of customType}
     * @return customType
     */
    
    @Nullable
    public String getCustomType(){
        return this.customType;
    }
    
    /**
     * value of value}
     * @return value
     */
    
    
    public String getValue(){
        return this.value;
    }
    
    /**
     * value of language}
     * @return language
     */
    
    @Nullable
    public String getLanguage(){
        return this.language;
    }
    
    /**
     * value of caseInsensitive}
     * @return caseInsensitive
     */
    
    @Nullable
    public Boolean getCaseInsensitive(){
        return this.caseInsensitive;
    }

    /**
     * builds OrderSearchStringValue with checking for non-null required values
     * @return OrderSearchStringValue
     */
    public OrderSearchStringValue build() {
        Objects.requireNonNull(field, OrderSearchStringValue.class + ": field is missing");
        Objects.requireNonNull(value, OrderSearchStringValue.class + ": value is missing");
        return new OrderSearchStringValueImpl(field, boost, customType, value, language, caseInsensitive);
    }
    
    /**
     * builds OrderSearchStringValue without checking for non-null required values
     * @return OrderSearchStringValue
     */
    public OrderSearchStringValue buildUnchecked() {
        return new OrderSearchStringValueImpl(field, boost, customType, value, language, caseInsensitive);
    }

    /**
     * factory method for an instance of OrderSearchStringValueBuilder
     * @return builder 
     */
    public static OrderSearchStringValueBuilder of() {
        return new OrderSearchStringValueBuilder();
    }

    /**
     * create builder for OrderSearchStringValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchStringValueBuilder of(final OrderSearchStringValue template) {
        OrderSearchStringValueBuilder builder = new OrderSearchStringValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.customType = template.getCustomType();
        builder.value = template.getValue();
        builder.language = template.getLanguage();
        builder.caseInsensitive = template.getCaseInsensitive();
        return builder;
    }

}
