
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAssociateModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAssociateModeChangeBuilder builder) {
        ChangeAssociateModeChange changeAssociateModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeAssociateModeChange).isInstanceOf(ChangeAssociateModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAssociateModeChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAssociateModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) },
                new Object[] { "nextValue", ChangeAssociateModeChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit")) } };
    }

    @Test
    public void change() {
        ChangeAssociateModeChange value = ChangeAssociateModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAssociateModeChange value = ChangeAssociateModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void nextValue() {
        ChangeAssociateModeChange value = ChangeAssociateModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitAssociateMode.findEnum("Explicit"));
    }
}
