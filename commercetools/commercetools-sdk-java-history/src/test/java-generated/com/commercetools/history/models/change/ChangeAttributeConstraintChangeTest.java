
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAttributeConstraintChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAttributeConstraintChangeBuilder builder) {
        ChangeAttributeConstraintChange changeAttributeConstraintChange = builder.buildUnchecked();
        Assertions.assertThat(changeAttributeConstraintChange).isInstanceOf(ChangeAttributeConstraintChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAttributeConstraintChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAttributeConstraintChange.builder()
                                .previousValue(
                                    com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None")) },
                new Object[] { "nextValue", ChangeAttributeConstraintChange.builder()
                        .nextValue(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None")) },
                new Object[] { "attributeName",
                        ChangeAttributeConstraintChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
    }

    @Test
    public void nextValue() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setNextValue(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.AttributeConstraintEnum.findEnum("None"));
    }

    @Test
    public void attributeName() {
        ChangeAttributeConstraintChange value = ChangeAttributeConstraintChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
