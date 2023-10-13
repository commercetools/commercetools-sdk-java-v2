
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
public class ProjectChangeCountriesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeCountriesActionBuilder builder) {
        ProjectChangeCountriesAction projectChangeCountriesAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeCountriesAction).isInstanceOf(ProjectChangeCountriesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ProjectChangeCountriesAction.builder().countries(Collections.singletonList("countries")) } };
    }

    @Test
    public void countries() {
        ProjectChangeCountriesAction value = ProjectChangeCountriesAction.of();
        value.setCountries(Collections.singletonList("countries"));
        Assertions.assertThat(value.getCountries()).isEqualTo(Collections.singletonList("countries"));
    }
}
