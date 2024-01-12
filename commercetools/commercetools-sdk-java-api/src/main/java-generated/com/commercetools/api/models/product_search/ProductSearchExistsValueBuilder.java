
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchExistsValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchExistsValue productSearchExistsValue = ProductSearchExistsValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchExistsValueBuilder implements Builder<ProductSearchExistsValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    @Nullable
    private String language;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchExistsValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public ProductSearchExistsValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     * set the value to the attributeType
     * @param attributeType value to be set
     * @return Builder
     */

    public ProductSearchExistsValueBuilder attributeType(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public ProductSearchExistsValueBuilder language(@Nullable final String language) {
        this.language = language;
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
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    /**
     * builds ProductSearchExistsValue with checking for non-null required values
     * @return ProductSearchExistsValue
     */
    public ProductSearchExistsValue build() {
        Objects.requireNonNull(field, ProductSearchExistsValue.class + ": field is missing");
        return new ProductSearchExistsValueImpl(field, boost, attributeType, language);
    }

    /**
     * builds ProductSearchExistsValue without checking for non-null required values
     * @return ProductSearchExistsValue
     */
    public ProductSearchExistsValue buildUnchecked() {
        return new ProductSearchExistsValueImpl(field, boost, attributeType, language);
    }

    /**
     * factory method for an instance of ProductSearchExistsValueBuilder
     * @return builder
     */
    public static ProductSearchExistsValueBuilder of() {
        return new ProductSearchExistsValueBuilder();
    }

    /**
     * create builder for ProductSearchExistsValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchExistsValueBuilder of(final ProductSearchExistsValue template) {
        ProductSearchExistsValueBuilder builder = new ProductSearchExistsValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.attributeType = template.getAttributeType();
        builder.language = template.getLanguage();
        return builder;
    }

}
