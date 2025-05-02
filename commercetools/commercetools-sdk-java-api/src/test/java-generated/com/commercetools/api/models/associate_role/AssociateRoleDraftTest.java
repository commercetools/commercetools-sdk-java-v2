
package com.commercetools.api.models.associate_role;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleDraftBuilder builder) {
        AssociateRoleDraft associateRoleDraft = builder.buildUnchecked();
        Assertions.assertThat(associateRoleDraft).isInstanceOf(AssociateRoleDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AssociateRoleDraft.builder().key("key") },
                new Object[] { "name", AssociateRoleDraft.builder().name("name") },
                new Object[] { "buyerAssignable", AssociateRoleDraft.builder().buyerAssignable(true) },
                new Object[] { "permissions", AssociateRoleDraft.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) },
                new Object[] { "custom", AssociateRoleDraft.builder()
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
