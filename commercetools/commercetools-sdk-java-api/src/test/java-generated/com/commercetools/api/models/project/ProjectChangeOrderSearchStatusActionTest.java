
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
public class ProjectChangeOrderSearchStatusActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeOrderSearchStatusActionBuilder builder) {
        ProjectChangeOrderSearchStatusAction projectChangeOrderSearchStatusAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeOrderSearchStatusAction)
                .isInstanceOf(ProjectChangeOrderSearchStatusAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectChangeOrderSearchStatusAction.builder()
                .status(com.commercetools.api.models.project.OrderSearchStatus.findEnum("Activated")) } };
    }

    @Test
    public void status() {
        ProjectChangeOrderSearchStatusAction value = ProjectChangeOrderSearchStatusAction.of();
        value.setStatus(com.commercetools.api.models.project.OrderSearchStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.OrderSearchStatus.findEnum("Activated"));
    }
}
