
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
@JsonDeserialize(as = ProductVariantAddedMessageImpl.class)
public interface ProductVariantAddedMessage extends Message {

    String PRODUCT_VARIANT_ADDED = "ProductVariantAdded";

    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariant(final ProductVariant variant);

    public void setStaged(final Boolean staged);

    public static ProductVariantAddedMessage of() {
        return new ProductVariantAddedMessageImpl();
    }

    public static ProductVariantAddedMessage of(final ProductVariantAddedMessage template) {
        ProductVariantAddedMessageImpl instance = new ProductVariantAddedMessageImpl();
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
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductVariantAddedMessageBuilder builder() {
        return ProductVariantAddedMessageBuilder.of();
    }

    public static ProductVariantAddedMessageBuilder builder(final ProductVariantAddedMessage template) {
        return ProductVariantAddedMessageBuilder.of(template);
    }

    default <T> T withProductVariantAddedMessage(Function<ProductVariantAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantAddedMessage>";
            }
        };
    }
}
