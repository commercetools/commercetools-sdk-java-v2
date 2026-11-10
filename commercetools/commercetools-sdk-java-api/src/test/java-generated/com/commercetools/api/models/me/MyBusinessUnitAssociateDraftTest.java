
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitAssociateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitAssociateDraftBuilder builder) {
        MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitAssociateDraft).isInstanceOf(MyBusinessUnitAssociateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyBusinessUnitAssociateDraft.builder().version(2L) },
                new Object[] { "customer",
                        MyBusinessUnitAssociateDraft.builder()
                                .customer(new com.commercetools.api.models.me.MyCustomerDraftImpl()) },
                new Object[] { "associateRoleAssignments", MyBusinessUnitAssociateDraft.builder()
                        .associateRoleAssignments(Collections.singletonList(
                            new com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftImpl())) } };
    }

    @Test
    public void version() {
        MyBusinessUnitAssociateDraft value = MyBusinessUnitAssociateDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void customer() {
        MyBusinessUnitAssociateDraft value = MyBusinessUnitAssociateDraft.of();
        value.setCustomer(new com.commercetools.api.models.me.MyCustomerDraftImpl());
        Assertions.assertThat(value.getCustomer()).isEqualTo(new com.commercetools.api.models.me.MyCustomerDraftImpl());
    }

    @Test
    public void associateRoleAssignments() {
        MyBusinessUnitAssociateDraft value = MyBusinessUnitAssociateDraft.of();
        value.setAssociateRoleAssignments(Collections
                .singletonList(new com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftImpl()));
    }
}
