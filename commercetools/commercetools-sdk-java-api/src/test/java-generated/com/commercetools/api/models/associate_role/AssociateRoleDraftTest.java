
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
public class AssociateRoleDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleDraftBuilder builder) {
        AssociateRoleDraft associateRoleDraft = builder.buildUnchecked();
        Assertions.assertThat(associateRoleDraft).isInstanceOf(AssociateRoleDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleDraft.builder().key("key") },
                new Object[] { AssociateRoleDraft.builder().name("name") },
                new Object[] { AssociateRoleDraft.builder().buyerAssignable(true) },
                new Object[] { AssociateRoleDraft.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) },
                new Object[] { AssociateRoleDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        AssociateRoleDraft value = AssociateRoleDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        AssociateRoleDraft value = AssociateRoleDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void buyerAssignable() {
        AssociateRoleDraft value = AssociateRoleDraft.of();
        value.setBuyerAssignable(true);
        Assertions.assertThat(value.getBuyerAssignable()).isEqualTo(true);
    }

    @Test
    public void permissions() {
        AssociateRoleDraft value = AssociateRoleDraft.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }

    @Test
    public void custom() {
        AssociateRoleDraft value = AssociateRoleDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
