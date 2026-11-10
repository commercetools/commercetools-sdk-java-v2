
package com.commercetools.api.models.associate_role;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRolePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRolePagedQueryResponseBuilder builder) {
        AssociateRolePagedQueryResponse associateRolePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(associateRolePagedQueryResponse).isInstanceOf(AssociateRolePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", AssociateRolePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", AssociateRolePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", AssociateRolePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", AssociateRolePagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        AssociateRolePagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.associate_role.AssociateRoleImpl())) } };
    }

    @Test
    public void limit() {
        AssociateRolePagedQueryResponse value = AssociateRolePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        AssociateRolePagedQueryResponse value = AssociateRolePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        AssociateRolePagedQueryResponse value = AssociateRolePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        AssociateRolePagedQueryResponse value = AssociateRolePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        AssociateRolePagedQueryResponse value = AssociateRolePagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleImpl()));
    }
}
