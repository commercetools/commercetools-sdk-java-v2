
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
@JsonDeserialize(as = ProductSelectionRemoveProductActionImpl.class)
public interface ProductSelectionRemoveProductAction extends ProductSelectionUpdateAction {

    String REMOVE_PRODUCT = "removeProduct";

    /**
    *  <p>ResourceIdentifier to Product</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    public void setProduct(final ProductResourceIdentifier product);

    public static ProductSelectionRemoveProductAction of() {
        return new ProductSelectionRemoveProductActionImpl();
    }

    public static ProductSelectionRemoveProductAction of(final ProductSelectionRemoveProductAction template) {
        ProductSelectionRemoveProductActionImpl instance = new ProductSelectionRemoveProductActionImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    public static ProductSelectionRemoveProductActionBuilder builder() {
        return ProductSelectionRemoveProductActionBuilder.of();
    }

    public static ProductSelectionRemoveProductActionBuilder builder(
            final ProductSelectionRemoveProductAction template) {
        return ProductSelectionRemoveProductActionBuilder.of(template);
    }

    default <T> T withProductSelectionRemoveProductAction(Function<ProductSelectionRemoveProductAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionRemoveProductAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionRemoveProductAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionRemoveProductAction>";
            }
        };
    }
}
