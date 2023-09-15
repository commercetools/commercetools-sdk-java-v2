
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
public class BusinessUnitReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitReferenceBuilder builder) {
        BusinessUnitReference businessUnitReference = builder.buildUnchecked();
        Assertions.assertThat(businessUnitReference).isInstanceOf(BusinessUnitReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitReference.builder()
                        .obj(new com.commercetools.api.models.business_unit.BusinessUnitImpl()) },
                new Object[] { BusinessUnitReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        BusinessUnitReference value = BusinessUnitReference.of();
        value.setObj(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
    }

    @Test
    public void id() {
        BusinessUnitReference value = BusinessUnitReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
