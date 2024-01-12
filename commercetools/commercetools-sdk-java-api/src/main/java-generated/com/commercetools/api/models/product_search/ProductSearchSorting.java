
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSorting
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSorting productSearchSorting = ProductSearchSorting.builder()
 *             .field("{field}")
 *             .order(ProductSearchSortOrder.ASC)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchSortingImpl.class)
public interface ProductSearchSorting {

    /**
     *
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *
     * @return order
     */
    @NotNull
    @JsonProperty("order")
    public ProductSearchSortOrder getOrder();

    /**
     *
     * @return mode
     */

    @JsonProperty("mode")
    public ProductSearchSortMode getMode();

    /**
     *
     * @return attributeType
     */

    @JsonProperty("attributeType")
    public ProductSearchAttributeType getAttributeType();

    /**
     *
     * @return filter
     */
    @Valid
    @JsonProperty("filter")
    public ProductSearchQueryExpression getFilter();

    /**
     *
     * @return internal
     */

    @JsonProperty("internal")
    public Boolean getInternal();

    /**
     * set field
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     * set order
     * @param order value to be set
     */

    public void setOrder(final ProductSearchSortOrder order);

    /**
     * set mode
     * @param mode value to be set
     */

    public void setMode(final ProductSearchSortMode mode);

    /**
     * set attributeType
     * @param attributeType value to be set
     */

    public void setAttributeType(final ProductSearchAttributeType attributeType);

    /**
     * set filter
     * @param filter value to be set
     */

    public void setFilter(final ProductSearchQueryExpression filter);

    /**
     * set internal
     * @param internal value to be set
     */

    public void setInternal(final Boolean internal);

    /**
     * factory method
     * @return instance of ProductSearchSorting
     */
    public static ProductSearchSorting of() {
        return new ProductSearchSortingImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchSorting
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchSorting of(final ProductSearchSorting template) {
        ProductSearchSortingImpl instance = new ProductSearchSortingImpl();
        instance.setField(template.getField());
        instance.setLanguage(template.getLanguage());
        instance.setOrder(template.getOrder());
        instance.setMode(template.getMode());
        instance.setAttributeType(template.getAttributeType());
        instance.setFilter(template.getFilter());
        instance.setInternal(template.getInternal());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchSorting
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchSorting deepCopy(@Nullable final ProductSearchSorting template) {
        if (template == null) {
            return null;
        }
        ProductSearchSortingImpl instance = new ProductSearchSortingImpl();
        instance.setField(template.getField());
        instance.setLanguage(template.getLanguage());
        instance.setOrder(template.getOrder());
        instance.setMode(template.getMode());
        instance.setAttributeType(template.getAttributeType());
        instance.setFilter(
            com.commercetools.api.models.product_search.ProductSearchQueryExpression.deepCopy(template.getFilter()));
        instance.setInternal(template.getInternal());
        return instance;
    }

    /**
     * builder factory method for ProductSearchSorting
     * @return builder
     */
    public static ProductSearchSortingBuilder builder() {
        return ProductSearchSortingBuilder.of();
    }

    /**
     * create builder for ProductSearchSorting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSortingBuilder builder(final ProductSearchSorting template) {
        return ProductSearchSortingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchSorting(Function<ProductSearchSorting, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchSorting> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchSorting>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchSorting>";
            }
        };
    }
}
