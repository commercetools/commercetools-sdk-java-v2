
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFullTextPrefixValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFullTextPrefixValue searchFullTextPrefixValue = SearchFullTextPrefixValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFullTextPrefixValueBuilder implements Builder<SearchFullTextPrefixValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private java.lang.Object value;

    @Nullable
    private String language;

    @Nullable
    private com.commercetools.api.models.search.SearchMatchType mustMatch;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchFullTextPrefixValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchFullTextPrefixValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchFullTextPrefixValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public SearchFullTextPrefixValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     * @return Builder
     */

    public SearchFullTextPrefixValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     * set the value to the mustMatch
     * @param mustMatch value to be set
     * @return Builder
     */

    public SearchFullTextPrefixValueBuilder mustMatch(
            @Nullable final com.commercetools.api.models.search.SearchMatchType mustMatch) {
        this.mustMatch = mustMatch;
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
     * value of value}
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
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
     * value of mustMatch}
     * @return mustMatch
     */

    @Nullable
    public com.commercetools.api.models.search.SearchMatchType getMustMatch() {
        return this.mustMatch;
    }

    /**
     * builds SearchFullTextPrefixValue with checking for non-null required values
     * @return SearchFullTextPrefixValue
     */
    public SearchFullTextPrefixValue build() {
        Objects.requireNonNull(field, SearchFullTextPrefixValue.class + ": field is missing");
        Objects.requireNonNull(value, SearchFullTextPrefixValue.class + ": value is missing");
        return new SearchFullTextPrefixValueImpl(field, boost, fieldType, value, language, mustMatch);
    }

    /**
     * builds SearchFullTextPrefixValue without checking for non-null required values
     * @return SearchFullTextPrefixValue
     */
    public SearchFullTextPrefixValue buildUnchecked() {
        return new SearchFullTextPrefixValueImpl(field, boost, fieldType, value, language, mustMatch);
    }

    /**
     * factory method for an instance of SearchFullTextPrefixValueBuilder
     * @return builder
     */
    public static SearchFullTextPrefixValueBuilder of() {
        return new SearchFullTextPrefixValueBuilder();
    }

    /**
     * create builder for SearchFullTextPrefixValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFullTextPrefixValueBuilder of(final SearchFullTextPrefixValue template) {
        SearchFullTextPrefixValueBuilder builder = new SearchFullTextPrefixValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.fieldType = template.getFieldType();
        builder.value = template.getValue();
        builder.language = template.getLanguage();
        builder.mustMatch = template.getMustMatch();
        return builder;
    }

}
