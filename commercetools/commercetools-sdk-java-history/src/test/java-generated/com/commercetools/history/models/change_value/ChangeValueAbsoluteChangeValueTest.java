
package com.commercetools.history.models.change_value;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeValueAbsoluteChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeValueAbsoluteChangeValueBuilder builder) {
        ChangeValueAbsoluteChangeValue changeValueAbsoluteChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeValueAbsoluteChangeValue).isInstanceOf(ChangeValueAbsoluteChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "money", ChangeValueAbsoluteChangeValue.builder()
                .money(Collections.singletonList(new com.commercetools.history.models.common.MoneyImpl())) } };
    }

    @Test
    public void money() {
        ChangeValueAbsoluteChangeValue value = ChangeValueAbsoluteChangeValue.of();
        value.setMoney(Collections.singletonList(new com.commercetools.history.models.common.MoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.MoneyImpl()));
    }
}
