
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
public class BusinessUnitAddAssociateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddAssociateActionBuilder builder) {
        BusinessUnitAddAssociateAction businessUnitAddAssociateAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAddAssociateAction).isInstanceOf(BusinessUnitAddAssociateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitAddAssociateAction.builder()
                .associate(new com.commercetools.api.models.business_unit.AssociateDraftImpl()) } };
    }

    @Test
    public void associate() {
        BusinessUnitAddAssociateAction value = BusinessUnitAddAssociateAction.of();
        value.setAssociate(new com.commercetools.api.models.business_unit.AssociateDraftImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateDraftImpl());
    }
}
