package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.productvariants.Attributes;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantPatchBuilder {


    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;


    private com.commercetools.importapi.models.common.ProductKeyReference product;

    @Nullable
    private com.commercetools.importapi.models.productvariants.Attributes attributes;

    public ProductVariantPatchBuilder productVariant( final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

    public ProductVariantPatchBuilder product( final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    public ProductVariantPatchBuilder attributes(@Nullable final com.commercetools.importapi.models.productvariants.Attributes attributes) {
        this.attributes = attributes;
        return this;
    }


    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant(){
        return this.productVariant;
    }


    public com.commercetools.importapi.models.common.ProductKeyReference getProduct(){
        return this.product;
    }

    @Nullable
    public com.commercetools.importapi.models.productvariants.Attributes getAttributes(){
        return this.attributes;
    }

    public ProductVariantPatch build() {
        return new ProductVariantPatchImpl(productVariant, product, attributes);
    }

    public static ProductVariantPatchBuilder of() {
        return new ProductVariantPatchBuilder();
    }

    public static ProductVariantPatchBuilder of(final ProductVariantPatch template) {
        ProductVariantPatchBuilder builder = new ProductVariantPatchBuilder();
        builder.productVariant = template.getProductVariant();
        builder.product = template.getProduct();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
