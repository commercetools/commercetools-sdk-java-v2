
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddAttributeDefinitionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddAttributeDefinitionChangeBuilder builder) {
        AddAttributeDefinitionChange addAttributeDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(addAttributeDefinitionChange).isInstanceOf(AddAttributeDefinitionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddAttributeDefinitionChange.builder().change("change") },
                new Object[] { "nextValue", AddAttributeDefinitionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AttributeDefinitionImpl()) } };
    }

    @Test
    public void change() {
        AddAttributeDefinitionChange value = AddAttributeDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddAttributeDefinitionChange value = AddAttributeDefinitionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AttributeDefinitionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeDefinitionImpl());
    }
}
