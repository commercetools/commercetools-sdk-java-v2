
package com.commercetools.importapi.models.customfields;

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
public class ReferenceFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReferenceFieldBuilder builder) {
        ReferenceField referenceField = builder.buildUnchecked();
        Assertions.assertThat(referenceField).isInstanceOf(ReferenceField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ReferenceField.builder().value(new com.commercetools.importapi.models.common.KeyReferenceImpl()) } };
    }

    @Test
    public void value() {
        ReferenceField value = ReferenceField.of();
        value.setValue(new com.commercetools.importapi.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.KeyReferenceImpl());
    }
}
