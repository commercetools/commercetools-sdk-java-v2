
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerJsonOutputFilteringMatcherTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerJsonOutputFilteringMatcherBuilder builder) {
        McpServerJsonOutputFilteringMatcher mcpServerJsonOutputFilteringMatcher = builder.buildUnchecked();
        Assertions.assertThat(mcpServerJsonOutputFilteringMatcher)
                .isInstanceOf(McpServerJsonOutputFilteringMatcher.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fieldPaths",
                        McpServerJsonOutputFilteringMatcher.builder()
                                .fieldPaths(Collections.singletonList("fieldPaths")) },
                new Object[] { "fieldNames",
                        McpServerJsonOutputFilteringMatcher.builder()
                                .fieldNames(Collections.singletonList("fieldNames")) },
                new Object[] { "fieldNameContains", McpServerJsonOutputFilteringMatcher.builder()
                        .fieldNameContains(Collections.singletonList("fieldNameContains")) } };
    }

    @Test
    public void fieldPaths() {
        McpServerJsonOutputFilteringMatcher value = McpServerJsonOutputFilteringMatcher.of();
        value.setFieldPaths(Collections.singletonList("fieldPaths"));
        Assertions.assertThat(value.getFieldPaths()).isEqualTo(Collections.singletonList("fieldPaths"));
    }

    @Test
    public void fieldNames() {
        McpServerJsonOutputFilteringMatcher value = McpServerJsonOutputFilteringMatcher.of();
        value.setFieldNames(Collections.singletonList("fieldNames"));
        Assertions.assertThat(value.getFieldNames()).isEqualTo(Collections.singletonList("fieldNames"));
    }

    @Test
    public void fieldNameContains() {
        McpServerJsonOutputFilteringMatcher value = McpServerJsonOutputFilteringMatcher.of();
        value.setFieldNameContains(Collections.singletonList("fieldNameContains"));
        Assertions.assertThat(value.getFieldNameContains()).isEqualTo(Collections.singletonList("fieldNameContains"));
    }
}
