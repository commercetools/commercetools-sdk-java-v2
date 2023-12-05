
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
public class AssociateRoleSetNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleSetNameActionBuilder builder) {
        AssociateRoleSetNameAction associateRoleSetNameAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleSetNameAction).isInstanceOf(AssociateRoleSetNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleSetNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        AssociateRoleSetNameAction value = AssociateRoleSetNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
