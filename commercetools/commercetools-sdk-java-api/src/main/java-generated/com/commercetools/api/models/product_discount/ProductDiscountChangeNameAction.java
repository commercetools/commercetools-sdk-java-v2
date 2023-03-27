
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeNameAction productDiscountChangeNameAction = ProductDiscountChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeNameActionImpl.class)
public interface ProductDiscountChangeNameAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of ProductDiscountChangeNameAction
     */
    public static ProductDiscountChangeNameAction of() {
        return new ProductDiscountChangeNameActionImpl();
    }

    /**
     * factory method to copy an instance of ProductDiscountChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountChangeNameAction of(final ProductDiscountChangeNameAction template) {
        ProductDiscountChangeNameActionImpl instance = new ProductDiscountChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountChangeNameAction
     * @return builder
     */
    public static ProductDiscountChangeNameActionBuilder builder() {
        return ProductDiscountChangeNameActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeNameActionBuilder builder(final ProductDiscountChangeNameAction template) {
        return ProductDiscountChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountChangeNameAction(Function<ProductDiscountChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangeNameAction>";
            }
        };
    }
}
