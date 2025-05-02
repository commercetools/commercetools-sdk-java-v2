
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeValueRelativeChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeValueRelativeChangeValueBuilder builder) {
        ChangeValueRelativeChangeValue changeValueRelativeChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeValueRelativeChangeValue).isInstanceOf(ChangeValueRelativeChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permyriad", ChangeValueRelativeChangeValue.builder().permyriad(1) } };
    }

    @Test
    public void permyriad() {
        ChangeValueRelativeChangeValue value = ChangeValueRelativeChangeValue.of();
        value.setPermyriad(1);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1);
    }
}
