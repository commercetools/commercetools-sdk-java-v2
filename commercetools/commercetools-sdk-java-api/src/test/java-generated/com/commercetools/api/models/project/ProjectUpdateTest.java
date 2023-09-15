
package com.commercetools.api.models.project;

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
public class ProjectUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectUpdateBuilder builder) {
        ProjectUpdate projectUpdate = builder.buildUnchecked();
        Assertions.assertThat(projectUpdate).isInstanceOf(ProjectUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectUpdate.builder().version(2L) },
                new Object[] { ProjectUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.project.ProjectUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProjectUpdate value = ProjectUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProjectUpdate value = ProjectUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.project.ProjectUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.project.ProjectUpdateActionImpl()));
    }
}
