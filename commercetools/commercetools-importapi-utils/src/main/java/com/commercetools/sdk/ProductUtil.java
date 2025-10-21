package com.commercetools.sdk;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.*;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.importapi.models.common.*;
import com.commercetools.importapi.models.productdrafts.PriceDraftImport;
import com.commercetools.importapi.models.productdrafts.ProductDraftImport;
import com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.BooleanAttribute;
import com.commercetools.importapi.models.productvariants.NumberAttribute;

public final class ProductUtil {
    private static KeyResolverService<CategoryReference> catKeyResolverService;

    public ProductUtil() {
        catKeyResolverService = new ExpandObjResolverService<>();
    }
    public static ProductDraftImport toProductDraftImport(ProductProjection product) {
        var draft = ProductDraftImport.builder()
                .key(product.getKey())
                .productType(p -> p.key(product.getProductType().getObj().getKey()))
                .name(l -> getLocalizedStringBuilder(product.getName()))
                .slug(l -> getLocalizedStringBuilder(product.getSlug()))
                .description(Optional.ofNullable(product.getDescription())
                        .map(ProductUtil::getLocalizedStringBuilder)
                        .map(LocalizedStringBuilder::build)
                        .orElse(null))
                .categories(extractCategoryKeyReference(product))
                .metaTitle(Optional.ofNullable(product.getMetaTitle())
                        .map(ProductUtil::getLocalizedStringBuilder)
                        .map(LocalizedStringBuilder::build)
                        .orElse(null))
                .metaDescription(
                    (com.commercetools.importapi.models.common.LocalizedString) product.getMetaDescription())
                .metaKeywords((com.commercetools.importapi.models.common.LocalizedString) product.getMetaKeywords())
                .masterVariant(extractProductVariantDraftImport(product.getMasterVariant()))
                .variants(extractProductVariantDraftImport(product))
                .taxCategory(getTaxCategoryKeyReference(product))
                .state(getStateKeyReference(product))
                .priceMode(mapPriceModeToImportApi(product))
                .attributes(
                    product.getAttributes().stream().map(ProductUtil::mapAttribute).collect(Collectors.toList()));
        return draft.build();
    }

    private static LocalizedStringBuilder getLocalizedStringBuilder(LocalizedString s) {
        return com.commercetools.importapi.models.common.LocalizedString.builder().values(s.values());
    }

    private static com.commercetools.importapi.models.common.ProductPriceModeEnum mapPriceModeToImportApi(
            ProductProjection product) {
        if (product.getPriceMode() == null) {
            return null;
        }
        if (product.getPriceMode().equals(ProductPriceModeEnum.ProductPriceModeEnumEnum.EMBEDDED)) {
            return com.commercetools.importapi.models.common.ProductPriceModeEnum.ProductPriceModeEnumEnum.EMBEDDED;
        }
        return com.commercetools.importapi.models.common.ProductPriceModeEnum.ProductPriceModeEnumEnum.STANDALONE;
    }

    private static StateKeyReference getStateKeyReference(ProductProjection product) {
        var key = Optional.ofNullable(product.getState()).map(StateReference::getObj).map(State::getKey).orElse(null);
        if (key != null) {
            return StateKeyReference.builder().key(key).build();
        }
        return null;
    }

    private static TaxCategoryKeyReference getTaxCategoryKeyReference(ProductProjection product) {
        var key = Optional.ofNullable(product.getTaxCategory())
                .map(TaxCategoryReference::getObj)
                .map(TaxCategory::getKey)
                .orElse(null);
        if (key != null) {
            return TaxCategoryKeyReference.builder().key(key).build();
        }
        return null;
    }

    private static List<ProductVariantDraftImport> extractProductVariantDraftImport(ProductProjection product) {
        return product.getVariants()
                .stream()
                .map(ProductUtil::extractProductVariantDraftImport)
                .collect(Collectors.toList());
    }

    private static ProductVariantDraftImport extractProductVariantDraftImport(ProductVariant variant) {
        return ProductVariantDraftImport.builder()
                .key(variant.getKey())
                .sku(variant.getSku())
                .images(variant.getImages()
                        .stream()
                        .map(i -> com.commercetools.importapi.models.common.Image.builder()
                                .dimensions(d -> com.commercetools.importapi.models.common.AssetDimensions.builder()
                                        .w(i.getDimensions().getW())
                                        .h(i.getDimensions().getH()))
                                .url(i.getUrl())
                                .label(i.getLabel())
                                .build())
                        .collect(Collectors.toList()))
                .prices(mapPricesToImportApi(variant))
                .attributes(
                    variant.getAttributes().stream().map(ProductUtil::mapAttribute).collect(Collectors.toList()))
                .assets(importAssets(variant.getAssets()))
                .build();
    }

    private static List<PriceDraftImport> mapPricesToImportApi(ProductVariant variant) {
        return variant.getPrices()
                .stream()
                .map(p -> PriceDraftImport.builder()
                        .key(p.getKey())
                        .value(v -> (p.getValue() instanceof CentPrecisionMoney)
                                ? v.centPrecisionBuilder()
                                        .centAmount(p.getValue().getCentAmount())
                                        .currencyCode(p.getValue().getCurrencyCode())
                                        .fractionDigits(p.getValue().getFractionDigits())
                                : v.highPrecisionBuilder()
                                        .centAmount(p.getValue().getCentAmount())
                                        .currencyCode(p.getValue().getCurrencyCode())
                                        .fractionDigits(p.getValue().getFractionDigits()))
                        .build())
                .collect(Collectors.toList());
    }

    private static List<com.commercetools.importapi.models.common.Asset> importAssets(
            List<com.commercetools.api.models.common.Asset> assets) {
        if (assets == null) {
            return null;
        }
        return assets.stream()
                .map(a -> com.commercetools.importapi.models.common.Asset.builder()
                        .key(a.getKey())
                        .name(getLocalizedStringBuilder(a.getName()).build())
                        .build())
                .collect(Collectors.toList());
    }

    private static List<CategoryKeyReference> extractCategoryKeyReference(ProductProjection product) {
        return product.getCategories()
                .stream()
                .map(c -> CategoryKeyReference.builder().key(catKeyResolverService.resolveKey(c)).build())
                .collect(Collectors.toList());
    }

    private static Attribute mapAttribute(com.commercetools.api.models.product.Attribute attribute) {
        Object value = attribute.getValue();

        if (value instanceof String) {
            return Attribute.textBuilder().name(attribute.getName()).value((String) value).build();
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
            return Attribute.ltextBuilder()
                    .name(attribute.getName())
                    .value(getLocalizedStringBuilder(((LocalizedString) value)).build())
                    .build();
        }
        if (value instanceof AttributePlainEnumValue) {
            return Attribute.enumBuilder()
                    .name(attribute.getName())
                    .value(((AttributePlainEnumValue) value).getKey())
                    .build();
        }
        if (value instanceof AttributeLocalizedEnumValue) {
            return Attribute.enumBuilder()
                    .name(attribute.getName())
                    .value(((AttributeLocalizedEnumValue) value).getKey())
                    .build();
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
            return Attribute.enumBuilder()
                    .name(attribute.getName())
                    .value(String.valueOf((AttributeConstraintEnum) value))
                    .build();
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
