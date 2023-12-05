
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
public class ProjectChangeBusinessUnitStatusOnCreationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeBusinessUnitStatusOnCreationActionBuilder builder) {
        ProjectChangeBusinessUnitStatusOnCreationAction projectChangeBusinessUnitStatusOnCreationAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeBusinessUnitStatusOnCreationAction)
                .isInstanceOf(ProjectChangeBusinessUnitStatusOnCreationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectChangeBusinessUnitStatusOnCreationAction.builder()
                .status(com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        ProjectChangeBusinessUnitStatusOnCreationAction value = ProjectChangeBusinessUnitStatusOnCreationAction.of();
        value.setStatus(com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active"));
    }
}
