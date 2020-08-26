package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.common.Image;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.orders.LineItemPrice;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.orders.LineItemProductVariantImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemProductVariantImportDraftBuilder {

    @Nullable
    private com.commercetools.importer.models.common.ProductKeyReference product;
    
    @Nullable
    private String sku;
    
    @Nullable
    private java.util.List<com.commercetools.importer.models.orders.LineItemPrice> prices;
    
    @Nullable
    private java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes;
    
    @Nullable
    private java.util.List<com.commercetools.importer.models.common.Image> images;

    public LineItemProductVariantImportDraftBuilder product(@Nullable final com.commercetools.importer.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }
    
    public LineItemProductVariantImportDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    public LineItemProductVariantImportDraftBuilder prices(@Nullable final java.util.List<com.commercetools.importer.models.orders.LineItemPrice> prices) {
        this.prices = prices;
        return this;
    }
    
    public LineItemProductVariantImportDraftBuilder attributes(@Nullable final java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }
    
    public LineItemProductVariantImportDraftBuilder images(@Nullable final java.util.List<com.commercetools.importer.models.common.Image> images) {
        this.images = images;
        return this;
    }

    @Nullable
    public com.commercetools.importer.models.common.ProductKeyReference getProduct(){
        return this.product;
    }
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    @Nullable
    public java.util.List<com.commercetools.importer.models.orders.LineItemPrice> getPrices(){
        return this.prices;
    }
    
    @Nullable
    public java.util.List<com.commercetools.importer.models.productvariants.Attribute> getAttributes(){
        return this.attributes;
    }
    
    @Nullable
    public java.util.List<com.commercetools.importer.models.common.Image> getImages(){
        return this.images;
    }

    public LineItemProductVariantImportDraft build() {
        return new LineItemProductVariantImportDraftImpl(product, sku, prices, attributes, images);
    }

    public static LineItemProductVariantImportDraftBuilder of() {
        return new LineItemProductVariantImportDraftBuilder();
    }

    public static LineItemProductVariantImportDraftBuilder of(final LineItemProductVariantImportDraft template) {
        LineItemProductVariantImportDraftBuilder builder = new LineItemProductVariantImportDraftBuilder();
        builder.product = template.getProduct();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        builder.images = template.getImages();
        return builder;
    }

}
