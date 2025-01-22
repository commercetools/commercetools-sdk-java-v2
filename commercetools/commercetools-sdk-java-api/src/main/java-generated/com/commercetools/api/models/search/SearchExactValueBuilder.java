
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchExactValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExactValue searchExactValue = SearchExactValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchExactValueBuilder implements Builder<SearchExactValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private java.lang.Object value;

    @Nullable
    private java.util.List<java.lang.Object> values;

    @Nullable
    private String language;

    @Nullable
    private Boolean caseInsensitive;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchExactValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchExactValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchExactValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public SearchExactValueBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     * set values to the values
     * @param values value to be set
     * @return Builder
     */

    public SearchExactValueBuilder values(@Nullable final java.lang.Object... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     * set value to the values
     * @param values value to be set
     * @return Builder
     */

    public SearchExactValueBuilder values(@Nullable final java.util.List<java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     * add values to the values
     * @param values value to be set
     * @return Builder
     */

    public SearchExactValueBuilder plusValues(@Nullable final java.lang.Object... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public SearchExactValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the caseInsensitive
     * @param caseInsensitive value to be set
     * @return Builder
     */

    public SearchExactValueBuilder caseInsensitive(@Nullable final Boolean caseInsensitive) {
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
     *  <p>Possible values for the <code>fieldType</code> property on simple expressions indicating the data type of the <code>field</code>.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     * value of value}
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * value of values}
     * @return values
     */

    @Nullable
    public java.util.List<java.lang.Object> getValues() {
        return this.values;
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
     * builds SearchExactValue with checking for non-null required values
     * @return SearchExactValue
     */
    public SearchExactValue build() {
        Objects.requireNonNull(field, SearchExactValue.class + ": field is missing");
        return new SearchExactValueImpl(field, boost, fieldType, value, values, language, caseInsensitive);
    }

    /**
     * builds SearchExactValue without checking for non-null required values
     * @return SearchExactValue
     */
    public SearchExactValue buildUnchecked() {
        return new SearchExactValueImpl(field, boost, fieldType, value, values, language, caseInsensitive);
    }

    /**
     * factory method for an instance of SearchExactValueBuilder
     * @return builder
     */
    public static SearchExactValueBuilder of() {
        return new SearchExactValueBuilder();
    }

    /**
     * create builder for SearchExactValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExactValueBuilder of(final SearchExactValue template) {
        SearchExactValueBuilder builder = new SearchExactValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.fieldType = template.getFieldType();
        builder.value = template.getValue();
        builder.values = template.getValues();
        builder.language = template.getLanguage();
        builder.caseInsensitive = template.getCaseInsensitive();
        return builder;
    }

}
