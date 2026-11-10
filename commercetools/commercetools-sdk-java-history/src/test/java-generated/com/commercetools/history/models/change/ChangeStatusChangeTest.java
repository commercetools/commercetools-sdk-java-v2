
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeStatusChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeStatusChangeBuilder builder) {
        ChangeStatusChange changeStatusChange = builder.buildUnchecked();
        Assertions.assertThat(changeStatusChange).isInstanceOf(ChangeStatusChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeStatusChange.builder().change("change") },
                new Object[] { "previousValue", ChangeStatusChange.builder()
                        .previousValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active")) },
                new Object[] { "nextValue", ChangeStatusChange.builder()
                        .nextValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active")) } };
    }

    @Test
    public void change() {
        ChangeStatusChange value = ChangeStatusChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStatusChange value = ChangeStatusChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
    }

    @Test
    public void nextValue() {
        ChangeStatusChange value = ChangeStatusChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStatus.findEnum("Active"));
    }
}
