
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
public class ProjectSetShippingRateInputTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectSetShippingRateInputTypeActionBuilder builder) {
        ProjectSetShippingRateInputTypeAction projectSetShippingRateInputTypeAction = builder.buildUnchecked();
        Assertions.assertThat(projectSetShippingRateInputTypeAction)
                .isInstanceOf(ProjectSetShippingRateInputTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectSetShippingRateInputTypeAction.builder()
                .shippingRateInputType(new com.commercetools.api.models.project.ShippingRateInputTypeImpl()) } };
    }

    @Test
    public void shippingRateInputType() {
        ProjectSetShippingRateInputTypeAction value = ProjectSetShippingRateInputTypeAction.of();
        value.setShippingRateInputType(new com.commercetools.api.models.project.ShippingRateInputTypeImpl());
        Assertions.assertThat(value.getShippingRateInputType())
                .isEqualTo(new com.commercetools.api.models.project.ShippingRateInputTypeImpl());
    }
}
