
package com.commercetools.api.models.shopping_list;

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
public class ShoppingListSetBusinessUnitActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetBusinessUnitActionBuilder builder) {
        ShoppingListSetBusinessUnitAction shoppingListSetBusinessUnitAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetBusinessUnitAction).isInstanceOf(ShoppingListSetBusinessUnitAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListSetBusinessUnitAction.builder()
                .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void businessUnit() {
        ShoppingListSetBusinessUnitAction value = ShoppingListSetBusinessUnitAction.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
