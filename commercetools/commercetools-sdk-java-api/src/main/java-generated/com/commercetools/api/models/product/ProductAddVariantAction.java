
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
 * ProductAddVariantAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddVariantAction productAddVariantAction = ProductAddVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddVariantActionImpl.class)
public interface ProductAddVariantAction extends ProductUpdateAction {

    String ADD_VARIANT = "addVariant";

    /**
     *  <p>Value to set. Must be unique.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Value to set. Must be unique.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>Images for the Product Variant.</p>
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Attributes for the Product Variant.</p>
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>If <code>true</code> the new Product Variant is only staged. If <code>false</code> the new Product Variant is both current and staged.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

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
    public void setImages(final Image... images);

    public void setImages(final List<Image> images);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    public void setStaged(final Boolean staged);

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    public void setAssets(final List<AssetDraft> assets);

    public static ProductAddVariantAction of() {
        return new ProductAddVariantActionImpl();
    }

    public static ProductAddVariantAction of(final ProductAddVariantAction template) {
        ProductAddVariantActionImpl instance = new ProductAddVariantActionImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setImages(template.getImages());
        instance.setAttributes(template.getAttributes());
        instance.setStaged(template.getStaged());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public static ProductAddVariantActionBuilder builder() {
        return ProductAddVariantActionBuilder.of();
    }

    public static ProductAddVariantActionBuilder builder(final ProductAddVariantAction template) {
        return ProductAddVariantActionBuilder.of(template);
    }

    default <T> T withProductAddVariantAction(Function<ProductAddVariantAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddVariantAction>";
            }
        };
    }
}
