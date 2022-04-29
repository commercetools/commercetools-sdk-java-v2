
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRemoveImageActionImpl.class)
public interface ProductRemoveImageAction extends ProductUpdateAction {

    String REMOVE_IMAGE = "removeImage";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>The URL of the image.</p>
    */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setImageUrl(final String imageUrl);

    public void setStaged(final Boolean staged);

    public static ProductRemoveImageAction of() {
        return new ProductRemoveImageActionImpl();
    }

    public static ProductRemoveImageAction of(final ProductRemoveImageAction template) {
        ProductRemoveImageActionImpl instance = new ProductRemoveImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemoveImageActionBuilder builder() {
        return ProductRemoveImageActionBuilder.of();
    }

    public static ProductRemoveImageActionBuilder builder(final ProductRemoveImageAction template) {
        return ProductRemoveImageActionBuilder.of(template);
    }

    default <T> T withProductRemoveImageAction(Function<ProductRemoveImageAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveImageAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveImageAction>";
            }
        };
    }
}
