
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
@JsonDeserialize(as = ProductVariantDeletedMessageImpl.class)
public interface ProductVariantDeletedMessage extends Message {

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

    public static ProductVariantDeletedMessage of() {
        return new ProductVariantDeletedMessageImpl();
    }

    public static ProductVariantDeletedMessage of(final ProductVariantDeletedMessage template) {
        ProductVariantDeletedMessageImpl instance = new ProductVariantDeletedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVariant(template.getVariant());
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    public static ProductVariantDeletedMessageBuilder builder() {
        return ProductVariantDeletedMessageBuilder.of();
    }

    public static ProductVariantDeletedMessageBuilder builder(final ProductVariantDeletedMessage template) {
        return ProductVariantDeletedMessageBuilder.of(template);
    }

    default <T> T withProductVariantDeletedMessage(Function<ProductVariantDeletedMessage, T> helper) {
        return helper.apply(this);
    }
}
