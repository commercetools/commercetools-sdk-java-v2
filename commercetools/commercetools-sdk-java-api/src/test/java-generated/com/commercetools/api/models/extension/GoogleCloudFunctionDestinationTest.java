
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GoogleCloudFunctionDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GoogleCloudFunctionDestinationBuilder builder) {
        GoogleCloudFunctionDestination googleCloudFunctionDestination = builder.buildUnchecked();
        Assertions.assertThat(googleCloudFunctionDestination).isInstanceOf(GoogleCloudFunctionDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "url", GoogleCloudFunctionDestination.builder().url("url") } };
    }

    @Test
    public void url() {
        GoogleCloudFunctionDestination value = GoogleCloudFunctionDestination.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }
}
