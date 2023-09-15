
package com.commercetools.api.models.project;

import java.util.Collections;

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
public class CartClassificationTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartClassificationTypeBuilder builder) {
        CartClassificationType cartClassificationType = builder.buildUnchecked();
        Assertions.assertThat(cartClassificationType).isInstanceOf(CartClassificationType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartClassificationType.builder()
                .values(Collections
                        .singletonList(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl())) } };
    }

    @Test
    public void values() {
        CartClassificationType value = CartClassificationType.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()));
    }
}
