
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerSetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerSetNameActionBuilder builder) {
        McpServerSetNameAction mcpServerSetNameAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerSetNameAction).isInstanceOf(McpServerSetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", McpServerSetNameAction.builder()
                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        McpServerSetNameAction value = McpServerSetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
