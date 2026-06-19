package com.commercetools.sdk;

import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.importapi.models.productvariants.ProductVariantImport;

import java.util.stream.Collectors;

import static com.commercetools.sdk.CommonImportUtil.importAssets;
import static com.commercetools.sdk.ProductUtil.toImportImages;

public class ProductVariantUtil {
    public ProductVariantImport toProductVariantImport(ProductProjection product, ProductVariant variant, String productKey) {
        return ProductVariantImport.builder()
                .key(variant.getKey()) // required field
                .sku(variant.getSku())
                .isMasterVariant(variant.getId().equals(product.getMasterVariant().getId())) // required field
                .attributes(variant.getAttributes().stream()
                        .map(ProductUtil::mapAttribute)
                        .collect(Collectors.toList()))
                .images(toImportImages(variant.getImages()))
                .assets(importAssets(variant.getAssets()))
                .product(p -> p.key(productKey)) // required field
                .build();
    }
}
