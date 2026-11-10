
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitChangeAssociateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitChangeAssociateActionBuilder builder) {
        MyBusinessUnitChangeAssociateAction myBusinessUnitChangeAssociateAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitChangeAssociateAction)
                .isInstanceOf(MyBusinessUnitChangeAssociateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associate", MyBusinessUnitChangeAssociateAction.builder()
                .associate(new com.commercetools.api.models.business_unit.AssociateDraftImpl()) } };
    }

    @Test
    public void associate() {
        MyBusinessUnitChangeAssociateAction value = MyBusinessUnitChangeAssociateAction.of();
        value.setAssociate(new com.commercetools.api.models.business_unit.AssociateDraftImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateDraftImpl());
    }
}
