
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchTimeRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchTimeRangeValue searchTimeRangeValue = SearchTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchTimeRangeValueBuilder implements Builder<SearchTimeRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private java.time.LocalTime gte;

    @Nullable
    private java.time.LocalTime gt;

    @Nullable
    private java.time.LocalTime lte;

    @Nullable
    private java.time.LocalTime lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchTimeRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchTimeRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchTimeRangeValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public SearchTimeRangeValueBuilder gte(@Nullable final java.time.LocalTime gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public SearchTimeRangeValueBuilder gt(@Nullable final java.time.LocalTime gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public SearchTimeRangeValueBuilder lte(@Nullable final java.time.LocalTime lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public SearchTimeRangeValueBuilder lt(@Nullable final java.time.LocalTime lt) {
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
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
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
    public java.time.LocalTime getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public java.time.LocalTime getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public java.time.LocalTime getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public java.time.LocalTime getLt() {
        return this.lt;
    }

    /**
     * builds SearchTimeRangeValue with checking for non-null required values
     * @return SearchTimeRangeValue
     */
    public SearchTimeRangeValue build() {
        Objects.requireNonNull(field, SearchTimeRangeValue.class + ": field is missing");
        return new SearchTimeRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * builds SearchTimeRangeValue without checking for non-null required values
     * @return SearchTimeRangeValue
     */
    public SearchTimeRangeValue buildUnchecked() {
        return new SearchTimeRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of SearchTimeRangeValueBuilder
     * @return builder
     */
    public static SearchTimeRangeValueBuilder of() {
        return new SearchTimeRangeValueBuilder();
    }

    /**
     * create builder for SearchTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchTimeRangeValueBuilder of(final SearchTimeRangeValue template) {
        SearchTimeRangeValueBuilder builder = new SearchTimeRangeValueBuilder();
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
