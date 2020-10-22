package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.orders.LineItemPrice;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LineItemProductVariantImportDraftImpl.class)
public interface LineItemProductVariantImportDraft  {

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
    
    public void setPrices(final List<LineItemPrice> prices);
    
    public void setAttributes(final List<Attribute> attributes);
    
    public void setImages(final List<Image> images);

    public static LineItemProductVariantImportDraftImpl of(){
        return new LineItemProductVariantImportDraftImpl();
    }
    

    public static LineItemProductVariantImportDraftImpl of(final LineItemProductVariantImportDraft template) {
        LineItemProductVariantImportDraftImpl instance = new LineItemProductVariantImportDraftImpl();
        instance.setProduct(template.getProduct());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        return instance;
    }

    default <T extends Accessor<LineItemProductVariantImportDraft>> T withLineItemProductVariantImportDraft(Function<LineItemProductVariantImportDraft, T> helper) {
        return helper.apply(this);
    }
}
