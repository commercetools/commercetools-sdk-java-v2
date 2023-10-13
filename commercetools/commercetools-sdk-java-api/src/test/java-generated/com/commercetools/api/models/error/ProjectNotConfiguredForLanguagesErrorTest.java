
package com.commercetools.api.models.error;

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
public class ProjectNotConfiguredForLanguagesErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectNotConfiguredForLanguagesErrorBuilder builder) {
        ProjectNotConfiguredForLanguagesError projectNotConfiguredForLanguagesError = builder.buildUnchecked();
        Assertions.assertThat(projectNotConfiguredForLanguagesError)
                .isInstanceOf(ProjectNotConfiguredForLanguagesError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectNotConfiguredForLanguagesError.builder().message("message") },
                new Object[] { ProjectNotConfiguredForLanguagesError.builder()
                        .languages(Collections.singletonList("languages")) } };
    }

    @Test
    public void message() {
        ProjectNotConfiguredForLanguagesError value = ProjectNotConfiguredForLanguagesError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void languages() {
        ProjectNotConfiguredForLanguagesError value = ProjectNotConfiguredForLanguagesError.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }
}
