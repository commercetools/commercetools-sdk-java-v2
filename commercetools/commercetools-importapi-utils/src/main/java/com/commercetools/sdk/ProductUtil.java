
package com.commercetools.sdk;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

import com.commercetools.api.models.cart.CartReferenceImpl;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.category.CategoryReferenceImpl;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductReferenceImpl;
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
import com.commercetools.importapi.models.productvariants.DateTimeAttribute;
import com.commercetools.importapi.models.productvariants.NumberAttribute;
import io.vrap.rmf.base.client.Builder;

public final class ProductUtil {
    private static KeyResolverService keyResolverService= new ExpandObjResolverService();

    public static ProductDraftImport toProductDraftImport(ProductProjection product) {
        var draft = ProductDraftImport.builder()
                .key(product.getKey())
                .productType(p -> p.key(keyResolverService.resolveKey(product.getProductType())))
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
        var key = keyResolverService.resolveKey(product.getState());
        if (key != null) {
            return StateKeyReference.builder().key(key).build();
        }
        return null;
    }

    private static TaxCategoryKeyReference getTaxCategoryKeyReference(ProductProjection product) {
        var key = keyResolverService.resolveKey(product.getTaxCategory());
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
                        .value(v -> importApiTypedMoney(p.getValue(), v))
                        .build())
                .collect(Collectors.toList());
    }

    private static Builder<? extends TypedMoney> importApiTypedMoney(
            com.commercetools.api.models.common.TypedMoney p, TypedMoneyBuilder v) {
        return (p instanceof HighPrecisionMoney) ?
                v.highPrecisionBuilder()
                        .centAmount(p.getCentAmount())
                        .currencyCode(p.getCurrencyCode())
                        .preciseAmount(((com.commercetools.api.models.common.HighPrecisionMoney)p).getPreciseAmount()) :
                v.centPrecisionBuilder()
                        .centAmount(p.getCentAmount())
                        .currencyCode(p.getCurrencyCode())
                        .fractionDigits(p.getFractionDigits());
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
                .map(c -> CategoryKeyReference.builder().key(keyResolverService.resolveKey(c)).build())
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
            return Attribute.moneyBuilder().name(attribute.getName()).value((v -> importApiTypedMoney(
                    (com.commercetools.api.models.common.TypedMoney) value, v))).build();
        }
        if (value instanceof LocalDate) {
            return Attribute.dateBuilder().name(attribute.getName()).value((LocalDate) value).build();
        }
        if (value instanceof ZonedDateTime) {
            return Attribute.datetimeBuilder().name(attribute.getName()).value((ZonedDateTime) value).build();
        }
        if (value instanceof LocalTime) {
            return Attribute.timeBuilder().name(attribute.getName()).value((LocalTime) value).build();
        }
        if (value instanceof AttributeConstraintEnum) {
            return Attribute.enumBuilder()
                    .name(attribute.getName())
                    .value(String.valueOf((AttributeConstraintEnum) value))
                    .build();
        }
        if (value instanceof ArrayList) {
            var list = (ArrayList<?>) value;
            if (list.isEmpty()) {
                return Attribute.textSetBuilder().value().build();
            }
            if (list.get(0) instanceof LocalDate) {
                return Attribute.dateSetBuilder().name(attribute.getName()).value((ArrayList<LocalDate>) list).build();
            }
            if (list.get(0) instanceof ZonedDateTime) {
                return Attribute.datetimeSetBuilder().name(attribute.getName()).value((ArrayList<ZonedDateTime>) list).build();
            }
            if (list.get(0) instanceof LocalTime) {
                return Attribute.timeSetBuilder().name(attribute.getName()).value((ArrayList<LocalTime>) list).build();
            }
            if (list.get(0) instanceof String) {
                return Attribute.textSetBuilder().name(attribute.getName()).value((ArrayList<String>) list).build();
            }
            if (list.get(0) instanceof Integer) {
                return Attribute.numberSetBuilder().name(attribute.getName()).value((ArrayList<Double>) list).build();
            }
            if (list.get(0) instanceof Long) {
                return Attribute.numberSetBuilder().name(attribute.getName()).value((ArrayList<Double>) list).build();
            }
            if (list.get(0) instanceof Boolean) {
                return Attribute.booleanSetBuilder().name(attribute.getName()).value((ArrayList<Boolean>) list).build();
            }
            if (list.get(0) instanceof Double) {
                return Attribute.numberSetBuilder().name(attribute.getName()).value((ArrayList<Double>) list).build();
            }
            if (list.get(0) instanceof LocalizedString) {
                return Attribute.ltextSetBuilder()
                        .name(attribute.getName())
                        .value(list.stream().map(v -> getLocalizedStringBuilder(((LocalizedString) v)).build()).collect(
                                Collectors.toList()))
                        .build();
            }
            if (list.get(0) instanceof AttributePlainEnumValue) {
                return Attribute.enumSetBuilder()
                        .name(attribute.getName())
                        .value(((ArrayList<AttributePlainEnumValue>) list).stream().map(AttributePlainEnumValue::getKey).collect(
                                Collectors.toList()))
                        .build();
            }
            if (list.get(0) instanceof AttributeLocalizedEnumValue) {
                return Attribute.enumSetBuilder()
                        .name(attribute.getName())
                        .value(((ArrayList<AttributeLocalizedEnumValue>) list).stream().map(AttributeLocalizedEnumValue::getKey).collect(
                                Collectors.toList()))
                        .build();
            }
            if (list.get(0) instanceof Money) {
                return Attribute.moneySetBuilder().name(attribute.getName()).value(
                        list.stream().map(v -> importApiTypedMoney((
                                com.commercetools.api.models.common.TypedMoney)v, new TypedMoneyBuilder()).build()).collect(Collectors.toList())).build();
            }
        }
        if (value instanceof ProductReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.productBuilder().key (((ProductReferenceImpl) value).getObj().getKey())).build();
        }
        if (value instanceof ProductTypeReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.productTypeBuilder().key (((ProductTypeReferenceImpl) value).getObj().getKey())).build();
        }
        if (value instanceof CartReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.cartBuilder().key (((CartReferenceImpl) value).getObj().getKey())).build();
        }
        if (value instanceof BusinessUnitKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.businessUnitBuilder().key (((BusinessUnitKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof CategoryReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.categoryBuilder().key (((CategoryReferenceImpl) value).getObj().getKey())).build();
        }
        if (value instanceof ChannelKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.channelBuilder().key (((ChannelKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof CustomerKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.customerBuilder().key (((CustomerKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof AssociateRoleKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.associateRoleBuilder().key (((AssociateRoleKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof DiscountCodeKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.discountCodeBuilder().key (((DiscountCodeKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof CustomerGroupKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.customerGroupBuilder().key (((CustomerGroupKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof OrderKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.orderBuilder().key (((OrderKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof ShippingMethodKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.shippingMethodBuilder().key (((ShippingMethodKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof StateKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.stateBuilder().key (((StateKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof TaxCategoryKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.taxCategoryBuilder().key (((TaxCategoryKeyReferenceImpl) value).getKey())).build();
        }
        if (value instanceof  CustomObjectKeyReferenceImpl) {
            return Attribute.referenceBuilder().name(attribute.getName()).value(r -> r.keyValueDocumentBuilder().key (((CustomObjectKeyReferenceImpl) value).getKey())).build();
        }
        /* TODO: AttributeNestedType */
        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
    }
}
