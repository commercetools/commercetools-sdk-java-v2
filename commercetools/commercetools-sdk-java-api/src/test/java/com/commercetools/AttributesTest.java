
package com.commercetools;

import static com.commercetools.TestUtils.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Map;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.product.AttributeAccessor;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.Test;

public class AttributesTest {

    @Test
    public void attributes() throws IOException {
        ProductVariant variant = JsonUtils.fromJsonString(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        Map<String, Object> attributes = variant.withProductVariant(AttributeAccessor::asAttributeMap);
        assertThat(attributes.get("text")).isInstanceOfSatisfying(String.class, s -> assertThat(s).isEqualTo("foo"));
        assertThat(attributes.get("ltext")).isInstanceOfSatisfying(LocalizedString.class,
            localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(attributes.get("enum")).isInstanceOfSatisfying(AttributePlainEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(attributes.get("lenum")).isInstanceOfSatisfying(AttributeLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));
        assertThat(attributes.get("date")).isInstanceOfSatisfying(LocalDate.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(attributes.get("time")).isInstanceOfSatisfying(LocalTime.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.get("datetime")).isInstanceOfSatisfying(ZonedDateTime.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(attributes.get("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.get("integer")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(10.0));
        assertThat(attributes.get("double")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.get("reference")).isInstanceOfSatisfying(ProductReference.class,
            reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(attributes.get("money")).isInstanceOfSatisfying(TypedMoney.class,
            money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(attributes.get("nested")).asList().first().isInstanceOfSatisfying(Attribute.class,
            attribute -> assertThat(attribute.getValue()).isInstanceOf(AttributePlainEnumValue.class));
        assertThat(attributes.get("set-text")).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-ltext")).asList().first().isInstanceOf(LocalizedString.class);
        assertThat(attributes.get("set-enum")).asList().first().isInstanceOf(AttributePlainEnumValue.class);
        assertThat(attributes.get("set-lenum")).asList().first().isInstanceOf(AttributeLocalizedEnumValue.class);
        assertThat(attributes.get("set-date")).asList().first().isInstanceOf(LocalDate.class);
        assertThat(attributes.get("set-time")).asList().first().isInstanceOf(LocalTime.class);
        assertThat(attributes.get("set-datetime")).asList().first().isInstanceOf(ZonedDateTime.class);
        assertThat(attributes.get("set-boolean")).asList().first().isInstanceOf(Boolean.class);
        assertThat(attributes.get("set-integer")).asList().first().isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(10.0));
        assertThat(attributes.get("set-double")).asList().first().isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(attributes.get("set-money")).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(attributes.get("set-nested")).asList().first().asList().first().isInstanceOfSatisfying(
            Attribute.class, attribute -> assertThat(attribute.getValue()).isInstanceOf(AttributePlainEnumValue.class));
    }
}
