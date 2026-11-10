
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveAssociateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveAssociateChangeBuilder builder) {
        RemoveAssociateChange removeAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(removeAssociateChange).isInstanceOf(RemoveAssociateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveAssociateChange.builder().change("change") },
                new Object[] { "previousValue", RemoveAssociateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AssociateImpl()) } };
    }

    @Test
    public void change() {
        RemoveAssociateChange value = RemoveAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveAssociateChange value = RemoveAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }
}
