
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomFieldAddedMessageBuilder builder) {
        BusinessUnitCustomFieldAddedMessage businessUnitCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldAddedMessage)
                .isInstanceOf(BusinessUnitCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", BusinessUnitCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", BusinessUnitCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldAddedMessage value = BusinessUnitCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitCustomFieldAddedMessage value = BusinessUnitCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
