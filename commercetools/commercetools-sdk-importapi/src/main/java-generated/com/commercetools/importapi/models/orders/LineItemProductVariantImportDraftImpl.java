package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.orders.LineItemPrice;
import com.commercetools.importapi.models.productvariants.Attribute;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemProductVariantImportDraftImpl implements LineItemProductVariantImportDraft {

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    private String sku;

    private java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    private java.util.List<com.commercetools.importapi.models.common.Image> images;

    @JsonCreator
    LineItemProductVariantImportDraftImpl(@JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product, @JsonProperty("sku") final String sku, @JsonProperty("prices") final java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices, @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes, @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images) {
        this.product = product;
        this.sku = sku;
        this.prices = prices;
        this.attributes = attributes;
        this.images = images;
    }
    public LineItemProductVariantImportDraftImpl() {

    }

    /**
    *  <p>Maps to <code>ProductVariant.product</code>.</p>
    */
    public com.commercetools.importapi.models.common.ProductKeyReference getProduct(){
        return this.product;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.sku</code>.</p>
    */
    public String getSku(){
        return this.sku;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
    */
    public java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> getPrices(){
        return this.prices;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
    */
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes(){
        return this.attributes;
    }

    /**
    *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages(){
        return this.images;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product){
        this.product = product;
    }

    public void setSku(final String sku){
        this.sku = sku;
    }

    public void setPrices(final java.util.List<com.commercetools.importapi.models.orders.LineItemPrice> prices){
        this.prices = prices;
    }

    public void setAttributes(final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes){
        this.attributes = attributes;
    }

    public void setImages(final java.util.List<com.commercetools.importapi.models.common.Image> images){
        this.images = images;
    }

}
