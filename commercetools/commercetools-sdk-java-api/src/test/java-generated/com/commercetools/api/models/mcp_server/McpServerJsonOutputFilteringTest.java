
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerJsonOutputFilteringTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerJsonOutputFilteringBuilder builder) {
        McpServerJsonOutputFiltering mcpServerJsonOutputFiltering = builder.buildUnchecked();
        Assertions.assertThat(mcpServerJsonOutputFiltering).isInstanceOf(McpServerJsonOutputFiltering.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "redact", McpServerJsonOutputFiltering.builder()
                .redact(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherImpl()) },
                new Object[] { "drop", McpServerJsonOutputFiltering.builder()
                        .drop(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherImpl()) },
                new Object[] { "fieldPathsToKeep",
                        McpServerJsonOutputFiltering.builder()
                                .fieldPathsToKeep(Collections.singletonList("fieldPathsToKeep")) },
                new Object[] { "redactedWith", McpServerJsonOutputFiltering.builder().redactedWith("redactedWith") } };
    }

    @Test
    public void redact() {
        McpServerJsonOutputFiltering value = McpServerJsonOutputFiltering.of();
        value.setRedact(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherImpl());
        Assertions.assertThat(value.getRedact())
                .isEqualTo(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherImpl());
    }

    @Test
    public void drop() {
        McpServerJsonOutputFiltering value = McpServerJsonOutputFiltering.of();
        value.setDrop(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherImpl());
        Assertions.assertThat(value.getDrop())
                .isEqualTo(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherImpl());
    }

    @Test
    public void fieldPathsToKeep() {
        McpServerJsonOutputFiltering value = McpServerJsonOutputFiltering.of();
        value.setFieldPathsToKeep(Collections.singletonList("fieldPathsToKeep"));
        Assertions.assertThat(value.getFieldPathsToKeep()).isEqualTo(Collections.singletonList("fieldPathsToKeep"));
    }

    @Test
    public void redactedWith() {
        McpServerJsonOutputFiltering value = McpServerJsonOutputFiltering.of();
        value.setRedactedWith("redactedWith");
        Assertions.assertThat(value.getRedactedWith()).isEqualTo("redactedWith");
    }
}
