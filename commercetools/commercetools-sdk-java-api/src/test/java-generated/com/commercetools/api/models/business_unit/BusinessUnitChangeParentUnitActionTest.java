
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
public class BusinessUnitChangeParentUnitActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitChangeParentUnitActionBuilder builder) {
        BusinessUnitChangeParentUnitAction businessUnitChangeParentUnitAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeParentUnitAction)
                .isInstanceOf(BusinessUnitChangeParentUnitAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitChangeParentUnitAction.builder()
                .parentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void parentUnit() {
        BusinessUnitChangeParentUnitAction value = BusinessUnitChangeParentUnitAction.of();
        value.setParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
