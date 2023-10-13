
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
public class ProjectChangeLanguagesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeLanguagesActionBuilder builder) {
        ProjectChangeLanguagesAction projectChangeLanguagesAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeLanguagesAction).isInstanceOf(ProjectChangeLanguagesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ProjectChangeLanguagesAction.builder().languages(Collections.singletonList("languages")) } };
    }

    @Test
    public void languages() {
        ProjectChangeLanguagesAction value = ProjectChangeLanguagesAction.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }
}
