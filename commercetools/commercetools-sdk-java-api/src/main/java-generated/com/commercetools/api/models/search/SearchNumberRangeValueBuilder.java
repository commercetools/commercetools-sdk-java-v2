
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchNumberRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNumberRangeValue searchNumberRangeValue = SearchNumberRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchNumberRangeValueBuilder implements Builder<SearchNumberRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private Double gte;

    @Nullable
    private Double gt;

    @Nullable
    private Double lte;

    @Nullable
    private Double lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchNumberRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchNumberRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchNumberRangeValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public SearchNumberRangeValueBuilder gte(@Nullable final Double gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public SearchNumberRangeValueBuilder gt(@Nullable final Double gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public SearchNumberRangeValueBuilder lte(@Nullable final Double lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public SearchNumberRangeValueBuilder lt(@Nullable final Double lt) {
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
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
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
    public Double getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public Double getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public Double getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public Double getLt() {
        return this.lt;
    }

    /**
     * builds SearchNumberRangeValue with checking for non-null required values
     * @return SearchNumberRangeValue
     */
    public SearchNumberRangeValue build() {
        Objects.requireNonNull(field, SearchNumberRangeValue.class + ": field is missing");
        return new SearchNumberRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * builds SearchNumberRangeValue without checking for non-null required values
     * @return SearchNumberRangeValue
     */
    public SearchNumberRangeValue buildUnchecked() {
        return new SearchNumberRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of SearchNumberRangeValueBuilder
     * @return builder
     */
    public static SearchNumberRangeValueBuilder of() {
        return new SearchNumberRangeValueBuilder();
    }

    /**
     * create builder for SearchNumberRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNumberRangeValueBuilder of(final SearchNumberRangeValue template) {
        SearchNumberRangeValueBuilder builder = new SearchNumberRangeValueBuilder();
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
