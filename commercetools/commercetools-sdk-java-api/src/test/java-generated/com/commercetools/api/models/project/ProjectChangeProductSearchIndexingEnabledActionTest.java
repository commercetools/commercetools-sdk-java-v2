
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
public class ProjectChangeProductSearchIndexingEnabledActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeProductSearchIndexingEnabledActionBuilder builder) {
        ProjectChangeProductSearchIndexingEnabledAction projectChangeProductSearchIndexingEnabledAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeProductSearchIndexingEnabledAction)
                .isInstanceOf(ProjectChangeProductSearchIndexingEnabledAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProjectChangeProductSearchIndexingEnabledAction.builder().enabled(true) } };
    }

    @Test
    public void enabled() {
        ProjectChangeProductSearchIndexingEnabledAction value = ProjectChangeProductSearchIndexingEnabledAction.of();
        value.setEnabled(true);
        Assertions.assertThat(value.getEnabled()).isEqualTo(true);
    }
}
