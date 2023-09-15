
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
public class BooleanSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BooleanSetFieldBuilder builder) {
        BooleanSetField booleanSetField = builder.buildUnchecked();
        Assertions.assertThat(booleanSetField).isInstanceOf(BooleanSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BooleanSetField.builder().value(Collections.singletonList(true)) } };
    }

    @Test
    public void value() {
        BooleanSetField value = BooleanSetField.of();
        value.setValue(Collections.singletonList(true));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(true));
    }
}
