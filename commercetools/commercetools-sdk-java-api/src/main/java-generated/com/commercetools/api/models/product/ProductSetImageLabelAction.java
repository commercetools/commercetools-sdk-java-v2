
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetImageLabelActionImpl.class)
public interface ProductSetImageLabelAction extends ProductUpdateAction {

    String SET_IMAGE_LABEL = "setImageLabel";

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
    *  <p>The URL of the image.</p>
    */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
    *  <p>The new image label.
    *  If left blank or set to null, the label is removed.</p>
    */

    @JsonProperty("label")
    public String getLabel();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setSku(final String sku);

    public void setVariantId(final Long variantId);

    public void setImageUrl(final String imageUrl);

    public void setLabel(final String label);

    public void setStaged(final Boolean staged);

    public static ProductSetImageLabelAction of() {
        return new ProductSetImageLabelActionImpl();
    }

    public static ProductSetImageLabelAction of(final ProductSetImageLabelAction template) {
        ProductSetImageLabelActionImpl instance = new ProductSetImageLabelActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetImageLabelActionBuilder builder() {
        return ProductSetImageLabelActionBuilder.of();
    }

    public static ProductSetImageLabelActionBuilder builder(final ProductSetImageLabelAction template) {
        return ProductSetImageLabelActionBuilder.of(template);
    }

    default <T> T withProductSetImageLabelAction(Function<ProductSetImageLabelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetImageLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetImageLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetImageLabelAction>";
            }
        };
    }
}
