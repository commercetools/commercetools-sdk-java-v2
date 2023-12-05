
package com.commercetools.api.models.message;

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
public class AssociateRolePermissionsSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRolePermissionsSetMessageBuilder builder) {
        AssociateRolePermissionsSetMessage associateRolePermissionsSetMessage = builder.buildUnchecked();
        Assertions.assertThat(associateRolePermissionsSetMessage)
                .isInstanceOf(AssociateRolePermissionsSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRolePermissionsSetMessage.builder()
                .permissions(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void permissions() {
        AssociateRolePermissionsSetMessage value = AssociateRolePermissionsSetMessage.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }
}
