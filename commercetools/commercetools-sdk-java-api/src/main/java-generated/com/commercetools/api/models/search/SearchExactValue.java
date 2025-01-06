
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchExactValue
 *
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
@JsonDeserialize(as = SearchExactValueImpl.class)
public interface SearchExactValue extends SearchQueryExpressionValue {

    /**
     *
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *
     * @return values
     */

    @JsonProperty("values")
    public List<Object> getValues();

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
     * set values
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final Object... values);

    /**
     * set values
     * @param values values to be set
     */

    public void setValues(final List<Object> values);

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
     * @return instance of SearchExactValue
     */
    public static SearchExactValue of() {
        return new SearchExactValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchExactValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchExactValue of(final SearchExactValue template) {
        SearchExactValueImpl instance = new SearchExactValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setValues(template.getValues());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchExactValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchExactValue deepCopy(@Nullable final SearchExactValue template) {
        if (template == null) {
            return null;
        }
        SearchExactValueImpl instance = new SearchExactValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setValue(template.getValue());
        instance.setValues(Optional.ofNullable(template.getValues()).map(ArrayList::new).orElse(null));
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * builder factory method for SearchExactValue
     * @return builder
     */
    public static SearchExactValueBuilder builder() {
        return SearchExactValueBuilder.of();
    }

    /**
     * create builder for SearchExactValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExactValueBuilder builder(final SearchExactValue template) {
        return SearchExactValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchExactValue(Function<SearchExactValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchExactValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchExactValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchExactValue>";
            }
        };
    }
}
