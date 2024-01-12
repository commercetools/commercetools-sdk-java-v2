
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
 * ProductSearchFullTextValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFullTextValue productSearchFullTextValue = ProductSearchFullTextValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFullTextValueImpl.class)
public interface ProductSearchFullTextValue extends ProductSearchQueryExpressionValue {

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
    public ProductSearchMatchType getMustMatch();

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

    public void setMustMatch(final ProductSearchMatchType mustMatch);

    /**
     * factory method
     * @return instance of ProductSearchFullTextValue
     */
    public static ProductSearchFullTextValue of() {
        return new ProductSearchFullTextValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFullTextValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFullTextValue of(final ProductSearchFullTextValue template) {
        ProductSearchFullTextValueImpl instance = new ProductSearchFullTextValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFullTextValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFullTextValue deepCopy(@Nullable final ProductSearchFullTextValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchFullTextValueImpl instance = new ProductSearchFullTextValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFullTextValue
     * @return builder
     */
    public static ProductSearchFullTextValueBuilder builder() {
        return ProductSearchFullTextValueBuilder.of();
    }

    /**
     * create builder for ProductSearchFullTextValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFullTextValueBuilder builder(final ProductSearchFullTextValue template) {
        return ProductSearchFullTextValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFullTextValue(Function<ProductSearchFullTextValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFullTextValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFullTextValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFullTextValue>";
            }
        };
    }
}
