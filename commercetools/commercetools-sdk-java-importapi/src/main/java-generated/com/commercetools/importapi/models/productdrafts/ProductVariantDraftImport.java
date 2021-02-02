
package com.commercetools.importapi.models.productdrafts;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantDraftImportImpl.class)
public interface ProductVariantDraftImport {

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("key")
    public String getKey();

    @Valid
    @JsonProperty("prices")
    public List<PriceDraftImport> getPrices();

    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    public void setSku(final String sku);

    public void setKey(final String key);

    @JsonIgnore
    public void setPrices(final PriceDraftImport... prices);

    public void setPrices(final List<PriceDraftImport> prices);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    @JsonIgnore
    public void setImages(final Image... images);

    public void setImages(final List<Image> images);

    @JsonIgnore
    public void setAssets(final Asset... assets);

    public void setAssets(final List<Asset> assets);

    public static ProductVariantDraftImport of() {
        return new ProductVariantDraftImportImpl();
    }

    public static ProductVariantDraftImport of(final ProductVariantDraftImport template) {
        ProductVariantDraftImportImpl instance = new ProductVariantDraftImportImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public static ProductVariantDraftImportBuilder builder() {
        return ProductVariantDraftImportBuilder.of();
    }

    public static ProductVariantDraftImportBuilder builder(final ProductVariantDraftImport template) {
        return ProductVariantDraftImportBuilder.of(template);
    }

    default <T> T withProductVariantDraftImport(Function<ProductVariantDraftImport, T> helper) {
        return helper.apply(this);
    }
}
