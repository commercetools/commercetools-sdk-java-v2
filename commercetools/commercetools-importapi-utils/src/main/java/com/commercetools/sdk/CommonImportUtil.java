
package com.commercetools.sdk;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.LocalizedString;
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

    public static List<Asset> importAssets(List<com.commercetools.api.models.common.Asset> assets) {
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

    public static Builder<? extends TypedMoney> importApiTypedMoney(com.commercetools.api.models.common.TypedMoney p,
            TypedMoneyBuilder v) {
        return (p instanceof HighPrecisionMoney)
                ? v.highPrecisionBuilder()
                        .centAmount(p.getCentAmount())
                        .currencyCode(p.getCurrencyCode())
                        .preciseAmount(((com.commercetools.api.models.common.HighPrecisionMoney) p).getPreciseAmount())
                : v.centPrecisionBuilder()
                        .centAmount(p.getCentAmount())
                        .currencyCode(p.getCurrencyCode())
                        .fractionDigits(p.getFractionDigits());
    }

    public com.commercetools.importapi.models.customfields.Custom getImportApiCustom(CustomFields customFields) {
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
        if (value instanceof String) {
            return CustomField.stringBuilder().value((String) value).build();
        }
        if (value instanceof Boolean) {
            return CustomField.booleanBuilder().value((Boolean) value).build();
        }
        if (value instanceof Double) {
            return CustomField.numberBuilder().value((Double) value).build();
        }
        if (value instanceof Integer) {
            return CustomField.numberBuilder().value(((Integer) value).doubleValue()).build();
        }
        if (value instanceof Long) {
            return CustomField.numberBuilder().value(((Long) value).doubleValue()).build();
        }
        if (value instanceof LocalizedString) {
            return CustomField.localizedStringBuilder()
                    .value(getLocalizedStringBuilder((LocalizedString) value).build())
                    .build();
        }
        if (value instanceof LocalDate) {
            return CustomField.dateBuilder().value((LocalDate) value).build();
        }
        if (value instanceof ZonedDateTime) {
            return CustomField.dateTimeBuilder().value((ZonedDateTime) value).build();
        }
        if (value instanceof LocalTime) {
            return CustomField.timeBuilder().value((LocalTime) value).build();
        }
        if (value instanceof Money) {
            return CustomField.moneyBuilder()
                    .value(v -> importApiTypedMoney((com.commercetools.api.models.common.TypedMoney) value, v))
                    .build();
        }
        throw new IllegalArgumentException("Unsupported custom field type: " + value.getClass());
    }

    private com.commercetools.importapi.models.common.TypeKeyReference getTypeReference(TypeReference typeRef) {
        return TypeKeyReference.builder().key(keyResolverService.resolveKey(typeRef)).build();
    }
}
