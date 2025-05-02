
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRulePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRulePagedQueryResponseBuilder builder) {
        ApprovalRulePagedQueryResponse approvalRulePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(approvalRulePagedQueryResponse).isInstanceOf(ApprovalRulePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ApprovalRulePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ApprovalRulePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ApprovalRulePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ApprovalRulePagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        ApprovalRulePagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.ApprovalRuleImpl())) } };
    }

    @Test
    public void limit() {
        ApprovalRulePagedQueryResponse value = ApprovalRulePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ApprovalRulePagedQueryResponse value = ApprovalRulePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ApprovalRulePagedQueryResponse value = ApprovalRulePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ApprovalRulePagedQueryResponse value = ApprovalRulePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ApprovalRulePagedQueryResponse value = ApprovalRulePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl()));
    }
}
