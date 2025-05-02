
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitNameChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitNameChangedMessageBuilder builder) {
        BusinessUnitNameChangedMessage businessUnitNameChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitNameChangedMessage).isInstanceOf(BusinessUnitNameChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", BusinessUnitNameChangedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        BusinessUnitNameChangedMessage value = BusinessUnitNameChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
