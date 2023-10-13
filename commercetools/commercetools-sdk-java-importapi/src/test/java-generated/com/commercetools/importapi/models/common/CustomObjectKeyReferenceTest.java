
package com.commercetools.importapi.models.common;

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
public class CustomObjectKeyReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomObjectKeyReferenceBuilder builder) {
        CustomObjectKeyReference customObjectKeyReference = builder.buildUnchecked();
        Assertions.assertThat(customObjectKeyReference).isInstanceOf(CustomObjectKeyReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomObjectKeyReference.builder().container("container") } };
    }

    @Test
    public void container() {
        CustomObjectKeyReference value = CustomObjectKeyReference.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }
}
