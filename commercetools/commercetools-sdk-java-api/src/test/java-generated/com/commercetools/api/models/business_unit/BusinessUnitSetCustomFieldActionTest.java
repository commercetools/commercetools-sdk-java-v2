
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetCustomFieldActionBuilder builder) {
        BusinessUnitSetCustomFieldAction businessUnitSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetCustomFieldAction).isInstanceOf(BusinessUnitSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", BusinessUnitSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", BusinessUnitSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        BusinessUnitSetCustomFieldAction value = BusinessUnitSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitSetCustomFieldAction value = BusinessUnitSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
