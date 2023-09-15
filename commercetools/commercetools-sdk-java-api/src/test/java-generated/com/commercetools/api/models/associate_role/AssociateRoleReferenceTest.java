
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
public class AssociateRoleReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleReferenceBuilder builder) {
        AssociateRoleReference associateRoleReference = builder.buildUnchecked();
        Assertions.assertThat(associateRoleReference).isInstanceOf(AssociateRoleReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AssociateRoleReference.builder()
                        .obj(new com.commercetools.api.models.associate_role.AssociateRoleImpl()) },
                new Object[] { AssociateRoleReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        AssociateRoleReference value = AssociateRoleReference.of();
        value.setObj(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
    }

    @Test
    public void id() {
        AssociateRoleReference value = AssociateRoleReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
