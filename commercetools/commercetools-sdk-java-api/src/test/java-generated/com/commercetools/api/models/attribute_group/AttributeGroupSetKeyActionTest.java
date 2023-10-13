
package com.commercetools.api.models.attribute_group;

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
public class AttributeGroupSetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupSetKeyActionBuilder builder) {
        AttributeGroupSetKeyAction attributeGroupSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupSetKeyAction).isInstanceOf(AttributeGroupSetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeGroupSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        AttributeGroupSetKeyAction value = AttributeGroupSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
