
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidFromAndUntilValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ValidFromAndUntilValueBuilder builder) {
        ValidFromAndUntilValue validFromAndUntilValue = builder.buildUnchecked();
        Assertions.assertThat(validFromAndUntilValue).isInstanceOf(ValidFromAndUntilValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validFrom", ValidFromAndUntilValue.builder().validFrom("validFrom") },
                new Object[] { "validUntil", ValidFromAndUntilValue.builder().validUntil("validUntil") } };
    }

    @Test
    public void validFrom() {
        ValidFromAndUntilValue value = ValidFromAndUntilValue.of();
        value.setValidFrom("validFrom");
        Assertions.assertThat(value.getValidFrom()).isEqualTo("validFrom");
    }

    @Test
    public void validUntil() {
        ValidFromAndUntilValue value = ValidFromAndUntilValue.of();
        value.setValidUntil("validUntil");
        Assertions.assertThat(value.getValidUntil()).isEqualTo("validUntil");
    }
}
