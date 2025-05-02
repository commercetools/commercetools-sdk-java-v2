
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitLabelBuilder builder) {
        BusinessUnitLabel businessUnitLabel = builder.buildUnchecked();
        Assertions.assertThat(businessUnitLabel).isInstanceOf(BusinessUnitLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", BusinessUnitLabel.builder().key("key") },
                new Object[] { "name", BusinessUnitLabel.builder().name("name") } };
    }

    @Test
    public void key() {
        BusinessUnitLabel value = BusinessUnitLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        BusinessUnitLabel value = BusinessUnitLabel.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
