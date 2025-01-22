
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchLongRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchLongRangeValue searchLongRangeValue = SearchLongRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchLongRangeValueBuilder implements Builder<SearchLongRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private Long gte;

    @Nullable
    private Long gt;

    @Nullable
    private Long lte;

    @Nullable
    private Long lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchLongRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchLongRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchLongRangeValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public SearchLongRangeValueBuilder gte(@Nullable final Long gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public SearchLongRangeValueBuilder gt(@Nullable final Long gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public SearchLongRangeValueBuilder lte(@Nullable final Long lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public SearchLongRangeValueBuilder lt(@Nullable final Long lt) {
        this.lt = lt;
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
     *  <p>Possible values for the <code>fieldType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     * value of gte}
     * @return gte
     */

    @Nullable
    public Long getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public Long getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public Long getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public Long getLt() {
        return this.lt;
    }

    /**
     * builds SearchLongRangeValue with checking for non-null required values
     * @return SearchLongRangeValue
     */
    public SearchLongRangeValue build() {
        Objects.requireNonNull(field, SearchLongRangeValue.class + ": field is missing");
        return new SearchLongRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * builds SearchLongRangeValue without checking for non-null required values
     * @return SearchLongRangeValue
     */
    public SearchLongRangeValue buildUnchecked() {
        return new SearchLongRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of SearchLongRangeValueBuilder
     * @return builder
     */
    public static SearchLongRangeValueBuilder of() {
        return new SearchLongRangeValueBuilder();
    }

    /**
     * create builder for SearchLongRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchLongRangeValueBuilder of(final SearchLongRangeValue template) {
        SearchLongRangeValueBuilder builder = new SearchLongRangeValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.fieldType = template.getFieldType();
        builder.gte = template.getGte();
        builder.gt = template.getGt();
        builder.lte = template.getLte();
        builder.lt = template.getLt();
        return builder;
    }

}
