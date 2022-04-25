
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetSourcesActionImpl.class)
public interface ProductSetAssetSourcesAction extends ProductUpdateAction {

    String SET_ASSET_SOURCES = "setAssetSources";

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

    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    public void setSources(final List<AssetSource> sources);

    public static ProductSetAssetSourcesAction of() {
        return new ProductSetAssetSourcesActionImpl();
    }

    public static ProductSetAssetSourcesAction of(final ProductSetAssetSourcesAction template) {
        ProductSetAssetSourcesActionImpl instance = new ProductSetAssetSourcesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(template.getSources());
        return instance;
    }

    public static ProductSetAssetSourcesActionBuilder builder() {
        return ProductSetAssetSourcesActionBuilder.of();
    }

    public static ProductSetAssetSourcesActionBuilder builder(final ProductSetAssetSourcesAction template) {
        return ProductSetAssetSourcesActionBuilder.of(template);
    }

    default <T> T withProductSetAssetSourcesAction(Function<ProductSetAssetSourcesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetSourcesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetSourcesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetSourcesAction>";
            }
        };
    }
}
