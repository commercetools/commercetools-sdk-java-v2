
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetTagsActionImpl.class)
public interface ProductSetAssetTagsAction extends ProductUpdateAction {

    String SET_ASSET_TAGS = "setAssetTags";

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

    @JsonProperty("tags")
    public List<String> getTags();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    @JsonIgnore
    public void setTags(final String... tags);

    public void setTags(final List<String> tags);

    public static ProductSetAssetTagsAction of() {
        return new ProductSetAssetTagsActionImpl();
    }

    public static ProductSetAssetTagsAction of(final ProductSetAssetTagsAction template) {
        ProductSetAssetTagsActionImpl instance = new ProductSetAssetTagsActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    public static ProductSetAssetTagsActionBuilder builder() {
        return ProductSetAssetTagsActionBuilder.of();
    }

    public static ProductSetAssetTagsActionBuilder builder(final ProductSetAssetTagsAction template) {
        return ProductSetAssetTagsActionBuilder.of(template);
    }

    default <T> T withProductSetAssetTagsAction(Function<ProductSetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }
}
