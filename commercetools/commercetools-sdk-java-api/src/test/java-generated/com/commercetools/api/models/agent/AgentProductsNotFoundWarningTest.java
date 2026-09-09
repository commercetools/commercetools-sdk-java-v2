
package com.commercetools.api.models.agent;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentProductsNotFoundWarningTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentProductsNotFoundWarningBuilder builder) {
        AgentProductsNotFoundWarning agentProductsNotFoundWarning = builder.buildUnchecked();
        Assertions.assertThat(agentProductsNotFoundWarning).isInstanceOf(AgentProductsNotFoundWarning.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentProductsNotFoundWarning.builder().message("message") },
                new Object[] { "products",
                        AgentProductsNotFoundWarning.builder().products(Collections.singletonList("products")) } };
    }

    @Test
    public void message() {
        AgentProductsNotFoundWarning value = AgentProductsNotFoundWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void products() {
        AgentProductsNotFoundWarning value = AgentProductsNotFoundWarning.of();
        value.setProducts(Collections.singletonList("products"));
        Assertions.assertThat(value.getProducts()).isEqualTo(Collections.singletonList("products"));
    }
}
