
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Import representation for a product variant. Use this type for importing new product variants
*  into a commercetools project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantImportImpl.class)
public interface ProductVariantImport extends ImportResource {

    /**
    *  <p>Maps to <code>ProductVariant.sku</code>.</p>
    */

    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>Maps to <code>ProductVariant.isMasterVariant</code>.</p>
    */
    @NotNull
    @JsonProperty("isMasterVariant")
    public Boolean getIsMasterVariant();

    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
    *  <p>Each attribute referenced must be defined
    *  in an already existing product type in the commercetools project, or the import
    *  operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
    *  <p>Maps to <code>ProductVariant.images</code>.</p>
    */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
    *  <p>Maps to <code>ProductVariant.assets</code>.</p>
    */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
    *  <p>If there were updates, only the updates will be published to <code>staged</code> and <code>current</code> projection.</p>
    */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
    *  <p>The product in which this product variant is contained. Maps to <code>ProductVariant.product</code>.</p>
    *  <p>The product referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    public void setSku(final String sku);

    public void setIsMasterVariant(final Boolean isMasterVariant);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    @JsonIgnore
    public void setImages(final Image... images);

    public void setImages(final List<Image> images);

    @JsonIgnore
    public void setAssets(final Asset... assets);

    public void setAssets(final List<Asset> assets);

    public void setPublish(final Boolean publish);

    public void setProduct(final ProductKeyReference product);

    public static ProductVariantImport of() {
        return new ProductVariantImportImpl();
    }

    public static ProductVariantImport of(final ProductVariantImport template) {
        ProductVariantImportImpl instance = new ProductVariantImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setIsMasterVariant(template.getIsMasterVariant());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setPublish(template.getPublish());
        instance.setProduct(template.getProduct());
        return instance;
    }

    public static ProductVariantImportBuilder builder() {
        return ProductVariantImportBuilder.of();
    }

    public static ProductVariantImportBuilder builder(final ProductVariantImport template) {
        return ProductVariantImportBuilder.of(template);
    }

    default <T> T withProductVariantImport(Function<ProductVariantImport, T> helper) {
        return helper.apply(this);
    }
}
