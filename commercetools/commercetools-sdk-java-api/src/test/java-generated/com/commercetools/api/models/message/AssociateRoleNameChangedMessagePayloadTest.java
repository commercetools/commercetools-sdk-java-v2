
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
public class AssociateRoleNameChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleNameChangedMessagePayloadBuilder builder) {
        AssociateRoleNameChangedMessagePayload associateRoleNameChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(associateRoleNameChangedMessagePayload)
                .isInstanceOf(AssociateRoleNameChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleNameChangedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        AssociateRoleNameChangedMessagePayload value = AssociateRoleNameChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
