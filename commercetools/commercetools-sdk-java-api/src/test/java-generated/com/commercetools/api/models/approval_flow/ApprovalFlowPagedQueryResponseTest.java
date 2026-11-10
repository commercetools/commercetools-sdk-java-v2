
package com.commercetools.api.models.approval_flow;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowPagedQueryResponseBuilder builder) {
        ApprovalFlowPagedQueryResponse approvalFlowPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowPagedQueryResponse).isInstanceOf(ApprovalFlowPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ApprovalFlowPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ApprovalFlowPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ApprovalFlowPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ApprovalFlowPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        ApprovalFlowPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.approval_flow.ApprovalFlowImpl())) } };
    }

    @Test
    public void limit() {
        ApprovalFlowPagedQueryResponse value = ApprovalFlowPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ApprovalFlowPagedQueryResponse value = ApprovalFlowPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ApprovalFlowPagedQueryResponse value = ApprovalFlowPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ApprovalFlowPagedQueryResponse value = ApprovalFlowPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ApprovalFlowPagedQueryResponse value = ApprovalFlowPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl()));
    }
}
