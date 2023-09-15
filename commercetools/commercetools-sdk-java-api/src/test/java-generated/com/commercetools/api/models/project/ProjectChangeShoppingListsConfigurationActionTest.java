
package com.commercetools.api.models.project;

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
public class ProjectChangeShoppingListsConfigurationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeShoppingListsConfigurationActionBuilder builder) {
        ProjectChangeShoppingListsConfigurationAction projectChangeShoppingListsConfigurationAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeShoppingListsConfigurationAction)
                .isInstanceOf(ProjectChangeShoppingListsConfigurationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectChangeShoppingListsConfigurationAction.builder()
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
