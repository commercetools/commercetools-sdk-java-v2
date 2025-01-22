
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchDateTimeRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateTimeRangeValue searchDateTimeRangeValue = SearchDateTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchDateTimeRangeValueBuilder implements Builder<SearchDateTimeRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private java.time.ZonedDateTime gte;

    @Nullable
    private java.time.ZonedDateTime gt;

    @Nullable
    private java.time.ZonedDateTime lte;

    @Nullable
    private java.time.ZonedDateTime lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchDateTimeRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchDateTimeRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchDateTimeRangeValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public SearchDateTimeRangeValueBuilder gte(@Nullable final java.time.ZonedDateTime gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public SearchDateTimeRangeValueBuilder gt(@Nullable final java.time.ZonedDateTime gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public SearchDateTimeRangeValueBuilder lte(@Nullable final java.time.ZonedDateTime lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public SearchDateTimeRangeValueBuilder lt(@Nullable final java.time.ZonedDateTime lt) {
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
    public java.time.ZonedDateTime getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public java.time.ZonedDateTime getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public java.time.ZonedDateTime getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public java.time.ZonedDateTime getLt() {
        return this.lt;
    }

    /**
     * builds SearchDateTimeRangeValue with checking for non-null required values
     * @return SearchDateTimeRangeValue
     */
    public SearchDateTimeRangeValue build() {
        Objects.requireNonNull(field, SearchDateTimeRangeValue.class + ": field is missing");
        return new SearchDateTimeRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * builds SearchDateTimeRangeValue without checking for non-null required values
     * @return SearchDateTimeRangeValue
     */
    public SearchDateTimeRangeValue buildUnchecked() {
        return new SearchDateTimeRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of SearchDateTimeRangeValueBuilder
     * @return builder
     */
    public static SearchDateTimeRangeValueBuilder of() {
        return new SearchDateTimeRangeValueBuilder();
    }

    /**
     * create builder for SearchDateTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateTimeRangeValueBuilder of(final SearchDateTimeRangeValue template) {
        SearchDateTimeRangeValueBuilder builder = new SearchDateTimeRangeValueBuilder();
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
