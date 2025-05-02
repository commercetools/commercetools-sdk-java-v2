
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveInheritedAssociateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveInheritedAssociateChangeBuilder builder) {
        RemoveInheritedAssociateChange removeInheritedAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(removeInheritedAssociateChange).isInstanceOf(RemoveInheritedAssociateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveInheritedAssociateChange.builder().change("change") },
                new Object[] { "previousValue", RemoveInheritedAssociateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.InheritedAssociateImpl()) } };
    }

    @Test
    public void change() {
        RemoveInheritedAssociateChange value = RemoveInheritedAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveInheritedAssociateChange value = RemoveInheritedAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.InheritedAssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.InheritedAssociateImpl());
    }
}
