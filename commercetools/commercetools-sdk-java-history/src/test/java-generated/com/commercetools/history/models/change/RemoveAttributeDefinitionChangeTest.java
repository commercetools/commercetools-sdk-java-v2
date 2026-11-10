
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveAttributeDefinitionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveAttributeDefinitionChangeBuilder builder) {
        RemoveAttributeDefinitionChange removeAttributeDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(removeAttributeDefinitionChange).isInstanceOf(RemoveAttributeDefinitionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveAttributeDefinitionChange.builder().change("change") },
                new Object[] { "previousValue", RemoveAttributeDefinitionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AttributeDefinitionImpl()) } };
    }

    @Test
    public void change() {
        RemoveAttributeDefinitionChange value = RemoveAttributeDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveAttributeDefinitionChange value = RemoveAttributeDefinitionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AttributeDefinitionImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeDefinitionImpl());
    }
}
