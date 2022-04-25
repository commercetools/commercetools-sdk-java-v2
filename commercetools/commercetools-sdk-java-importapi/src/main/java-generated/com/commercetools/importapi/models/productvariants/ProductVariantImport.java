
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
*  <p>The data representation for a ProductVariant to be imported that is persisted as a <a href="/../api/projects/products#productvariant">ProductVariant</a> in the Project.</p>
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
    *  <p>Maps to <code>ProductVariant.attributes</code>.
    *  The referenced attribute must be defined in an already existing ProductType in the commercetools project, or the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be <code>unresolved</code>.</p>
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
    *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data.
    *  If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged.
    *  However, if the import data contains no update, that is, if it matches the staged projection of the existing Product in the platform, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
    */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
    *  <p>The <a href="/../api/projects/products#productvariant">Product</a> to which this Product Variant belongs. Maps to <code>ProductVariant.product</code>.
    *  The Reference to the <a href="/../api/projects/products#product">Product</a> with which the ProductVariant is associated.
    *  If referenced Product does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Product is created.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantImport>";
            }
        };
    }
}
