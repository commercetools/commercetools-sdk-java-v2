
package com.commercetools.api.models.message;

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
public class BusinessUnitAssociateModeChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAssociateModeChangedMessageBuilder builder) {
        BusinessUnitAssociateModeChangedMessage businessUnitAssociateModeChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociateModeChangedMessage)
                .isInstanceOf(BusinessUnitAssociateModeChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAssociateModeChangedMessage.builder()
                        .associateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                .findEnum("Explicit")) },
                new Object[] { BusinessUnitAssociateModeChangedMessage.builder()
                        .oldAssociateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                .findEnum("Explicit")) } };
    }

    @Test
    public void associateMode() {
        BusinessUnitAssociateModeChangedMessage value = BusinessUnitAssociateModeChangedMessage.of();
        value.setAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void oldAssociateMode() {
        BusinessUnitAssociateModeChangedMessage value = BusinessUnitAssociateModeChangedMessage.of();
        value.setOldAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getOldAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }
}
