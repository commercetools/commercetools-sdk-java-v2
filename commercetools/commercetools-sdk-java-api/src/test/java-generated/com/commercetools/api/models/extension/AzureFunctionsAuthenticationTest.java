
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AzureFunctionsAuthenticationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AzureFunctionsAuthenticationBuilder builder) {
        AzureFunctionsAuthentication azureFunctionsAuthentication = builder.buildUnchecked();
        Assertions.assertThat(azureFunctionsAuthentication).isInstanceOf(AzureFunctionsAuthentication.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AzureFunctionsAuthentication.builder().key("key") } };
    }

    @Test
    public void key() {
        AzureFunctionsAuthentication value = AzureFunctionsAuthentication.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
