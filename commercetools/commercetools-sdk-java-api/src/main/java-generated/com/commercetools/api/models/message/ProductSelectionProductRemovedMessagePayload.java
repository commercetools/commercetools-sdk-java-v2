
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductRemovedMessagePayloadImpl.class)
public interface ProductSelectionProductRemovedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_PRODUCT_REMOVED = "ProductSelectionProductRemoved";

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Product">Product</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    public void setProduct(final ProductReference product);

    public static ProductSelectionProductRemovedMessagePayload of() {
        return new ProductSelectionProductRemovedMessagePayloadImpl();
    }

    public static ProductSelectionProductRemovedMessagePayload of(
            final ProductSelectionProductRemovedMessagePayload template) {
        ProductSelectionProductRemovedMessagePayloadImpl instance = new ProductSelectionProductRemovedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    public static ProductSelectionProductRemovedMessagePayloadBuilder builder() {
        return ProductSelectionProductRemovedMessagePayloadBuilder.of();
    }

    public static ProductSelectionProductRemovedMessagePayloadBuilder builder(
            final ProductSelectionProductRemovedMessagePayload template) {
        return ProductSelectionProductRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionProductRemovedMessagePayload(
            Function<ProductSelectionProductRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductRemovedMessagePayload>";
            }
        };
    }
}
