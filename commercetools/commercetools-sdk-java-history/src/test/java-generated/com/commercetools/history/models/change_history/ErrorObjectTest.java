
package com.commercetools.history.models.change_history;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ErrorObjectTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ErrorObjectBuilder builder) {
        ErrorObject errorObject = builder.buildUnchecked();
        Assertions.assertThat(errorObject).isInstanceOf(ErrorObject.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", ErrorObject.builder().code("code") },
                new Object[] { "message", ErrorObject.builder().message("message") } };
    }

    @Test
    public void code() {
        ErrorObject value = ErrorObject.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void message() {
        ErrorObject value = ErrorObject.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
