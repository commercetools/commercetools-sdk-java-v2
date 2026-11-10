
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeShoppingListsConfigurationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeShoppingListsConfigurationActionBuilder builder) {
        ProjectChangeShoppingListsConfigurationAction projectChangeShoppingListsConfigurationAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeShoppingListsConfigurationAction)
                .isInstanceOf(ProjectChangeShoppingListsConfigurationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shoppingListsConfiguration",
                ProjectChangeShoppingListsConfigurationAction.builder()
                        .shoppingListsConfiguration(
                            new com.commercetools.api.models.project.ShoppingListsConfigurationImpl()) } };
    }

    @Test
    public void shoppingListsConfiguration() {
        ProjectChangeShoppingListsConfigurationAction value = ProjectChangeShoppingListsConfigurationAction.of();
        value.setShoppingListsConfiguration(new com.commercetools.api.models.project.ShoppingListsConfigurationImpl());
        Assertions.assertThat(value.getShoppingListsConfiguration())
                .isEqualTo(new com.commercetools.api.models.project.ShoppingListsConfigurationImpl());
    }
}
