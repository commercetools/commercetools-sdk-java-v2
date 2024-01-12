
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchExistsValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchExistsValue productSearchExistsValue = ProductSearchExistsValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchExistsValueImpl.class)
public interface ProductSearchExistsValue extends ProductSearchQueryExpressionValue {

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     * factory method
     * @return instance of ProductSearchExistsValue
     */
    public static ProductSearchExistsValue of() {
        return new ProductSearchExistsValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchExistsValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchExistsValue of(final ProductSearchExistsValue template) {
        ProductSearchExistsValueImpl instance = new ProductSearchExistsValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setLanguage(template.getLanguage());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchExistsValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchExistsValue deepCopy(@Nullable final ProductSearchExistsValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchExistsValueImpl instance = new ProductSearchExistsValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setLanguage(template.getLanguage());
        return instance;
    }

    /**
     * builder factory method for ProductSearchExistsValue
     * @return builder
     */
    public static ProductSearchExistsValueBuilder builder() {
        return ProductSearchExistsValueBuilder.of();
    }

    /**
     * create builder for ProductSearchExistsValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchExistsValueBuilder builder(final ProductSearchExistsValue template) {
        return ProductSearchExistsValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchExistsValue(Function<ProductSearchExistsValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchExistsValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchExistsValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchExistsValue>";
            }
        };
    }
}
