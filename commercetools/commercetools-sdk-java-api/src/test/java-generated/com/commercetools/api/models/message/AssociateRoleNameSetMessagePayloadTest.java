
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
public class AssociateRoleNameSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleNameSetMessagePayloadBuilder builder) {
        AssociateRoleNameSetMessagePayload associateRoleNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(associateRoleNameSetMessagePayload)
                .isInstanceOf(AssociateRoleNameSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleNameSetMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        AssociateRoleNameSetMessagePayload value = AssociateRoleNameSetMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
