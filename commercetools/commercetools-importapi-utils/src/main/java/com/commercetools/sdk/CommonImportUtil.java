
package com.commercetools.sdk;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.importapi.models.common.*;
import com.commercetools.importapi.models.customfields.CustomField;

import io.vrap.rmf.base.client.Builder;

public class CommonImportUtil {

    private final KeyResolverService keyResolverService;
    public CommonImportUtil() {
        keyResolverService = new ExpandObjResolverService();
    }

    public CommonImportUtil(final KeyResolverService resolverService) {
        keyResolverService = resolverService;
    }

    public static LocalizedStringBuilder getLocalizedStringBuilder(LocalizedString s) {
        return com.commercetools.importapi.models.common.LocalizedString.builder().values(s.values());
    }

    public List<Asset> importAssets(List<com.commercetools.api.models.common.Asset> assets) {
        if (assets == null) {
            return null;
        }
        return assets.stream()
                .map(a -> com.commercetools.importapi.models.common.Asset.builder()
                        .key(a.getKey())
                        .name(getLocalizedStringBuilder(a.getName()).build()) // required field
                        .sources(getImportSources(a.getSources())) // required field
                        .description(Optional.ofNullable(a.getDescription())
                                .map(CommonImportUtil::getLocalizedStringBuilder)
                                .map(LocalizedStringBuilder::build)
                                .orElse(null))
                        .tags(a.getTags())
                        .custom(getImportApiCustom(a.getCustom()))
                        .build())
                .collect(Collectors.toList());
    }

    private List<AssetSource> getImportSources(List<com.commercetools.api.models.common.AssetSource> sources) {
        return sources.stream()
                .map(s -> AssetSource.builder()
                        .key(s.getKey())
                        .uri(s.getUri())
                        .dimensions(toImportAssetDimntions(s.getDimensions()))
                        .contentType(s.getContentType())
                        .build())
                .collect(Collectors.toList());
    }

    private AssetDimensions toImportAssetDimntions(com.commercetools.api.models.common.AssetDimensions dimensions) {
        if (dimensions == null) {
            return null;
        }
        return AssetDimensions.builder().w(dimensions.getW()).h(dimensions.getH()).build();
    }

    public static Builder<? extends TypedMoney> importApiTypedMoney(com.commercetools.api.models.common.TypedMoney p,
            TypedMoneyBuilder v) {
        return (p instanceof HighPrecisionMoney highPrecisionMoney)
                ? v.highPrecisionBuilder()
                        .centAmount(highPrecisionMoney.getCentAmount())
                        .currencyCode(highPrecisionMoney.getCurrencyCode())
                        .preciseAmount(highPrecisionMoney.getPreciseAmount())
                : v.centPrecisionBuilder()
                        .centAmount(p.getCentAmount())
                        .currencyCode(p.getCurrencyCode())
                        .fractionDigits(p.getFractionDigits());
    }

    public static Builder<? extends TypedMoney> importApiTypedMoney(com.commercetools.api.models.common.Money money,
            TypedMoneyBuilder v) {
        return v.centPrecisionBuilder()
                .centAmount(money.getCentAmount())
                .currencyCode(money.getCurrencyCode())
                .fractionDigits(2);
    }

    public com.commercetools.importapi.models.customfields.Custom getImportApiCustom(CustomFields customFields) {
        if (customFields == null) {
            return null;
        }
        return com.commercetools.importapi.models.customfields.Custom.builder()
                .type(getTypeReference(customFields.getType()))
                .fields(getImportApiFields(customFields.getFields()))
                .build();
    }

    private static com.commercetools.importapi.models.customfields.FieldContainer getImportApiFields(
            FieldContainer fields) {
        return com.commercetools.importapi.models.customfields.FieldContainer.builder()
                .values(mapCustomField(fields.values()))
                .build();
    }

