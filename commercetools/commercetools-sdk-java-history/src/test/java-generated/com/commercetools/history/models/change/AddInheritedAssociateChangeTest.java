
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddInheritedAssociateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddInheritedAssociateChangeBuilder builder) {
        AddInheritedAssociateChange addInheritedAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(addInheritedAssociateChange).isInstanceOf(AddInheritedAssociateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddInheritedAssociateChange.builder().change("change") },
                new Object[] { "nextValue", AddInheritedAssociateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) } };
    }

    @Test
    public void change() {
        AddInheritedAssociateChange value = AddInheritedAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddInheritedAssociateChange value = AddInheritedAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }
}
