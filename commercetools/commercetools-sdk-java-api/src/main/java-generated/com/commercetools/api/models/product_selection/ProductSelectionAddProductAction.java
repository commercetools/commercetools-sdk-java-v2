
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionAddProductActionImpl.class)
public interface ProductSelectionAddProductAction extends ProductSelectionUpdateAction {

    String ADD_PRODUCT = "addProduct";

    /**
    *  <p>ResourceIdentifier to Product</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    public void setProduct(final ProductResourceIdentifier product);

    public static ProductSelectionAddProductAction of() {
        return new ProductSelectionAddProductActionImpl();
    }

    public static ProductSelectionAddProductAction of(final ProductSelectionAddProductAction template) {
        ProductSelectionAddProductActionImpl instance = new ProductSelectionAddProductActionImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    public static ProductSelectionAddProductActionBuilder builder() {
        return ProductSelectionAddProductActionBuilder.of();
    }

    public static ProductSelectionAddProductActionBuilder builder(final ProductSelectionAddProductAction template) {
        return ProductSelectionAddProductActionBuilder.of(template);
    }

    default <T> T withProductSelectionAddProductAction(Function<ProductSelectionAddProductAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAddProductAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAddProductAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionAddProductAction>";
            }
        };
    }
}
