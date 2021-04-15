
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDeletedMessageImpl.class)
public interface ProductDeletedMessage extends Message {

    String PRODUCT_DELETED = "ProductDeleted";

    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    @NotNull
    @Valid
    @JsonProperty("currentProjection")
    public ProductProjection getCurrentProjection();

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public void setCurrentProjection(final ProductProjection currentProjection);

    public static ProductDeletedMessage of() {
        return new ProductDeletedMessageImpl();
    }

    public static ProductDeletedMessage of(final ProductDeletedMessage template) {
        ProductDeletedMessageImpl instance = new ProductDeletedMessageImpl();
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
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setCurrentProjection(template.getCurrentProjection());
        return instance;
    }

    public static ProductDeletedMessageBuilder builder() {
        return ProductDeletedMessageBuilder.of();
    }

    public static ProductDeletedMessageBuilder builder(final ProductDeletedMessage template) {
        return ProductDeletedMessageBuilder.of(template);
    }

    default <T> T withProductDeletedMessage(Function<ProductDeletedMessage, T> helper) {
        return helper.apply(this);
    }
}
