
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
public class AssociateRoleBuyerAssignableChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleBuyerAssignableChangedMessagePayloadBuilder builder) {
        AssociateRoleBuyerAssignableChangedMessagePayload associateRoleBuyerAssignableChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(associateRoleBuyerAssignableChangedMessagePayload)
                .isInstanceOf(AssociateRoleBuyerAssignableChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AssociateRoleBuyerAssignableChangedMessagePayload.builder().buyerAssignable(true) } };
    }

    @Test
    public void buyerAssignable() {
        AssociateRoleBuyerAssignableChangedMessagePayload value = AssociateRoleBuyerAssignableChangedMessagePayload
                .of();
        value.setBuyerAssignable(true);
        Assertions.assertThat(value.getBuyerAssignable()).isEqualTo(true);
    }
}
