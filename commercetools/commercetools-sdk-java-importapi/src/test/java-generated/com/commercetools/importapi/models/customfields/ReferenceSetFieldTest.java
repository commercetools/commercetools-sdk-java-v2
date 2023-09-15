
package com.commercetools.importapi.models.customfields;

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
public class ReferenceSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReferenceSetFieldBuilder builder) {
        ReferenceSetField referenceSetField = builder.buildUnchecked();
        Assertions.assertThat(referenceSetField).isInstanceOf(ReferenceSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReferenceSetField.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl())) } };
    }

    @Test
    public void value() {
        ReferenceSetField value = ReferenceSetField.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
    }
}
