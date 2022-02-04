
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;
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
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.type.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

public class CustomFieldsTest {

    @Test
    public void fields() throws IOException {
        ObjectMapper mapper = JsonUtils.createObjectMapper();
        CustomFields customFields = mapper.readValue(stringFromResource("customfields.json"), CustomFields.class);

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
        assertThat(fields.get("integer")).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(10L));
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
        assertThat(fields.get("set-integer")).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(fields.get("set-double")).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.get("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(fields.get("set-money")).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(fields.get("set-empty")).asList().isEmpty();
    }

    @Test
    public void fieldsAsDateFalse() throws IOException {
        ApiModuleOptions options = ApiModuleOptions.of()
                .withDateAttributeAsString(true)
                .withDateCustomFieldAsString(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        CustomFields customFields = mapper.readValue(stringFromResource("customfields.json"), CustomFields.class);

        assertThat(customFields.getFields().values()).isNotEmpty();

        Map<String, Object> fields = customFields.getFields().values();
        assertThat(fields.get("text")).isInstanceOfSatisfying(String.class, s -> assertThat(s).isEqualTo("foo"));
        assertThat(fields.get("ltext")).isInstanceOfSatisfying(LocalizedString.class,
            localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(fields.get("enum")).isInstanceOfSatisfying(CustomFieldEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(fields.get("lenum")).isInstanceOfSatisfying(CustomFieldLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));

        assertThat(fields.get("date")).isInstanceOfSatisfying(String.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(fields.get("time")).isInstanceOfSatisfying(String.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(fields.get("datetime")).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));

        assertThat(fields.get("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(fields.get("integer")).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(10L));
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
        assertThat(fields.get("set-date")).asList().first().isInstanceOf(String.class);
        assertThat(fields.get("set-time")).asList().first().isInstanceOf(String.class);
        assertThat(fields.get("set-datetime")).asList().first().isInstanceOf(String.class);
        assertThat(fields.get("set-boolean")).asList().first().isInstanceOf(Boolean.class);
        assertThat(fields.get("set-integer")).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(fields.get("set-double")).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.get("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(fields.get("set-money")).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(fields.get("set-empty")).asList().isEmpty();
    }

    @Test
    public void fieldsEmpty() throws IOException {
        ObjectMapper mapper = JsonUtils.createObjectMapper();
        CustomFields customFields = mapper.readValue("{}", CustomFields.class);

        CustomFieldsAccessor fields = customFields.withCustomFields(CustomFieldsAccessor::new);
        Assertions.assertThat(fields).isInstanceOf(CustomFieldsAccessor.class);

        CustomFields customFields2 = mapper.readValue("{\"fields\": []}", CustomFields.class);

        CustomFieldsAccessor fields2 = customFields2.getFields().withFieldContainer(CustomFieldsAccessor::new);
        Assertions.assertThat(fields2).isInstanceOf(CustomFieldsAccessor.class);
    }

    @Test
    public void fieldsAccessor() throws IOException {
        ObjectMapper mapper = JsonUtils.createObjectMapper();
        CustomFields customFields = mapper.readValue(stringFromResource("customfields.json"), CustomFields.class);

        assertThat(customFields.getFields().values()).isNotEmpty();

        CustomFieldsAccessor fields = customFields.withCustomFields(CustomFieldsAccessor::new);
        assertThat(fields.asString("null")).isNull();
        assertThat(fields.asString("text")).isInstanceOfSatisfying(String.class, s -> assertThat(s).isEqualTo("foo"));
        assertThat(fields.asLocalizedString("ltext")).isInstanceOfSatisfying(LocalizedString.class,
            localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(fields.asEnum("enum")).isInstanceOfSatisfying(CustomFieldEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(fields.asLocalizedEnum("lenum")).isInstanceOfSatisfying(CustomFieldLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));
        assertThat(fields.asDate("date")).isInstanceOfSatisfying(LocalDate.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(fields.asTime("time")).isInstanceOfSatisfying(LocalTime.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(fields.asDateTime("datetime")).isInstanceOfSatisfying(ZonedDateTime.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(fields.asBoolean("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(fields.asLong("integer")).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(10L));
        assertThat(fields.asDouble("double")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.asBoolean("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(fields.asReference("reference")).isInstanceOfSatisfying(ProductReference.class,
            reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(fields.asMoney("money")).isInstanceOfSatisfying(TypedMoney.class,
            money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(fields.asSetString("set-text")).asList().first().isInstanceOf(String.class);
        assertThat(fields.asSetLocalizedString("set-ltext")).asList().first().isInstanceOf(LocalizedString.class);
        assertThat(fields.asSetEnum("set-enum")).asList().first().isInstanceOf(CustomFieldEnumValue.class);
        assertThat(fields.asSetLocalizedEnum("set-lenum")).asList()
                .first()
                .isInstanceOf(CustomFieldLocalizedEnumValue.class);
        assertThat(fields.asSetDate("set-date")).asList().first().isInstanceOf(LocalDate.class);
        assertThat(fields.asSetTime("set-time")).asList().first().isInstanceOf(LocalTime.class);
        assertThat(fields.asSetDateTime("set-datetime")).asList().first().isInstanceOf(ZonedDateTime.class);
        assertThat(fields.asSetBoolean("set-boolean")).asList().first().isInstanceOf(Boolean.class);
        assertThat(fields.asSetLong("set-integer")).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(fields.asSetDouble("set-double")).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.asSetReference("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(fields.asSetMoney("set-money")).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(fields.asSetLong("set-empty")).asList().isEmpty();
    }

    @Test
    public void fieldsAsDateFalseAccessor() throws IOException {
        ApiModuleOptions options = ApiModuleOptions.of()
                .withDateAttributeAsString(true)
                .withDateCustomFieldAsString(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        CustomFields customFields = mapper.readValue(stringFromResource("customfields.json"), CustomFields.class);

        assertThat(customFields.getFields().values()).isNotEmpty();

        CustomFieldsAccessor fields = customFields.withCustomFields(CustomFieldsAccessor::new);

        assertThat(fields.asString("text")).isInstanceOfSatisfying(String.class, s -> assertThat(s).isEqualTo("foo"));
        assertThat(fields.asLocalizedString("ltext")).isInstanceOfSatisfying(LocalizedString.class,
            localizedString -> assertThat(localizedString.values().get("en")).isEqualTo("foo"));
        assertThat(fields.asEnum("enum")).isInstanceOfSatisfying(CustomFieldEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel()).isEqualTo("foo"));
        assertThat(fields.asLocalizedEnum("lenum")).isInstanceOfSatisfying(CustomFieldLocalizedEnumValue.class,
            enumValue -> assertThat(enumValue.getLabel().values().get("en")).isEqualTo("foo"));

        assertThat(fields.asString("date")).isInstanceOfSatisfying(String.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(fields.asString("time")).isInstanceOfSatisfying(String.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(fields.asString("datetime")).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));

        assertThat(fields.asBoolean("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(fields.asLong("integer")).isInstanceOfSatisfying(Long.class,
            number -> assertThat(number).isEqualTo(10L));
        assertThat(fields.asDouble("double")).isInstanceOfSatisfying(Double.class,
            number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.asBoolean("boolean")).isInstanceOfSatisfying(Boolean.class,
            aBoolean -> assertThat(aBoolean).isTrue());
        assertThat(fields.asReference("reference")).isInstanceOfSatisfying(ProductReference.class,
            reference -> assertThat(reference.getId()).isEqualTo("12345"));
        assertThat(fields.asMoney("money")).isInstanceOfSatisfying(TypedMoney.class,
            money -> assertThat(money.getCentAmount()).isEqualTo(100));
        assertThat(fields.asSetString("set-text")).asList().first().isInstanceOf(String.class);
        assertThat(fields.asSetLocalizedString("set-ltext")).asList().first().isInstanceOf(LocalizedString.class);
        assertThat(fields.asSetEnum("set-enum")).asList().first().isInstanceOf(CustomFieldEnumValue.class);
        assertThat(fields.asSetLocalizedEnum("set-lenum")).asList()
                .first()
                .isInstanceOf(CustomFieldLocalizedEnumValue.class);
        assertThat(fields.asSetString("set-date")).asList().first().isInstanceOf(String.class);
        assertThat(fields.asSetString("set-time")).asList().first().isInstanceOf(String.class);
        assertThat(fields.asSetString("set-datetime")).asList().first().isInstanceOf(String.class);
        assertThat(fields.asSetBoolean("set-boolean")).asList().first().isInstanceOf(Boolean.class);
        assertThat(fields.asSetLong("set-integer")).asList()
                .first()
                .isInstanceOfSatisfying(Long.class, number -> assertThat(number).isEqualTo(10L));
        assertThat(fields.asSetDouble("set-double")).asList()
                .first()
                .isInstanceOfSatisfying(Double.class, number -> assertThat(number).isEqualTo(11.0));
        assertThat(fields.asSetReference("set-reference")).asList().first().isInstanceOf(ProductReference.class);
        assertThat(fields.asSetMoney("set-money")).asList().first().isInstanceOf(TypedMoney.class);
        assertThat(fields.asSetReference("set-empty")).asList().isEmpty();
    }

    @Test
    public void emptyField() throws IOException {
        Order order = JsonUtils.fromJsonString(stringFromResource("orderlineitem.json"), Order.class);

        assertThat(order.getLineItems().get(0).getCustom().getFields().values().get("empty")).isInstanceOf(List.class);
    }

    @Test
    public void httpDeSerialize() throws IOException {
        String numberAttributes = stringFromResource("fieldnumbers.json");
        FieldContainer fieldContainer = JsonUtils.fromJsonString(numberAttributes, FieldContainer.class);
        String serializedNumberAttributes = JsonUtils.toJsonString(fieldContainer);
        Assertions.assertThat(serializedNumberAttributes).isEqualTo("{\"double\":13.0,\"decimal\":13.1,\"int\":13}");
    }

    @Test
    public void serializeCustomFields() throws JsonProcessingException {
        FieldContainer container = FieldContainerBuilder.of()
                .addValue("int", 13)
                .addValue("double", 13.0)
                .addValue("double2", 13.1)
                .addValue("bool", true)
                .addValue("string", "foo")
                .addValue("enum", CustomFieldEnumValueBuilder.of().key("foo").label("foo").build())
                .addValue("setNumber", Lists.newArrayList(13.0, 13, 13.1))
                .addValue("setText", Lists.newArrayList("foo", "bar"))
                .build();
        Assertions.assertThat(JsonUtils.toJsonString(container))
                .isEqualTo(
                    "{\"bool\":true,\"string\":\"foo\",\"double\":13.0,\"double2\":13.1,\"int\":13,\"enum\":{\"key\":\"foo\",\"label\":\"foo\"},\"setNumber\":[13.0,13,13.1],\"setText\":[\"foo\",\"bar\"]}");
    }
}
