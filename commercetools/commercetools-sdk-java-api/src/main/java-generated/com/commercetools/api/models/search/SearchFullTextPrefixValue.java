
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
 * SearchFullTextPrefixValue
 *
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
@JsonDeserialize(as = SearchFullTextPrefixValueImpl.class)
public interface SearchFullTextPrefixValue extends SearchQueryExpressionValue {

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *
     * @return mustMatch
     */

    @JsonProperty("mustMatch")
    public SearchMatchType getMustMatch();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     * set mustMatch
     * @param mustMatch value to be set
     */

    public void setMustMatch(final SearchMatchType mustMatch);

    /**
     * factory method
     * @return instance of SearchFullTextPrefixValue
     */
    public static SearchFullTextPrefixValue of() {
        return new SearchFullTextPrefixValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchFullTextPrefixValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchFullTextPrefixValue of(final SearchFullTextPrefixValue template) {
        SearchFullTextPrefixValueImpl instance = new SearchFullTextPrefixValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchFullTextPrefixValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchFullTextPrefixValue deepCopy(@Nullable final SearchFullTextPrefixValue template) {
        if (template == null) {
            return null;
        }
        SearchFullTextPrefixValueImpl instance = new SearchFullTextPrefixValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    /**
     * builder factory method for SearchFullTextPrefixValue
     * @return builder
     */
    public static SearchFullTextPrefixValueBuilder builder() {
        return SearchFullTextPrefixValueBuilder.of();
    }

    /**
     * create builder for SearchFullTextPrefixValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFullTextPrefixValueBuilder builder(final SearchFullTextPrefixValue template) {
        return SearchFullTextPrefixValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchFullTextPrefixValue(Function<SearchFullTextPrefixValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchFullTextPrefixValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchFullTextPrefixValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchFullTextPrefixValue>";
            }
        };
    }
}
