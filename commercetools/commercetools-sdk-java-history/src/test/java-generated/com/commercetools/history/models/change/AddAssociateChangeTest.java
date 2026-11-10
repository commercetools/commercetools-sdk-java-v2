
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddAssociateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddAssociateChangeBuilder builder) {
        AddAssociateChange addAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(addAssociateChange).isInstanceOf(AddAssociateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddAssociateChange.builder().change("change") }, new Object[] {
                "nextValue",
                AddAssociateChange.builder().nextValue(new com.commercetools.history.models.common.AssociateImpl()) } };
    }

    @Test
    public void change() {
        AddAssociateChange value = AddAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddAssociateChange value = AddAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }
}
