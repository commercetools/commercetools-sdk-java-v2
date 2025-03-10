
package com.commercetools.api.models.order;

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
public class OrderSetBusinessUnitActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetBusinessUnitActionBuilder builder) {
        OrderSetBusinessUnitAction orderSetBusinessUnitAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetBusinessUnitAction).isInstanceOf(OrderSetBusinessUnitAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetBusinessUnitAction.builder()
                .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void businessUnit() {
        OrderSetBusinessUnitAction value = OrderSetBusinessUnitAction.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
