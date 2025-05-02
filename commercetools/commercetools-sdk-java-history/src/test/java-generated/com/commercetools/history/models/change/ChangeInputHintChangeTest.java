
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeInputHintChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeInputHintChangeBuilder builder) {
        ChangeInputHintChange changeInputHintChange = builder.buildUnchecked();
        Assertions.assertThat(changeInputHintChange).isInstanceOf(ChangeInputHintChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeInputHintChange.builder().change("change") },
                new Object[] { "previousValue", ChangeInputHintChange.builder()
                        .previousValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine")) },
                new Object[] { "nextValue", ChangeInputHintChange.builder()
                        .nextValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine")) },
                new Object[] { "fieldName", ChangeInputHintChange.builder().fieldName("fieldName") },
                new Object[] { "attributeName", ChangeInputHintChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
    }

    @Test
    public void nextValue() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setNextValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
    }

    @Test
    public void fieldName() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
