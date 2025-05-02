
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeInheritedAssociateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeInheritedAssociateChangeBuilder builder) {
        ChangeInheritedAssociateChange changeInheritedAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(changeInheritedAssociateChange).isInstanceOf(ChangeInheritedAssociateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeInheritedAssociateChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeInheritedAssociateChange.builder()
                                .previousValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) },
                new Object[] { "nextValue", ChangeInheritedAssociateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) } };
    }

    @Test
    public void change() {
        ChangeInheritedAssociateChange value = ChangeInheritedAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeInheritedAssociateChange value = ChangeInheritedAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }

    @Test
    public void nextValue() {
        ChangeInheritedAssociateChange value = ChangeInheritedAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }
}
