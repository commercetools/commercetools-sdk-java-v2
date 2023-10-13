
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
public class AttributeGroupResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupResourceIdentifierBuilder builder) {
        AttributeGroupResourceIdentifier attributeGroupResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupResourceIdentifier).isInstanceOf(AttributeGroupResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeGroupResourceIdentifier.builder().id("id") },
                new Object[] { AttributeGroupResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        AttributeGroupResourceIdentifier value = AttributeGroupResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        AttributeGroupResourceIdentifier value = AttributeGroupResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
