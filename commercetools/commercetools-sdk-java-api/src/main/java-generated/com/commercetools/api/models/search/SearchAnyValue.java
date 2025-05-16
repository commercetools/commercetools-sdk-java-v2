
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
 * SearchAnyValue
 *
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
@JsonDeserialize(as = SearchAnyValueImpl.class)
public interface SearchAnyValue extends SearchQueryExpressionValue {

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
     * @return caseInsensitive
     */

    @JsonProperty("caseInsensitive")
    public Boolean getCaseInsensitive();

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
     * set caseInsensitive
     * @param caseInsensitive value to be set
     */

    public void setCaseInsensitive(final Boolean caseInsensitive);

    /**
     * factory method
     * @return instance of SearchAnyValue
     */
    public static SearchAnyValue of() {
        return new SearchAnyValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchAnyValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchAnyValue of(final SearchAnyValue template) {
        SearchAnyValueImpl instance = new SearchAnyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    public SearchAnyValue copyDeep();

    /**
     * factory method to create a deep copy of SearchAnyValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchAnyValue deepCopy(@Nullable final SearchAnyValue template) {
        if (template == null) {
            return null;
        }
        SearchAnyValueImpl instance = new SearchAnyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * builder factory method for SearchAnyValue
     * @return builder
     */
    public static SearchAnyValueBuilder builder() {
        return SearchAnyValueBuilder.of();
    }

    /**
     * create builder for SearchAnyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchAnyValueBuilder builder(final SearchAnyValue template) {
        return SearchAnyValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchAnyValue(Function<SearchAnyValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchAnyValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchAnyValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchAnyValue>";
            }
        };
    }
}
