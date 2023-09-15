
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
public class AssociateRoleUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleUpdateBuilder builder) {
        AssociateRoleUpdate associateRoleUpdate = builder.buildUnchecked();
        Assertions.assertThat(associateRoleUpdate).isInstanceOf(AssociateRoleUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleUpdate.builder().version(2L) },
                new Object[] { AssociateRoleUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.associate_role.AssociateRoleUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        AssociateRoleUpdate value = AssociateRoleUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        AssociateRoleUpdate value = AssociateRoleUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.associate_role.AssociateRoleUpdateActionImpl()));
    }
}
