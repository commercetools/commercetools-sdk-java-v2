
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchAnyValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchAnyValue productSearchAnyValue = ProductSearchAnyValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchAnyValueBuilder implements Builder<ProductSearchAnyValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

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

    public ProductSearchAnyValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchAnyValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchAnyValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public ProductSearchAnyValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public ProductSearchAnyValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the caseInsensitive
     * @param caseInsensitive value to be set
     * @return Builder
     */

    public ProductSearchAnyValueBuilder caseInsensitive(@Nullable final Boolean caseInsensitive) {
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
    public Double getBoost() {
        return this.boost;
    }

    /**
     * value of attributeType}
     * @return attributeType
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchAttributeType getAttributeType() {
        return this.attributeType;
    }

    /**
     * value of value}
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
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
     * builds ProductSearchAnyValue with checking for non-null required values
     * @return ProductSearchAnyValue
     */
    public ProductSearchAnyValue build() {
        Objects.requireNonNull(field, ProductSearchAnyValue.class + ": field is missing");
        Objects.requireNonNull(value, ProductSearchAnyValue.class + ": value is missing");
        return new ProductSearchAnyValueImpl(field, boost, attributeType, value, language, caseInsensitive);
    }

    /**
     * builds ProductSearchAnyValue without checking for non-null required values
     * @return ProductSearchAnyValue
     */
    public ProductSearchAnyValue buildUnchecked() {
        return new ProductSearchAnyValueImpl(field, boost, attributeType, value, language, caseInsensitive);
    }

    /**
     * factory method for an instance of ProductSearchAnyValueBuilder
     * @return builder
     */
    public static ProductSearchAnyValueBuilder of() {
        return new ProductSearchAnyValueBuilder();
    }

    /**
     * create builder for ProductSearchAnyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchAnyValueBuilder of(final ProductSearchAnyValue template) {
        ProductSearchAnyValueBuilder builder = new ProductSearchAnyValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.attributeType = template.getAttributeType();
        builder.value = template.getValue();
        builder.language = template.getLanguage();
        builder.caseInsensitive = template.getCaseInsensitive();
        return builder;
    }

}
