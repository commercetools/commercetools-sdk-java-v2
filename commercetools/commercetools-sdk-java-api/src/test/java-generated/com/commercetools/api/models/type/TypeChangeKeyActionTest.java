
package com.commercetools.api.models.type;

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
public class TypeChangeKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeKeyActionBuilder builder) {
        TypeChangeKeyAction typeChangeKeyAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeKeyAction).isInstanceOf(TypeChangeKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeChangeKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        TypeChangeKeyAction value = TypeChangeKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
