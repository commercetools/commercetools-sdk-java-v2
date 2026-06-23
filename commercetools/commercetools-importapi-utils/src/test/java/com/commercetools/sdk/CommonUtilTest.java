package com.commercetools.sdk;

import com.commercetools.importapi.models.common.AssetSource;
import com.commercetools.importapi.models.customfields.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

public class CommonUtilTest {
    CommonImportUtil util;
    @BeforeEach void setup() {
        util = new CommonImportUtil();
    }
    @Test
    void shouldMapStringField() {
        CustomField result = CommonImportUtil.mapCustomField("hello");
        Assertions.assertEquals("String", result.getType());
        Assertions.assertEquals("hello", ((StringField) result).getValue());
    }

    @Test
    void shouldMapBooleanField() {
        CustomField result = CommonImportUtil.mapCustomField(Boolean.TRUE);
        Assertions.assertEquals("Boolean", result.getType());
        Assertions.assertTrue(((BooleanField) result).getValue());
    }

    @Test
    void shouldMapIntegerAsNumberField() {
        CustomField result = CommonImportUtil.mapCustomField(42);
        Assertions.assertEquals("Number", result.getType());
        Assertions.assertEquals(42.0, ((NumberField) result).getValue());
    }

    @Test
    void shouldMapDoubleAsNumberField() {
        CustomField result = CommonImportUtil.mapCustomField(3.14);
        Assertions.assertEquals("Number", result.getType());
        Assertions.assertEquals(3.14, ((NumberField) result).getValue());
    }

    @Test
    void shouldMapLongAsNumberField() {
        CustomField result = CommonImportUtil.mapCustomField(100L);
        Assertions.assertEquals("Number", result.getType());
        Assertions.assertEquals(100.0, ((NumberField) result).getValue());
    }

    @Test
    void shouldMapLocalDateField() {
        LocalDate date = LocalDate.of(2026, 1, 15);
        CustomField result = CommonImportUtil.mapCustomField(date);
        Assertions.assertEquals("Date", result.getType());
        Assertions.assertEquals(date, ((DateField) result).getValue());
    }

    @Test
    void shouldMapZonedDateTimeField() {
        ZonedDateTime dt = ZonedDateTime.parse("2026-01-15T10:00:00Z");
        CustomField result = CommonImportUtil.mapCustomField(dt);
        Assertions.assertEquals("DateTime", result.getType());
    }

    @Test
    void shouldMapLocalTimeField() {
        LocalTime time = LocalTime.of(10, 30);
        CustomField result = CommonImportUtil.mapCustomField(time);
        Assertions.assertEquals("Time", result.getType());
        Assertions.assertEquals(time, ((TimeField) result).getValue());
    }

    @Test
    void shouldThrowForUnsupportedType() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> CommonImportUtil.mapCustomField(new Object()));
    }

    // mapCustomField(Map) — null and non-null
    @Test
    void shouldReturnNullForNullMap() {
        Assertions.assertNull(CommonImportUtil.mapCustomField((Map<String, Object>) null));
    }

    @Test
    void shouldMapFieldsMap() {
        Map<String, Object> fields = Map.of("name", "Alice", "age", 30);
        Map<String, CustomField> result = CommonImportUtil.mapCustomField(fields);

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("String", result.get("name").getType());
        Assertions.assertEquals("Number", result.get("age").getType());
    }

    // getImportApiCustom — null guard
    @Test
    void shouldReturnNullForNullCustomFields() {
        Assertions.assertNull(util.getImportApiCustom(null));
    }

    // importAssets — null guard
    @Test
    void shouldReturnNullForNullAssets() {
        Assertions.assertNull(util.importAssets(null));
    }

    @Test
    void shouldMapAssets() {
        var asset = com.commercetools.api.models.common.Asset.builder()
                .key("asset-key")
                .name(com.commercetools.api.models.common.LocalizedString.builder()
                        .addValue("en", "My Asset").build())
                .sources(List.of())
                .id("asset-id")
                .sources(List.of(com.commercetools.api.models.common.AssetSource.builder().key("key").uri("url").build()))
                .build();
        var result = util.importAssets(List.of(asset));
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("asset-key", result.get(0).getKey());
    }
}
