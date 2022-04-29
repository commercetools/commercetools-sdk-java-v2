
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductAddAssetActionImpl.class)
public interface ProductAddAssetAction extends ProductUpdateAction {

    String ADD_ASSET = "addAsset";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("staged")
    public Boolean getStaged();

    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetDraft getAsset();

    /**
    *  <p>Position of the new asset inside the existing list (from <code>0</code> to the size of the list)</p>
    */

    @JsonProperty("position")
    public Integer getPosition();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAsset(final AssetDraft asset);

    public void setPosition(final Integer position);

    public static ProductAddAssetAction of() {
        return new ProductAddAssetActionImpl();
    }

    public static ProductAddAssetAction of(final ProductAddAssetAction template) {
        ProductAddAssetActionImpl instance = new ProductAddAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAsset(template.getAsset());
        instance.setPosition(template.getPosition());
        return instance;
    }

    public static ProductAddAssetActionBuilder builder() {
        return ProductAddAssetActionBuilder.of();
    }

    public static ProductAddAssetActionBuilder builder(final ProductAddAssetAction template) {
        return ProductAddAssetActionBuilder.of(template);
    }

    default <T> T withProductAddAssetAction(Function<ProductAddAssetAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddAssetAction>";
            }
        };
    }
}
