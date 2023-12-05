
package com.commercetools.api.models.associate_role;

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
public class AssociateRoleKeyReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateRoleKeyReferenceBuilder builder) {
        AssociateRoleKeyReference associateRoleKeyReference = builder.buildUnchecked();
        Assertions.assertThat(associateRoleKeyReference).isInstanceOf(AssociateRoleKeyReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateRoleKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        AssociateRoleKeyReference value = AssociateRoleKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
