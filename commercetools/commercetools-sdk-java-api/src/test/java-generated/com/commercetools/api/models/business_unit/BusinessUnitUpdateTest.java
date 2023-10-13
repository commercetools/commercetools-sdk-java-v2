
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
public class BusinessUnitUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitUpdateBuilder builder) {
        BusinessUnitUpdate businessUnitUpdate = builder.buildUnchecked();
        Assertions.assertThat(businessUnitUpdate).isInstanceOf(BusinessUnitUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitUpdate.builder().version(2L) },
                new Object[] { BusinessUnitUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        BusinessUnitUpdate value = BusinessUnitUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        BusinessUnitUpdate value = BusinessUnitUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl()));
    }
}
