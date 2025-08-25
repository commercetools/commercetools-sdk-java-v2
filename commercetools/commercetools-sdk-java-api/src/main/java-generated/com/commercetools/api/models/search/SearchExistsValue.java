
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchExistsValue
 *
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
@JsonDeserialize(as = SearchExistsValueImpl.class)
public interface SearchExistsValue extends SearchQueryExpressionValue {

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     * factory method
     * @return instance of SearchExistsValue
     */
    public static SearchExistsValue of() {
        return new SearchExistsValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchExistsValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchExistsValue of(final SearchExistsValue template) {
        SearchExistsValueImpl instance = new SearchExistsValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setLanguage(template.getLanguage());
        return instance;
    }

    public SearchExistsValue copyDeep();

    /**
     * factory method to create a deep copy of SearchExistsValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchExistsValue deepCopy(@Nullable final SearchExistsValue template) {
        if (template == null) {
            return null;
        }
        SearchExistsValueImpl instance = new SearchExistsValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setLanguage(template.getLanguage());
        return instance;
    }

    /**
     * builder factory method for SearchExistsValue
     * @return builder
     */
    public static SearchExistsValueBuilder builder() {
        return SearchExistsValueBuilder.of();
    }

    /**
     * create builder for SearchExistsValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExistsValueBuilder builder(final SearchExistsValue template) {
        return SearchExistsValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchExistsValue(Function<SearchExistsValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchExistsValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchExistsValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchExistsValue>";
            }
        };
    }
}
