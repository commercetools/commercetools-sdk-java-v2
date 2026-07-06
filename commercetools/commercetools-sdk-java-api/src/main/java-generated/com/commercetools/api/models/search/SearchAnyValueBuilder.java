
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchAnyValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchAnyValue searchAnyValue = SearchAnyValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchAnyValueBuilder implements Builder<SearchAnyValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private java.lang.Object value;

    @Nullable
    private String language;

    @Nullable
    private Boolean caseInsensitive;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchAnyValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchAnyValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchAnyValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public SearchAnyValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public SearchAnyValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the caseInsensitive
     * @param caseInsensitive value to be set
     * @return Builder
     */

    public SearchAnyValueBuilder caseInsensitive(@Nullable final Boolean caseInsensitive) {
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
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
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

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
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
     * builds SearchAnyValue with checking for non-null required values
     * @return SearchAnyValue
     */
    public SearchAnyValue build() {
        Objects.requireNonNull(field, SearchAnyValue.class + ": field is missing");
        Objects.requireNonNull(value, SearchAnyValue.class + ": value is missing");
        return new SearchAnyValueImpl(field, boost, fieldType, value, language, caseInsensitive);
    }

    /**
     * builds SearchAnyValue without checking for non-null required values
     * @return SearchAnyValue
     */
    public SearchAnyValue buildUnchecked() {
        return new SearchAnyValueImpl(field, boost, fieldType, value, language, caseInsensitive);
    }

    /**
     * factory method for an instance of SearchAnyValueBuilder
     * @return builder
     */
    public static SearchAnyValueBuilder of() {
        return new SearchAnyValueBuilder();
    }

    /**
     * create builder for SearchAnyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchAnyValueBuilder of(final SearchAnyValue template) {
        SearchAnyValueBuilder builder = new SearchAnyValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.fieldType = template.getFieldType();
        builder.value = template.getValue();
        builder.language = template.getLanguage();
        builder.caseInsensitive = template.getCaseInsensitive();
        return builder;
    }

}
