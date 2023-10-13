
package com.commercetools.api.models.me;

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
public class MyBusinessUnitChangeAssociateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitChangeAssociateActionBuilder builder) {
        MyBusinessUnitChangeAssociateAction myBusinessUnitChangeAssociateAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitChangeAssociateAction)
                .isInstanceOf(MyBusinessUnitChangeAssociateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyBusinessUnitChangeAssociateAction.builder()
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
