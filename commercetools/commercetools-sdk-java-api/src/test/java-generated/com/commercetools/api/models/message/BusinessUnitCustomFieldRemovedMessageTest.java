
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomFieldRemovedMessageBuilder builder) {
        BusinessUnitCustomFieldRemovedMessage businessUnitCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldRemovedMessage)
                .isInstanceOf(BusinessUnitCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", BusinessUnitCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldRemovedMessage value = BusinessUnitCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
