
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
public class ProjectChangeCountryTaxRateFallbackEnabledActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder) {
        ProjectChangeCountryTaxRateFallbackEnabledAction projectChangeCountryTaxRateFallbackEnabledAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeCountryTaxRateFallbackEnabledAction)
                .isInstanceOf(ProjectChangeCountryTaxRateFallbackEnabledAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ProjectChangeCountryTaxRateFallbackEnabledAction.builder().countryTaxRateFallbackEnabled(true) } };
    }

    @Test
    public void countryTaxRateFallbackEnabled() {
        ProjectChangeCountryTaxRateFallbackEnabledAction value = ProjectChangeCountryTaxRateFallbackEnabledAction.of();
        value.setCountryTaxRateFallbackEnabled(true);
        Assertions.assertThat(value.getCountryTaxRateFallbackEnabled()).isEqualTo(true);
    }
}
