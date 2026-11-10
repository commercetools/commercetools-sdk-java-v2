
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerTypeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerTypeBuilder builder) {
        McpServerType mcpServerType = builder.buildUnchecked();
        Assertions.assertThat(mcpServerType).isInstanceOf(McpServerType.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", McpServerType.builder().type("type") },
                new Object[] { "majorVersion", McpServerType.builder().majorVersion("majorVersion") },
                new Object[] { "tools",
                        McpServerType.builder()
                                .tools(Collections.singletonList(
                                    new com.commercetools.api.models.mcp_server.McpServerTypeToolImpl())) } };
    }

    @Test
    public void type() {
        McpServerType value = McpServerType.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void majorVersion() {
        McpServerType value = McpServerType.of();
        value.setMajorVersion("majorVersion");
        Assertions.assertThat(value.getMajorVersion()).isEqualTo("majorVersion");
    }

    @Test
    public void tools() {
        McpServerType value = McpServerType.of();
        value.setTools(Collections.singletonList(new com.commercetools.api.models.mcp_server.McpServerTypeToolImpl()));
        Assertions.assertThat(value.getTools())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.mcp_server.McpServerTypeToolImpl()));
    }
}
