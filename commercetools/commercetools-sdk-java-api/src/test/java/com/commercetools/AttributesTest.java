
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
import com.commercetools.api.models.product.AttributeBuilder;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder;
import com.commercetools.api.product.AttributeAccessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
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

    @Test
    public void serializeAttributes() throws JsonProcessingException {
        Attribute intAttribute = AttributeBuilder.of().name("int").value(13).build();
        Assertions.assertThat(JsonUtils.toJsonString(intAttribute)).isEqualTo("{\"name\":\"int\",\"value\":13}");

        Attribute doubleAttribute = AttributeBuilder.of().name("double").value(13.0).build();
        Assertions.assertThat(JsonUtils.toJsonString(doubleAttribute)).isEqualTo("{\"name\":\"double\",\"value\":13}");

        Attribute double2Attribute = AttributeBuilder.of().name("double").value(13.1).build();
        Assertions.assertThat(JsonUtils.toJsonString(double2Attribute)).isEqualTo("{\"name\":\"double\",\"value\":13.1}");

        Attribute boolAttribute = AttributeBuilder.of().name("bool").value(true).build();
        Assertions.assertThat(JsonUtils.toJsonString(boolAttribute)).isEqualTo("{\"name\":\"bool\",\"value\":true}");

        Attribute stringAttribute = AttributeBuilder.of().name("string").value("foo").build();
        Assertions.assertThat(JsonUtils.toJsonString(stringAttribute)).isEqualTo("{\"name\":\"string\",\"value\":\"foo\"}");

        Attribute enumAttribute = AttributeBuilder.of().name("enum").value(AttributePlainEnumValueBuilder.of().key("foo").label("foo").build()).build();
        Assertions.assertThat(JsonUtils.toJsonString(enumAttribute)).isEqualTo("{\"name\":\"enum\",\"value\":{\"key\":\"foo\",\"label\":\"foo\"}}");

        Attribute setNumberAttribute = AttributeBuilder.of().name("setNumber").value(Lists.newArrayList(13, 13.0, 13.1)).build();
        Assertions.assertThat(JsonUtils.toJsonString(setNumberAttribute)).isEqualTo("{\"name\":\"setNumber\",\"value\":[13,13,13.1]}");

        Attribute setStringAttribute = AttributeBuilder.of().name("setString").value(Lists.newArrayList("foo", "bar")).build();
        Assertions.assertThat(JsonUtils.toJsonString(setStringAttribute)).isEqualTo("{\"name\":\"setString\",\"value\":[\"foo\",\"bar\"]}");

    }
}
