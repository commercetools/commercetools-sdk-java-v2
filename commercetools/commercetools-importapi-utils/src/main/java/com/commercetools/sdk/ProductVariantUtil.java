
package com.commercetools.sdk;

import static com.commercetools.sdk.CommonImportUtil.importAssets;
import static com.commercetools.sdk.ProductUtil.toImportImages;

import java.util.Optional;
import java.util.stream.Collectors;

import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.importapi.models.productvariants.ProductVariantImport;

public class ProductVariantUtil {
    public ProductVariantImport toProductVariantImport(ProductProjection product, ProductVariant variant) {
        return toProductVariantImport(product, variant, false);
    }

    public ProductVariantImport toProductVariantImport(ProductProjection product, ProductVariant variant,
            Boolean staged) {
        return ProductVariantImport.builder()
                .key(variant.getKey()) // required field
                .sku(variant.getSku())
                .isMasterVariant(variant.getId().equals(product.getMasterVariant().getId())) // required field
                .attributes(Optional.ofNullable(variant.getAttributes())
                        .map(attrs -> attrs.stream().map(ProductUtil::mapAttribute).collect(Collectors.toList()))
                        .orElse(null))
                .images(toImportImages(variant.getImages()))
                .assets(importAssets(variant.getAssets()))
                .staged(staged)
                .product(p -> p.key(product.getKey())) // required field
                .build();
    }
}
