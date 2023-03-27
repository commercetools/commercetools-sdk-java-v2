
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionRemoveProductAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionRemoveProductAction productSelectionRemoveProductAction = ProductSelectionRemoveProductAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionRemoveProductActionImpl.class)
public interface ProductSelectionRemoveProductAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionRemoveProductAction
     */
    String REMOVE_PRODUCT = "removeProduct";

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param product value to be set
     */

    public void setProduct(final ProductResourceIdentifier product);

    /**
     * factory method
     * @return instance of ProductSelectionRemoveProductAction
     */
    public static ProductSelectionRemoveProductAction of() {
        return new ProductSelectionRemoveProductActionImpl();
    }

    /**
     * factory method to copy an instance of ProductSelectionRemoveProductAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionRemoveProductAction of(final ProductSelectionRemoveProductAction template) {
        ProductSelectionRemoveProductActionImpl instance = new ProductSelectionRemoveProductActionImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionRemoveProductAction
     * @return builder
     */
    public static ProductSelectionRemoveProductActionBuilder builder() {
        return ProductSelectionRemoveProductActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionRemoveProductAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionRemoveProductActionBuilder builder(
            final ProductSelectionRemoveProductAction template) {
        return ProductSelectionRemoveProductActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionRemoveProductAction(Function<ProductSelectionRemoveProductAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionRemoveProductAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionRemoveProductAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionRemoveProductAction>";
            }
        };
    }
}
