
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchDateRangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateRangeValue searchDateRangeValue = SearchDateRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchDateRangeValueBuilder implements Builder<SearchDateRangeValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private java.time.LocalDate gte;

    @Nullable
    private java.time.LocalDate gt;

    @Nullable
    private java.time.LocalDate lte;

    @Nullable
    private java.time.LocalDate lt;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchDateRangeValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchDateRangeValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchDateRangeValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the gte
     * @param gte value to be set
     * @return Builder
     */

    public SearchDateRangeValueBuilder gte(@Nullable final java.time.LocalDate gte) {
        this.gte = gte;
        return this;
    }

    /**
     * set the value to the gt
     * @param gt value to be set
     * @return Builder
     */

    public SearchDateRangeValueBuilder gt(@Nullable final java.time.LocalDate gt) {
        this.gt = gt;
        return this;
    }

    /**
     * set the value to the lte
     * @param lte value to be set
     * @return Builder
     */

    public SearchDateRangeValueBuilder lte(@Nullable final java.time.LocalDate lte) {
        this.lte = lte;
        return this;
    }

    /**
     * set the value to the lt
     * @param lt value to be set
     * @return Builder
     */

    public SearchDateRangeValueBuilder lt(@Nullable final java.time.LocalDate lt) {
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
    public java.time.LocalDate getGte() {
        return this.gte;
    }

    /**
     * value of gt}
     * @return gt
     */

    @Nullable
    public java.time.LocalDate getGt() {
        return this.gt;
    }

    /**
     * value of lte}
     * @return lte
     */

    @Nullable
    public java.time.LocalDate getLte() {
        return this.lte;
    }

    /**
     * value of lt}
     * @return lt
     */

    @Nullable
    public java.time.LocalDate getLt() {
        return this.lt;
    }

    /**
     * builds SearchDateRangeValue with checking for non-null required values
     * @return SearchDateRangeValue
     */
    public SearchDateRangeValue build() {
        Objects.requireNonNull(field, SearchDateRangeValue.class + ": field is missing");
        return new SearchDateRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * builds SearchDateRangeValue without checking for non-null required values
     * @return SearchDateRangeValue
     */
    public SearchDateRangeValue buildUnchecked() {
        return new SearchDateRangeValueImpl(field, boost, fieldType, gte, gt, lte, lt);
    }

    /**
     * factory method for an instance of SearchDateRangeValueBuilder
     * @return builder
     */
    public static SearchDateRangeValueBuilder of() {
        return new SearchDateRangeValueBuilder();
    }

    /**
     * create builder for SearchDateRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateRangeValueBuilder of(final SearchDateRangeValue template) {
        SearchDateRangeValueBuilder builder = new SearchDateRangeValueBuilder();
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
