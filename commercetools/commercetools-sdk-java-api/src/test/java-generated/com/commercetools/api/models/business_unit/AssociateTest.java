
package com.commercetools.api.models.business_unit;

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
public class AssociateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateBuilder builder) {
        Associate associate = builder.buildUnchecked();
        Assertions.assertThat(associate).isInstanceOf(Associate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { Associate.builder()
                        .associateRoleAssignments(Collections.singletonList(
                            new com.commercetools.api.models.business_unit.AssociateRoleAssignmentImpl())) },
                new Object[] { Associate.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void associateRoleAssignments() {
        Associate value = Associate.of();
        value.setAssociateRoleAssignments(
            Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateRoleAssignmentImpl()));
        Assertions.assertThat(value.getAssociateRoleAssignments())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.business_unit.AssociateRoleAssignmentImpl()));
    }

    @Test
    public void customer() {
        Associate value = Associate.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
