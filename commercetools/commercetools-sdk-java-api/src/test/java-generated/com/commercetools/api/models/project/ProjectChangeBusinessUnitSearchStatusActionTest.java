
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
public class ProjectChangeBusinessUnitSearchStatusActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeBusinessUnitSearchStatusActionBuilder builder) {
        ProjectChangeBusinessUnitSearchStatusAction projectChangeBusinessUnitSearchStatusAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeBusinessUnitSearchStatusAction)
                .isInstanceOf(ProjectChangeBusinessUnitSearchStatusAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectChangeBusinessUnitSearchStatusAction.builder()
                .status(com.commercetools.api.models.project.BusinessUnitSearchStatus.findEnum("Activated")) } };
    }

    @Test
    public void status() {
        ProjectChangeBusinessUnitSearchStatusAction value = ProjectChangeBusinessUnitSearchStatusAction.of();
        value.setStatus(com.commercetools.api.models.project.BusinessUnitSearchStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.BusinessUnitSearchStatus.findEnum("Activated"));
    }
}
