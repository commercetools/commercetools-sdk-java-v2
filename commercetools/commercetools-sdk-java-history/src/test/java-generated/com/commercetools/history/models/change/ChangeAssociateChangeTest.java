
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAssociateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAssociateChangeBuilder builder) {
        ChangeAssociateChange changeAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(changeAssociateChange).isInstanceOf(ChangeAssociateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAssociateChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAssociateChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AssociateImpl()) },
                new Object[] { "nextValue", ChangeAssociateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AssociateImpl()) } };
    }

    @Test
    public void change() {
        ChangeAssociateChange value = ChangeAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAssociateChange value = ChangeAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }

    @Test
    public void nextValue() {
        ChangeAssociateChange value = ChangeAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }
}
