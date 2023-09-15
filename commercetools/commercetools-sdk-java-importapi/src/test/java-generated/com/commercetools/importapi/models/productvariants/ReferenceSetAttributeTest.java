
package com.commercetools.importapi.models.productvariants;

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
public class ReferenceSetAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReferenceSetAttributeBuilder builder) {
        ReferenceSetAttribute referenceSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(referenceSetAttribute).isInstanceOf(ReferenceSetAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReferenceSetAttribute.builder()
                .value(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl())) } };
    }

    @Test
    public void value() {
        ReferenceSetAttribute value = ReferenceSetAttribute.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.KeyReferenceImpl()));
    }
}
