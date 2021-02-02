
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductChangeAssetNameActionImpl.class)
public interface ProductChangeAssetNameAction extends ProductUpdateAction {

    String CHANGE_ASSET_NAME = "changeAssetName";

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
    @JsonProperty("name")
    public LocalizedString getName();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setName(final LocalizedString name);

    public static ProductChangeAssetNameAction of() {
        return new ProductChangeAssetNameActionImpl();
    }

    public static ProductChangeAssetNameAction of(final ProductChangeAssetNameAction template) {
        ProductChangeAssetNameActionImpl instance = new ProductChangeAssetNameActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        return instance;
    }

    public static ProductChangeAssetNameActionBuilder builder() {
        return ProductChangeAssetNameActionBuilder.of();
    }

    public static ProductChangeAssetNameActionBuilder builder(final ProductChangeAssetNameAction template) {
        return ProductChangeAssetNameActionBuilder.of(template);
    }

    default <T> T withProductChangeAssetNameAction(Function<ProductChangeAssetNameAction, T> helper) {
        return helper.apply(this);
    }
}
