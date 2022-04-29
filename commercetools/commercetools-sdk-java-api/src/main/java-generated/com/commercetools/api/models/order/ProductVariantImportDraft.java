
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantImportDraftImpl.class)
public interface ProductVariantImportDraft {

    /**
    *  <p>The sequential ID of the variant within the product.
    *  The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set,
    *  or alternatively you can just specify SKU of the product variant.</p>
    */

    @JsonProperty("id")
    public Long getId();

    /**
    *  <p>The SKU of the existing variant.</p>
    */

    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>The prices of the variant.
    *  The prices should not contain two prices for the same price scope (same currency, country and customer group).
    *  If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
    */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
    *  <p>If this property is defined, then it will override the <code>attributes</code> property from the original
    *  product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
    */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
    *  <p>If this property is defined, then it will override the <code>images</code> property from the original
    *  product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
    */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    public void setId(final Long id);

    public void setSku(final String sku);

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    public void setPrices(final List<PriceDraft> prices);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    @JsonIgnore
    public void setImages(final Image... images);

    public void setImages(final List<Image> images);

    public static ProductVariantImportDraft of() {
        return new ProductVariantImportDraftImpl();
    }

    public static ProductVariantImportDraft of(final ProductVariantImportDraft template) {
        ProductVariantImportDraftImpl instance = new ProductVariantImportDraftImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        return instance;
    }

    public static ProductVariantImportDraftBuilder builder() {
        return ProductVariantImportDraftBuilder.of();
    }

    public static ProductVariantImportDraftBuilder builder(final ProductVariantImportDraft template) {
        return ProductVariantImportDraftBuilder.of(template);
    }

    default <T> T withProductVariantImportDraft(Function<ProductVariantImportDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantImportDraft>";
            }
        };
    }
}
