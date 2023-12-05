
package com.commercetools.api.models.associate_role;

import java.time.ZonedDateTime;
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
public class AssociateRoleTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleBuilder builder) {
        AssociateRole associateRole = builder.buildUnchecked();
        Assertions.assertThat(associateRole).isInstanceOf(AssociateRole.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRole.builder().id("id") },
                new Object[] { AssociateRole.builder().version(2L) },
                new Object[] { AssociateRole.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { AssociateRole.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { AssociateRole.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        AssociateRole.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { AssociateRole.builder().key("key") },
                new Object[] { AssociateRole.builder().buyerAssignable(true) },
                new Object[] { AssociateRole.builder().name("name") },
                new Object[] { AssociateRole.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) },
                new Object[] {
                        AssociateRole.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        AssociateRole value = AssociateRole.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        AssociateRole value = AssociateRole.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        AssociateRole value = AssociateRole.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        AssociateRole value = AssociateRole.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        AssociateRole value = AssociateRole.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        AssociateRole value = AssociateRole.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        AssociateRole value = AssociateRole.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void buyerAssignable() {
        AssociateRole value = AssociateRole.of();
        value.setBuyerAssignable(true);
        Assertions.assertThat(value.getBuyerAssignable()).isEqualTo(true);
    }

    @Test
    public void name() {
        AssociateRole value = AssociateRole.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void permissions() {
        AssociateRole value = AssociateRole.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }

    @Test
    public void custom() {
        AssociateRole value = AssociateRole.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
