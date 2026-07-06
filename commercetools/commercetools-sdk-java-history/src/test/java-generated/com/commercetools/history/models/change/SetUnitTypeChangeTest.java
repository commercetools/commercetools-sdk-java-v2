
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetUnitTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetUnitTypeChangeBuilder builder) {
        SetUnitTypeChange setUnitTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setUnitTypeChange).isInstanceOf(SetUnitTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetUnitTypeChange.builder().change("change") },
                new Object[] { "parentUnit", SetUnitTypeChange.builder()
                        .parentUnit(new com.commercetools.history.models.common.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "previousValue", SetUnitTypeChange.builder()
                        .previousValue(com.commercetools.history.models.common.BusinessUnitType.findEnum("Company")) },
                new Object[] { "nextValue", SetUnitTypeChange.builder()
                        .nextValue(com.commercetools.history.models.common.BusinessUnitType.findEnum("Company")) } };
    }

    @Test
    public void change() {
        SetUnitTypeChange value = SetUnitTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void parentUnit() {
        SetUnitTypeChange value = SetUnitTypeChange.of();
        value.setParentUnit(new com.commercetools.history.models.common.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.history.models.common.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void previousValue() {
        SetUnitTypeChange value = SetUnitTypeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.BusinessUnitType.findEnum("Company"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitType.findEnum("Company"));
    }

    @Test
    public void nextValue() {
        SetUnitTypeChange value = SetUnitTypeChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitType.findEnum("Company"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitType.findEnum("Company"));
    }
}
