
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterOverrideTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParameterOverrideBuilder builder) {
        ParameterOverride parameterOverride = builder.buildUnchecked();
        Assertions.assertThat(parameterOverride).isInstanceOf(ParameterOverride.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ParameterOverride.builder().name("name") },
                new Object[] { "description", ParameterOverride.builder().description("description") },
                new Object[] { "const", ParameterOverride.builder()._const("_const") },
                new Object[] { "default", ParameterOverride.builder()._default("_default") },
                new Object[] { "allowedTypes",
                        ParameterOverride.builder().allowedTypes(Collections.singletonList("allowedTypes")) } };
    }

    @Test
    public void name() {
        ParameterOverride value = ParameterOverride.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ParameterOverride value = ParameterOverride.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void _const() {
        ParameterOverride value = ParameterOverride.of();
        value.setConst("const");
        Assertions.assertThat(value.getConst()).isEqualTo("const");
    }

    @Test
    public void _default() {
        ParameterOverride value = ParameterOverride.of();
        value.setDefault("default");
        Assertions.assertThat(value.getDefault()).isEqualTo("default");
    }

    @Test
    public void allowedTypes() {
        ParameterOverride value = ParameterOverride.of();
        value.setAllowedTypes(Collections.singletonList("allowedTypes"));
        Assertions.assertThat(value.getAllowedTypes()).isEqualTo(Collections.singletonList("allowedTypes"));
    }
}
