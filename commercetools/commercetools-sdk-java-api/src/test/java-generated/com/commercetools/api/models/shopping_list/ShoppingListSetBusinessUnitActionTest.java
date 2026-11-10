
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetBusinessUnitActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetBusinessUnitActionBuilder builder) {
        ShoppingListSetBusinessUnitAction shoppingListSetBusinessUnitAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetBusinessUnitAction).isInstanceOf(ShoppingListSetBusinessUnitAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "businessUnit", ShoppingListSetBusinessUnitAction.builder()
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
