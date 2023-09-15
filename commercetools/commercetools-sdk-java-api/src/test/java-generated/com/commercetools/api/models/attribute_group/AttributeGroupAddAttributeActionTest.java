
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
public class AttributeGroupAddAttributeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupAddAttributeActionBuilder builder) {
        AttributeGroupAddAttributeAction attributeGroupAddAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupAddAttributeAction).isInstanceOf(AttributeGroupAddAttributeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeGroupAddAttributeAction.builder()
                .attribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()) } };
    }

    @Test
    public void attribute() {
        AttributeGroupAddAttributeAction value = AttributeGroupAddAttributeAction.of();
        value.setAttribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
        Assertions.assertThat(value.getAttribute())
                .isEqualTo(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
    }
}
