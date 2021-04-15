
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetDescriptionActionImpl.class)
public interface ProductSetAssetDescriptionAction extends ProductUpdateAction {

    String SET_ASSET_DESCRIPTION = "setAssetDescription";

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

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setDescription(final LocalizedString description);

    public static ProductSetAssetDescriptionAction of() {
        return new ProductSetAssetDescriptionActionImpl();
    }

    public static ProductSetAssetDescriptionAction of(final ProductSetAssetDescriptionAction template) {
        ProductSetAssetDescriptionActionImpl instance = new ProductSetAssetDescriptionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ProductSetAssetDescriptionActionBuilder builder() {
        return ProductSetAssetDescriptionActionBuilder.of();
    }

    public static ProductSetAssetDescriptionActionBuilder builder(final ProductSetAssetDescriptionAction template) {
        return ProductSetAssetDescriptionActionBuilder.of(template);
    }

    default <T> T withProductSetAssetDescriptionAction(Function<ProductSetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
