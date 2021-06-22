
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemProductVariantImportDraftImpl.class)
public interface LineItemProductVariantImportDraft {

    /**
    *  <p>Maps to <code>ProductVariant.product</code>.</p>
    */
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.sku</code>.</p>
    */

    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
    */
    @Valid
    @JsonProperty("prices")
    public List<LineItemPrice> getPrices();

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
    */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
    */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    public void setProduct(final ProductKeyReference product);

    public void setSku(final String sku);

    @JsonIgnore
    public void setPrices(final LineItemPrice... prices);

    public void setPrices(final List<LineItemPrice> prices);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    @JsonIgnore
    public void setImages(final Image... images);

    public void setImages(final List<Image> images);

    public static LineItemProductVariantImportDraft of() {
        return new LineItemProductVariantImportDraftImpl();
    }

    public static LineItemProductVariantImportDraft of(final LineItemProductVariantImportDraft template) {
        LineItemProductVariantImportDraftImpl instance = new LineItemProductVariantImportDraftImpl();
        instance.setProduct(template.getProduct());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        return instance;
    }

    public static LineItemProductVariantImportDraftBuilder builder() {
        return LineItemProductVariantImportDraftBuilder.of();
    }

    public static LineItemProductVariantImportDraftBuilder builder(final LineItemProductVariantImportDraft template) {
        return LineItemProductVariantImportDraftBuilder.of(template);
    }

    default <T> T withLineItemProductVariantImportDraft(Function<LineItemProductVariantImportDraft, T> helper) {
        return helper.apply(this);
    }
}
