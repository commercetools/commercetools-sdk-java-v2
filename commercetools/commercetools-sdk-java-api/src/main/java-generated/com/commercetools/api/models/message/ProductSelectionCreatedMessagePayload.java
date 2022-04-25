
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_selection.ProductSelectionType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionCreatedMessagePayloadImpl.class)
public interface ProductSelectionCreatedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_CREATED = "ProductSelectionCreated";

    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionType getProductSelection();

    public void setProductSelection(final ProductSelectionType productSelection);

    public static ProductSelectionCreatedMessagePayload of() {
        return new ProductSelectionCreatedMessagePayloadImpl();
    }

    public static ProductSelectionCreatedMessagePayload of(final ProductSelectionCreatedMessagePayload template) {
        ProductSelectionCreatedMessagePayloadImpl instance = new ProductSelectionCreatedMessagePayloadImpl();
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    public static ProductSelectionCreatedMessagePayloadBuilder builder() {
        return ProductSelectionCreatedMessagePayloadBuilder.of();
    }

    public static ProductSelectionCreatedMessagePayloadBuilder builder(
            final ProductSelectionCreatedMessagePayload template) {
        return ProductSelectionCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionCreatedMessagePayload(Function<ProductSelectionCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionCreatedMessagePayload>";
            }
        };
    }
}
