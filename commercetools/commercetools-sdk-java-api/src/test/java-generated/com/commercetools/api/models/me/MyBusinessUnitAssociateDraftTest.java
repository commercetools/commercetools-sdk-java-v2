
package com.commercetools.api.models.me;

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
public class MyBusinessUnitAssociateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitAssociateDraftBuilder builder) {
        MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitAssociateDraft).isInstanceOf(MyBusinessUnitAssociateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyBusinessUnitAssociateDraft.builder().version(2L) },
                new Object[] { MyBusinessUnitAssociateDraft.builder()
                        .customer(new com.commercetools.api.models.me.MyCustomerDraftImpl()) },
                new Object[] { MyBusinessUnitAssociateDraft.builder()
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
