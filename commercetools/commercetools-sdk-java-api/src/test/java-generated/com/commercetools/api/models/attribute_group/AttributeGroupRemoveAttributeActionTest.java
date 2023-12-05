
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
public class AttributeGroupRemoveAttributeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupRemoveAttributeActionBuilder builder) {
        AttributeGroupRemoveAttributeAction attributeGroupRemoveAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupRemoveAttributeAction)
                .isInstanceOf(AttributeGroupRemoveAttributeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeGroupRemoveAttributeAction.builder()
                .attribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()) } };
    }

    @Test
    public void attribute() {
        AttributeGroupRemoveAttributeAction value = AttributeGroupRemoveAttributeAction.of();
        value.setAttribute(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
        Assertions.assertThat(value.getAttribute())
                .isEqualTo(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl());
    }
}
