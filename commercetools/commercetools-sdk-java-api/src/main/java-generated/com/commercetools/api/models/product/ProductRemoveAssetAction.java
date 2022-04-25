
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRemoveAssetActionImpl.class)
public interface ProductRemoveAssetAction extends ProductUpdateAction {

    String REMOVE_ASSET = "removeAsset";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("staged")
    public Boolean getStaged();

    @JsonProperty("assetId")
    public String getAssetId();

    @JsonProperty("assetKey")
    public String getAssetKey();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public static ProductRemoveAssetAction of() {
        return new ProductRemoveAssetActionImpl();
    }

    public static ProductRemoveAssetAction of(final ProductRemoveAssetAction template) {
        ProductRemoveAssetActionImpl instance = new ProductRemoveAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public static ProductRemoveAssetActionBuilder builder() {
        return ProductRemoveAssetActionBuilder.of();
    }

    public static ProductRemoveAssetActionBuilder builder(final ProductRemoveAssetAction template) {
        return ProductRemoveAssetActionBuilder.of(template);
    }

    default <T> T withProductRemoveAssetAction(Function<ProductRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveAssetAction>";
            }
        };
    }
}
