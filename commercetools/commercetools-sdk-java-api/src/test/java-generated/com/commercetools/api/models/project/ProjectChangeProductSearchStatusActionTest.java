
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
public class ProjectChangeProductSearchStatusActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeProductSearchStatusActionBuilder builder) {
        ProjectChangeProductSearchStatusAction projectChangeProductSearchStatusAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeProductSearchStatusAction)
                .isInstanceOf(ProjectChangeProductSearchStatusAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectChangeProductSearchStatusAction.builder()
                .status(com.commercetools.api.models.project.ProductSearchStatus.findEnum("Activated")) } };
    }

    @Test
    public void status() {
        ProjectChangeProductSearchStatusAction value = ProjectChangeProductSearchStatusAction.of();
        value.setStatus(com.commercetools.api.models.project.ProductSearchStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.ProductSearchStatus.findEnum("Activated"));
    }
}
