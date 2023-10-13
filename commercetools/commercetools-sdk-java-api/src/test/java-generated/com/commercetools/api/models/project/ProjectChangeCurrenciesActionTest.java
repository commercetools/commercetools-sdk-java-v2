
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
public class ProjectChangeCurrenciesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeCurrenciesActionBuilder builder) {
        ProjectChangeCurrenciesAction projectChangeCurrenciesAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeCurrenciesAction).isInstanceOf(ProjectChangeCurrenciesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ProjectChangeCurrenciesAction.builder().currencies(Collections.singletonList("currencies")) } };
    }

    @Test
    public void currencies() {
        ProjectChangeCurrenciesAction value = ProjectChangeCurrenciesAction.of();
        value.setCurrencies(Collections.singletonList("currencies"));
        Assertions.assertThat(value.getCurrencies()).isEqualTo(Collections.singletonList("currencies"));
    }
}
