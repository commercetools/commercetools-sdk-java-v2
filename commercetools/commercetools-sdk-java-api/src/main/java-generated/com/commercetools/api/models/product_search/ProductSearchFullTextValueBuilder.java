
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFullTextValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFullTextValue productSearchFullTextValue = ProductSearchFullTextValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFullTextValueBuilder implements Builder<ProductSearchFullTextValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    private java.lang.Object value;

    @Nullable
    private String language;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchMatchType mustMatch;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchFullTextValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchFullTextValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchFullTextValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public ProductSearchFullTextValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public ProductSearchFullTextValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the mustMatch
     * @param mustMatch value to be set
     * @return Builder
     */

    public ProductSearchFullTextValueBuilder mustMatch(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchMatchType mustMatch) {
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
     * value of mustMatch}
     * @return mustMatch
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchMatchType getMustMatch() {
        return this.mustMatch;
    }

    /**
     * builds ProductSearchFullTextValue with checking for non-null required values
     * @return ProductSearchFullTextValue
     */
    public ProductSearchFullTextValue build() {
        Objects.requireNonNull(field, ProductSearchFullTextValue.class + ": field is missing");
        Objects.requireNonNull(value, ProductSearchFullTextValue.class + ": value is missing");
        return new ProductSearchFullTextValueImpl(field, boost, attributeType, value, language, mustMatch);
    }

    /**
     * builds ProductSearchFullTextValue without checking for non-null required values
     * @return ProductSearchFullTextValue
     */
    public ProductSearchFullTextValue buildUnchecked() {
        return new ProductSearchFullTextValueImpl(field, boost, attributeType, value, language, mustMatch);
    }

    /**
     * factory method for an instance of ProductSearchFullTextValueBuilder
     * @return builder
     */
    public static ProductSearchFullTextValueBuilder of() {
        return new ProductSearchFullTextValueBuilder();
    }

    /**
     * create builder for ProductSearchFullTextValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFullTextValueBuilder of(final ProductSearchFullTextValue template) {
        ProductSearchFullTextValueBuilder builder = new ProductSearchFullTextValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.attributeType = template.getAttributeType();
        builder.value = template.getValue();
        builder.language = template.getLanguage();
        builder.mustMatch = template.getMustMatch();
        return builder;
    }

}
