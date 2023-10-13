
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
public class AssociateRoleCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleCreatedMessageBuilder builder) {
        AssociateRoleCreatedMessage associateRoleCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(associateRoleCreatedMessage).isInstanceOf(AssociateRoleCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleCreatedMessage.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleImpl()) } };
    }

    @Test
    public void associateRole() {
        AssociateRoleCreatedMessage value = AssociateRoleCreatedMessage.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
    }
}
