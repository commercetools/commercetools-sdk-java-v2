
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

/**
 *  <p>Creates a Product Variant when included in the <code>masterVariant</code> and <code>variants</code> fields of the ProductDraft.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDraft productVariantDraft = ProductVariantDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantDraftImpl.class)
public interface ProductVariantDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ProductVariantDraft> {

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Images for the Product Variant.</p>
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Media assets for the Product Variant.</p>
     */
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

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantDraft>";
            }
        };
    }
}
