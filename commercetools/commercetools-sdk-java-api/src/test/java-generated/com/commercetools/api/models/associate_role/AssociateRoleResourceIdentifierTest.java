
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
public class AssociateRoleResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleResourceIdentifierBuilder builder) {
        AssociateRoleResourceIdentifier associateRoleResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(associateRoleResourceIdentifier).isInstanceOf(AssociateRoleResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleResourceIdentifier.builder().id("id") },
                new Object[] { AssociateRoleResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        AssociateRoleResourceIdentifier value = AssociateRoleResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        AssociateRoleResourceIdentifier value = AssociateRoleResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
