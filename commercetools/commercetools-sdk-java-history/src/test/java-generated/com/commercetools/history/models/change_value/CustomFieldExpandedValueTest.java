
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomFieldExpandedValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomFieldExpandedValueBuilder builder) {
        CustomFieldExpandedValue customFieldExpandedValue = builder.buildUnchecked();
        Assertions.assertThat(customFieldExpandedValue).isInstanceOf(CustomFieldExpandedValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomFieldExpandedValue.builder().name("name") },
                new Object[] { "value", CustomFieldExpandedValue.builder().value("value") },
                new Object[] { "label", CustomFieldExpandedValue.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        CustomFieldExpandedValue value = CustomFieldExpandedValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomFieldExpandedValue value = CustomFieldExpandedValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void label() {
        CustomFieldExpandedValue value = CustomFieldExpandedValue.of();
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
