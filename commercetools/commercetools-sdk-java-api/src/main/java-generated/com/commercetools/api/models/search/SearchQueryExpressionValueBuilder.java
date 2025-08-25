
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchQueryExpressionValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchQueryExpressionValue searchQueryExpressionValue = SearchQueryExpressionValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchQueryExpressionValueBuilder implements Builder<SearchQueryExpressionValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchQueryExpressionValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchQueryExpressionValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchQueryExpressionValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
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
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     * builds SearchQueryExpressionValue with checking for non-null required values
     * @return SearchQueryExpressionValue
     */
    public SearchQueryExpressionValue build() {
        Objects.requireNonNull(field, SearchQueryExpressionValue.class + ": field is missing");
        return new SearchQueryExpressionValueImpl(field, boost, fieldType);
    }

    /**
     * builds SearchQueryExpressionValue without checking for non-null required values
     * @return SearchQueryExpressionValue
     */
    public SearchQueryExpressionValue buildUnchecked() {
        return new SearchQueryExpressionValueImpl(field, boost, fieldType);
    }

    /**
     * factory method for an instance of SearchQueryExpressionValueBuilder
     * @return builder
     */
    public static SearchQueryExpressionValueBuilder of() {
        return new SearchQueryExpressionValueBuilder();
    }

    /**
     * create builder for SearchQueryExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchQueryExpressionValueBuilder of(final SearchQueryExpressionValue template) {
        SearchQueryExpressionValueBuilder builder = new SearchQueryExpressionValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.fieldType = template.getFieldType();
        return builder;
    }

}
