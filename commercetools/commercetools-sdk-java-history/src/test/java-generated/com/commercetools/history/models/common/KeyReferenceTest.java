
package com.commercetools.history.models.common;

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
public class KeyReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(KeyReferenceBuilder builder) {
        KeyReference keyReference = builder.buildUnchecked();
        Assertions.assertThat(keyReference).isInstanceOf(KeyReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { KeyReference.builder().key("key") },
                new Object[] { KeyReference.builder()
                        .typeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void key() {
        KeyReference value = KeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void typeId() {
        KeyReference value = KeyReference.of();
        value.setTypeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
    }
}
