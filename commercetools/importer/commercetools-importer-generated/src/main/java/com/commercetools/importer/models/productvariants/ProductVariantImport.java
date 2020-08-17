package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.Asset;
import com.commercetools.importer.models.common.Image;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.ProductVariantImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Import representation for a product variant. Use this type for importing new product variants
*  into a commercetools project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
    *  <p>Set product Published field to <code>true</code> if there were no updates.
    *  If there were Updates, only the updates will be published to <code>staged</code> and <code>current</code> projection.</p>
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
    
    public void setAttributes(final List<Attribute> attributes);
    
    public void setImages(final List<Image> images);
    
    public void setAssets(final List<Asset> assets);
    
    public void setPublish(final Boolean publish);
    
    public void setProduct(final ProductKeyReference product);

    public static ProductVariantImportImpl of(){
        return new ProductVariantImportImpl();
    }
    

    public static ProductVariantImportImpl of(final ProductVariantImport template) {
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

}
