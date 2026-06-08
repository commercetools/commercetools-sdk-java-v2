
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SearchFuzzyValue
 *
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
@JsonDeserialize(as = SearchFuzzyValueImpl.class)
public interface SearchFuzzyValue extends SearchQueryExpressionValue {

    /**
     *  <p>The search term to find fuzzy matches for. If multiple terms are provided (separated by whitespace), the fuzziness level is applied to each term individually.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>The maximum fuzziness level desired for the search term. Allowed values are <code>0</code>, <code>1</code>, and <code>2</code>. The API automatically adjusts the effective fuzziness level based on the length of the search term if it exceeds the maximum allowed for the given string length according to the following rules:</p>
     *  <ul>
     *   <li>Terms with 1-2 characters: 0 (exact match)</li>
     *   <li>Terms with 3-5 characters: 1 (up to one difference is allowed)</li>
     *   <li>Terms with more than 5 characters: 2 (up to two differences are allowed)</li>
     *  </ul>
     * @return level
     */
    @NotNull
    @JsonProperty("level")
    public Integer getLevel();

    /**
     *  <p>Language of the localized value. Must be provided when the field is of type <code>localizedTextField</code>. The provided Locale must be one of the Project's languages.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *  <p>Controls whether all of the provided terms must match (<code>all</code>, default) or any of those (<code>any</code>).</p>
     * @return mustMatch
     */

    @JsonProperty("mustMatch")
    public SearchMatchType getMustMatch();

    /**
     *  <p>The search term to find fuzzy matches for. If multiple terms are provided (separated by whitespace), the fuzziness level is applied to each term individually.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>The maximum fuzziness level desired for the search term. Allowed values are <code>0</code>, <code>1</code>, and <code>2</code>. The API automatically adjusts the effective fuzziness level based on the length of the search term if it exceeds the maximum allowed for the given string length according to the following rules:</p>
     *  <ul>
     *   <li>Terms with 1-2 characters: 0 (exact match)</li>
     *   <li>Terms with 3-5 characters: 1 (up to one difference is allowed)</li>
     *   <li>Terms with more than 5 characters: 2 (up to two differences are allowed)</li>
     *  </ul>
     * @param level value to be set
     */

    public void setLevel(final Integer level);

    /**
     *  <p>Language of the localized value. Must be provided when the field is of type <code>localizedTextField</code>. The provided Locale must be one of the Project's languages.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     *  <p>Controls whether all of the provided terms must match (<code>all</code>, default) or any of those (<code>any</code>).</p>
     * @param mustMatch value to be set
     */

    public void setMustMatch(final SearchMatchType mustMatch);

    /**
     * factory method
     * @return instance of SearchFuzzyValue
     */
    public static SearchFuzzyValue of() {
        return new SearchFuzzyValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchFuzzyValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchFuzzyValue of(final SearchFuzzyValue template) {
        SearchFuzzyValueImpl instance = new SearchFuzzyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setLevel(template.getLevel());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    public SearchFuzzyValue copyDeep();

    /**
     * factory method to create a deep copy of SearchFuzzyValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchFuzzyValue deepCopy(@Nullable final SearchFuzzyValue template) {
        if (template == null) {
            return null;
        }
        SearchFuzzyValueImpl instance = new SearchFuzzyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setLevel(template.getLevel());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    /**
     * builder factory method for SearchFuzzyValue
     * @return builder
     */
    public static SearchFuzzyValueBuilder builder() {
        return SearchFuzzyValueBuilder.of();
    }

    /**
     * create builder for SearchFuzzyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFuzzyValueBuilder builder(final SearchFuzzyValue template) {
        return SearchFuzzyValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchFuzzyValue(Function<SearchFuzzyValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchFuzzyValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchFuzzyValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchFuzzyValue>";
            }
        };
    }
}
