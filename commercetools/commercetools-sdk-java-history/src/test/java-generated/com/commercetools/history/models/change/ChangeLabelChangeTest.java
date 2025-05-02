
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeLabelChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeLabelChangeBuilder builder) {
        ChangeLabelChange changeLabelChange = builder.buildUnchecked();
        Assertions.assertThat(changeLabelChange).isInstanceOf(ChangeLabelChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeLabelChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeLabelChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        ChangeLabelChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "fieldName", ChangeLabelChange.builder().fieldName("fieldName") },
                new Object[] { "attributeName", ChangeLabelChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void fieldName() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        ChangeLabelChange value = ChangeLabelChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
