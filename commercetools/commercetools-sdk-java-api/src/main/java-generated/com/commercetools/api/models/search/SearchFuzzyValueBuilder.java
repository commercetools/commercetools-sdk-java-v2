
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFuzzyValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFuzzyValue searchFuzzyValue = SearchFuzzyValue.builder()
 *             .field("{field}")
 *             .level(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFuzzyValueBuilder implements Builder<SearchFuzzyValue> {

    private String field;

    @Nullable
    private Double boost;

    @Nullable
    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private java.lang.Object value;

    private Integer level;

    @Nullable
    private String language;

    @Nullable
    private com.commercetools.api.models.search.SearchMatchType mustMatch;

    /**
     * set the value to the field
     * @param field value to be set
     * @return Builder
     */

    public SearchFuzzyValueBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     * set the value to the boost
     * @param boost value to be set
     * @return Builder
     */

    public SearchFuzzyValueBuilder boost(@Nullable final Double boost) {
        this.boost = boost;
        return this;
    }

    /**
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     * @return Builder
     */

    public SearchFuzzyValueBuilder fieldType(
            @Nullable final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     *  <p>The search term to find fuzzy matches for. If multiple terms are provided (separated by whitespace), the fuzziness level is applied to each term individually.</p>
     * @param value value to be set
     * @return Builder
     */

    public SearchFuzzyValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The maximum fuzziness level desired for the search term. Allowed values are <code>0</code>, <code>1</code>, and <code>2</code>. The API automatically adjusts the effective fuzziness level based on the length of the search term if it exceeds the maximum allowed for the given string length according to the following rules:</p>
     *  <ul>
     *   <li>Terms with 1-2 characters: 0 (exact match)</li>
     *   <li>Terms with 3-5 characters: 1 (up to one difference is allowed)</li>
     *   <li>Terms with more than 5 characters: 2 (up to two differences are allowed)</li>
     *  </ul>
     * @param level value to be set
     * @return Builder
     */

    public SearchFuzzyValueBuilder level(final Integer level) {
        this.level = level;
        return this;
    }

    /**
     *  <p>Language of the localized value. Must be provided when the field is of type <code>localizedTextField</code>. The provided Locale must be one of the Project's languages.</p>
     * @param language value to be set
     * @return Builder
     */

    public SearchFuzzyValueBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     *  <p>Controls whether all of the provided terms must match (<code>all</code>, default) or any of those (<code>any</code>).</p>
     * @param mustMatch value to be set
     * @return Builder
     */

    public SearchFuzzyValueBuilder mustMatch(
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
     *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
     * @return fieldType
     */

    @Nullable
    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
    }

    /**
     *  <p>The search term to find fuzzy matches for. If multiple terms are provided (separated by whitespace), the fuzziness level is applied to each term individually.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>The maximum fuzziness level desired for the search term. Allowed values are <code>0</code>, <code>1</code>, and <code>2</code>. The API automatically adjusts the effective fuzziness level based on the length of the search term if it exceeds the maximum allowed for the given string length according to the following rules:</p>
     *  <ul>
     *   <li>Terms with 1-2 characters: 0 (exact match)</li>
     *   <li>Terms with 3-5 characters: 1 (up to one difference is allowed)</li>
     *   <li>Terms with more than 5 characters: 2 (up to two differences are allowed)</li>
     *  </ul>
     * @return level
     */

    public Integer getLevel() {
        return this.level;
    }

    /**
     *  <p>Language of the localized value. Must be provided when the field is of type <code>localizedTextField</code>. The provided Locale must be one of the Project's languages.</p>
     * @return language
     */

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    /**
     *  <p>Controls whether all of the provided terms must match (<code>all</code>, default) or any of those (<code>any</code>).</p>
     * @return mustMatch
     */

    @Nullable
    public com.commercetools.api.models.search.SearchMatchType getMustMatch() {
        return this.mustMatch;
    }

    /**
     * builds SearchFuzzyValue with checking for non-null required values
     * @return SearchFuzzyValue
     */
    public SearchFuzzyValue build() {
        Objects.requireNonNull(field, SearchFuzzyValue.class + ": field is missing");
        Objects.requireNonNull(value, SearchFuzzyValue.class + ": value is missing");
        Objects.requireNonNull(level, SearchFuzzyValue.class + ": level is missing");
        return new SearchFuzzyValueImpl(field, boost, fieldType, value, level, language, mustMatch);
    }

    /**
     * builds SearchFuzzyValue without checking for non-null required values
     * @return SearchFuzzyValue
     */
    public SearchFuzzyValue buildUnchecked() {
        return new SearchFuzzyValueImpl(field, boost, fieldType, value, level, language, mustMatch);
    }

    /**
     * factory method for an instance of SearchFuzzyValueBuilder
     * @return builder
     */
    public static SearchFuzzyValueBuilder of() {
        return new SearchFuzzyValueBuilder();
    }

    /**
     * create builder for SearchFuzzyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFuzzyValueBuilder of(final SearchFuzzyValue template) {
        SearchFuzzyValueBuilder builder = new SearchFuzzyValueBuilder();
        builder.field = template.getField();
        builder.boost = template.getBoost();
        builder.fieldType = template.getFieldType();
        builder.value = template.getValue();
        builder.level = template.getLevel();
        builder.language = template.getLanguage();
        builder.mustMatch = template.getMustMatch();
        return builder;
    }

}
