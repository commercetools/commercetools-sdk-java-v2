
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeNameAction productTypeChangeNameAction = ProductTypeChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeNameActionImpl.class)
public interface ProductTypeChangeNameAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New value to set.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ProductTypeChangeNameAction
     */
    public static ProductTypeChangeNameAction of() {
        return new ProductTypeChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeNameAction of(final ProductTypeChangeNameAction template) {
        ProductTypeChangeNameActionImpl instance = new ProductTypeChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangeNameAction deepCopy(@Nullable final ProductTypeChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangeNameActionImpl instance = new ProductTypeChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeNameAction
     * @return builder
     */
    public static ProductTypeChangeNameActionBuilder builder() {
        return ProductTypeChangeNameActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeNameActionBuilder builder(final ProductTypeChangeNameAction template) {
        return ProductTypeChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeNameAction(Function<ProductTypeChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeNameAction>";
            }
        };
    }
}
