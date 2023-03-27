
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeAttributeOrderByNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeOrderByNameAction productTypeChangeAttributeOrderByNameAction = ProductTypeChangeAttributeOrderByNameAction.builder()
 *             .plusAttributeNames(attributeNamesBuilder -> attributeNamesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeAttributeOrderByNameActionImpl.class)
public interface ProductTypeChangeAttributeOrderByNameAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeAttributeOrderByNameAction
     */
    String CHANGE_ATTRIBUTE_ORDER_BY_NAME = "changeAttributeOrderByName";

    /**
     *  <p>Names of Attributes to reorder. This array must include all Attributes currently present on a ProductType in a different order.</p>
     * @return attributeNames
     */
    @NotNull
    @JsonProperty("attributeNames")
    public List<String> getAttributeNames();

    /**
     *  <p>Names of Attributes to reorder. This array must include all Attributes currently present on a ProductType in a different order.</p>
     * @param attributeNames values to be set
     */

    @JsonIgnore
    public void setAttributeNames(final String... attributeNames);

    /**
     *  <p>Names of Attributes to reorder. This array must include all Attributes currently present on a ProductType in a different order.</p>
     * @param attributeNames values to be set
     */

    public void setAttributeNames(final List<String> attributeNames);

    /**
     * factory method
     * @return instance of ProductTypeChangeAttributeOrderByNameAction
     */
    public static ProductTypeChangeAttributeOrderByNameAction of() {
        return new ProductTypeChangeAttributeOrderByNameActionImpl();
    }

    /**
     * factory method to copy an instance of ProductTypeChangeAttributeOrderByNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeAttributeOrderByNameAction of(
            final ProductTypeChangeAttributeOrderByNameAction template) {
        ProductTypeChangeAttributeOrderByNameActionImpl instance = new ProductTypeChangeAttributeOrderByNameActionImpl();
        instance.setAttributeNames(template.getAttributeNames());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeAttributeOrderByNameAction
     * @return builder
     */
    public static ProductTypeChangeAttributeOrderByNameActionBuilder builder() {
        return ProductTypeChangeAttributeOrderByNameActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeAttributeOrderByNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeAttributeOrderByNameActionBuilder builder(
            final ProductTypeChangeAttributeOrderByNameAction template) {
        return ProductTypeChangeAttributeOrderByNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeAttributeOrderByNameAction(
            Function<ProductTypeChangeAttributeOrderByNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeOrderByNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeOrderByNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeAttributeOrderByNameAction>";
            }
        };
    }
}
