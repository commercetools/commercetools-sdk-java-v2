
package com.commercetools.api.models.associate_role;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class AssociateRolePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRolePagedQueryResponseBuilder builder) {
        AssociateRolePagedQueryResponse associateRolePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(associateRolePagedQueryResponse).isInstanceOf(AssociateRolePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRolePagedQueryResponse.builder().limit(7L) },
                new Object[] { AssociateRolePagedQueryResponse.builder().offset(3L) },
                new Object[] { AssociateRolePagedQueryResponse.builder().count(2L) },
                new Object[] { AssociateRolePagedQueryResponse.builder().total(1L) },
                new Object[] { AssociateRolePagedQueryResponse.builder()
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
