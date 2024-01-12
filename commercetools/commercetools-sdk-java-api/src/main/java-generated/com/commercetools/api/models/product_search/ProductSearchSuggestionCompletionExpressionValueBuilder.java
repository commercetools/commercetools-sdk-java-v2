
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSuggestionCompletionExpressionValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionCompletionExpressionValue productSearchSuggestionCompletionExpressionValue = ProductSearchSuggestionCompletionExpressionValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .prefix("{prefix}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSuggestionCompletionExpressionValueBuilder
        implements Builder<ProductSearchSuggestionCompletionExpressionValue> {

    private String name;

    private String field;

    private String prefix;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchSuggestionCompletionExpressionValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public ProductSearchSuggestionCompletionExpressionValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the prefix
     * @param prefix value to be set
     * @return Builder
     */

    public ProductSearchSuggestionCompletionExpressionValueBuilder prefix(final String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of field}
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     * value of prefix}
     * @return prefix
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * builds ProductSearchSuggestionCompletionExpressionValue with checking for non-null required values
     * @return ProductSearchSuggestionCompletionExpressionValue
     */
    public ProductSearchSuggestionCompletionExpressionValue build() {
        Objects.requireNonNull(name, ProductSearchSuggestionCompletionExpressionValue.class + ": name is missing");
        Objects.requireNonNull(field, ProductSearchSuggestionCompletionExpressionValue.class + ": field is missing");
        Objects.requireNonNull(prefix, ProductSearchSuggestionCompletionExpressionValue.class + ": prefix is missing");
        return new ProductSearchSuggestionCompletionExpressionValueImpl(name, field, prefix);
    }

    /**
     * builds ProductSearchSuggestionCompletionExpressionValue without checking for non-null required values
     * @return ProductSearchSuggestionCompletionExpressionValue
     */
    public ProductSearchSuggestionCompletionExpressionValue buildUnchecked() {
        return new ProductSearchSuggestionCompletionExpressionValueImpl(name, field, prefix);
    }

    /**
     * factory method for an instance of ProductSearchSuggestionCompletionExpressionValueBuilder
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionValueBuilder of() {
        return new ProductSearchSuggestionCompletionExpressionValueBuilder();
    }

    /**
     * create builder for ProductSearchSuggestionCompletionExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionValueBuilder of(
            final ProductSearchSuggestionCompletionExpressionValue template) {
        ProductSearchSuggestionCompletionExpressionValueBuilder builder = new ProductSearchSuggestionCompletionExpressionValueBuilder();
        builder.name = template.getName();
        builder.field = template.getField();
        builder.prefix = template.getPrefix();
        return builder;
    }

}
