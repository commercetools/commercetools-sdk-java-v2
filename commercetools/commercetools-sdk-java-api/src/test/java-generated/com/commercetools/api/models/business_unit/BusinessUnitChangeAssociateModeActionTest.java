
package com.commercetools.api.models.business_unit;

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
public class BusinessUnitChangeAssociateModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitChangeAssociateModeActionBuilder builder) {
        BusinessUnitChangeAssociateModeAction businessUnitChangeAssociateModeAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeAssociateModeAction)
                .isInstanceOf(BusinessUnitChangeAssociateModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitChangeAssociateModeAction.builder()
                .associateMode(
                    com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit")) } };
    }

    @Test
    public void associateMode() {
        BusinessUnitChangeAssociateModeAction value = BusinessUnitChangeAssociateModeAction.of();
        value.setAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }
}
