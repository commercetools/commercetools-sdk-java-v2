
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Map;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.type.CustomFieldEnumValue;
import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.models.type.CustomFields;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.Test;

public class CustomFieldsTest {

    @Test
    public void fields() throws IOException {
        CustomFields customFields = JsonUtils.fromJsonString(stringFromResource("customfields.json"),
            CustomFields.class);

        assertThat(customFields.getFields().values()).isNotEmpty();

        Map<String, Object> fields = customFields.getFields().values();
        assertThat(fields.get("text")).isInstanceOfSatisfying(String.class, s -> assertThat(s).isEqualTo("foo"));
        assertThat(fields.get("ltext")).isInstanceOfSatisfying(LocalizedString.class,
            localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(fields.get("enum")).isInstanceOfSatisfying(CustomFieldEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(fields.get("lenum")).isInstanceOfSatisfying(CustomFieldLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));
        assertThat(fields.get("date")).isInstanceOfSatisfying(LocalDate.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(fields.get("time")).isInstanceOfSatisfying(LocalTime.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(fields.get("datetime")).isInstanceOfSatisfying(ZonedDateTime.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(fields.get("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(fields.get("integer")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(10.0));
        assertThat(fields.get("double")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.get("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(fields.get("reference")).isInstanceOfSatisfying(ProductReference.class,
            reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(fields.get("money")).isInstanceOfSatisfying(TypedMoney.class,
            money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(fields.get("set-text")).asList().first().isInstanceOf(String.class);
        assertThat(fields.get("set-ltext")).asList().first().isInstanceOf(LocalizedString.class);
        assertThat(fields.get("set-enum")).asList().first().isInstanceOf(CustomFieldEnumValue.class);
        assertThat(fields.get("set-lenum")).asList().first().isInstanceOf(CustomFieldLocalizedEnumValue.class);
        assertThat(fields.get("set-date")).asList().first().isInstanceOf(LocalDate.class);
        assertThat(fields.get("set-time")).asList().first().isInstanceOf(LocalTime.class);
        assertThat(fields.get("set-datetime")).asList().first().isInstanceOf(ZonedDateTime.class);
        assertThat(fields.get("set-boolean")).asList().first().isInstanceOf(Boolean.class);
        assertThat(fields.get("set-integer")).asList().first().isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(10.0));
        assertThat(fields.get("set-double")).asList().first().isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.get("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(fields.get("set-money")).asList().first().isInstanceOf(TypedMoney.class);
    }
}
