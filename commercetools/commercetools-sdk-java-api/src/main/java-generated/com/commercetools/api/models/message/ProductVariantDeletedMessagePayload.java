
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductVariant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantDeletedMessagePayloadImpl.class)
public interface ProductVariantDeletedMessagePayload extends MessagePayload {

    String PRODUCT_VARIANT_DELETED = "ProductVariantDeleted";

    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    public void setVariant(final ProductVariant variant);

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public static ProductVariantDeletedMessagePayload of() {
        return new ProductVariantDeletedMessagePayloadImpl();
    }

    public static ProductVariantDeletedMessagePayload of(final ProductVariantDeletedMessagePayload template) {
        ProductVariantDeletedMessagePayloadImpl instance = new ProductVariantDeletedMessagePayloadImpl();
        instance.setVariant(template.getVariant());
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    public static ProductVariantDeletedMessagePayloadBuilder builder() {
        return ProductVariantDeletedMessagePayloadBuilder.of();
    }

    public static ProductVariantDeletedMessagePayloadBuilder builder(
            final ProductVariantDeletedMessagePayload template) {
        return ProductVariantDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductVariantDeletedMessagePayload(Function<ProductVariantDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
