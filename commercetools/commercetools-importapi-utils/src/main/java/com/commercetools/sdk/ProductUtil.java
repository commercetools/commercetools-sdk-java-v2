package com.commercetools.sdk;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.*;
import com.commercetools.importapi.models.common.*;
import com.commercetools.importapi.models.productdrafts.PriceDraftImport;
import com.commercetools.importapi.models.productdrafts.ProductDraftImport;
import com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.BooleanAttribute;
import com.commercetools.importapi.models.productvariants.NumberAttribute;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

public final class ProductUtil {

    public static ProductDraftImport toProductDraftImport(ProductProjection product) {
    var draft = ProductDraftImport.builder().key(product.getKey())
            .productType(p -> p.key(Optional.ofNullable(product.getProductType())
                            .map( ProductTypeReference::getObj).map(ProductType::getKey).orElse(null)))
            .name(l -> l.values(product.getName().values()))
            .slug(l -> l.values(product.getSlug().values()))
            .description(d -> d.values(
                    Optional.ofNullable(product.getDescription()).map(LocalizedString::values).orElse(null))) // if not null
            .categories(extractCategoryKeyReference(product))
            .metaTitle(t -> t.values(
                            Optional.ofNullable(product.getMetaTitle()).map(LocalizedString::values).orElse(null)))
            .metaDescription((com.commercetools.importapi.models.common.LocalizedString)product.getMetaDescription()) // if not null
            .metaKeywords((com.commercetools.importapi.models.common.LocalizedString) product.getMetaKeywords()) // if not null
            .masterVariant(extractProductVariantDraftImport(product.getMasterVariant()))
            .variants(extractProductVariantDraftImport(product))
            .taxCategory(t -> t.key(product.getTaxCategory().getObj().getKey()))
            .state(s -> s.key(product.getState().getObj().getKey()))
            //.priceMode(product.getPriceMode())
            .attributes(product.getAttributes().stream().map(ProductUtil::mapAttribute).collect(Collectors.toList()));
    return draft.build();
    }

    private static List<ProductVariantDraftImport> extractProductVariantDraftImport(ProductProjection product) {
        return product.getVariants().stream().map(ProductUtil::extractProductVariantDraftImport).collect(Collectors.toList());
    }

    private static ProductVariantDraftImport extractProductVariantDraftImport(ProductVariant variant) {
        return ProductVariantDraftImport.builder().key(variant.getKey()).sku(variant.getSku())
                .setImages(i -> (Image) variant.getImages())
                .prices(variant.getPrices().stream().map(p -> PriceDraftImport.builder().key(p.getKey()).value(v ->
                        (p.getValue() instanceof CentPrecisionMoney) ?
                                v.centPrecisionBuilder().centAmount(p.getValue().getCentAmount()).currencyCode(p.getValue()
                                        .getCurrencyCode()).fractionDigits(p.getValue().getFractionDigits()) :
                                v.highPrecisionBuilder().centAmount(p.getValue().getCentAmount()).currencyCode(p.getValue()
                                        .getCurrencyCode()).fractionDigits(p.getValue().getFractionDigits())
                ).build()).collect(Collectors.toList()))
                .attributes(variant.getAttributes().stream().map(
                        ProductUtil::mapAttribute).collect(Collectors.toList()))
                .assets(importAssets(variant.getAssets())).build();
    }

    private static List<com.commercetools.importapi.models.common.Asset> importAssets(List<com.commercetools.api.models.common.Asset> assets){
        return assets.stream().map(a -> com.commercetools.importapi.models.common.Asset.builder().key(a.getKey())
                .name((com.commercetools.importapi.models.common.LocalizedString)a.getName()).build()).collect(
                Collectors.toList());
    }
    private static CategoryKeyReference extractCategoryKeyReference(ProductProjection product) {
        return CategoryKeyReference.builder().key(product.getCategories().get(0).getObj().getKey()).build();
    }

    private static Attribute mapAttribute(com.commercetools.api.models.product.Attribute attribute) {
        Object value = attribute.getValue();

        if (value instanceof String) {
            return   Attribute.textBuilder().name(attribute.getName()).value((String) value).build();
        }
        if (value instanceof Integer) {
            return Attribute.numberBuilder().name(attribute.getName()).value(((Integer) value).doubleValue()).build();
        }
        if (value instanceof Boolean) {
            return Attribute.booleanBuilder().name(attribute.getName()).value((Boolean) value).build();
        }
        if (value instanceof Double) {
            return Attribute.numberBuilder().name(attribute.getName()).value(((Double) value)).build();
        }
        if (value instanceof Long) {
            return Attribute.numberBuilder().name(attribute.getName()).value(((Long) value).doubleValue()).build();
        }
        if (value instanceof LocalizedString) {
            return Attribute.ltextBuilder().name(attribute.getName()).value(l -> l.values(((LocalizedString) value).values())).build();
        }
        if (value instanceof AttributePlainEnumValue) {
            return Attribute.enumBuilder().name(attribute.getName()).value(((AttributePlainEnumValue) value).getKey()).build();
        }
        if (value instanceof AttributeLocalizedEnumValue) {
            return Attribute.enumBuilder().name(attribute.getName()).value(((AttributeLocalizedEnumValue) value).getKey()).build();
        }
        if (value instanceof Money) {
            return Attribute.moneyBuilder().name(attribute.getName()).value((TypedMoney) value).build();
        }
        if (value instanceof LocalDate) {
            return Attribute.dateBuilder().name(attribute.getName()).value((LocalDate) value).build();
        }
        if (value instanceof ZonedDateTime) {
            return Attribute.datetimeBuilder().name(attribute.getName()).value((ZonedDateTime) value).build();
        }
        if (value instanceof AttributeReferenceType) {
            return Attribute.referenceBuilder().name(attribute.getName()).value((KeyReference) value).build();
        }
        if (value instanceof AttributeReferenceTypeId) {
            return Attribute.referenceBuilder().name(attribute.getName()).value((KeyReference) value).build();
        }
        if (value instanceof AttributeConstraintEnum) {
            return Attribute.enumBuilder().name(attribute.getName()).value(
                    String.valueOf((AttributeConstraintEnum) value)).build();
        }
        if (value instanceof AttributeSetType) {
            var elementType = ((AttributeSetType) value).getElementType();
            if (elementType instanceof BooleanAttribute) {
                return Attribute.booleanSetBuilder().name(attribute.getName()).value((List<Boolean>) value).build();
            }
            if (elementType instanceof NumberAttribute) {
                return Attribute.numberSetBuilder().name(attribute.getName()).value((List<Double>) value).build();
            }
        }
        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
    }
}
