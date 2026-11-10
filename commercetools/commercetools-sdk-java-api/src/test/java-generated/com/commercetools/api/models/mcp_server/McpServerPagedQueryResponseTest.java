
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerPagedQueryResponseBuilder builder) {
        McpServerPagedQueryResponse mcpServerPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(mcpServerPagedQueryResponse).isInstanceOf(McpServerPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", McpServerPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", McpServerPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", McpServerPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", McpServerPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", McpServerPagedQueryResponse.builder()
                        .results(
                            Collections.singletonList(new com.commercetools.api.models.mcp_server.McpServerImpl())) } };
    }

    @Test
    public void limit() {
        McpServerPagedQueryResponse value = McpServerPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        McpServerPagedQueryResponse value = McpServerPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        McpServerPagedQueryResponse value = McpServerPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        McpServerPagedQueryResponse value = McpServerPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        McpServerPagedQueryResponse value = McpServerPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.mcp_server.McpServerImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.mcp_server.McpServerImpl()));
    }
}
