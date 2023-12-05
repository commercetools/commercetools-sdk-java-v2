
package com.commercetools.api.models.message;

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
public class AssociateRolePermissionAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRolePermissionAddedMessagePayloadBuilder builder) {
        AssociateRolePermissionAddedMessagePayload associateRolePermissionAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(associateRolePermissionAddedMessagePayload)
                .isInstanceOf(AssociateRolePermissionAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRolePermissionAddedMessagePayload.builder()
                .permission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")) } };
    }

    @Test
    public void permission() {
        AssociateRolePermissionAddedMessagePayload value = AssociateRolePermissionAddedMessagePayload.of();
        value.setPermission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
        Assertions.assertThat(value.getPermission())
                .isEqualTo(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
    }
}
