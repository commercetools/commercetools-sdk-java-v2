
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchAnyValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchAnyValue productSearchAnyValue = ProductSearchAnyValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchAnyValueImpl.class)
public interface ProductSearchAnyValue extends ProductSearchQueryExpressionValue {

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
     * @return instance of ProductSearchAnyValue
     */
    public static ProductSearchAnyValue of() {
        return new ProductSearchAnyValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchAnyValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchAnyValue of(final ProductSearchAnyValue template) {
        ProductSearchAnyValueImpl instance = new ProductSearchAnyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchAnyValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchAnyValue deepCopy(@Nullable final ProductSearchAnyValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchAnyValueImpl instance = new ProductSearchAnyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * builder factory method for ProductSearchAnyValue
     * @return builder
     */
    public static ProductSearchAnyValueBuilder builder() {
        return ProductSearchAnyValueBuilder.of();
    }

    /**
     * create builder for ProductSearchAnyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchAnyValueBuilder builder(final ProductSearchAnyValue template) {
        return ProductSearchAnyValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchAnyValue(Function<ProductSearchAnyValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchAnyValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchAnyValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchAnyValue>";
            }
        };
    }
}
