
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
public class ProjectChangeCustomerSearchStatusActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeCustomerSearchStatusActionBuilder builder) {
        ProjectChangeCustomerSearchStatusAction projectChangeCustomerSearchStatusAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeCustomerSearchStatusAction)
                .isInstanceOf(ProjectChangeCustomerSearchStatusAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectChangeCustomerSearchStatusAction.builder()
                .status(com.commercetools.api.models.project.CustomerSearchStatus.findEnum("Activated")) } };
    }

    @Test
    public void status() {
        ProjectChangeCustomerSearchStatusAction value = ProjectChangeCustomerSearchStatusAction.of();
        value.setStatus(com.commercetools.api.models.project.CustomerSearchStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.CustomerSearchStatus.findEnum("Activated"));
    }
}
