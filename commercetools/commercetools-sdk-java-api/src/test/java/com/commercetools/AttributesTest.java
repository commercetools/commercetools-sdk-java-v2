
package com.commercetools;

import static com.commercetools.TestUtils.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

import com.commercetools.api.json.ApiModuleOptions;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Maps;
import org.junit.jupiter.api.Test;

public class AttributesTest {

    @Test
    public void deprecatedAttributesAccessor() throws IOException {
        ProductVariant variant = JsonUtils.fromJsonString(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        Map<String, Object> attributes = variant
                .withProductVariant(com.commercetools.api.product.AttributeAccessor::asAttributeMap);
        assertThat(attributes.get("text")).isInstanceOfSatisfying(String.class, s -> assertThat(s).isEqualTo("foo"));
    }

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
        assertThat(attributes.get("date-text")).isInstanceOfSatisfying(String.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01T"));
        assertThat(attributes.get("time")).isInstanceOfSatisfying(LocalTime.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.get("time-simple")).isInstanceOfSatisfying(LocalTime.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00"));
        assertThat(attributes.get("datetime")).isInstanceOfSatisfying(ZonedDateTime.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(attributes.get("datetime-simple")).isInstanceOfSatisfying(ZonedDateTime.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00Z"));
        assertThat(attributes.get("datetime-text")).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2018-09-24T00:00:00-0400"));
        assertThat(attributes.get("datetime-offset")).isInstanceOfSatisfying(ZonedDateTime.class,
            dateTime -> assertThat(dateTime).isEqualTo("2018-09-24T00:00:00-04:00"));
        assertThat(attributes.get("datetime-no-offset")).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2018-09-24T00:00:00"));
        assertThat(attributes.get("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.get("integer")).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.get("double")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.get("reference")).isInstanceOfSatisfying(ProductReference.class,
            reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(attributes.get("money")).isInstanceOfSatisfying(TypedMoney.class,
            money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(attributes.get("nested")).asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));
        assertThat(attributes.get("set-text")).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-ltext")).asList().first().isInstanceOf(LocalizedString.class);
        assertThat(attributes.get("set-enum")).asList().first().isInstanceOf(AttributePlainEnumValue.class);
        assertThat(attributes.get("set-lenum")).asList().first().isInstanceOf(AttributeLocalizedEnumValue.class);
        assertThat(attributes.get("set-date")).asList().first().isInstanceOf(LocalDate.class);
        assertThat(attributes.get("set-time")).asList().first().isInstanceOf(LocalTime.class);
        assertThat(attributes.get("set-datetime")).asList().first().isInstanceOf(ZonedDateTime.class);
        assertThat(attributes.get("set-boolean")).asList().first().isInstanceOf(Boolean.class);
        assertThat(attributes.get("set-integer")).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.get("set-double")).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(attributes.get("set-money")).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(attributes.get("set-nested")).asList()
                .first()
                .asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));

        assertThat(attributes.get("localizedNotes")).asList().first().isInstanceOf(LocalizedString.class);
    }

    @Test
    public void httpDeSerialize() throws IOException {
        String numberAttributes = stringFromResource("numbers.json");
        ProductVariant variant = JsonUtils.fromJsonString(numberAttributes, ProductVariant.class);
        String serializedNumberAttributes = JsonUtils.toJsonString(variant);
        Assertions.assertThat(serializedNumberAttributes)
                .isEqualTo(
                    "{\"attributes\":[{\"name\":\"double\",\"value\":13.0},{\"name\":\"int\",\"value\":13},{\"name\":\"decimal\",\"value\":13.1}]}");
    }

    @Test
    public void serializeAttributes() throws JsonProcessingException {
        Attribute intAttribute = AttributeBuilder.of().name("int").value(13).build();
        Assertions.assertThat(JsonUtils.toJsonString(intAttribute)).isEqualTo("{\"name\":\"int\",\"value\":13}");

        Attribute doubleAttribute = AttributeBuilder.of().name("double").value(13.0).build();
        Assertions.assertThat(JsonUtils.toJsonString(doubleAttribute))
                .isEqualTo("{\"name\":\"double\",\"value\":13.0}");

        Attribute double2Attribute = AttributeBuilder.of().name("double").value(13.1).build();
        Assertions.assertThat(JsonUtils.toJsonString(double2Attribute))
                .isEqualTo("{\"name\":\"double\",\"value\":13.1}");

        Attribute boolAttribute = AttributeBuilder.of().name("bool").value(true).build();
        Assertions.assertThat(JsonUtils.toJsonString(boolAttribute)).isEqualTo("{\"name\":\"bool\",\"value\":true}");

        Attribute stringAttribute = AttributeBuilder.of().name("string").value("foo").build();
        Assertions.assertThat(JsonUtils.toJsonString(stringAttribute))
                .isEqualTo("{\"name\":\"string\",\"value\":\"foo\"}");

        Attribute enumAttribute = AttributeBuilder.of()
                .name("enum")
                .value(AttributePlainEnumValueBuilder.of().key("foo").label("foo").build())
                .build();
        Assertions.assertThat(JsonUtils.toJsonString(enumAttribute))
                .isEqualTo("{\"name\":\"enum\",\"value\":{\"key\":\"foo\",\"label\":\"foo\"}}");

        Attribute setNumberAttribute = AttributeBuilder.of()
                .name("setNumber")
                .value(Lists.newArrayList(13, 13.0, 13.1))
                .build();
        Assertions.assertThat(JsonUtils.toJsonString(setNumberAttribute))
                .isEqualTo("{\"name\":\"setNumber\",\"value\":[13,13.0,13.1]}");

        Attribute setStringAttribute = AttributeBuilder.of()
                .name("setString")
                .value(Lists.newArrayList("foo", "bar"))
                .build();
        Assertions.assertThat(JsonUtils.toJsonString(setStringAttribute))
                .isEqualTo("{\"name\":\"setString\",\"value\":[\"foo\",\"bar\"]}");

    }

    @Test
    public void attributesAsJsonNode() throws JsonProcessingException {
        ApiModuleOptions options = ApiModuleOptions.of().withAttributeAsJsonNode(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        ProductVariant variant = mapper.readValue(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();
        assertThat(variant.getAttributes().stream().map(Attribute::getValue)).allMatch(o -> o instanceof JsonNode);
    }

    @Test
    public void attributesNumberAsDouble() throws JsonProcessingException {
        ApiModuleOptions options = ApiModuleOptions.of().withAttributeNumberAsDouble(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        ProductVariant variant = mapper.readValue(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttribute("integer").getValue()).isEqualTo(10.0);
    }

    @Test
    public void attributeTypeByName() throws JsonProcessingException {
        ApiModuleOptions options = ApiModuleOptions.of()
                .withAttributeTypes(Maps.newHashMap("test", new TypeReference<String>() {
                }));
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        Attribute attribute = mapper.readValue("{\"name\":\"test\", \"value\": \"2025-01-01\"}", Attribute.class);

        assertThat(attribute.getValue()).isEqualTo("2025-01-01");

        Attribute attributeDate = mapper.readValue("{\"name\":\"date\", \"value\": \"2025-01-01\"}", Attribute.class);
        assertThat(attributeDate.getValue()).isEqualTo(LocalDate.parse("2025-01-01"));

        Attribute attributeInvalidMonth = mapper.readValue("{\"name\":\"invalid\", \"value\": \"2025-13-01\"}",
            Attribute.class);
        assertThat(attributeInvalidMonth.getValue()).isEqualTo("2025-13-01");

        Attribute attributeInvalidDay = mapper.readValue("{\"name\":\"invalid\", \"value\": \"2025-12-32\"}",
            Attribute.class);
        assertThat(attributeInvalidDay.getValue()).isEqualTo("2025-12-32");
    }

    @Test
    public void attributesAsDateFalse() throws IOException {
        ApiModuleOptions options = ApiModuleOptions.of()
                .withDateAttributeAsString(true)
                .withDateCustomFieldAsString(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        ProductVariant variant = mapper.readValue(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        Map<String, Attribute> attributes = variant.withProductVariant(AttributeAccessor::asMap);
        assertThat(attributes.get("text").getValue()).isInstanceOfSatisfying(String.class,
            s -> assertThat(s).isEqualTo("foo"));
        assertThat(attributes.get("ltext").getValue()).isInstanceOfSatisfying(LocalizedString.class,
            localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(attributes.get("enum").getValue()).isInstanceOfSatisfying(AttributePlainEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(attributes.get("lenum").getValue()).isInstanceOfSatisfying(AttributeLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));

        assertThat(attributes.get("date").getValue()).isInstanceOfSatisfying(String.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(attributes.get("time").getValue()).isInstanceOfSatisfying(String.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.get("datetime").getValue()).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(attributes.get("time-simple").getValue()).isInstanceOfSatisfying(String.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00"));
        assertThat(attributes.get("datetime-simple").getValue()).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00Z"));
        assertThat(attributes.get("datetime-text").getValue()).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2018-09-24T00:00:00-0400"));
        assertThat(attributes.get("datetime-offset").getValue()).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2018-09-24T00:00:00-04:00"));
        assertThat(attributes.get("datetime-no-offset").getValue()).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2018-09-24T00:00:00"));
        assertThat(attributes.get("date").withAttribute(AttributeAccessor::asDate))
                .isInstanceOfSatisfying(LocalDate.class, localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(attributes.get("time").withAttribute(AttributeAccessor::asTime))
                .isInstanceOfSatisfying(LocalTime.class, localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.get("datetime").withAttribute(AttributeAccessor::asDateTime)).isInstanceOfSatisfying(
            ZonedDateTime.class, dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));

        assertThat(attributes.get("boolean").getValue()).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.get("integer").getValue()).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.get("double").getValue()).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("boolean").getValue()).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.get("reference").getValue()).isInstanceOfSatisfying(ProductReference.class,
            reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(attributes.get("money").getValue()).isInstanceOfSatisfying(TypedMoney.class,
            money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(attributes.get("nested").getValue()).asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));
        assertThat(attributes.get("set-text").getValue()).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-ltext").getValue()).asList().first().isInstanceOf(LocalizedString.class);
        assertThat(attributes.get("set-enum").getValue()).asList().first().isInstanceOf(AttributePlainEnumValue.class);
        assertThat(attributes.get("set-lenum").getValue()).asList()
                .first()
                .isInstanceOf(AttributeLocalizedEnumValue.class);

        assertThat(attributes.get("set-date").getValue()).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-time").getValue()).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-datetime").getValue()).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-date").withAttribute(AttributeAccessor::asSetDate)).asList()
                .first()
                .isInstanceOf(LocalDate.class);
        assertThat(attributes.get("set-time").withAttribute(AttributeAccessor::asSetTime)).asList()
                .first()
                .isInstanceOf(LocalTime.class);
        assertThat(attributes.get("set-datetime").withAttribute(AttributeAccessor::asSetDateTime)).asList()
                .first()
                .isInstanceOf(ZonedDateTime.class);

        assertThat(attributes.get("set-boolean").getValue()).asList().first().isInstanceOf(Boolean.class);
        assertThat(attributes.get("set-integer").getValue()).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.get("set-double").getValue()).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("set-reference").getValue()).asList().first().isInstanceOf(ProductReference.class);
        assertThat(attributes.get("set-money").getValue()).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(attributes.get("set-nested").getValue()).asList()
                .first()
                .asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));
        assertThat(attributes.get("localizedNotes").getValue()).asList().first().isInstanceOf(LocalizedString.class);

    }

