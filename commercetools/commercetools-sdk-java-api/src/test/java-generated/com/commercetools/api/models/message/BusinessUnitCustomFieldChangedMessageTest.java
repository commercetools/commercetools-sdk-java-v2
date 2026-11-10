
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomFieldChangedMessageBuilder builder) {
        BusinessUnitCustomFieldChangedMessage businessUnitCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldChangedMessage)
                .isInstanceOf(BusinessUnitCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", BusinessUnitCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", BusinessUnitCustomFieldChangedMessage.builder().value("value") },
                new Object[] { "oldValue", BusinessUnitCustomFieldChangedMessage.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldChangedMessage value = BusinessUnitCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitCustomFieldChangedMessage value = BusinessUnitCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        BusinessUnitCustomFieldChangedMessage value = BusinessUnitCustomFieldChangedMessage.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
