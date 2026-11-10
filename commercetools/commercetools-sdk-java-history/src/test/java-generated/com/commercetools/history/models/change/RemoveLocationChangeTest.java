
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveLocationChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveLocationChangeBuilder builder) {
        RemoveLocationChange removeLocationChange = builder.buildUnchecked();
        Assertions.assertThat(removeLocationChange).isInstanceOf(RemoveLocationChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveLocationChange.builder().change("change") },
                new Object[] { "previousValue", RemoveLocationChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LocationImpl()) } };
    }

    @Test
    public void change() {
        RemoveLocationChange value = RemoveLocationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveLocationChange value = RemoveLocationChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocationImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocationImpl());
    }
}
