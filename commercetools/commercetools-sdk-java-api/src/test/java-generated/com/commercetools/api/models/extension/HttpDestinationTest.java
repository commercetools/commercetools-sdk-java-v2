
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class HttpDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, HttpDestinationBuilder builder) {
        HttpDestination httpDestination = builder.buildUnchecked();
        Assertions.assertThat(httpDestination).isInstanceOf(HttpDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "url", HttpDestination.builder().url("url") },
                new Object[] { "authentication",
                        HttpDestination.builder()
                                .authentication(
                                    new com.commercetools.api.models.extension.HttpDestinationAuthenticationImpl()) } };
    }

    @Test
    public void url() {
        HttpDestination value = HttpDestination.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }

    @Test
    public void authentication() {
        HttpDestination value = HttpDestination.of();
        value.setAuthentication(new com.commercetools.api.models.extension.HttpDestinationAuthenticationImpl());
        Assertions.assertThat(value.getAuthentication())
                .isEqualTo(new com.commercetools.api.models.extension.HttpDestinationAuthenticationImpl());
    }
}