    static Map<String, CustomField> mapCustomField(Map<String, Object> customFieldsValues) {
        if (customFieldsValues == null)
            return null;
        return customFieldsValues.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> mapCustomField(e.getValue())));
    }

    static CustomField mapCustomField(Object value) {
        if (value instanceof String strValue) {
            return CustomField.stringBuilder().value(strValue).build();
        }
        if (value instanceof Boolean bValue) {
            return CustomField.booleanBuilder().value(bValue).build();
        }
        if (value instanceof Double dValue) {
            return CustomField.numberBuilder().value(dValue).build();
        }
        if (value instanceof Integer intValue) {
            return CustomField.numberBuilder().value((intValue).doubleValue()).build();
        }
        if (value instanceof Long lValue) {
            return CustomField.numberBuilder().value((lValue).doubleValue()).build();
        }
        if (value instanceof LocalizedString str) {
            return CustomField.localizedStringBuilder().value(getLocalizedStringBuilder(str).build()).build();
        }
        if (value instanceof LocalDate localDateValue) {
            return CustomField.dateBuilder().value(localDateValue).build();
        }
        if (value instanceof ZonedDateTime zonedDateTimeValue) {
            return CustomField.dateTimeBuilder().value(zonedDateTimeValue).build();
        }
        if (value instanceof LocalTime localTimeValue) {
            return CustomField.timeBuilder().value(localTimeValue).build();
        }
        if (value instanceof com.commercetools.api.models.common.Money moneyValue) {
            return CustomField.moneyBuilder()
                    .value(v -> com.commercetools.importapi.models.common.Money.builder())
                    .build();
        }
        if (value instanceof com.commercetools.api.models.common.Money moneyValue) {
            return CustomField.moneyBuilder().value(v -> importApiTypedMoney(moneyValue, v)).build();
        }
        if (value instanceof List list) {
            if (list.isEmpty()) {
                return CustomField.localizedStringSetBuilder().value().build();
            }
            if (list.get(0) instanceof LocalDate) {
                return CustomField.dateSetBuilder()
                        .value((List<LocalDate>) list.stream().map(obj -> (LocalDate) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof ZonedDateTime) {
                return CustomField.dateTimeSetBuilder()
                        .value((List<ZonedDateTime>) list.stream().map(obj -> (ZonedDateTime) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof LocalTime) {
                return CustomField.timeSetBuilder()
                        .value((List<LocalTime>) list.stream().map(obj -> (LocalTime) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof String) {
                return CustomField.stringSetBuilder()
                        .value((List<String>) list.stream().map(obj -> (String) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof Integer) {
                return CustomField.numberSetBuilder()
                        .value((List<Double>) list.stream().map(obj -> (Double) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof Long) {
                return CustomField.numberSetBuilder()
                        .value((List<Double>) list.stream().map(obj -> (Double) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof Boolean) {
                return CustomField.booleanSetBuilder()
                        .value((List<Boolean>) list.stream().map(obj -> (Boolean) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof Double) {
                return CustomField.numberSetBuilder()
                        .value((List<Double>) list.stream().map(obj -> (Double) obj).toList())
                        .build();
            }
            if (list.get(0) instanceof LocalizedString) {
                return CustomField.localizedStringSetBuilder()
                        .value((List<com.commercetools.importapi.models.common.LocalizedString>) list.stream()
                                .map(v -> getLocalizedStringBuilder(((LocalizedString) v)).build())
                                .toList())
                        .build();
            }
            if (list.get(0) instanceof AttributePlainEnumValue) {
                return CustomField.enumSetBuilder()
                        .value((List<String>) list.stream().map(x -> ((AttributePlainEnumValue) x).getKey()).toList())
                        .build();
            }
            if (list.get(0) instanceof AttributeLocalizedEnumValue) {
                return CustomField.enumSetBuilder()
                        .value(
                            (List<String>) list.stream().map(x -> ((AttributeLocalizedEnumValue) x).getKey()).toList())
                        .build();
            }
            if (list.get(0) instanceof com.commercetools.api.models.common.Money) {
                return CustomField.moneySetBuilder()
                        .value((List<TypedMoney>) list.stream()
                                .map(v -> importApiTypedMoney((com.commercetools.api.models.common.TypedMoney) v,
                                    new TypedMoneyBuilder()).build())
                                .toList())
                        .build();
            }
        }
        throw new IllegalArgumentException("Unsupported custom field type: " + value.getClass());
    }

    private com.commercetools.importapi.models.common.TypeKeyReference getTypeReference(TypeReference typeRef) {
        return TypeKeyReference.builder().key(keyResolverService.resolveKey(typeRef)).build();
    }
}
