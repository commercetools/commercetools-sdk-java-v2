
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchExistsValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExistsValue searchExistsValue = SearchExistsValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchExistsValueBuilder implements Builder<SearchExistsValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    @Nullable
    private String language;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchExistsValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchExistsValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchExistsValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public SearchExistsValueBuilder language(@Nullable final String language) {
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
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
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
     * builds SearchExistsValue with checking for non-null required values
     * @return SearchExistsValue
     */
    public SearchExistsValue build() {
        Objects.requireNonNull(field, SearchExistsValue.class + ": field is missing");
        return new SearchExistsValueImpl(field, boost, fieldType, language);
    }

    /**
     * builds SearchExistsValue without checking for non-null required values
     * @return SearchExistsValue
     */
    public SearchExistsValue buildUnchecked() {
        return new SearchExistsValueImpl(field, boost, fieldType, language);
    }

    /**
     * factory method for an instance of SearchExistsValueBuilder
     * @return builder
     */
    public static SearchExistsValueBuilder of() {
        return new SearchExistsValueBuilder();
    }

    /**
     * create builder for SearchExistsValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExistsValueBuilder of(final SearchExistsValue template) {
        SearchExistsValueBuilder builder = new SearchExistsValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.fieldType = template.getFieldType();
        builder.language = template.getLanguage();
        return builder;
    }

}
