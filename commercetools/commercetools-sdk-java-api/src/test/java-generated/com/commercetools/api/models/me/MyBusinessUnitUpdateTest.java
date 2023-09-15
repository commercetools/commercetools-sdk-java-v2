
package com.commercetools.api.models.me;

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
public class MyBusinessUnitUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitUpdateBuilder builder) {
        MyBusinessUnitUpdate myBusinessUnitUpdate = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitUpdate).isInstanceOf(MyBusinessUnitUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyBusinessUnitUpdate.builder().version(2L) },
                new Object[] { MyBusinessUnitUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyBusinessUnitUpdate value = MyBusinessUnitUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyBusinessUnitUpdate value = MyBusinessUnitUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.business_unit.BusinessUnitUpdateActionImpl()));
    }
}
