
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantDraftImpl.class)
public interface ProductVariantDraft {

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("key")
    public String getKey();

    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    public void setSku(final String sku);

    public void setKey(final String key);

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    public void setPrices(final List<PriceDraft> prices);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    @JsonIgnore
    public void setImages(final Image... images);

    public void setImages(final List<Image> images);

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    public void setAssets(final List<AssetDraft> assets);

    public static ProductVariantDraft of() {
        return new ProductVariantDraftImpl();
    }

    public static ProductVariantDraft of(final ProductVariantDraft template) {
        ProductVariantDraftImpl instance = new ProductVariantDraftImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public static ProductVariantDraftBuilder builder() {
        return ProductVariantDraftBuilder.of();
    }

    public static ProductVariantDraftBuilder builder(final ProductVariantDraft template) {
        return ProductVariantDraftBuilder.of(template);
    }

    default <T> T withProductVariantDraft(Function<ProductVariantDraft, T> helper) {
        return helper.apply(this);
    }
}
