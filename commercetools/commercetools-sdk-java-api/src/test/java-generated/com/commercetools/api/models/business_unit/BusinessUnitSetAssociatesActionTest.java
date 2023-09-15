
package com.commercetools.api.models.business_unit;

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
public class BusinessUnitSetAssociatesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSetAssociatesActionBuilder builder) {
        BusinessUnitSetAssociatesAction businessUnitSetAssociatesAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetAssociatesAction).isInstanceOf(BusinessUnitSetAssociatesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitSetAssociatesAction.builder()
                .associates(
                    Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateDraftImpl())) } };
    }

    @Test
    public void associates() {
        BusinessUnitSetAssociatesAction value = BusinessUnitSetAssociatesAction.of();
        value.setAssociates(
            Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateDraftImpl()));
        Assertions.assertThat(value.getAssociates())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateDraftImpl()));
    }
}
