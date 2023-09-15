
package com.commercetools.api.models.attribute_group;

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
public class AttributeGroupSetAttributesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupSetAttributesActionBuilder builder) {
        AttributeGroupSetAttributesAction attributeGroupSetAttributesAction = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupSetAttributesAction).isInstanceOf(AttributeGroupSetAttributesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeGroupSetAttributesAction.builder()
                .attributes(Collections
                        .singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl())) } };
    }

    @Test
    public void attributes() {
        AttributeGroupSetAttributesAction value = AttributeGroupSetAttributesAction.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
    }
}