    @Test
    public void attributesTyped() throws IOException {
        ProductVariant variant = JsonUtils.fromJsonString(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        Map<String, Attribute> attributes = variant.withProductVariant(AttributeAccessor::asMap);
        assertThat(attributes.get("text").withAttribute(AttributeAccessor::asString))
                .isInstanceOfSatisfying(String.class, s -> assertThat(s).isEqualTo("foo"));
        assertThat(attributes.get("ltext").withAttribute(AttributeAccessor::asLocalizedString)).isInstanceOfSatisfying(
            LocalizedString.class, localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(attributes.get("enum").withAttribute(AttributeAccessor::asEnum)).isInstanceOfSatisfying(
            AttributePlainEnumValue.class, enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(attributes.get("lenum").withAttribute(AttributeAccessor::asLocalizedEnum)).isInstanceOfSatisfying(
            AttributeLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));
        assertThat(attributes.get("date").withAttribute(AttributeAccessor::asDate))
                .isInstanceOfSatisfying(LocalDate.class, localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(attributes.get("time").withAttribute(AttributeAccessor::asTime))
                .isInstanceOfSatisfying(LocalTime.class, localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.get("datetime").withAttribute(AttributeAccessor::asDateTime)).isInstanceOfSatisfying(
            ZonedDateTime.class, dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(attributes.get("boolean").withAttribute(AttributeAccessor::asBoolean))
                .isInstanceOfSatisfying(Boolean.class, aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.get("integer").withAttribute(AttributeAccessor::asLong))
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.get("double").withAttribute(AttributeAccessor::asDouble))
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("reference").withAttribute(AttributeAccessor::asReference)).isInstanceOfSatisfying(
            ProductReference.class, reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(attributes.get("money").withAttribute(AttributeAccessor::asMoney))
                .isInstanceOfSatisfying(TypedMoney.class, money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(attributes.get("nested").getValue()).asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));
        assertThat(attributes.get("set-text").withAttribute(AttributeAccessor::asSetString)).asList()
                .first()
                .isInstanceOf(String.class);
        assertThat(attributes.get("set-ltext").withAttribute(AttributeAccessor::asSetLocalizedString)).asList()
                .first()
                .isInstanceOf(LocalizedString.class);
        assertThat(attributes.get("set-enum").withAttribute(AttributeAccessor::asSetEnum)).asList()
                .first()
                .isInstanceOf(AttributePlainEnumValue.class);
        assertThat(attributes.get("set-lenum").withAttribute(AttributeAccessor::asSetLocalizedEnum)).asList()
                .first()
                .isInstanceOf(AttributeLocalizedEnumValue.class);
        assertThat(attributes.get("set-date").withAttribute(AttributeAccessor::asSetDate)).asList()
                .first()
                .isInstanceOf(LocalDate.class);
        assertThat(attributes.get("set-time").withAttribute(AttributeAccessor::asSetTime)).asList()
                .first()
                .isInstanceOf(LocalTime.class);
        assertThat(attributes.get("set-datetime").withAttribute(AttributeAccessor::asSetDateTime)).asList()
                .first()
                .isInstanceOf(ZonedDateTime.class);
        assertThat(attributes.get("set-boolean").withAttribute(AttributeAccessor::asSetBoolean)).asList()
                .first()
                .isInstanceOf(Boolean.class);
        assertThat(attributes.get("set-integer").withAttribute(AttributeAccessor::asSetLong)).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.get("set-double").withAttribute(AttributeAccessor::asSetDouble)).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.get("set-reference").withAttribute(AttributeAccessor::asSetReference)).asList()
                .first()
                .isInstanceOf(ProductReference.class);
        assertThat(attributes.get("set-money").withAttribute(AttributeAccessor::asSetMoney)).asList()
                .first()
                .isInstanceOf(TypedMoney.class);
        assertThat(attributes.get("set-nested").getValue()).asList()
                .first()
                .asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));
        assertThat(attributes.get("localizedNotes").withAttribute(AttributeAccessor::asSetLocalizedString)).asList()
                .first()
                .isInstanceOf(LocalizedString.class);
    }

    @Test
    public void attributesTypedAccessor() throws IOException {
        ProductVariant variant = JsonUtils.fromJsonString(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        AttributesAccessor attributes = variant.withProductVariant(AttributesAccessor::of);
        assertThat(attributes.asString("null")).isNull();

        assertThat(attributes.asString("text")).isInstanceOfSatisfying(String.class,
            s -> assertThat(s).isEqualTo("foo"));
        assertThat(attributes.asLocalizedString("ltext")).isInstanceOfSatisfying(LocalizedString.class,
            localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(attributes.asEnum("enum")).isInstanceOfSatisfying(AttributePlainEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(attributes.asLocalizedEnum("lenum")).isInstanceOfSatisfying(AttributeLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));
        assertThat(attributes.asDate("date")).isInstanceOfSatisfying(LocalDate.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(attributes.asTime("time")).isInstanceOfSatisfying(LocalTime.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.asDateTime("datetime")).isInstanceOfSatisfying(ZonedDateTime.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(attributes.asBoolean("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(attributes.asLong("integer")).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.asDouble("integer")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(10.0));
        assertThat(attributes.asDouble("double")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.asLong("double")).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(11L));
        assertThat(attributes.asReference("reference")).isInstanceOfSatisfying(ProductReference.class,
            reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(attributes.asMoney("money")).isInstanceOfSatisfying(TypedMoney.class,
            money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(attributes.get("nested").getValue()).asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));
        assertThat(attributes.asSetString("set-text")).asList().first().isInstanceOf(String.class);
        assertThat(attributes.asSetLocalizedString("set-ltext")).asList().first().isInstanceOf(LocalizedString.class);
        assertThat(attributes.asSetEnum("set-enum")).asList().first().isInstanceOf(AttributePlainEnumValue.class);
        assertThat(attributes.asSetLocalizedEnum("set-lenum")).asList()
                .first()
                .isInstanceOf(AttributeLocalizedEnumValue.class);
        assertThat(attributes.asSetDate("set-date")).asList().first().isInstanceOf(LocalDate.class);
        assertThat(attributes.asSetTime("set-time")).asList().first().isInstanceOf(LocalTime.class);
        assertThat(attributes.asSetDateTime("set-datetime")).asList().first().isInstanceOf(ZonedDateTime.class);
        assertThat(attributes.asSetBoolean("set-boolean")).asList().first().isInstanceOf(Boolean.class);
        assertThat(attributes.asSetLong("set-integer")).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(attributes.asSetDouble("set-double")).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(attributes.asSetReference("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(attributes.asSetMoney("set-money")).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(attributes.get("set-nested").getValue()).asList()
                .first()
                .asList()
                .first()
                .isInstanceOfSatisfying(Attribute.class,
                    attribute -> assertThat(attribute.getValue()).isInstanceOf(String.class));
        assertThat(attributes.asSetLocalizedString("localizedNotes")).asList()
                .first()
                .isInstanceOf(LocalizedString.class);
    }

    @Test
    public void nestedAttributesTypedAccessor() throws IOException {
        ProductVariant variant = JsonUtils.fromJsonString(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        AttributesAccessor attributes = variant.withProductVariant(AttributesAccessor::of);
        final AttributesAccessor nested = attributes.asNested("nested");

        assertThat(nested).isNotNull();
        assertThat(nested.asEnum("nested-enum")).isInstanceOf(AttributePlainEnumValue.class);
        assertThat(nested.asString("nested-string")).isInstanceOf(String.class);
    }

    @Test
    public void setNestedAttributesTypedAccessor() throws IOException {
        ProductVariant variant = JsonUtils.fromJsonString(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        AttributesAccessor attributes = variant.withProductVariant(AttributesAccessor::of);
        final List<AttributesAccessor> nested = attributes.asSetNested("set-nested");

        assertThat(nested).hasSize(1);
        assertThat(nested.get(0).asEnum("set-nested-enum")).isInstanceOf(AttributePlainEnumValue.class);
        assertThat(nested.get(0).asString("set-nested-string")).isInstanceOf(String.class);
    }

    @Test
    public void dateDeserialization() throws IOException {
        ProductVariant variant = JsonUtils.fromJsonString(stringFromResource("date-attributes.json"),
            ProductVariant.class);
        assertThat(variant.getAttributes()).isNotEmpty();
        AttributesAccessor attributes = variant.withProductVariant(AttributesAccessor::of);
        assertThat(attributes.get("datetime").getValue()).isInstanceOf(ZonedDateTime.class);
        assertThat(attributes.get("datetime-simple").getValue()).isInstanceOf(ZonedDateTime.class);
        assertThat(attributes.get("datetime-max").getValue()).isInstanceOf(ZonedDateTime.class);
        assertThat(attributes.get("time").getValue()).isInstanceOf(LocalTime.class);
        assertThat(attributes.get("time-simple").getValue()).isInstanceOf(LocalTime.class);
        assertThat(attributes.get("time-max").getValue()).isInstanceOf(LocalTime.class);
    }
}
