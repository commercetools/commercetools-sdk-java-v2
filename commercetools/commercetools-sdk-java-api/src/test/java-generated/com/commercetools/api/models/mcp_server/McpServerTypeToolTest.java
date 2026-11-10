
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerTypeToolTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerTypeToolBuilder builder) {
        McpServerTypeTool mcpServerTypeTool = builder.buildUnchecked();
        Assertions.assertThat(mcpServerTypeTool).isInstanceOf(McpServerTypeTool.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", McpServerTypeTool.builder().name("name") },
                new Object[] { "description", McpServerTypeTool.builder().description("description") },
                new Object[] { "operationType", McpServerTypeTool.builder().operationType("operationType") },
                new Object[] { "groups", McpServerTypeTool.builder().groups(Collections.singletonList("groups")) } };
    }

    @Test
    public void name() {
        McpServerTypeTool value = McpServerTypeTool.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        McpServerTypeTool value = McpServerTypeTool.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void operationType() {
        McpServerTypeTool value = McpServerTypeTool.of();
        value.setOperationType("operationType");
        Assertions.assertThat(value.getOperationType()).isEqualTo("operationType");
    }

    @Test
    public void groups() {
        McpServerTypeTool value = McpServerTypeTool.of();
        value.setGroups(Collections.singletonList("groups"));
        Assertions.assertThat(value.getGroups()).isEqualTo(Collections.singletonList("groups"));
    }
}
