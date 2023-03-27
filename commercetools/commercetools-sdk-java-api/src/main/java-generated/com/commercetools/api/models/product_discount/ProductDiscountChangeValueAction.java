
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeValueAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeValueAction productDiscountChangeValueAction = ProductDiscountChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeValueActionImpl.class)
public interface ProductDiscountChangeValueAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountChangeValueAction
     */
    String CHANGE_VALUE = "changeValue";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValueDraft getValue();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param value value to be set
     */

    public void setValue(final ProductDiscountValueDraft value);

    /**
     * factory method
     * @return instance of ProductDiscountChangeValueAction
     */
    public static ProductDiscountChangeValueAction of() {
        return new ProductDiscountChangeValueActionImpl();
    }

    /**
     * factory method to copy an instance of ProductDiscountChangeValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountChangeValueAction of(final ProductDiscountChangeValueAction template) {
        ProductDiscountChangeValueActionImpl instance = new ProductDiscountChangeValueActionImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountChangeValueAction
     * @return builder
     */
    public static ProductDiscountChangeValueActionBuilder builder() {
        return ProductDiscountChangeValueActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountChangeValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeValueActionBuilder builder(final ProductDiscountChangeValueAction template) {
        return ProductDiscountChangeValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountChangeValueAction(Function<ProductDiscountChangeValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangeValueAction>";
            }
        };
    }
}
