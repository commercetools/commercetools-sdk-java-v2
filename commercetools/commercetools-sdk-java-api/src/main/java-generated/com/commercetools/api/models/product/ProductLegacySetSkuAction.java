
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductLegacySetSkuActionImpl;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductLegacySetSkuActionImpl.class)
public interface ProductLegacySetSkuAction extends ProductUpdateAction {

    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    public void setSku(final String sku);

    public void setVariantId(final Integer variantId);

    public static ProductLegacySetSkuAction of() {
        return new ProductLegacySetSkuActionImpl();
    }

    public static ProductLegacySetSkuAction of(final ProductLegacySetSkuAction template) {
        ProductLegacySetSkuActionImpl instance = new ProductLegacySetSkuActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    public static ProductLegacySetSkuActionBuilder builder() {
        return ProductLegacySetSkuActionBuilder.of();
    }

    public static ProductLegacySetSkuActionBuilder builder(final ProductLegacySetSkuAction template) {
        return ProductLegacySetSkuActionBuilder.of(template);
    }

    default <T> T withProductLegacySetSkuAction(Function<ProductLegacySetSkuAction, T> helper) {
        return helper.apply(this);
    }
}
