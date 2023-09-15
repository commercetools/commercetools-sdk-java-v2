
package com.commercetools.api.models.associate_role;

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
public class AssociateRoleChangeBuyerAssignableActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleChangeBuyerAssignableActionBuilder builder) {
        AssociateRoleChangeBuyerAssignableAction associateRoleChangeBuyerAssignableAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleChangeBuyerAssignableAction)
                .isInstanceOf(AssociateRoleChangeBuyerAssignableAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AssociateRoleChangeBuyerAssignableAction.builder().buyerAssignable(true) } };
    }

    @Test
    public void buyerAssignable() {
        AssociateRoleChangeBuyerAssignableAction value = AssociateRoleChangeBuyerAssignableAction.of();
        value.setBuyerAssignable(true);
        Assertions.assertThat(value.getBuyerAssignable()).isEqualTo(true);
    }
}
